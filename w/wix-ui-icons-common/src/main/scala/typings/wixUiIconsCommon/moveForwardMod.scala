package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.distComponentsMoveForwardMod.MoveForwardProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moveForwardMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/MoveForward", JSImport.Default)
  @js.native
  val default: FC[MoveForwardProps] = js.native
  
  type _To = FC[MoveForwardProps]
  
  /* This means you don't have to write `default`, but can instead just say `moveForwardMod.foo` */
  override def _to: FC[MoveForwardProps] = default
}
