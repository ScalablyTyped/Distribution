package typings.webBluetooth

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BluetoothDeviceEventHandlers extends StObject {
  
  def onadvertisementreceived(ev: BluetoothAdvertisingEvent): Any
  
  def ongattserverdisconnected(ev: Event): Any
}
object BluetoothDeviceEventHandlers {
  
  inline def apply(onadvertisementreceived: BluetoothAdvertisingEvent => Any, ongattserverdisconnected: Event => Any): BluetoothDeviceEventHandlers = {
    val __obj = js.Dynamic.literal(onadvertisementreceived = js.Any.fromFunction1(onadvertisementreceived), ongattserverdisconnected = js.Any.fromFunction1(ongattserverdisconnected))
    __obj.asInstanceOf[BluetoothDeviceEventHandlers]
  }
  
  extension [Self <: BluetoothDeviceEventHandlers](x: Self) {
    
    inline def setOnadvertisementreceived(value: BluetoothAdvertisingEvent => Any): Self = StObject.set(x, "onadvertisementreceived", js.Any.fromFunction1(value))
    
    inline def setOngattserverdisconnected(value: Event => Any): Self = StObject.set(x, "ongattserverdisconnected", js.Any.fromFunction1(value))
  }
}
