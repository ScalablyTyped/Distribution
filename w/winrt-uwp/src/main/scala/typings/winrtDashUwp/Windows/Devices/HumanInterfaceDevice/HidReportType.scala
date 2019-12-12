package typings.winrtDashUwp.Windows.Devices.HumanInterfaceDevice

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.HumanInterfaceDevice.HidReportType.feature
import typings.winrtDashUwp.Windows.Devices.HumanInterfaceDevice.HidReportType.input
import typings.winrtDashUwp.Windows.Devices.HumanInterfaceDevice.HidReportType.output
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HidReportType with Double] = js.native
  /* 2 */ @js.native
  object feature extends TopLevel[feature with Double]
  
  /* 0 */ @js.native
  object input extends TopLevel[input with Double]
  
  /* 1 */ @js.native
  object output extends TopLevel[output with Double]
  
}

