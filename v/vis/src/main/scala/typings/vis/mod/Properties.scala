package typings.vis.mod

import typings.vis.anon.Canvas
import typings.vis.anon.Nodes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Properties extends js.Object {
  var edges: js.Array[String] = js.native
  var event: js.Array[String] = js.native
  var nodes: js.Array[String] = js.native
  var pointer: Canvas = js.native
  var previousSelection: js.UndefOr[Nodes] = js.native
}

object Properties {
  @scala.inline
  def apply(edges: js.Array[String], event: js.Array[String], nodes: js.Array[String], pointer: Canvas): Properties = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Properties]
  }
  @scala.inline
  implicit class PropertiesOps[Self <: Properties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEdgesVarargs(value: String*): Self = this.set("edges", js.Array(value :_*))
    @scala.inline
    def setEdges(value: js.Array[String]): Self = this.set("edges", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventVarargs(value: String*): Self = this.set("event", js.Array(value :_*))
    @scala.inline
    def setEvent(value: js.Array[String]): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodesVarargs(value: String*): Self = this.set("nodes", js.Array(value :_*))
    @scala.inline
    def setNodes(value: js.Array[String]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointer(value: Canvas): Self = this.set("pointer", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousSelection(value: Nodes): Self = this.set("previousSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousSelection: Self = this.set("previousSelection", js.undefined)
  }
  
}

