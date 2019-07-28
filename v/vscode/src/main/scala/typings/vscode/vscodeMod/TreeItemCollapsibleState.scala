package typings.vscode.vscodeMod

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
  
  /* 1 */ val Collapsed: typings.vscode.vscodeMod.TreeItemCollapsibleState.Collapsed with Double = js.native
  /* 2 */ val Expanded: typings.vscode.vscodeMod.TreeItemCollapsibleState.Expanded with Double = js.native
  /* 0 */ val None: typings.vscode.vscodeMod.TreeItemCollapsibleState.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TreeItemCollapsibleState with Double] = js.native
}

