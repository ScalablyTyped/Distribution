package typings.webBluetooth

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BluetoothDeviceEventHandlers extends js.Object {
  
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
  implicit class BluetoothDeviceEventHandlersOps[Self <: BluetoothDeviceEventHandlers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnadvertisementreceived(value: Event => js.Any): Self = this.set("onadvertisementreceived", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOngattserverdisconnected(value: Event => js.Any): Self = this.set("ongattserverdisconnected", js.Any.fromFunction1(value))
  }
}
