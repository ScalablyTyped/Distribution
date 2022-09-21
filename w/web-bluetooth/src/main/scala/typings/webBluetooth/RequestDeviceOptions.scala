package typings.webBluetooth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.webBluetooth.anon.Filters
  - typings.webBluetooth.anon.AcceptAllDevices
*/
trait RequestDeviceOptions extends StObject
object RequestDeviceOptions {
  
  inline def AcceptAllDevices(acceptAllDevices: Boolean): typings.webBluetooth.anon.AcceptAllDevices = {
    val __obj = js.Dynamic.literal(acceptAllDevices = acceptAllDevices.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.webBluetooth.anon.AcceptAllDevices]
  }
  
  inline def Filters(filters: js.Array[BluetoothLEScanFilter]): typings.webBluetooth.anon.Filters = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.webBluetooth.anon.Filters]
  }
}
