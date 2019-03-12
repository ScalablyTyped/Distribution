package typings
package webDashBluetoothLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BluetoothRemoteGATTDescriptor extends js.Object {
  val characteristic: BluetoothRemoteGATTCharacteristic
  val uuid: java.lang.String
  val value: js.UndefOr[stdLib.DataView] = js.undefined
  def readValue(): js.Promise[stdLib.DataView]
  def writeValue(value: stdLib.BufferSource): js.Promise[scala.Unit]
}

object BluetoothRemoteGATTDescriptor {
  @scala.inline
  def apply(
    characteristic: BluetoothRemoteGATTCharacteristic,
    readValue: () => js.Promise[stdLib.DataView],
    uuid: java.lang.String,
    writeValue: stdLib.BufferSource => js.Promise[scala.Unit],
    value: stdLib.DataView = null
  ): BluetoothRemoteGATTDescriptor = {
    val __obj = js.Dynamic.literal(characteristic = characteristic, readValue = js.Any.fromFunction0(readValue), uuid = uuid, writeValue = js.Any.fromFunction1(writeValue))
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[BluetoothRemoteGATTDescriptor]
  }
}

