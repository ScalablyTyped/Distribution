package typings
package webDashBluetoothLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BluetoothRemoteGATTServer
  extends stdLib.EventTarget {
  val connected: scala.Boolean = js.native
  val device: BluetoothDevice = js.native
  def connect(): stdLib.Promise[BluetoothRemoteGATTServer] = js.native
  def disconnect(): scala.Unit = js.native
  def getPrimaryService(service: BluetoothServiceUUID): stdLib.Promise[BluetoothRemoteGATTService] = js.native
  def getPrimaryServices(): stdLib.Promise[js.Array[BluetoothRemoteGATTService]] = js.native
  def getPrimaryServices(service: BluetoothServiceUUID): stdLib.Promise[js.Array[BluetoothRemoteGATTService]] = js.native
}

