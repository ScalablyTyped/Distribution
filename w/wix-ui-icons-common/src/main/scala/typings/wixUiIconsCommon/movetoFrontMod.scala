package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsMovetoFrontMod.MovetoFrontProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object movetoFrontMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/MovetoFront", JSImport.Default)
  @js.native
  val default: FC[MovetoFrontProps] = js.native
  
  type _To = FC[MovetoFrontProps]
  
  /* This means you don't have to write `default`, but can instead just say `movetoFrontMod.foo` */
  override def _to: FC[MovetoFrontProps] = default
}
