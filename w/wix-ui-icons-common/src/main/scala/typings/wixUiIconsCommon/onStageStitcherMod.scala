package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.stitcherMod.StitcherProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onStageStitcherMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/Stitcher", JSImport.Default)
  @js.native
  val default: FC[StitcherProps] = js.native
  
  type _To = FC[StitcherProps]
  
  /* This means you don't have to write `default`, but can instead just say `onStageStitcherMod.foo` */
  override def _to: FC[StitcherProps] = default
}
