package typings.webDashBluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BluetoothCharacteristicProperties extends js.Object {
  val authenticatedSignedWrites: Boolean
  val broadcast: Boolean
  val indicate: Boolean
  @JSName("notify")
  val notify_FBluetoothCharacteristicProperties: Boolean
  val read: Boolean
  val reliableWrite: Boolean
  val writableAuxiliaries: Boolean
  val write: Boolean
  val writeWithoutResponse: Boolean
}

object BluetoothCharacteristicProperties {
  @scala.inline
  def apply(
    authenticatedSignedWrites: Boolean,
    broadcast: Boolean,
    indicate: Boolean,
    notify: Boolean,
    read: Boolean,
    reliableWrite: Boolean,
    writableAuxiliaries: Boolean,
    write: Boolean,
    writeWithoutResponse: Boolean
  ): BluetoothCharacteristicProperties = {
    val __obj = js.Dynamic.literal(authenticatedSignedWrites = authenticatedSignedWrites, broadcast = broadcast, indicate = indicate, notify = notify, read = read, reliableWrite = reliableWrite, writableAuxiliaries = writableAuxiliaries, write = write, writeWithoutResponse = writeWithoutResponse)
  
    __obj.asInstanceOf[BluetoothCharacteristicProperties]
  }
}

