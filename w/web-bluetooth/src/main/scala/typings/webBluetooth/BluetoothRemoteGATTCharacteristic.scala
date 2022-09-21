package typings.webBluetooth

import typings.std.BufferSource
import typings.std.Event
import typings.std.EventTarget
import typings.webBluetooth.webBluetoothStrings.characteristicvaluechanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BluetoothRemoteGATTCharacteristic
  extends StObject
     with EventTarget
     with CharacteristicEventHandlers {
  
  @JSName("addEventListener")
  def addEventListener_characteristicvaluechanged(
    `type`: characteristicvaluechanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_characteristicvaluechanged(
    `type`: characteristicvaluechanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    useCapture: Boolean
  ): Unit = js.native
  
  def getDescriptor(descriptor: BluetoothDescriptorUUID): js.Promise[BluetoothRemoteGATTDescriptor] = js.native
  
  def getDescriptors(): js.Promise[js.Array[BluetoothRemoteGATTDescriptor]] = js.native
  def getDescriptors(descriptor: BluetoothDescriptorUUID): js.Promise[js.Array[BluetoothRemoteGATTDescriptor]] = js.native
  
  val properties: BluetoothCharacteristicProperties = js.native
  
  def readValue(): js.Promise[js.typedarray.DataView] = js.native
  
  val service: BluetoothRemoteGATTService = js.native
  
  def startNotifications(): js.Promise[BluetoothRemoteGATTCharacteristic] = js.native
  
  def stopNotifications(): js.Promise[BluetoothRemoteGATTCharacteristic] = js.native
  
  val uuid: String = js.native
  
  val value: js.UndefOr[js.typedarray.DataView] = js.native
  
  def writeValue(value: BufferSource): js.Promise[Unit] = js.native
  
  def writeValueWithResponse(value: BufferSource): js.Promise[Unit] = js.native
  
  def writeValueWithoutResponse(value: BufferSource): js.Promise[Unit] = js.native
}
