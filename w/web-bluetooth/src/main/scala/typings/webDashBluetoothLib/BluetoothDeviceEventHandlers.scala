package typings
package webDashBluetoothLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BluetoothDeviceEventHandlers extends js.Object {
  def ongattserverdisconnected(`this`: this.type, ev: stdLib.Event): js.Any
}

object BluetoothDeviceEventHandlers {
  @scala.inline
  def apply(ongattserverdisconnected: (BluetoothDeviceEventHandlers, stdLib.Event) => js.Any): BluetoothDeviceEventHandlers = {
    val __obj = js.Dynamic.literal(ongattserverdisconnected = js.Any.fromFunction2(ongattserverdisconnected))
  
    __obj.asInstanceOf[BluetoothDeviceEventHandlers]
  }
}

