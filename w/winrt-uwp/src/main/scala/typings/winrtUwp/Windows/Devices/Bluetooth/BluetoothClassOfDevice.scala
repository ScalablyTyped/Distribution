package typings.winrtUwp.Windows.Devices.Bluetooth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality to determine the Bluetooth Class Of Device (Bluetooth COD) information for a device. */
trait BluetoothClassOfDevice extends StObject {
  
  /** Gets the Major Class code of the Bluetooth device. */
  var majorClass: BluetoothMajorClass
  
  /** Gets the Minor Class code of the device. */
  var minorClass: BluetoothMinorClass
  
  /** Gets the Bluetooth Class Of Device information, represented as an integer value. */
  var rawValue: Double
  
  /** Gets the service capabilities of the device. */
  var serviceCapabilities: BluetoothServiceCapabilities
}
object BluetoothClassOfDevice {
  
  inline def apply(
    majorClass: BluetoothMajorClass,
    minorClass: BluetoothMinorClass,
    rawValue: Double,
    serviceCapabilities: BluetoothServiceCapabilities
  ): BluetoothClassOfDevice = {
    val __obj = js.Dynamic.literal(majorClass = majorClass.asInstanceOf[js.Any], minorClass = minorClass.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], serviceCapabilities = serviceCapabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothClassOfDevice]
  }
  
  extension [Self <: BluetoothClassOfDevice](x: Self) {
    
    inline def setMajorClass(value: BluetoothMajorClass): Self = StObject.set(x, "majorClass", value.asInstanceOf[js.Any])
    
    inline def setMinorClass(value: BluetoothMinorClass): Self = StObject.set(x, "minorClass", value.asInstanceOf[js.Any])
    
    inline def setRawValue(value: Double): Self = StObject.set(x, "rawValue", value.asInstanceOf[js.Any])
    
    inline def setServiceCapabilities(value: BluetoothServiceCapabilities): Self = StObject.set(x, "serviceCapabilities", value.asInstanceOf[js.Any])
  }
}
