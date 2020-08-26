package typings.winrtUwp.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a maintenance trigger. */
@js.native
trait MaintenanceTrigger extends js.Object {
  /** Gets the interval of a maintenance trigger. */
  var freshnessTime: Double = js.native
  /** Gets whether the maintenance trigger is used only once or each time the FreshnessTime interval elapses. */
  var oneShot: Boolean = js.native
}

object MaintenanceTrigger {
  @scala.inline
  def apply(freshnessTime: Double, oneShot: Boolean): MaintenanceTrigger = {
    val __obj = js.Dynamic.literal(freshnessTime = freshnessTime.asInstanceOf[js.Any], oneShot = oneShot.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceTrigger]
  }
  @scala.inline
  implicit class MaintenanceTriggerOps[Self <: MaintenanceTrigger] (val x: Self) extends AnyVal {
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
    def setFreshnessTime(value: Double): Self = this.set("freshnessTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setOneShot(value: Boolean): Self = this.set("oneShot", value.asInstanceOf[js.Any])
  }
  
}

