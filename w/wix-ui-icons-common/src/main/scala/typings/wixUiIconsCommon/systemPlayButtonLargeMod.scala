package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.playButtonLargeMod.PlayButtonLargeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemPlayButtonLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/system/PlayButtonLarge", JSImport.Default)
  @js.native
  val default: FC[PlayButtonLargeProps] = js.native
  
  type _To = FC[PlayButtonLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemPlayButtonLargeMod.foo` */
  override def _to: FC[PlayButtonLargeProps] = default
}
