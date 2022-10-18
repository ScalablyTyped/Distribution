package typings.winrtUwp.global.Windows.Devices.Bluetooth

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Networking.HostName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Bluetooth device. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Bluetooth.BluetoothDevice")
@js.native
open class BluetoothDevice ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothDevice
object BluetoothDevice {
  
  @JSGlobal("Windows.Devices.Bluetooth.BluetoothDevice")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a BluetoothDevice object for the given BluetoothAddress .
    * @param address The address of the Bluetooth device.
    * @return After the asynchronous operation completes, returns the BluetoothDevice object with the given BluetoothAddress or null if the address does not resolve to a valid device.
    */
  /* static member */
  inline def fromBluetoothAddressAsync(address: Double): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothDevice] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBluetoothAddressAsync")(address.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothDevice]]
  
  /**
    * Returns a BluetoothDevice object identified by the given HostName .
    * @param hostName The HostName that identifies the BluetoothDevice instance.
    * @return After the asynchronous operation completes, returns the BluetoothDevice object identified by the given HostName .
    */
  /* static member */
  inline def fromHostNameAsync(hostName: HostName): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothDevice] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHostNameAsync")(hostName.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothDevice]]
  
  /**
    * Returns a BluetoothDevice object identified by the given DeviceId .
    * @param deviceId The DeviceId value that identifies the BluetoothDevice instance.
    * @return After the asynchronous operation completes, returns the BluetoothDevice object identified by the given DeviceId .
    */
  /* static member */
  inline def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothDevice] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIdAsync")(deviceId.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothDevice]]
  
  /**
    * Gets an Advanced Query Syntax (AQS) string for identifying instances of this device. This string is passed to the FindAllAsync or CreateWatcher method.
    * @return The device selector for this device.
    */
  /* static member */
  inline def getDeviceSelector(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")().asInstanceOf[String]
  
  /**
    * Creates an Advanced Query Syntax (AQS) filter string from a 64-bit address that represents a Bluetooth device. The AQS string is passed into the CreateWatcher method to return a collection of DeviceInformation objects.
    * @param bluetoothAddress A 64-bit Bluetooth device address used for constructing the AQS string.
    * @return An AQS string that can be passed as a parameter to the CreateWatcher method.
    */
  /* static member */
  inline def getDeviceSelectorFromBluetoothAddress(bluetoothAddress: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelectorFromBluetoothAddress")(bluetoothAddress.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates an Advanced Query Syntax (AQS) filter string from a BluetoothClassOfDevice object. The AQS string is passed into the CreateWatcher method to return a collection of DeviceInformation objects.
    * @param classOfDevice The class of device used for constructing the AQS string.
    * @return An AQS string that can be passed as a parameter to the CreateWatcher method.
    */
  /* static member */
  inline def getDeviceSelectorFromClassOfDevice(classOfDevice: typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothClassOfDevice): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelectorFromClassOfDevice")(classOfDevice.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates an Advanced Query Syntax (AQS) filter string that contains a query for Bluetooth devices with the indicated BluetoothConnectionStatus . The AQS string is passed into the CreateWatcher method to return a collection of DeviceInformation objects with the indicated Bluetooth connection status.
    * @param connectionStatus The connection status used for constructing the AQS string.
    * @return An AQS string that can be passed as a parameter to the CreateWatcher method.
    */
  /* static member */
  inline def getDeviceSelectorFromConnectionStatus(connectionStatus: typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothConnectionStatus): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelectorFromConnectionStatus")(connectionStatus.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates an Advanced Query Syntax (AQS) filter string that contains a query for the Bluetooth device name. The AQS string is passed into the CreateWatcher method to return a collection of DeviceInformation objects containing the specified Bluetooth device name.
    * @param deviceName The Bluetooth device name used for constructing the AQS string.
    * @return An AQS string that is passed as a parameter to the CreateWatcher method.
    */
  /* static member */
  inline def getDeviceSelectorFromDeviceName(deviceName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelectorFromDeviceName")(deviceName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates an Advanced Query Syntax (AQS) filter string that contains a query for Bluetooth devices that are either paired or unpaired. The AQS string is passed into the CreateWatcher method to return a collection of DeviceInformation objects.
    * @param pairingState The current pairing state for Bluetooth devices used for constructing the AQS string. Bluetooth devices can be either paired (true) or unpaired (false). The AQS Filter string will request scanning to be performed when the pairingState is false.
    * @return An AQS string that can be passed as a parameter to the CreateWatcher method.
    */
  /* static member */
  inline def getDeviceSelectorFromPairingState(pairingState: Boolean): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelectorFromPairingState")(pairingState.asInstanceOf[js.Any]).asInstanceOf[String]
}
