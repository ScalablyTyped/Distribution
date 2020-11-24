package typings.winrtUwp.global.Windows.Devices.Bluetooth

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Networking.HostName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Bluetooth device. */
@JSGlobal("Windows.Devices.Bluetooth.BluetoothDevice")
@js.native
abstract class BluetoothDevice ()
  extends typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothDevice
/* static members */
@JSGlobal("Windows.Devices.Bluetooth.BluetoothDevice")
@js.native
object BluetoothDevice extends js.Object {
  
  /**
    * Returns a BluetoothDevice object for the given BluetoothAddress .
    * @param address The address of the Bluetooth device.
    * @return After the asynchronous operation completes, returns the BluetoothDevice object with the given BluetoothAddress or null if the address does not resolve to a valid device.
    */
  def fromBluetoothAddressAsync(address: Double): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothDevice] = js.native
  
  /**
    * Returns a BluetoothDevice object identified by the given HostName .
    * @param hostName The HostName that identifies the BluetoothDevice instance.
    * @return After the asynchronous operation completes, returns the BluetoothDevice object identified by the given HostName .
    */
  def fromHostNameAsync(hostName: HostName): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothDevice] = js.native
  
  /**
    * Returns a BluetoothDevice object identified by the given DeviceId .
    * @param deviceId The DeviceId value that identifies the BluetoothDevice instance.
    * @return After the asynchronous operation completes, returns the BluetoothDevice object identified by the given DeviceId .
    */
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothDevice] = js.native
  
  /**
    * Gets an Advanced Query Syntax (AQS) string for identifying instances of this device. This string is passed to the FindAllAsync or CreateWatcher method.
    * @return The device selector for this device.
    */
  def getDeviceSelector(): String = js.native
  
  /**
    * Creates an Advanced Query Syntax (AQS) filter string from a 64-bit address that represents a Bluetooth device. The AQS string is passed into the CreateWatcher method to return a collection of DeviceInformation objects.
    * @param bluetoothAddress A 64-bit Bluetooth device address used for constructing the AQS string.
    * @return An AQS string that can be passed as a parameter to the CreateWatcher method.
    */
  def getDeviceSelectorFromBluetoothAddress(bluetoothAddress: Double): String = js.native
  
  /**
    * Creates an Advanced Query Syntax (AQS) filter string from a BluetoothClassOfDevice object. The AQS string is passed into the CreateWatcher method to return a collection of DeviceInformation objects.
    * @param classOfDevice The class of device used for constructing the AQS string.
    * @return An AQS string that can be passed as a parameter to the CreateWatcher method.
    */
  def getDeviceSelectorFromClassOfDevice(classOfDevice: typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothClassOfDevice): String = js.native
  
  /**
    * Creates an Advanced Query Syntax (AQS) filter string that contains a query for Bluetooth devices with the indicated BluetoothConnectionStatus . The AQS string is passed into the CreateWatcher method to return a collection of DeviceInformation objects with the indicated Bluetooth connection status.
    * @param connectionStatus The connection status used for constructing the AQS string.
    * @return An AQS string that can be passed as a parameter to the CreateWatcher method.
    */
  def getDeviceSelectorFromConnectionStatus(connectionStatus: typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothConnectionStatus): String = js.native
  
  /**
    * Creates an Advanced Query Syntax (AQS) filter string that contains a query for the Bluetooth device name. The AQS string is passed into the CreateWatcher method to return a collection of DeviceInformation objects containing the specified Bluetooth device name.
    * @param deviceName The Bluetooth device name used for constructing the AQS string.
    * @return An AQS string that is passed as a parameter to the CreateWatcher method.
    */
  def getDeviceSelectorFromDeviceName(deviceName: String): String = js.native
  
  /**
    * Creates an Advanced Query Syntax (AQS) filter string that contains a query for Bluetooth devices that are either paired or unpaired. The AQS string is passed into the CreateWatcher method to return a collection of DeviceInformation objects.
    * @param pairingState The current pairing state for Bluetooth devices used for constructing the AQS string. Bluetooth devices can be either paired (true) or unpaired (false). The AQS Filter string will request scanning to be performed when the pairingState is false.
    * @return An AQS string that can be passed as a parameter to the CreateWatcher method.
    */
  def getDeviceSelectorFromPairingState(pairingState: Boolean): String = js.native
}
