package typings.webBluetooth

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BluetoothAdvertisementEvent extends Event {
  
  var device: BluetoothDevice = js.native
  
  var manufacturerData: js.UndefOr[BluetoothManufacturerData] = js.native
  
  var rssi: Double = js.native
  
  var serviceData: js.UndefOr[BluetoothServiceData] = js.native
  
  var txPower: Double = js.native
  
  var uuids: js.UndefOr[js.Array[BluetoothServiceUUID]] = js.native
}
