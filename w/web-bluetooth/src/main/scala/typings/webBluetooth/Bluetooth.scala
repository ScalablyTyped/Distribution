package typings.webBluetooth

import typings.std.Event
import typings.std.EventTarget
import typings.webBluetooth.webBluetoothStrings.advertisementreceived
import typings.webBluetooth.webBluetoothStrings.availabilitychanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bluetooth
  extends EventTarget
     with BluetoothDeviceEventHandlers
     with CharacteristicEventHandlers
     with ServiceEventHandlers {
  
  @JSName("addEventListener")
  def addEventListener_advertisementreceived(
    `type`: advertisementreceived,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ BluetoothAdvertisementEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_advertisementreceived(
    `type`: advertisementreceived,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ BluetoothAdvertisementEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_availabilitychanged(`type`: availabilitychanged, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_availabilitychanged(
    `type`: availabilitychanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  
  def getAvailability(): js.Promise[Boolean] = js.native
  
  def getDevices(): js.Promise[js.Array[BluetoothDevice]] = js.native
  
  def onavailabilitychanged(ev: Event): js.Any = js.native
  
  val referringDevice: js.UndefOr[BluetoothDevice] = js.native
  
  def requestDevice(): js.Promise[BluetoothDevice] = js.native
  def requestDevice(options: RequestDeviceOptions): js.Promise[BluetoothDevice] = js.native
  
  def requestLEScan(): js.Promise[BluetoothLEScan] = js.native
  def requestLEScan(options: RequestLEScanOptions): js.Promise[BluetoothLEScan] = js.native
}
