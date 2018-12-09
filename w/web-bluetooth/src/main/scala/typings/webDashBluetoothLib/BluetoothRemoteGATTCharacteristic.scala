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
  def getDescriptor(descriptor: BluetoothDescriptorUUID): js.Promise[BluetoothRemoteGATTDescriptor] = js.native
  def getDescriptors(): js.Promise[js.Array[BluetoothRemoteGATTDescriptor]] = js.native
  def getDescriptors(descriptor: BluetoothDescriptorUUID): js.Promise[js.Array[BluetoothRemoteGATTDescriptor]] = js.native
  def readValue(): js.Promise[stdLib.DataView] = js.native
  def startNotifications(): js.Promise[BluetoothRemoteGATTCharacteristic] = js.native
  def stopNotifications(): js.Promise[BluetoothRemoteGATTCharacteristic] = js.native
  def writeValue(value: stdLib.BufferSource): js.Promise[scala.Unit] = js.native
}

