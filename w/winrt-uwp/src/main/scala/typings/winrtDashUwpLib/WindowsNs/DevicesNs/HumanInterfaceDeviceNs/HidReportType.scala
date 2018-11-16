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
  
  val feature: feature with java.lang.String = js.native
  val input: input with java.lang.String = js.native
  val output: output with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.HumanInterfaceDeviceNs.HidReportType with java.lang.String
  ] = js.native
}

