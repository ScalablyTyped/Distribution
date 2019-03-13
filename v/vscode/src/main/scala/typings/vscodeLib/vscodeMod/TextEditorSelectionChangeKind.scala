package typings
package vscodeLib.vscodeMod

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
  sealed trait Command
    extends vscodeLib.vscodeMod.TextEditorSelectionChangeKind
  
  /**
  		 * Selection changed due to typing in the editor.
  		 */
  @js.native
  sealed trait Keyboard
    extends vscodeLib.vscodeMod.TextEditorSelectionChangeKind
  
  /**
  		 * Selection change due to clicking in the editor.
  		 */
  @js.native
  sealed trait Mouse
    extends vscodeLib.vscodeMod.TextEditorSelectionChangeKind
  
  /* 3 */ val Command: Command with scala.Double = js.native
  /* 1 */ val Keyboard: Keyboard with scala.Double = js.native
  /* 2 */ val Mouse: Mouse with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vscodeLib.vscodeMod.TextEditorSelectionChangeKind with scala.Double] = js.native
}

