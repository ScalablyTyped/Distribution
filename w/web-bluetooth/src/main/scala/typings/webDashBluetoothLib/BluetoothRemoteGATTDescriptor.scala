package typings
package webDashBluetoothLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BluetoothRemoteGATTDescriptor extends js.Object {
  val characteristic: BluetoothRemoteGATTCharacteristic
  val uuid: java.lang.String
  val value: js.UndefOr[stdLib.DataView] = js.undefined
  def readValue(): stdLib.Promise[stdLib.DataView]
  def writeValue(value: stdLib.BufferSource): stdLib.Promise[scala.Unit]
}

