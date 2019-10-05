package typings.winrtDashUwp.Windows.Devices.HumanInterfaceDevice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the arguments which the HID API sends as part of an input-report event. */
@JSGlobal("Windows.Devices.HumanInterfaceDevice.HidInputReportReceivedEventArgs")
@js.native
abstract class HidInputReportReceivedEventArgs () extends js.Object {
  /** Retrieves the input report. */
  var report: HidInputReport = js.native
}

