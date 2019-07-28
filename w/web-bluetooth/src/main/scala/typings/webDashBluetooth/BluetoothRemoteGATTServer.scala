package typings.webDashBluetooth

import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BluetoothRemoteGATTServer extends EventTarget {
  val connected: Boolean = js.native
  val device: BluetoothDevice = js.native
  def connect(): js.Promise[BluetoothRemoteGATTServer] = js.native
  def disconnect(): Unit = js.native
  def getPrimaryService(service: BluetoothServiceUUID): js.Promise[BluetoothRemoteGATTService] = js.native
  def getPrimaryServices(): js.Promise[js.Array[BluetoothRemoteGATTService]] = js.native
  def getPrimaryServices(service: BluetoothServiceUUID): js.Promise[js.Array[BluetoothRemoteGATTService]] = js.native
}

