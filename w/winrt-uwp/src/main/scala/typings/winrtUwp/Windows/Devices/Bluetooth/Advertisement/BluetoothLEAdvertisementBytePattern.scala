package typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A Bluetooth LE advertisement byte pattern for filters to match. */
@js.native
trait BluetoothLEAdvertisementBytePattern extends StObject {
  
  /** The Bluetooth LE advertisement data byte pattern to match. */
  var data: IBuffer = js.native
  
  /** The Bluetooth LE advertisement data type defined by the Bluetooth Special Interest Group (SIG) to match. */
  var dataType: Double = js.native
  
  /** The offset of byte pattern from beginning of advertisement data section. */
  var offset: Double = js.native
}
object BluetoothLEAdvertisementBytePattern {
  
  @scala.inline
  def apply(data: IBuffer, dataType: Double, offset: Double): BluetoothLEAdvertisementBytePattern = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothLEAdvertisementBytePattern]
  }
  
  @scala.inline
  implicit class BluetoothLEAdvertisementBytePatternMutableBuilder[Self <: BluetoothLEAdvertisementBytePattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: IBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataType(value: Double): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
