package typings
package webDashBluetoothLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bluetooth
  extends stdLib.EventTarget
     with BluetoothDeviceEventHandlers
     with CharacteristicEventHandlers
     with ServiceEventHandlers {
  val referringDevice: js.UndefOr[BluetoothDevice] = js.native
  @JSName("addEventListener")
  def addEventListener_availabilitychanged(
    `type`: webDashBluetoothLib.webDashBluetoothLibStrings.availabilitychanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_availabilitychanged(
    `type`: webDashBluetoothLib.webDashBluetoothLibStrings.availabilitychanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def getAvailability(): js.Promise[scala.Boolean] = js.native
  def onavailabilitychanged(`this`: this.type, ev: stdLib.Event): js.Any = js.native
  def requestDevice(): js.Promise[BluetoothDevice] = js.native
  def requestDevice(options: RequestDeviceOptions): js.Promise[BluetoothDevice] = js.native
}

