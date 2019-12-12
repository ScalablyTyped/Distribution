package typings.vscode.vscodeMod

import org.scalablytyped.runtime.TopLevel
import typings.vscode.vscodeMod.TextEditorSelectionChangeKind.Keyboard
import typings.vscode.vscodeMod.TextEditorSelectionChangeKind.Mouse
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextEditorSelectionChangeKind with Double] = js.native
  /* 3 */ @js.native
  object Command
    extends TopLevel[typings.vscode.vscodeMod.TextEditorSelectionChangeKind.Command with Double]
  
  /* 1 */ @js.native
  object Keyboard extends TopLevel[Keyboard with Double]
  
  /* 2 */ @js.native
  object Mouse extends TopLevel[Mouse with Double]
  
}

