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
  def getCharacteristic(characteristic: BluetoothCharacteristicUUID): stdLib.Promise[BluetoothRemoteGATTCharacteristic] = js.native
  def getCharacteristics(): stdLib.Promise[js.Array[BluetoothRemoteGATTCharacteristic]] = js.native
  def getCharacteristics(characteristic: BluetoothCharacteristicUUID): stdLib.Promise[js.Array[BluetoothRemoteGATTCharacteristic]] = js.native
  def getIncludedService(service: BluetoothServiceUUID): stdLib.Promise[BluetoothRemoteGATTService] = js.native
  def getIncludedServices(): stdLib.Promise[js.Array[BluetoothRemoteGATTService]] = js.native
  def getIncludedServices(service: BluetoothServiceUUID): stdLib.Promise[js.Array[BluetoothRemoteGATTService]] = js.native
}

