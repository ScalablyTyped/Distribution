package typings.webBluetooth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestLEScanOptions extends StObject {
  
  val acceptAllAdvertisements: js.UndefOr[Boolean] = js.native
  
  val filters: js.UndefOr[js.Array[BluetoothLEScanFilter]] = js.native
  
  val keepRepeatedDevices: js.UndefOr[Boolean] = js.native
}
object RequestLEScanOptions {
  
  @scala.inline
  def apply(): RequestLEScanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestLEScanOptions]
  }
  
  @scala.inline
  implicit class RequestLEScanOptionsMutableBuilder[Self <: RequestLEScanOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptAllAdvertisements(value: Boolean): Self = StObject.set(x, "acceptAllAdvertisements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptAllAdvertisementsUndefined: Self = StObject.set(x, "acceptAllAdvertisements", js.undefined)
    
    @scala.inline
    def setFilters(value: js.Array[BluetoothLEScanFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: BluetoothLEScanFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setKeepRepeatedDevices(value: Boolean): Self = StObject.set(x, "keepRepeatedDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepRepeatedDevicesUndefined: Self = StObject.set(x, "keepRepeatedDevices", js.undefined)
  }
}
