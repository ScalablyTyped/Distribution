package typings.vis

import typings.vis.mod.IdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEdges extends js.Object {
  var edges: js.Array[IdType]
  var nodes: js.Array[IdType]
}

object AnonEdges {
  @scala.inline
  def apply(edges: js.Array[IdType], nodes: js.Array[IdType]): AnonEdges = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEdges]
  }
}

