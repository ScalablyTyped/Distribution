package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TreeItemCollapsibleState extends StObject
@JSImport("vscode", "TreeItemCollapsibleState")
@js.native
object TreeItemCollapsibleState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TreeItemCollapsibleState with Double] = js.native
  
  /**
    * Determines an item is collapsed
    */
  @js.native
  sealed trait Collapsed extends TreeItemCollapsibleState
  /* 1 */ val Collapsed: typings.vscode.mod.TreeItemCollapsibleState.Collapsed with Double = js.native
  
  /**
    * Determines an item is expanded
    */
  @js.native
  sealed trait Expanded extends TreeItemCollapsibleState
  /* 2 */ val Expanded: typings.vscode.mod.TreeItemCollapsibleState.Expanded with Double = js.native
  
  /**
    * Determines an item can be neither collapsed nor expanded. Implies it has no children.
    */
  @js.native
  sealed trait None extends TreeItemCollapsibleState
  /* 0 */ val None: typings.vscode.mod.TreeItemCollapsibleState.None with Double = js.native
}
