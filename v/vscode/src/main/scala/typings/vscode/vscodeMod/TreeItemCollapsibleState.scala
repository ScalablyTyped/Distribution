package typings.vscode.vscodeMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TreeItemCollapsibleState extends js.Object

@JSImport("vscode", "TreeItemCollapsibleState")
@js.native
object TreeItemCollapsibleState extends js.Object {
  /**
  		 * Determines an item is collapsed
  		 */
  @js.native
  sealed trait Collapsed extends TreeItemCollapsibleState
  
  /**
  		 * Determines an item is expanded
  		 */
  @js.native
  sealed trait Expanded extends TreeItemCollapsibleState
  
  /**
  		 * Determines an item can be neither collapsed nor expanded. Implies it has no children.
  		 */
  @js.native
  sealed trait None extends TreeItemCollapsibleState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TreeItemCollapsibleState with Double] = js.native
  /* 1 */ @js.native
  object Collapsed extends TopLevel[Collapsed with Double]
  
  /* 2 */ @js.native
  object Expanded extends TopLevel[Expanded with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}

