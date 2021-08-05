package typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A Bluetooth LE advertisement section. */
trait BluetoothLEAdvertisementDataSection extends StObject {
  
  /** The Bluetooth LE advertisement data payload. */
  var data: IBuffer
  
  /** The Bluetooth LE advertisement data type as defined by the Bluetooth Special Interest Group (SIG). */
  var dataType: Double
}
object BluetoothLEAdvertisementDataSection {
  
  inline def apply(data: IBuffer, dataType: Double): BluetoothLEAdvertisementDataSection = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothLEAdvertisementDataSection]
  }
  
  extension [Self <: BluetoothLEAdvertisementDataSection](x: Self) {
    
    inline def setData(value: IBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataType(value: Double): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
  }
}
