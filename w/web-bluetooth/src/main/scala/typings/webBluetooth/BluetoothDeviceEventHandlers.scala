package typings.webBluetooth

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BluetoothDeviceEventHandlers extends js.Object {
  def onadvertisementreceived(ev: Event): js.Any
  def ongattserverdisconnected(ev: Event): js.Any
}

object BluetoothDeviceEventHandlers {
  @scala.inline
  def apply(onadvertisementreceived: Event => js.Any, ongattserverdisconnected: Event => js.Any): BluetoothDeviceEventHandlers = {
    val __obj = js.Dynamic.literal(onadvertisementreceived = js.Any.fromFunction1(onadvertisementreceived), ongattserverdisconnected = js.Any.fromFunction1(ongattserverdisconnected))
    __obj.asInstanceOf[BluetoothDeviceEventHandlers]
  }
}

