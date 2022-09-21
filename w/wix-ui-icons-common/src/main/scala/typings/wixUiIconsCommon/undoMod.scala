package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsUndoMod.UndoProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object undoMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Undo", JSImport.Default)
  @js.native
  val default: FC[UndoProps] = js.native
  
  type _To = FC[UndoProps]
  
  /* This means you don't have to write `default`, but can instead just say `undoMod.foo` */
  override def _to: FC[UndoProps] = default
}
