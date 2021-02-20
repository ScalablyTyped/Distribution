package typings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object webBluetooth {
  
  type BluetoothCharacteristicUUID = scala.Double | java.lang.String
  
  type BluetoothDescriptorUUID = scala.Double | java.lang.String
  
  type BluetoothManufacturerData = typings.std.Map[scala.Double, typings.std.DataView]
  
  type BluetoothManufacturerDataFilter = org.scalablytyped.runtime.NumberDictionary[typings.webBluetooth.BluetoothDataFilter]
  
  type BluetoothServiceData = typings.std.Map[typings.webBluetooth.BluetoothServiceUUID, typings.std.DataView]
  
  type BluetoothServiceDataFilter = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ serviceUUID in web-bluetooth.BluetoothServiceUUID ]: web-bluetooth.BluetoothDataFilter}
    */ typings.webBluetooth.webBluetoothStrings.BluetoothServiceDataFilter with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type BluetoothServiceUUID = scala.Double | java.lang.String
}
