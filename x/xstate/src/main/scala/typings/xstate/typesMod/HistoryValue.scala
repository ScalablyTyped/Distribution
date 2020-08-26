package typings.xstate.typesMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryValue extends js.Object {
  var current: js.UndefOr[StateValue] = js.native
  var states: Record[String, js.UndefOr[HistoryValue]] = js.native
}

object HistoryValue {
  @scala.inline
  def apply(states: Record[String, js.UndefOr[HistoryValue]]): HistoryValue = {
    val __obj = js.Dynamic.literal(states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryValue]
  }
  @scala.inline
  implicit class HistoryValueOps[Self <: HistoryValue] (val x: Self) extends AnyVal {
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
    def setStates(value: Record[String, js.UndefOr[HistoryValue]]): Self = this.set("states", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrent(value: StateValue): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrent: Self = this.set("current", js.undefined)
  }
  
}

