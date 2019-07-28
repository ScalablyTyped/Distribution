package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CommentThreadCollapsibleState extends js.Object

@JSImport("vscode", "CommentThreadCollapsibleState")
@js.native
object CommentThreadCollapsibleState extends js.Object {
  /**
  		 * Determines an item is collapsed
  		 */
  @js.native
  sealed trait Collapsed extends CommentThreadCollapsibleState
  
  /**
  		 * Determines an item is expanded
  		 */
  @js.native
  sealed trait Expanded extends CommentThreadCollapsibleState
  
  /* 0 */ val Collapsed: typings.vscode.vscodeMod.CommentThreadCollapsibleState.Collapsed with Double = js.native
  /* 1 */ val Expanded: typings.vscode.vscodeMod.CommentThreadCollapsibleState.Expanded with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CommentThreadCollapsibleState with Double] = js.native
}

