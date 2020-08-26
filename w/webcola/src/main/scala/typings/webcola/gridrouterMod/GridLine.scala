package typings.webcola.gridrouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridLine extends js.Object {
  var nodes: js.Array[NodeWrapper] = js.native
  var pos: Double = js.native
}

object GridLine {
  @scala.inline
  def apply(nodes: js.Array[NodeWrapper], pos: Double): GridLine = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridLine]
  }
  @scala.inline
  implicit class GridLineOps[Self <: GridLine] (val x: Self) extends AnyVal {
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
    def setNodesVarargs(value: NodeWrapper*): Self = this.set("nodes", js.Array(value :_*))
    @scala.inline
    def setNodes(value: js.Array[NodeWrapper]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setPos(value: Double): Self = this.set("pos", value.asInstanceOf[js.Any])
  }
  
}

