package typings.webDashBluetooth

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BluetoothDeviceEventHandlers extends js.Object {
  def ongattserverdisconnected(ev: Event): js.Any
}

object BluetoothDeviceEventHandlers {
  @scala.inline
  def apply(ongattserverdisconnected: Event => js.Any): BluetoothDeviceEventHandlers = {
    val __obj = js.Dynamic.literal(ongattserverdisconnected = js.Any.fromFunction1(ongattserverdisconnected))
  
    __obj.asInstanceOf[BluetoothDeviceEventHandlers]
  }
}

