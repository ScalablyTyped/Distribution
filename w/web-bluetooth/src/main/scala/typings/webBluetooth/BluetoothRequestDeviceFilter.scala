package typings.webBluetooth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BluetoothRequestDeviceFilter extends StObject {
  
  var manufacturerId: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var namePrefix: js.UndefOr[String] = js.undefined
  
  var serviceDataUUID: js.UndefOr[BluetoothServiceUUID] = js.undefined
  
  var services: js.UndefOr[js.Array[BluetoothServiceUUID]] = js.undefined
}
object BluetoothRequestDeviceFilter {
  
  inline def apply(): BluetoothRequestDeviceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BluetoothRequestDeviceFilter]
  }
  
  extension [Self <: BluetoothRequestDeviceFilter](x: Self) {
    
    inline def setManufacturerId(value: Double): Self = StObject.set(x, "manufacturerId", value.asInstanceOf[js.Any])
    
    inline def setManufacturerIdUndefined: Self = StObject.set(x, "manufacturerId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamePrefix(value: String): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
    
    inline def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setServiceDataUUID(value: BluetoothServiceUUID): Self = StObject.set(x, "serviceDataUUID", value.asInstanceOf[js.Any])
    
    inline def setServiceDataUUIDUndefined: Self = StObject.set(x, "serviceDataUUID", js.undefined)
    
    inline def setServices(value: js.Array[BluetoothServiceUUID]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setServicesVarargs(value: BluetoothServiceUUID*): Self = StObject.set(x, "services", js.Array(value :_*))
  }
}
