package typings.winrt.Windows.Networking.Connectivity

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataPlanUsage extends js.Object {
  var lastSyncTime: Date = js.native
  var megabytesUsed: Double = js.native
}

object IDataPlanUsage {
  @scala.inline
  def apply(lastSyncTime: Date, megabytesUsed: Double): IDataPlanUsage = {
    val __obj = js.Dynamic.literal(lastSyncTime = lastSyncTime.asInstanceOf[js.Any], megabytesUsed = megabytesUsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataPlanUsage]
  }
  @scala.inline
  implicit class IDataPlanUsageOps[Self <: IDataPlanUsage] (val x: Self) extends AnyVal {
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
    def setLastSyncTime(value: Date): Self = this.set("lastSyncTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setMegabytesUsed(value: Double): Self = this.set("megabytesUsed", value.asInstanceOf[js.Any])
  }
  
}

