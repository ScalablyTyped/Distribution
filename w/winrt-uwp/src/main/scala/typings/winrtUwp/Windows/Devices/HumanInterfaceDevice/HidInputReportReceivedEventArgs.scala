package typings.winrtUwp.Windows.Devices.HumanInterfaceDevice

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the arguments which the HID API sends as part of an input-report event. */
trait HidInputReportReceivedEventArgs extends StObject {
  
  /** Retrieves the input report. */
  var report: HidInputReport
}
object HidInputReportReceivedEventArgs {
  
  inline def apply(report: HidInputReport): HidInputReportReceivedEventArgs = {
    val __obj = js.Dynamic.literal(report = report.asInstanceOf[js.Any])
    __obj.asInstanceOf[HidInputReportReceivedEventArgs]
  }
  
  extension [Self <: HidInputReportReceivedEventArgs](x: Self) {
    
    inline def setReport(value: HidInputReport): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
  }
}
