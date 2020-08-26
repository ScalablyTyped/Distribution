package typings.webcola

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/handledisconnected", JSImport.Namespace)
@js.native
object handledisconnectedMod extends js.Object {
  def applyPacking(graphs: js.Array[_], w: js.Any, h: js.Any, node_size: js.Any): Unit = js.native
  def applyPacking(
    graphs: js.Array[_],
    w: js.Any,
    h: js.Any,
    node_size: js.Any,
    desired_ratio: js.UndefOr[scala.Nothing],
    centerGraph: Boolean
  ): Unit = js.native
  def applyPacking(graphs: js.Array[_], w: js.Any, h: js.Any, node_size: js.Any, desired_ratio: Double): Unit = js.native
  def applyPacking(
    graphs: js.Array[_],
    w: js.Any,
    h: js.Any,
    node_size: js.Any,
    desired_ratio: Double,
    centerGraph: Boolean
  ): Unit = js.native
  def separateGraphs(nodes: js.Any, links: js.Any): js.Array[_] = js.native
}

