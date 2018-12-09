package typings
package webDashBluetoothLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BluetoothDevice
  extends stdLib.EventTarget
     with BluetoothDeviceEventHandlers
     with CharacteristicEventHandlers
     with ServiceEventHandlers {
  val gatt: js.UndefOr[BluetoothRemoteGATTServer] = js.native
  val id: java.lang.String = js.native
  val name: js.UndefOr[java.lang.String] = js.native
  val uuids: js.UndefOr[js.Array[java.lang.String]] = js.native
  val watchingAdvertisements: scala.Boolean = js.native
  @JSName("addEventListener")
  def addEventListener_advertisementreceived(
    `type`: webDashBluetoothLib.webDashBluetoothLibStrings.advertisementreceived,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_advertisementreceived(
    `type`: webDashBluetoothLib.webDashBluetoothLibStrings.advertisementreceived,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gattserverdisconnected(
    `type`: webDashBluetoothLib.webDashBluetoothLibStrings.gattserverdisconnected,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gattserverdisconnected(
    `type`: webDashBluetoothLib.webDashBluetoothLibStrings.gattserverdisconnected,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def unwatchAdvertisements(): scala.Unit = js.native
  def watchAdvertisements(): js.Promise[scala.Unit] = js.native
}

