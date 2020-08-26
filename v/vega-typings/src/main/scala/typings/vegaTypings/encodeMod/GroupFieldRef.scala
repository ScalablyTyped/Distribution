package typings.vegaTypings.encodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupFieldRef extends _Field {
  var group: Field = js.native
  var level: js.UndefOr[Double] = js.native
}

object GroupFieldRef {
  @scala.inline
  def apply(group: Field): GroupFieldRef = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupFieldRef]
  }
  @scala.inline
  implicit class GroupFieldRefOps[Self <: GroupFieldRef] (val x: Self) extends AnyVal {
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
    def setGroup(value: Field): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
  }
  
}

