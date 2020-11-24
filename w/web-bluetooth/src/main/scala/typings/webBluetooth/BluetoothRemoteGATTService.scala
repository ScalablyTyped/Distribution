package typings.webBluetooth

import typings.std.Event
import typings.std.EventTarget
import typings.webBluetooth.webBluetoothStrings.serviceadded
import typings.webBluetooth.webBluetoothStrings.servicechanged
import typings.webBluetooth.webBluetoothStrings.serviceremoved
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BluetoothRemoteGATTService
  extends EventTarget
     with CharacteristicEventHandlers
     with ServiceEventHandlers {
  
  @JSName("addEventListener")
  def addEventListener_serviceadded(`type`: serviceadded, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_serviceadded(
    `type`: serviceadded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_servicechanged(`type`: servicechanged, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_servicechanged(
    `type`: servicechanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_serviceremoved(`type`: serviceremoved, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_serviceremoved(
    `type`: serviceremoved,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  
  val device: BluetoothDevice = js.native
  
  def getCharacteristic(characteristic: BluetoothCharacteristicUUID): js.Promise[BluetoothRemoteGATTCharacteristic] = js.native
  
  def getCharacteristics(): js.Promise[js.Array[BluetoothRemoteGATTCharacteristic]] = js.native
  def getCharacteristics(characteristic: BluetoothCharacteristicUUID): js.Promise[js.Array[BluetoothRemoteGATTCharacteristic]] = js.native
  
  def getIncludedService(service: BluetoothServiceUUID): js.Promise[BluetoothRemoteGATTService] = js.native
  
  def getIncludedServices(): js.Promise[js.Array[BluetoothRemoteGATTService]] = js.native
  def getIncludedServices(service: BluetoothServiceUUID): js.Promise[js.Array[BluetoothRemoteGATTService]] = js.native
  
  val isPrimary: Boolean = js.native
  
  val uuid: String = js.native
}
