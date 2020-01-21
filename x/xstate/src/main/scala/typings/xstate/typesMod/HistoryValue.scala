package typings.xstate.typesMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryValue extends js.Object {
  var current: js.UndefOr[StateValue] = js.undefined
  var states: Record[String, js.UndefOr[HistoryValue]]
}

object HistoryValue {
  @scala.inline
  def apply(states: Record[String, js.UndefOr[HistoryValue]], current: StateValue = null): HistoryValue = {
    val __obj = js.Dynamic.literal(states = states.asInstanceOf[js.Any])
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryValue]
  }
}

