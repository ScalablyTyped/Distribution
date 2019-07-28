package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextEditorSelectionChangeKind extends js.Object

@JSImport("vscode", "TextEditorSelectionChangeKind")
@js.native
object TextEditorSelectionChangeKind extends js.Object {
  /**
  		 * Selection changed because a command ran.
  		 */
  @js.native
  sealed trait Command extends TextEditorSelectionChangeKind
  
  /**
  		 * Selection changed due to typing in the editor.
  		 */
  @js.native
  sealed trait Keyboard extends TextEditorSelectionChangeKind
  
  /**
  		 * Selection change due to clicking in the editor.
  		 */
  @js.native
  sealed trait Mouse extends TextEditorSelectionChangeKind
  
  /* 3 */ val Command: typings.vscode.vscodeMod.TextEditorSelectionChangeKind.Command with Double = js.native
  /* 1 */ val Keyboard: typings.vscode.vscodeMod.TextEditorSelectionChangeKind.Keyboard with Double = js.native
  /* 2 */ val Mouse: typings.vscode.vscodeMod.TextEditorSelectionChangeKind.Mouse with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextEditorSelectionChangeKind with Double] = js.native
}

