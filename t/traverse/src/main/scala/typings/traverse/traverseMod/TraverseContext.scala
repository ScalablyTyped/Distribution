package typings.traverse.traverseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraverseContext extends js.Object {
  /**
    * If the node equals one of its parents, the `circular` attribute is set to the context of that parent and the traversal progresses no deeper.
    */
  var circular: js.UndefOr[TraverseContext] = js.native
  /**
    * Whether or not the present node is a leaf node (has no children)
    */
  var isLeaf: Boolean = js.native
  /**
    * Whether the present node is the root node
    */
  var isRoot: Boolean = js.native
  /**
    * The name of the key of the present node in its parent.
    * This is `undefined` for the root node.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Object keys of the node.
    */
  var keys: js.Array[String] | Null = js.native
  /**
    * Depth of the node within the traversal
    */
  var level: Double = js.native
  /**
    * The present node on the recursive walk
    */
  var node: js.Any = js.native
  /**
    * Whether or not the present node is not a leaf node (has children)
    */
  var notLeaf: Boolean = js.native
  /**
    * Whether the present node is not the root node
    */
  var notRoot: Boolean = js.native
  /**
    * The context of the node's parent.
    * This is `undefined` for the root node.
    */
  var parent: js.UndefOr[TraverseContext] = js.native
  /**
    * The contexts of the node's parents.
    */
  var parents: js.Array[TraverseContext] = js.native
  /**
    * An array of string keys from the root to the present node
    */
  var path: js.Array[String] = js.native
  /**
    * Call this function after all of the children are traversed.
    */
  def after(callback: js.ThisFunction1[/* this */ this.type, /* value */ js.Any, Unit]): Unit = js.native
  /**
    * Call this function before all of the children are traversed.
    * You can assign into `this.keys` here to traverse in a custom order.
    */
  def before(callback: js.ThisFunction1[/* this */ this.type, /* value */ js.Any, Unit]): Unit = js.native
  /**
    * Prevents traversing descendents of the current node.
    */
  def block(): Unit = js.native
  /**
    * Delete the current element from its parent in the output. Calls `delete` even on Arrays.
    */
  def delete(): Unit = js.native
  def delete(stopHere: Boolean): Unit = js.native
  /**
    * Call this function after each of the children are traversed.
    */
  def post(callback: js.ThisFunction1[/* this */ this.type, /* child */ js.Any, Unit]): Unit = js.native
  /**
    * Call this function before each of the children are traversed.
    */
  def pre(callback: js.ThisFunction1[/* this */ this.type, /* child */ js.Any, Unit]): Unit = js.native
  /**
    * Remove the current element from the output. If the node is in an Array it will be spliced off. Otherwise it will be deleted from its parent.
    */
  def remove(): Unit = js.native
  def remove(stopHere: Boolean): Unit = js.native
  /**
    * Stops traversal entirely.
    */
  def stop(): Unit = js.native
  /**
    * Set a new value for the present node.
    * 
    * All the elements in `value` will be recursively traversed unless `stopHere` is true (false by default).
    */
  def update(value: js.Any): Unit = js.native
  def update(value: js.Any, stopHere: Boolean): Unit = js.native
}

