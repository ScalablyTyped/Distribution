package typings.vsoNodeApi.anon

import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemTypeColorAndIcon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Value extends js.Object {
  var key: String = js.native
  var value: js.Array[WorkItemTypeColorAndIcon] = js.native
}

object Value {
  @scala.inline
  def apply(key: String, value: js.Array[WorkItemTypeColorAndIcon]): Value = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  @scala.inline
  implicit class ValueOps[Self <: Value] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueVarargs(value: WorkItemTypeColorAndIcon*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: js.Array[WorkItemTypeColorAndIcon]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

