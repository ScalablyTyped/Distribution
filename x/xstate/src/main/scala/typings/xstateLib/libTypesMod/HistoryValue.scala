package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryValue extends js.Object {
  var current: js.UndefOr[StateValue]
  var states: stdLib.Record[java.lang.String, js.UndefOr[HistoryValue]]
}

object HistoryValue {
  @scala.inline
  def apply(states: stdLib.Record[java.lang.String, js.UndefOr[HistoryValue]], current: StateValue = null): HistoryValue = {
    val __obj = js.Dynamic.literal(states = states)
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryValue]
  }
}

