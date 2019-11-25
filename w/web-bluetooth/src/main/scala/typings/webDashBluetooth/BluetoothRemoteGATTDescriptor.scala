package typings.webDashBluetooth

import typings.std.BufferSource
import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BluetoothRemoteGATTDescriptor extends js.Object {
  val characteristic: BluetoothRemoteGATTCharacteristic
  val uuid: String
  val value: js.UndefOr[DataView] = js.undefined
  def readValue(): js.Promise[DataView]
  def writeValue(value: BufferSource): js.Promise[Unit]
}

object BluetoothRemoteGATTDescriptor {
  @scala.inline
  def apply(
    characteristic: BluetoothRemoteGATTCharacteristic,
    readValue: () => js.Promise[DataView],
    uuid: String,
    writeValue: BufferSource => js.Promise[Unit],
    value: DataView = null
  ): BluetoothRemoteGATTDescriptor = {
    val __obj = js.Dynamic.literal(characteristic = characteristic.asInstanceOf[js.Any], readValue = js.Any.fromFunction0(readValue), uuid = uuid.asInstanceOf[js.Any], writeValue = js.Any.fromFunction1(writeValue))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothRemoteGATTDescriptor]
  }
}

