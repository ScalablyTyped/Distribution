package typings
package vscodeLib.vscodeMod

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
  sealed trait Collapsed
    extends vscodeLib.vscodeMod.CommentThreadCollapsibleState
  
  /**
  		 * Determines an item is expanded
  		 */
  @js.native
  sealed trait Expanded
    extends vscodeLib.vscodeMod.CommentThreadCollapsibleState
  
  /* 0 */ val Collapsed: Collapsed with scala.Double = js.native
  /* 1 */ val Expanded: Expanded with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vscodeLib.vscodeMod.CommentThreadCollapsibleState with scala.Double] = js.native
}

