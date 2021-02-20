package typings.winrtUwp.Windows.Devices.HumanInterfaceDevice

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HidReportType extends StObject
/** Specifies a HID report type. */
@JSGlobal("Windows.Devices.HumanInterfaceDevice.HidReportType")
@js.native
object HidReportType extends StObject {
  
  /** The report is a feature report. */
  @js.native
  sealed trait feature extends HidReportType
  
  /** The report is an input report. */
  @js.native
  sealed trait input extends HidReportType
  
  /** The report is an output report. */
  @js.native
  sealed trait output extends HidReportType
}
