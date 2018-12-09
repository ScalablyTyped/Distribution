package typings
package webDashBluetoothLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BluetoothRemoteGATTService
  extends stdLib.EventTarget
     with CharacteristicEventHandlers
     with ServiceEventHandlers {
  val device: BluetoothDevice = js.native
  val isPrimary: scala.Boolean = js.native
  val uuid: java.lang.String = js.native
  @JSName("addEventListener")
  def addEventListener_serviceadded(
    `type`: webDashBluetoothLib.webDashBluetoothLibStrings.serviceadded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_serviceadded(
    `type`: webDashBluetoothLib.webDashBluetoothLibStrings.serviceadded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_servicechanged(
    `type`: webDashBluetoothLib.webDashBluetoothLibStrings.servicechanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_servicechanged(
    `type`: webDashBluetoothLib.webDashBluetoothLibStrings.servicechanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_serviceremoved(
    `type`: webDashBluetoothLib.webDashBluetoothLibStrings.serviceremoved,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_serviceremoved(
    `type`: webDashBluetoothLib.webDashBluetoothLibStrings.serviceremoved,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def getCharacteristic(characteristic: BluetoothCharacteristicUUID): js.Promise[BluetoothRemoteGATTCharacteristic] = js.native
  def getCharacteristics(): js.Promise[js.Array[BluetoothRemoteGATTCharacteristic]] = js.native
  def getCharacteristics(characteristic: BluetoothCharacteristicUUID): js.Promise[js.Array[BluetoothRemoteGATTCharacteristic]] = js.native
  def getIncludedService(service: BluetoothServiceUUID): js.Promise[BluetoothRemoteGATTService] = js.native
  def getIncludedServices(): js.Promise[js.Array[BluetoothRemoteGATTService]] = js.native
  def getIncludedServices(service: BluetoothServiceUUID): js.Promise[js.Array[BluetoothRemoteGATTService]] = js.native
}

