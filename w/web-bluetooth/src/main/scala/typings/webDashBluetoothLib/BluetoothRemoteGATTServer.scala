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
  def connect(): js.Promise[BluetoothRemoteGATTServer] = js.native
  def disconnect(): scala.Unit = js.native
  def getPrimaryService(service: BluetoothServiceUUID): js.Promise[BluetoothRemoteGATTService] = js.native
  def getPrimaryServices(): js.Promise[js.Array[BluetoothRemoteGATTService]] = js.native
  def getPrimaryServices(service: BluetoothServiceUUID): js.Promise[js.Array[BluetoothRemoteGATTService]] = js.native
}

