package typings.winrtUwp.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the barcode scanner data. */
@js.native
trait BarcodeScannerReport extends js.Object {
  
  /** Gets the full raw data from the DataReceived event. */
  var scanData: IBuffer = js.native
  
  /** Gets the decoded barcode label, which does not include the header, checksum, and other miscellaneous information. */
  var scanDataLabel: IBuffer = js.native
  
  /** Gets the decoded barcode label type. Possible values are defined in the BarcodeSymbologies class. */
  var scanDataType: Double = js.native
}
object BarcodeScannerReport {
  
  @scala.inline
  def apply(scanData: IBuffer, scanDataLabel: IBuffer, scanDataType: Double): BarcodeScannerReport = {
    val __obj = js.Dynamic.literal(scanData = scanData.asInstanceOf[js.Any], scanDataLabel = scanDataLabel.asInstanceOf[js.Any], scanDataType = scanDataType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarcodeScannerReport]
  }
  
  @scala.inline
  implicit class BarcodeScannerReportOps[Self <: BarcodeScannerReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setScanData(value: IBuffer): Self = this.set("scanData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanDataLabel(value: IBuffer): Self = this.set("scanDataLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanDataType(value: Double): Self = this.set("scanDataType", value.asInstanceOf[js.Any])
  }
}
