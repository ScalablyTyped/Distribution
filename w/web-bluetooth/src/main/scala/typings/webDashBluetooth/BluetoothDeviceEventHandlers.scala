package typings.webDashBluetooth

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BluetoothDeviceEventHandlers extends js.Object {
  def ongattserverdisconnected(`this`: this.type, ev: Event): js.Any
}

object BluetoothDeviceEventHandlers {
  @scala.inline
  def apply(ongattserverdisconnected: (BluetoothDeviceEventHandlers, Event) => js.Any): BluetoothDeviceEventHandlers = {
    val __obj = js.Dynamic.literal(ongattserverdisconnected = js.Any.fromFunction2(ongattserverdisconnected))
  
    __obj.asInstanceOf[BluetoothDeviceEventHandlers]
  }
}

