package typings.vscode.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CommentThreadCollapsibleState extends js.Object
@JSImport("vscode", "CommentThreadCollapsibleState")
@js.native
object CommentThreadCollapsibleState extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CommentThreadCollapsibleState with Double] = js.native
  
  /**
    * Determines an item is collapsed
    */
  @js.native
  sealed trait Collapsed extends CommentThreadCollapsibleState
  /* 0 */ @js.native
  object Collapsed extends TopLevel[Collapsed with Double]
  
  /**
    * Determines an item is expanded
    */
  @js.native
  sealed trait Expanded extends CommentThreadCollapsibleState
  /* 1 */ @js.native
  object Expanded extends TopLevel[Expanded with Double]
}
