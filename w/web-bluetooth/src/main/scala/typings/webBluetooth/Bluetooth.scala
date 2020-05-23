package typings.webBluetooth

import typings.std.Event
import typings.std.EventTarget
import typings.webBluetooth.webBluetoothStrings.availabilitychanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bluetooth
  extends EventTarget
     with BluetoothDeviceEventHandlers
     with CharacteristicEventHandlers
     with ServiceEventHandlers {
  val referringDevice: js.UndefOr[BluetoothDevice] = js.native
  @JSName("addEventListener")
  def addEventListener_availabilitychanged(`type`: availabilitychanged, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_availabilitychanged(
    `type`: availabilitychanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  def getAvailability(): js.Promise[Boolean] = js.native
  def onavailabilitychanged(ev: Event): js.Any = js.native
  def requestDevice(): js.Promise[BluetoothDevice] = js.native
  def requestDevice(options: RequestDeviceOptions): js.Promise[BluetoothDevice] = js.native
}

