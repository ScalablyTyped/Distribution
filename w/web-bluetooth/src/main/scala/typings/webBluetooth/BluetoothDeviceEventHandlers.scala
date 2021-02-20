package typings.webBluetooth

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BluetoothDeviceEventHandlers extends StObject {
  
  def onadvertisementreceived(ev: Event): js.Any = js.native
  
  def ongattserverdisconnected(ev: Event): js.Any = js.native
}
object BluetoothDeviceEventHandlers {
  
  @scala.inline
  def apply(onadvertisementreceived: Event => js.Any, ongattserverdisconnected: Event => js.Any): BluetoothDeviceEventHandlers = {
    val __obj = js.Dynamic.literal(onadvertisementreceived = js.Any.fromFunction1(onadvertisementreceived), ongattserverdisconnected = js.Any.fromFunction1(ongattserverdisconnected))
    __obj.asInstanceOf[BluetoothDeviceEventHandlers]
  }
  
  @scala.inline
  implicit class BluetoothDeviceEventHandlersMutableBuilder[Self <: BluetoothDeviceEventHandlers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnadvertisementreceived(value: Event => js.Any): Self = StObject.set(x, "onadvertisementreceived", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOngattserverdisconnected(value: Event => js.Any): Self = StObject.set(x, "ongattserverdisconnected", js.Any.fromFunction1(value))
  }
}
