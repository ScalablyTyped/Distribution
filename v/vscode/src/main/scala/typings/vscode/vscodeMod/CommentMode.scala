package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CommentMode extends js.Object

@JSImport("vscode", "CommentMode")
@js.native
object CommentMode extends js.Object {
  /**
  		 * Displays the comment editor
  		 */
  @js.native
  sealed trait Editing extends CommentMode
  
  /**
  		 * Displays the preview of the comment
  		 */
  @js.native
  sealed trait Preview extends CommentMode
  
  /* 0 */ val Editing: typings.vscode.vscodeMod.CommentMode.Editing with Double = js.native
  /* 1 */ val Preview: typings.vscode.vscodeMod.CommentMode.Preview with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CommentMode with Double] = js.native
}

