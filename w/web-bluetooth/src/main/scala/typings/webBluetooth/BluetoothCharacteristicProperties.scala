package typings.webBluetooth

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
    val __obj = js.Dynamic.literal(authenticatedSignedWrites = authenticatedSignedWrites.asInstanceOf[js.Any], broadcast = broadcast.asInstanceOf[js.Any], indicate = indicate.asInstanceOf[js.Any], notify = notify.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], reliableWrite = reliableWrite.asInstanceOf[js.Any], writableAuxiliaries = writableAuxiliaries.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any], writeWithoutResponse = writeWithoutResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BluetoothCharacteristicProperties]
  }
}

