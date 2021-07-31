package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextEditorSelectionChangeKind extends StObject
@JSImport("vscode", "TextEditorSelectionChangeKind")
@js.native
object TextEditorSelectionChangeKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextEditorSelectionChangeKind & Double] = js.native
  
  /**
    * Selection changed because a command ran.
    */
  @js.native
  sealed trait Command
    extends StObject
       with TextEditorSelectionChangeKind
  /* 3 */ val Command: typings.vscode.mod.TextEditorSelectionChangeKind.Command & Double = js.native
  
  /**
    * Selection changed due to typing in the editor.
    */
  @js.native
  sealed trait Keyboard
    extends StObject
       with TextEditorSelectionChangeKind
  /* 1 */ val Keyboard: typings.vscode.mod.TextEditorSelectionChangeKind.Keyboard & Double = js.native
  
  /**
    * Selection change due to clicking in the editor.
    */
  @js.native
  sealed trait Mouse
    extends StObject
       with TextEditorSelectionChangeKind
  /* 2 */ val Mouse: typings.vscode.mod.TextEditorSelectionChangeKind.Mouse & Double = js.native
}
