package typings.webBluetooth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestLEScanOptions extends StObject {
  
  val acceptAllAdvertisements: js.UndefOr[Boolean] = js.undefined
  
  val filters: js.UndefOr[js.Array[BluetoothLEScanFilter]] = js.undefined
  
  val keepRepeatedDevices: js.UndefOr[Boolean] = js.undefined
}
object RequestLEScanOptions {
  
  inline def apply(): RequestLEScanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestLEScanOptions]
  }
  
  extension [Self <: RequestLEScanOptions](x: Self) {
    
    inline def setAcceptAllAdvertisements(value: Boolean): Self = StObject.set(x, "acceptAllAdvertisements", value.asInstanceOf[js.Any])
    
    inline def setAcceptAllAdvertisementsUndefined: Self = StObject.set(x, "acceptAllAdvertisements", js.undefined)
    
    inline def setFilters(value: js.Array[BluetoothLEScanFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: BluetoothLEScanFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    inline def setKeepRepeatedDevices(value: Boolean): Self = StObject.set(x, "keepRepeatedDevices", value.asInstanceOf[js.Any])
    
    inline def setKeepRepeatedDevicesUndefined: Self = StObject.set(x, "keepRepeatedDevices", js.undefined)
  }
}
