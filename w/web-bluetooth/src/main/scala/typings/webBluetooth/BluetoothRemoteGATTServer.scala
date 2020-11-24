package typings.webBluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BluetoothRemoteGATTServer extends js.Object {
  
  def connect(): js.Promise[BluetoothRemoteGATTServer] = js.native
  
  val connected: Boolean = js.native
  
  val device: BluetoothDevice = js.native
  
  def disconnect(): Unit = js.native
  
  def getPrimaryService(service: BluetoothServiceUUID): js.Promise[BluetoothRemoteGATTService] = js.native
  
  def getPrimaryServices(): js.Promise[js.Array[BluetoothRemoteGATTService]] = js.native
  def getPrimaryServices(service: BluetoothServiceUUID): js.Promise[js.Array[BluetoothRemoteGATTService]] = js.native
}
