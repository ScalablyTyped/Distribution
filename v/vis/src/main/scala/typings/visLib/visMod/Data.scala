package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var edges: js.UndefOr[js.Array[Edge] | DataSet[Edge]] = js.undefined
  var nodes: js.UndefOr[js.Array[Node] | DataSet[Node]] = js.undefined
}

object Data {
  @scala.inline
  def apply(edges: js.Array[Edge] | DataSet[Edge] = null, nodes: js.Array[Node] | DataSet[Node] = null): Data = {
    val __obj = js.Dynamic.literal()
    if (edges != null) __obj.updateDynamic("edges")(edges.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

