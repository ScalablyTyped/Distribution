package typings.webBluetooth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BluetoothServiceDataFilter
  extends StObject
     with BluetoothDataFilter {
  
  var service: BluetoothServiceUUID
}
object BluetoothServiceDataFilter {
  
  inline def apply(service: BluetoothServiceUUID): BluetoothServiceDataFilter = {
    val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothServiceDataFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BluetoothServiceDataFilter] (val x: Self) extends AnyVal {
    
    inline def setService(value: BluetoothServiceUUID): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
  }
}
