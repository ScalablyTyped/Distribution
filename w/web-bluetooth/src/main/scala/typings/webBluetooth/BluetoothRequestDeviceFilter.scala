package typings.webBluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BluetoothRequestDeviceFilter extends js.Object {
  
  var manufacturerId: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var namePrefix: js.UndefOr[String] = js.native
  
  var serviceDataUUID: js.UndefOr[BluetoothServiceUUID] = js.native
  
  var services: js.UndefOr[js.Array[BluetoothServiceUUID]] = js.native
}
object BluetoothRequestDeviceFilter {
  
  @scala.inline
  def apply(): BluetoothRequestDeviceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BluetoothRequestDeviceFilter]
  }
  
  @scala.inline
  implicit class BluetoothRequestDeviceFilterOps[Self <: BluetoothRequestDeviceFilter] (val x: Self) extends AnyVal {
    
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
    def setManufacturerId(value: Double): Self = this.set("manufacturerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManufacturerId: Self = this.set("manufacturerId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNamePrefix(value: String): Self = this.set("namePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamePrefix: Self = this.set("namePrefix", js.undefined)
    
    @scala.inline
    def setServiceDataUUID(value: BluetoothServiceUUID): Self = this.set("serviceDataUUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceDataUUID: Self = this.set("serviceDataUUID", js.undefined)
    
    @scala.inline
    def setServicesVarargs(value: BluetoothServiceUUID*): Self = this.set("services", js.Array(value :_*))
    
    @scala.inline
    def setServices(value: js.Array[BluetoothServiceUUID]): Self = this.set("services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServices: Self = this.set("services", js.undefined)
  }
}
