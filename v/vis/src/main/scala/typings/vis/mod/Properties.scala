package typings.vis.mod

import typings.vis.anon.Canvas
import typings.vis.anon.Nodes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Properties extends js.Object {
  var edges: js.Array[String]
  var event: js.Array[String]
  var nodes: js.Array[String]
  var pointer: Canvas
  var previousSelection: js.UndefOr[Nodes] = js.undefined
}

object Properties {
  @scala.inline
  def apply(
    edges: js.Array[String],
    event: js.Array[String],
    nodes: js.Array[String],
    pointer: Canvas,
    previousSelection: Nodes = null
  ): Properties = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any])
    if (previousSelection != null) __obj.updateDynamic("previousSelection")(previousSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Properties]
  }
}

