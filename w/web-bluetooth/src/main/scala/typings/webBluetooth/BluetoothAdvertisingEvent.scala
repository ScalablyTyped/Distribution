package typings.webBluetooth

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BluetoothAdvertisingEvent
  extends StObject
     with Event {
  
  val appearance: js.UndefOr[Double] = js.native
  
  val device: BluetoothDevice = js.native
  
  val manufacturerData: BluetoothManufacturerData = js.native
  
  val name: js.UndefOr[String] = js.native
  
  val rssi: js.UndefOr[Double] = js.native
  
  val serviceData: BluetoothServiceData = js.native
  
  val txPower: js.UndefOr[Double] = js.native
  
  val uuids: js.Array[BluetoothServiceUUID] = js.native
}
