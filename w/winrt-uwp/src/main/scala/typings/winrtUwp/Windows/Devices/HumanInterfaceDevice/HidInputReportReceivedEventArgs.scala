package typings.winrtUwp.Windows.Devices.HumanInterfaceDevice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the arguments which the HID API sends as part of an input-report event. */
trait HidInputReportReceivedEventArgs extends js.Object {
  /** Retrieves the input report. */
  var report: HidInputReport
}

object HidInputReportReceivedEventArgs {
  @scala.inline
  def apply(report: HidInputReport): HidInputReportReceivedEventArgs = {
    val __obj = js.Dynamic.literal(report = report.asInstanceOf[js.Any])
    __obj.asInstanceOf[HidInputReportReceivedEventArgs]
  }
}

