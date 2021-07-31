package typings.winrtUwp.global.Windows.Devices.Bluetooth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality to determine the Bluetooth Class Of Device (Bluetooth COD) information for a device. */
@JSGlobal("Windows.Devices.Bluetooth.BluetoothClassOfDevice")
@js.native
abstract class BluetoothClassOfDevice ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothClassOfDevice {
  
  /** Gets the Major Class code of the Bluetooth device. */
  /* CompleteClass */
  var majorClass: typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothMajorClass = js.native
  
  /** Gets the Minor Class code of the device. */
  /* CompleteClass */
  var minorClass: typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothMinorClass = js.native
  
  /** Gets the Bluetooth Class Of Device information, represented as an integer value. */
  /* CompleteClass */
  var rawValue: Double = js.native
  
  /** Gets the service capabilities of the device. */
  /* CompleteClass */
  var serviceCapabilities: typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothServiceCapabilities = js.native
}
object BluetoothClassOfDevice {
  
  @JSGlobal("Windows.Devices.Bluetooth.BluetoothClassOfDevice")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a BluetoothClassOfDevice object by supplying values for BluetoothMajorClass , BluetoothMinorClass and BluetoothClassOfDevice.
    * @param majorClass One of the enumeration values that specifies the device's main function.
    * @param minorClass One of the enumeration values that specifies the minor class value to be used.
    * @param serviceCapabilities One of the enumeration values that specifies the service the device supports.
    * @return A BluetoothClassOfDevice object.
    */
  /* static member */
  @scala.inline
  def fromParts(
    majorClass: typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothMajorClass,
    minorClass: typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothMinorClass,
    serviceCapabilities: typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothServiceCapabilities
  ): typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothClassOfDevice = (^.asInstanceOf[js.Dynamic].applyDynamic("fromParts")(majorClass.asInstanceOf[js.Any], minorClass.asInstanceOf[js.Any], serviceCapabilities.asInstanceOf[js.Any])).asInstanceOf[typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothClassOfDevice]
  
  /**
    * Creates a BluetoothClassOfDevice object from a raw integer value representing the Major Class, Minor Class and Service Capabilities of the device.
    * @param rawValue The raw integer value from which to create the BluetoothClassOfDevice object.
    * @return A BluetoothClassOfDevice object.
    */
  /* static member */
  @scala.inline
  def fromRawValue(rawValue: Double): typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothClassOfDevice = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRawValue")(rawValue.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothClassOfDevice]
}
