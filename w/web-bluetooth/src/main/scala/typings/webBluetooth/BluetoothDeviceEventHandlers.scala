package typings.webBluetooth

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BluetoothDeviceEventHandlers extends js.Object {
  def onadvertisementreceived(ev: Event_): js.Any
  def ongattserverdisconnected(ev: Event_): js.Any
}

object BluetoothDeviceEventHandlers {
  @scala.inline
  def apply(onadvertisementreceived: Event_ => js.Any, ongattserverdisconnected: Event_ => js.Any): BluetoothDeviceEventHandlers = {
    val __obj = js.Dynamic.literal(onadvertisementreceived = js.Any.fromFunction1(onadvertisementreceived), ongattserverdisconnected = js.Any.fromFunction1(ongattserverdisconnected))
  
    __obj.asInstanceOf[BluetoothDeviceEventHandlers]
  }
}

