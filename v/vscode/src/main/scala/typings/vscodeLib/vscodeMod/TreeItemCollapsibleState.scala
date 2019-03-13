package typings
package vscodeLib.vscodeMod

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
  sealed trait Collapsed
    extends vscodeLib.vscodeMod.TreeItemCollapsibleState
  
  /**
  		 * Determines an item is expanded
  		 */
  @js.native
  sealed trait Expanded
    extends vscodeLib.vscodeMod.TreeItemCollapsibleState
  
  /**
  		 * Determines an item can be neither collapsed nor expanded. Implies it has no children.
  		 */
  @js.native
  sealed trait None
    extends vscodeLib.vscodeMod.TreeItemCollapsibleState
  
  /* 1 */ val Collapsed: Collapsed with scala.Double = js.native
  /* 2 */ val Expanded: Expanded with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vscodeLib.vscodeMod.TreeItemCollapsibleState with scala.Double] = js.native
}

