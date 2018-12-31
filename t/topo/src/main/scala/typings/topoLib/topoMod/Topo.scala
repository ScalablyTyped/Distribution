package typings
package topoLib.topoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Topo object is the container for topologically sorting a list of nodes with non-circular interdependencies.
  */
@js.native
trait Topo[TNode, TGroup] extends js.Object {
  /**
    * An array of the topologically sorted nodes. This list is renewed upon each call to `topo.add()`.
    */
  var nodes: js.Array[TNode] = js.native
  /**
    * Specifies an additional node or list of nodes to be topologically sorted.
    *
    * @param nodes a mixed value or array of mixed values to be added as nodes to the topologically sorted list.
    * @param options optional sorting information about the `nodes`:
    * - `group` - a string naming the group to which `nodes` should be assigned. The group name `'?'` is reserved.
    * - `before` - a string or array of strings specifying the groups that `nodes` must precede in the topological sort.
    * - `after` - a string or array of strings specifying the groups that `nodes` must succeed in the topological sort.
    * - `sort` - a numerical value used to sort items when performing a `topo.merge()`.
    * @returns an array of the topologically sorted nodes.
    */
  def add(nodes: TNode): js.Array[TNode] = js.native
  def add(nodes: TNode, options: topoLib.Anon_Group[TGroup]): js.Array[TNode] = js.native
  def add(nodes: js.Array[TNode]): js.Array[TNode] = js.native
  def add(nodes: js.Array[TNode], options: topoLib.Anon_Group[TGroup]): js.Array[TNode] = js.native
  def merge(others: js.Array[Topo[TNode, TGroup]]): js.Array[TNode] = js.native
  /**
    * Merges another `Topo` object into the current object.
    * If the order in which items have been added to each list matters, use the `sort` option in `topo.add()`
    * with an incrementing value providing an absolute sort order among all items added to either object.
    *
    * @param others the other object or array of objects to be merged into the current one. `null` values are ignored.
    * @returns an array of the topologically sorted nodes. Will throw if a dependency error is found as a result of the combined items.
    */
  def merge(others: Topo[TNode, TGroup]): js.Array[TNode] = js.native
}

