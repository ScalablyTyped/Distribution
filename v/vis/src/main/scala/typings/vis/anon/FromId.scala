package typings.vis.anon

import typings.vis.mod.IdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FromId extends js.Object {
  var fromId: IdType = js.native
  var toId: IdType = js.native
}

object FromId {
  @scala.inline
  def apply(fromId: IdType, toId: IdType): FromId = {
    val __obj = js.Dynamic.literal(fromId = fromId.asInstanceOf[js.Any], toId = toId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromId]
  }
  @scala.inline
  implicit class FromIdOps[Self <: FromId] (val x: Self) extends AnyVal {
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
    def setFromId(value: IdType): Self = this.set("fromId", value.asInstanceOf[js.Any])
    @scala.inline
    def setToId(value: IdType): Self = this.set("toId", value.asInstanceOf[js.Any])
  }
  
}

