package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CommentThreadCollapsibleState extends StObject
@JSImport("vscode", "CommentThreadCollapsibleState")
@js.native
object CommentThreadCollapsibleState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CommentThreadCollapsibleState with Double] = js.native
  
  /**
    * Determines an item is collapsed
    */
  @js.native
  sealed trait Collapsed extends CommentThreadCollapsibleState
  /* 0 */ val Collapsed: typings.vscode.mod.CommentThreadCollapsibleState.Collapsed with Double = js.native
  
  /**
    * Determines an item is expanded
    */
  @js.native
  sealed trait Expanded extends CommentThreadCollapsibleState
  /* 1 */ val Expanded: typings.vscode.mod.CommentThreadCollapsibleState.Expanded with Double = js.native
}
