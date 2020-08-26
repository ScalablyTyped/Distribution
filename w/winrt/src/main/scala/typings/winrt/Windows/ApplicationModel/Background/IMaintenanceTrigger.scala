package typings.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMaintenanceTrigger extends IBackgroundTrigger {
  var freshnessTime: Double = js.native
  var oneShot: Boolean = js.native
}

object IMaintenanceTrigger {
  @scala.inline
  def apply(freshnessTime: Double, oneShot: Boolean): IMaintenanceTrigger = {
    val __obj = js.Dynamic.literal(freshnessTime = freshnessTime.asInstanceOf[js.Any], oneShot = oneShot.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMaintenanceTrigger]
  }
  @scala.inline
  implicit class IMaintenanceTriggerOps[Self <: IMaintenanceTrigger] (val x: Self) extends AnyVal {
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

