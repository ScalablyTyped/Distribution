package typings.webBluetooth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BluetoothRequestDeviceFilter extends StObject {
  
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
  implicit class BluetoothRequestDeviceFilterMutableBuilder[Self <: BluetoothRequestDeviceFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManufacturerId(value: Double): Self = StObject.set(x, "manufacturerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturerIdUndefined: Self = StObject.set(x, "manufacturerId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamePrefix(value: String): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setServiceDataUUID(value: BluetoothServiceUUID): Self = StObject.set(x, "serviceDataUUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceDataUUIDUndefined: Self = StObject.set(x, "serviceDataUUID", js.undefined)
    
    @scala.inline
    def setServices(value: js.Array[BluetoothServiceUUID]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    @scala.inline
    def setServicesVarargs(value: BluetoothServiceUUID*): Self = StObject.set(x, "services", js.Array(value :_*))
  }
}
