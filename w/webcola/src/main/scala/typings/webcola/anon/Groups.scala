package typings.webcola.anon

import typings.webcola.powergraphMod.PowerEdge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Groups extends js.Object {
  var groups: js.Array[_] = js.native
  var powerEdges: js.Array[PowerEdge] = js.native
}

object Groups {
  @scala.inline
  def apply(groups: js.Array[_], powerEdges: js.Array[PowerEdge]): Groups = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], powerEdges = powerEdges.asInstanceOf[js.Any])
    __obj.asInstanceOf[Groups]
  }
  @scala.inline
  implicit class GroupsOps[Self <: Groups] (val x: Self) extends AnyVal {
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
    def setGroupsVarargs(value: js.Any*): Self = this.set("groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: js.Array[_]): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerEdgesVarargs(value: PowerEdge*): Self = this.set("powerEdges", js.Array(value :_*))
    @scala.inline
    def setPowerEdges(value: js.Array[PowerEdge]): Self = this.set("powerEdges", value.asInstanceOf[js.Any])
  }
  
}

