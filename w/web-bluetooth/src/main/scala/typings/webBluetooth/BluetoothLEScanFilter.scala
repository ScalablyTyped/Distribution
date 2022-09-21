package typings.webBluetooth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BluetoothLEScanFilter extends StObject {
  
  val manufacturerData: js.UndefOr[js.Array[BluetoothManufacturerDataFilter]] = js.undefined
  
  val name: js.UndefOr[String] = js.undefined
  
  val namePrefix: js.UndefOr[String] = js.undefined
  
  val serviceData: js.UndefOr[js.Array[BluetoothServiceDataFilter]] = js.undefined
  
  val services: js.UndefOr[js.Array[BluetoothServiceUUID]] = js.undefined
}
object BluetoothLEScanFilter {
  
  inline def apply(): BluetoothLEScanFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BluetoothLEScanFilter]
  }
  
  extension [Self <: BluetoothLEScanFilter](x: Self) {
    
    inline def setManufacturerData(value: js.Array[BluetoothManufacturerDataFilter]): Self = StObject.set(x, "manufacturerData", value.asInstanceOf[js.Any])
    
    inline def setManufacturerDataUndefined: Self = StObject.set(x, "manufacturerData", js.undefined)
    
    inline def setManufacturerDataVarargs(value: BluetoothManufacturerDataFilter*): Self = StObject.set(x, "manufacturerData", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamePrefix(value: String): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
    
    inline def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setServiceData(value: js.Array[BluetoothServiceDataFilter]): Self = StObject.set(x, "serviceData", value.asInstanceOf[js.Any])
    
    inline def setServiceDataUndefined: Self = StObject.set(x, "serviceData", js.undefined)
    
    inline def setServiceDataVarargs(value: BluetoothServiceDataFilter*): Self = StObject.set(x, "serviceData", js.Array(value*))
    
    inline def setServices(value: js.Array[BluetoothServiceUUID]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setServicesVarargs(value: BluetoothServiceUUID*): Self = StObject.set(x, "services", js.Array(value*))
  }
}
