package typings.toposort

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("toposort", JSImport.Namespace)
@js.native
object toposortMod extends js.Object {
  def apply[T](edges: js.Array[js.Tuple2[T, js.UndefOr[T]]]): js.Array[T] = js.native
  /**
    * This is a convenience method that allows you to define nodes that may or
    * may not be connected to any other nodes. The ordering of unconnected
    * nodes is not defined.
    * @param nodes An array of nodes
    * @param edges An array of directed edges. You don't need to mention all
    *              `nodes` here.
    * @returns a list of vertices, sorted from "start" to "end"
    * @throws if there are any cycles in the graph
    */
  def array[T](nodes: js.Array[T], edges: js.Array[js.Tuple2[T, js.UndefOr[T]]]): js.Array[T] = js.native
}

