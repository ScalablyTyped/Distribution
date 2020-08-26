package typings.vis.anon

import typings.vis.mod.IdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Edges extends js.Object {
  var edges: js.Array[IdType] = js.native
  var nodes: js.Array[IdType] = js.native
}

object Edges {
  @scala.inline
  def apply(edges: js.Array[IdType], nodes: js.Array[IdType]): Edges = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edges]
  }
  @scala.inline
  implicit class EdgesOps[Self <: Edges] (val x: Self) extends AnyVal {
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
    def setEdgesVarargs(value: IdType*): Self = this.set("edges", js.Array(value :_*))
    @scala.inline
    def setEdges(value: js.Array[IdType]): Self = this.set("edges", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodesVarargs(value: IdType*): Self = this.set("nodes", js.Array(value :_*))
    @scala.inline
    def setNodes(value: js.Array[IdType]): Self = this.set("nodes", value.asInstanceOf[js.Any])
  }
  
}

