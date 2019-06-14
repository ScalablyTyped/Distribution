package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.HumanInterfaceDeviceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HidReportType extends js.Object

/** Specifies a HID report type. */
@JSGlobal("Windows.Devices.HumanInterfaceDevice.HidReportType")
@js.native
object HidReportType extends js.Object {
  /** The report is a feature report. */
  @js.native
  sealed trait feature
    extends winrtDashUwpLib.WindowsNs.DevicesNs.HumanInterfaceDeviceNs.HidReportType
  
  /** The report is an input report. */
  @js.native
  sealed trait input
    extends winrtDashUwpLib.WindowsNs.DevicesNs.HumanInterfaceDeviceNs.HidReportType
  
  /** The report is an output report. */
  @js.native
  sealed trait output
    extends winrtDashUwpLib.WindowsNs.DevicesNs.HumanInterfaceDeviceNs.HidReportType
  
  /* 2 */ val feature: feature with scala.Double = js.native
  /* 0 */ val input: input with scala.Double = js.native
  /* 1 */ val output: output with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.HumanInterfaceDeviceNs.HidReportType with scala.Double
  ] = js.native
}

