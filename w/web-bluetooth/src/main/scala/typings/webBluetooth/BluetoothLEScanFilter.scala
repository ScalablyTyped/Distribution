package typings.webBluetooth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BluetoothLEScanFilter extends StObject {
  
  val manufacturerData: js.UndefOr[BluetoothManufacturerDataFilter] = js.native
  
  val name: js.UndefOr[String] = js.native
  
  val namePrefix: js.UndefOr[String] = js.native
  
  val serviceData: js.UndefOr[BluetoothServiceDataFilter] = js.native
  
  val services: js.UndefOr[js.Array[BluetoothServiceUUID]] = js.native
}
object BluetoothLEScanFilter {
  
  @scala.inline
  def apply(): BluetoothLEScanFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BluetoothLEScanFilter]
  }
  
  @scala.inline
  implicit class BluetoothLEScanFilterMutableBuilder[Self <: BluetoothLEScanFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManufacturerData(value: BluetoothManufacturerDataFilter): Self = StObject.set(x, "manufacturerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturerDataUndefined: Self = StObject.set(x, "manufacturerData", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamePrefix(value: String): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setServiceData(value: BluetoothServiceDataFilter): Self = StObject.set(x, "serviceData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceDataUndefined: Self = StObject.set(x, "serviceData", js.undefined)
    
    @scala.inline
    def setServices(value: js.Array[BluetoothServiceUUID]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    @scala.inline
    def setServicesVarargs(value: BluetoothServiceUUID*): Self = StObject.set(x, "services", js.Array(value :_*))
  }
}
