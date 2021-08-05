package typings.webBluetooth

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BluetoothDeviceEventHandlers extends StObject {
  
  def onadvertisementreceived(ev: Event): js.Any
  
  def ongattserverdisconnected(ev: Event): js.Any
}
object BluetoothDeviceEventHandlers {
  
  inline def apply(onadvertisementreceived: Event => js.Any, ongattserverdisconnected: Event => js.Any): BluetoothDeviceEventHandlers = {
    val __obj = js.Dynamic.literal(onadvertisementreceived = js.Any.fromFunction1(onadvertisementreceived), ongattserverdisconnected = js.Any.fromFunction1(ongattserverdisconnected))
    __obj.asInstanceOf[BluetoothDeviceEventHandlers]
  }
  
  extension [Self <: BluetoothDeviceEventHandlers](x: Self) {
    
    inline def setOnadvertisementreceived(value: Event => js.Any): Self = StObject.set(x, "onadvertisementreceived", js.Any.fromFunction1(value))
    
    inline def setOngattserverdisconnected(value: Event => js.Any): Self = StObject.set(x, "ongattserverdisconnected", js.Any.fromFunction1(value))
  }
}
