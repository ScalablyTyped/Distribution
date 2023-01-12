package typings.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the barcode data from the DataReceived event. */
trait BarcodeScannerDataReceivedEventArgs extends StObject {
  
  /** Gets the data from the DataReceived event. */
  var report: BarcodeScannerReport
}
object BarcodeScannerDataReceivedEventArgs {
  
  inline def apply(report: BarcodeScannerReport): BarcodeScannerDataReceivedEventArgs = {
    val __obj = js.Dynamic.literal(report = report.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarcodeScannerDataReceivedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BarcodeScannerDataReceivedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setReport(value: BarcodeScannerReport): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
  }
}
