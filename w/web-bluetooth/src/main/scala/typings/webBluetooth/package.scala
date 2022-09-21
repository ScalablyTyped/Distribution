package typings.webBluetooth

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BluetoothCharacteristicUUID = Double | String

type BluetoothDescriptorUUID = Double | String

type BluetoothManufacturerData = Map[Double, js.typedarray.DataView]

type BluetoothServiceData = Map[BluetoothServiceUUID, js.typedarray.DataView]

type BluetoothServiceUUID = Double | String
