package typings.unistUtilVisit

import typings.unist.mod.Node
import typings.unist.mod.Parent
import typings.unistUtilIs.mod.Test
import typings.unistUtilVisitParents.mod.Action
import typings.unistUtilVisitParents.mod.ActionTuple
import typings.unistUtilVisitParents.mod.Continue
import typings.unistUtilVisitParents.mod.Exit
import typings.unistUtilVisitParents.mod.Index
import typings.unistUtilVisitParents.mod.Skip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Visit children of a tree
    *
    * @param tree abstract syntax tree to visit
    * @param visitor function to run for each node
    * @param reverse visit the tree in reverse, defaults to false
    */
  inline def apply(tree: Node, visitor: Visitor[Node]): Unit = (^.asInstanceOf[js.Dynamic].apply(tree.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(tree: Node, visitor: Visitor[Node], reverse: Boolean): Unit = (^.asInstanceOf[js.Dynamic].apply(tree.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply[V /* <: Node */](tree: Node, test: js.Array[Test[js.Any]], visitor: Visitor[V]): Unit = (^.asInstanceOf[js.Dynamic].apply(tree.asInstanceOf[js.Any], test.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply[V /* <: Node */](tree: Node, test: js.Array[Test[js.Any]], visitor: Visitor[V], reverse: Boolean): Unit = (^.asInstanceOf[js.Dynamic].apply(tree.asInstanceOf[js.Any], test.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Visit children of tree which pass a test
    *
    * @param tree abstract syntax tree to visit
    * @param test test node
    * @param visitor function to run for each node
    * @param reverse visit the tree in reverse, defaults to false
    * @typeParam T tree node
    * @typeParam V node type found
    */
  inline def apply[V /* <: Node */](tree: Node, test: Test[V], visitor: Visitor[V]): Unit = (^.asInstanceOf[js.Dynamic].apply(tree.asInstanceOf[js.Any], test.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply[V /* <: Node */](tree: Node, test: Test[V], visitor: Visitor[V], reverse: Boolean): Unit = (^.asInstanceOf[js.Dynamic].apply(tree.asInstanceOf[js.Any], test.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("unist-util-visit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Continue traversing as normal
    */
  @JSImport("unist-util-visit", "CONTINUE")
  @js.native
  def CONTINUE: Continue = js.native
  inline def CONTINUE_=(x: Continue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTINUE")(x.asInstanceOf[js.Any])
  
  /**
    * Stop traversing immediately
    */
  @JSImport("unist-util-visit", "EXIT")
  @js.native
  def EXIT: Exit = js.native
  inline def EXIT_=(x: Exit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXIT")(x.asInstanceOf[js.Any])
  
  /**
    * Do not traverse this node’s children
    */
  @JSImport("unist-util-visit", "SKIP")
  @js.native
  def SKIP: Skip = js.native
  inline def SKIP_=(x: Skip): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SKIP")(x.asInstanceOf[js.Any])
  
  /**
    * Invoked when a node (matching test, if given) is found.
    * Visitors are free to transform node.
    * They can also transform the parent of node.
    * Replacing node itself, if visit.SKIP is not returned, still causes its descendants to be visited.
    * If adding or removing previous siblings (or next siblings, in case of reverse) of node,
    * visitor should return a new index (number) to specify the sibling to traverse after node is traversed.
    * Adding or removing next siblings of node (or previous siblings, in case of reverse)
    * is handled as expected without needing to return a new index.
    * Removing the children property of the parent still result in them being traversed.
    *
    * @param node Found node
    * @param index Position of found node within Parent
    * @param parent Parent of found node
    * @paramType V node type found
    * @returns
    * When Action is passed, treated as a tuple of [Action]
    * When Index is passed, treated as a tuple of [CONTINUE, Index]
    * When ActionTuple is passed,
    *   Note that passing a tuple only makes sense if the action is SKIP.
    *   If the action is EXIT, that action can be returned.
    *   If the action is CONTINUE, index can be returned.
    */
  type Visitor[V /* <: Node */] = js.Function3[
    /* node */ V, 
    /* index */ Double, 
    /* parent */ js.UndefOr[Parent], 
    Unit | Action | Index | ActionTuple
  ]
}
