package typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A Bluetooth LE manufacturer-specific data section (one particular type of LE advertisement section) */
@js.native
trait BluetoothLEManufacturerData extends js.Object {
  
  /** The Bluetooth LE company identifier code as defined by the Bluetooth Special Interest Group (SIG). */
  var companyId: Double = js.native
  
  /** Bluetooth LE manufacturer-specific section data. */
  var data: IBuffer = js.native
}
object BluetoothLEManufacturerData {
  
  @scala.inline
  def apply(companyId: Double, data: IBuffer): BluetoothLEManufacturerData = {
    val __obj = js.Dynamic.literal(companyId = companyId.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothLEManufacturerData]
  }
  
  @scala.inline
  implicit class BluetoothLEManufacturerDataOps[Self <: BluetoothLEManufacturerData] (val x: Self) extends AnyVal {
    
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
    def setCompanyId(value: Double): Self = this.set("companyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: IBuffer): Self = this.set("data", value.asInstanceOf[js.Any])
  }
}
