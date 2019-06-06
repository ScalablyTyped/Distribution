package typings
package vscodeLib.vscodeMod

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
  sealed trait Editing
    extends vscodeLib.vscodeMod.CommentMode
  
  /**
  		 * Displays the preview of the comment
  		 */
  @js.native
  sealed trait Preview
    extends vscodeLib.vscodeMod.CommentMode
  
  /* 0 */ val Editing: Editing with scala.Double = js.native
  /* 1 */ val Preview: Preview with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vscodeLib.vscodeMod.CommentMode with scala.Double] = js.native
}

