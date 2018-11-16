package typings
package webDashBluetoothLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BluetoothRemoteGATTCharacteristic
  extends stdLib.EventTarget
     with CharacteristicEventHandlers {
  val properties: BluetoothCharacteristicProperties = js.native
  val service: js.UndefOr[BluetoothRemoteGATTService] = js.native
  val uuid: java.lang.String = js.native
  val value: js.UndefOr[stdLib.DataView] = js.native
  @JSName("addEventListener")
  def addEventListener_characteristicvaluechanged(
    `type`: webDashBluetoothLib.webDashBluetoothLibStrings.characteristicvaluechanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_characteristicvaluechanged(
    `type`: webDashBluetoothLib.webDashBluetoothLibStrings.characteristicvaluechanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def getDescriptor(descriptor: BluetoothDescriptorUUID): stdLib.Promise[BluetoothRemoteGATTDescriptor] = js.native
  def getDescriptors(): stdLib.Promise[js.Array[BluetoothRemoteGATTDescriptor]] = js.native
  def getDescriptors(descriptor: BluetoothDescriptorUUID): stdLib.Promise[js.Array[BluetoothRemoteGATTDescriptor]] = js.native
  def readValue(): stdLib.Promise[stdLib.DataView] = js.native
  def startNotifications(): stdLib.Promise[BluetoothRemoteGATTCharacteristic] = js.native
  def stopNotifications(): stdLib.Promise[BluetoothRemoteGATTCharacteristic] = js.native
  def writeValue(value: stdLib.BufferSource): stdLib.Promise[scala.Unit] = js.native
}

