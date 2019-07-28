package typings.winrtDashUwp.WindowsNs.DevicesNs.HumanInterfaceDeviceNs

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
  sealed trait feature extends HidReportType
  
  /** The report is an input report. */
  @js.native
  sealed trait input extends HidReportType
  
  /** The report is an output report. */
  @js.native
  sealed trait output extends HidReportType
  
  /* 2 */ val feature: typings.winrtDashUwp.WindowsNs.DevicesNs.HumanInterfaceDeviceNs.HidReportType.feature with Double = js.native
  /* 0 */ val input: typings.winrtDashUwp.WindowsNs.DevicesNs.HumanInterfaceDeviceNs.HidReportType.input with Double = js.native
  /* 1 */ val output: typings.winrtDashUwp.WindowsNs.DevicesNs.HumanInterfaceDeviceNs.HidReportType.output with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HidReportType with Double] = js.native
}

