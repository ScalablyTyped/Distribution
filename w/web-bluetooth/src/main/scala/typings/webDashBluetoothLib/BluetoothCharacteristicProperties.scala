package typings
package webDashBluetoothLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BluetoothCharacteristicProperties extends js.Object {
  val authenticatedSignedWrites: scala.Boolean
  val broadcast: scala.Boolean
  val indicate: scala.Boolean
  @JSName("notify")
  val notify_FBluetoothCharacteristicProperties: scala.Boolean
  val read: scala.Boolean
  val reliableWrite: scala.Boolean
  val writableAuxiliaries: scala.Boolean
  val write: scala.Boolean
  val writeWithoutResponse: scala.Boolean
}

object BluetoothCharacteristicProperties {
  @scala.inline
  def apply(
    authenticatedSignedWrites: scala.Boolean,
    broadcast: scala.Boolean,
    indicate: scala.Boolean,
    notify: scala.Boolean,
    read: scala.Boolean,
    reliableWrite: scala.Boolean,
    writableAuxiliaries: scala.Boolean,
    write: scala.Boolean,
    writeWithoutResponse: scala.Boolean
  ): BluetoothCharacteristicProperties = {
    val __obj = js.Dynamic.literal(authenticatedSignedWrites = authenticatedSignedWrites, broadcast = broadcast, indicate = indicate, notify = notify, read = read, reliableWrite = reliableWrite, writableAuxiliaries = writableAuxiliaries, write = write, writeWithoutResponse = writeWithoutResponse)
  
    __obj.asInstanceOf[BluetoothCharacteristicProperties]
  }
}

