package typings.vscode.mod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CommentThreadCollapsibleState with Double] = js.native
  /* 0 */ @js.native
  object Collapsed extends TopLevel[Collapsed with Double]
  
  /* 1 */ @js.native
  object Expanded extends TopLevel[Expanded with Double]
  
}

