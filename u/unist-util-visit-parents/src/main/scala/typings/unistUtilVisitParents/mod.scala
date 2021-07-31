package typings.unistUtilVisitParents

import typings.unist.mod.Node
import typings.unistUtilIs.mod.Test
import typings.unistUtilVisitParents.unistUtilVisitParentsBooleans.`false`
import typings.unistUtilVisitParents.unistUtilVisitParentsBooleans.`true`
import typings.unistUtilVisitParents.unistUtilVisitParentsStrings.skip
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
  @scala.inline
  def apply(tree: Node, visitor: Visitor[Node]): Unit = (^.asInstanceOf[js.Dynamic].apply(tree.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(tree: Node, visitor: Visitor[Node], reverse: Boolean): Unit = (^.asInstanceOf[js.Dynamic].apply(tree.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply[V /* <: Node */](tree: Node, test: js.Array[Test[js.Any]], visitor: Visitor[V]): Unit = (^.asInstanceOf[js.Dynamic].apply(tree.asInstanceOf[js.Any], test.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply[V /* <: Node */](tree: Node, test: js.Array[Test[js.Any]], visitor: Visitor[V], reverse: Boolean): Unit = (^.asInstanceOf[js.Dynamic].apply(tree.asInstanceOf[js.Any], test.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Unit]
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
  @scala.inline
  def apply[V /* <: Node */](tree: Node, test: Test[V], visitor: Visitor[V]): Unit = (^.asInstanceOf[js.Dynamic].apply(tree.asInstanceOf[js.Any], test.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply[V /* <: Node */](tree: Node, test: Test[V], visitor: Visitor[V], reverse: Boolean): Unit = (^.asInstanceOf[js.Dynamic].apply(tree.asInstanceOf[js.Any], test.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("unist-util-visit-parents", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Continue traversing as normal
    */
  @JSImport("unist-util-visit-parents", "CONTINUE")
  @js.native
  def CONTINUE: Continue = js.native
  @scala.inline
  def CONTINUE_=(x: Continue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTINUE")(x.asInstanceOf[js.Any])
  
  /**
    * Stop traversing immediately
    */
  @JSImport("unist-util-visit-parents", "EXIT")
  @js.native
  def EXIT: Exit = js.native
  @scala.inline
  def EXIT_=(x: Exit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXIT")(x.asInstanceOf[js.Any])
  
  /**
    * Do not traverse this node’s children
    */
  @JSImport("unist-util-visit-parents", "SKIP")
  @js.native
  def SKIP: Skip = js.native
  @scala.inline
  def SKIP_=(x: Skip): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SKIP")(x.asInstanceOf[js.Any])
  
  /**
    * Union of the action types
    */
  type Action = Continue | Skip | Exit
  
  /**
    * List with one or two values, the first an action, the second an index.
    */
  type ActionTuple = js.Tuple2[Action, Index]
  
  /**
    * Continue traversing as normal
    */
  type Continue = `true`
  
  /**
    * Stop traversing immediately
    */
  type Exit = `false`
  
  /**
    * Move to the sibling at index next (after node itself is completely traversed).
    * Useful if mutating the tree, such as removing the node the visitor is currently on,
    * or any of its previous siblings (or next siblings, in case of reverse)
    * Results less than 0 or greater than or equal to children.length stop traversing the parent
    */
  type Index = Double
  
  /**
    * Do not traverse this node’s children
    */
  type Skip = skip
  
  /**
    * Invoked when a node (matching test, if given) is found.
    * Visitors are free to transform node.
    * They can also transform the parent of node (the last of ancestors).
    * Replacing node itself, if visit.SKIP is not returned, still causes its descendants to be visited.
    * If adding or removing previous siblings (or next siblings, in case of reverse) of node,
    * visitor should return a new index (number) to specify the sibling to traverse after node is traversed.
    * Adding or removing next siblings of node (or previous siblings, in case of reverse)
    * is handled as expected without needing to return a new index.
    * Removing the children property of an ancestor still results in them being traversed.
    *
    * @param node Found node
    * @param ancestors Ancestors of node
    * @paramType V node type found
    * @returns
    * When Action is passed, treated as a tuple of [Action]
    * When Index is passed, treated as a tuple of [CONTINUE, Index]
    * When ActionTuple is passed,
    *   Note that passing a tuple only makes sense if the action is SKIP.
    *   If the action is EXIT, that action can be returned.
    *   If the action is CONTINUE, index can be returned.
    */
  type Visitor[V /* <: Node */] = js.Function2[/* node */ V, /* ancestors */ js.Array[Node], Unit | Action | Index | ActionTuple]
}
