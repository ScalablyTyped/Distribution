package typings.vscode.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextEditorSelectionChangeKind extends js.Object
@JSImport("vscode", "TextEditorSelectionChangeKind")
@js.native
object TextEditorSelectionChangeKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextEditorSelectionChangeKind with Double] = js.native
  
  /**
    * Selection changed because a command ran.
    */
  @js.native
  sealed trait Command extends TextEditorSelectionChangeKind
  /* 3 */ @js.native
  object Command
    extends TopLevel[typings.vscode.mod.TextEditorSelectionChangeKind.Command with Double]
  
  /**
    * Selection changed due to typing in the editor.
    */
  @js.native
  sealed trait Keyboard extends TextEditorSelectionChangeKind
  /* 1 */ @js.native
  object Keyboard extends TopLevel[Keyboard with Double]
  
  /**
    * Selection change due to clicking in the editor.
    */
  @js.native
  sealed trait Mouse extends TextEditorSelectionChangeKind
  /* 2 */ @js.native
  object Mouse extends TopLevel[Mouse with Double]
}
