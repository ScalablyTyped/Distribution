package typings.winrtUwp.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the barcode scanner data. */
trait BarcodeScannerReport extends StObject {
  
  /** Gets the full raw data from the DataReceived event. */
  var scanData: IBuffer
  
  /** Gets the decoded barcode label, which does not include the header, checksum, and other miscellaneous information. */
  var scanDataLabel: IBuffer
  
  /** Gets the decoded barcode label type. Possible values are defined in the BarcodeSymbologies class. */
  var scanDataType: Double
}
object BarcodeScannerReport {
  
  inline def apply(scanData: IBuffer, scanDataLabel: IBuffer, scanDataType: Double): BarcodeScannerReport = {
    val __obj = js.Dynamic.literal(scanData = scanData.asInstanceOf[js.Any], scanDataLabel = scanDataLabel.asInstanceOf[js.Any], scanDataType = scanDataType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarcodeScannerReport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BarcodeScannerReport] (val x: Self) extends AnyVal {
    
    inline def setScanData(value: IBuffer): Self = StObject.set(x, "scanData", value.asInstanceOf[js.Any])
    
    inline def setScanDataLabel(value: IBuffer): Self = StObject.set(x, "scanDataLabel", value.asInstanceOf[js.Any])
    
    inline def setScanDataType(value: Double): Self = StObject.set(x, "scanDataType", value.asInstanceOf[js.Any])
  }
}
