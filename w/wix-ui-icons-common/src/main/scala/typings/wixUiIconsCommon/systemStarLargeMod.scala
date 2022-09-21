package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.starLargeMod.StarLargeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemStarLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/system/StarLarge", JSImport.Default)
  @js.native
  val default: FC[StarLargeProps] = js.native
  
  type _To = FC[StarLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemStarLargeMod.foo` */
  override def _to: FC[StarLargeProps] = default
}
