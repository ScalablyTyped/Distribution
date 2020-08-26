package typings.winrtUwp.Windows.Devices.HumanInterfaceDevice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the arguments which the HID API sends as part of an input-report event. */
@js.native
trait HidInputReportReceivedEventArgs extends js.Object {
  /** Retrieves the input report. */
  var report: HidInputReport = js.native
}

object HidInputReportReceivedEventArgs {
  @scala.inline
  def apply(report: HidInputReport): HidInputReportReceivedEventArgs = {
    val __obj = js.Dynamic.literal(report = report.asInstanceOf[js.Any])
    __obj.asInstanceOf[HidInputReportReceivedEventArgs]
  }
  @scala.inline
  implicit class HidInputReportReceivedEventArgsOps[Self <: HidInputReportReceivedEventArgs] (val x: Self) extends AnyVal {
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
    def setReport(value: HidInputReport): Self = this.set("report", value.asInstanceOf[js.Any])
  }
  
}

