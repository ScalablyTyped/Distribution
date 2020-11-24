package typings.webBluetooth

import typings.std.Event
import typings.std.EventTarget
import typings.webBluetooth.webBluetoothStrings.advertisementreceived
import typings.webBluetooth.webBluetoothStrings.gattserverdisconnected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BluetoothDevice
  extends EventTarget
     with BluetoothDeviceEventHandlers
     with CharacteristicEventHandlers
     with ServiceEventHandlers {
  
  @JSName("addEventListener")
  def addEventListener_advertisementreceived(`type`: advertisementreceived, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_advertisementreceived(
    `type`: advertisementreceived,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gattserverdisconnected(
    `type`: gattserverdisconnected,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gattserverdisconnected(
    `type`: gattserverdisconnected,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  
  val gatt: js.UndefOr[BluetoothRemoteGATTServer] = js.native
  
  val id: String = js.native
  
  val name: js.UndefOr[String] = js.native
  
  def unwatchAdvertisements(): Unit = js.native
  
  val uuids: js.UndefOr[js.Array[String]] = js.native
  
  def watchAdvertisements(): js.Promise[Unit] = js.native
  
  val watchingAdvertisements: Boolean = js.native
}
