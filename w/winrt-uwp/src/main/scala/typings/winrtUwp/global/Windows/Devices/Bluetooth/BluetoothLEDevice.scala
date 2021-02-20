package typings.winrtUwp.global.Windows.Devices.Bluetooth

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Bluetooth LE device. */
@JSGlobal("Windows.Devices.Bluetooth.BluetoothLEDevice")
@js.native
abstract class BluetoothLEDevice ()
  extends typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothLEDevice
object BluetoothLEDevice {
  
  /**
    * Returns a BluetoothLEDevice object for the given BluetoothAddress value and BluetoothAddressType value.
    * @param bluetoothAddress The 64-bit address of the Bluetooth LE device.
    * @param bluetoothAddressType The address type of the Bluetooth LE device.
    * @return Returns an asynchronous operation that completes with the BluetoothLEDevice object.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Bluetooth.BluetoothLEDevice.fromBluetoothAddressAsync")
  @js.native
  def fromBluetoothAddressAsync(
    bluetoothAddress: Double,
    bluetoothAddressType: typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothAddressType
  ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothLEDevice] = js.native
  
  /**
    * Returns a BluetoothLEDevice object for the given Id.
    * @param deviceId The Id of the Bluetooth LE device.
    * @return After the asynchronous operation completes, returns the BluetoothLEDevice object with the given Id.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Bluetooth.BluetoothLEDevice.fromIdAsync")
  @js.native
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothLEDevice] = js.native
  
  /**
    * Gets an Advanced Query Syntax (AQS) string for identifying all Bluetooth Low Energy (LE) devices. This string is passed to the FindAllAsync or CreateWatcher method in order to get a list of Bluetooth LE devices.
    * @return The device selector for this device.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Bluetooth.BluetoothLEDevice.getDeviceSelector")
  @js.native
  def getDeviceSelector(): String = js.native
  
  /**
    * Creates an Advanced Query Syntax (AQS) filter string from a BluetoothLEAppearance object. The AQS string is passed into the CreateWatcher method to return a collection of DeviceInformation objects with the specified appearance.
    * @param appearance The Bluetooth LE appearance used for constructing the AQS string.
    * @return An AQS string that can be passed as a parameter to the CreateWatcher method.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Bluetooth.BluetoothLEDevice.getDeviceSelectorFromAppearance")
  @js.native
  def getDeviceSelectorFromAppearance(appearance: typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothLEAppearance): String = js.native
  
  /**
    * Creates an Advanced Query Syntax (AQS) filter string from a 64-bit address that represents a Bluetooth LE device. The AQS string is passed into the CreateWatcher method to return a collection of DeviceInformation objects.
    * @param bluetoothAddress A 64-bit Bluetooth LE device address used for constructing the AQS string.
    * @return An AQS string that can be passed as a parameter to the CreateWatcher method.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Bluetooth.BluetoothLEDevice.getDeviceSelectorFromBluetoothAddress")
  @js.native
  def getDeviceSelectorFromBluetoothAddress(bluetoothAddress: Double): String = js.native
  /**
    * Creates an Advanced Query Syntax (AQS) filter string from a 64-bit address and address type that represents a Bluetooth LE device. The AQS string is passed into the CreateWatcher method.
    * @param bluetoothAddress A 64-bit Bluetooth LE device address used for constructing the AQS string.
    * @param bluetoothAddressType The Bluetooth LE device address type.
    * @return An AQS string that can be passed as a parameter to the CreateWatcher method.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Bluetooth.BluetoothLEDevice.getDeviceSelectorFromBluetoothAddress")
  @js.native
  def getDeviceSelectorFromBluetoothAddress(
    bluetoothAddress: Double,
    bluetoothAddressType: typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothAddressType
  ): String = js.native
  
  /**
    * Creates an Advanced Query Syntax (AQS) filter string that contains a query for Bluetooth LE devices with the indicated BluetoothConnectionStatus . The AQS string is passed into the CreateWatcher method to return a collection of DeviceInformation objects with the indicated Bluetooth connection status.
    * @param connectionStatus The connection status used for constructing the AQS string.
    * @return An AQS string that can be passed as a parameter to the CreateWatcher method.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Bluetooth.BluetoothLEDevice.getDeviceSelectorFromConnectionStatus")
  @js.native
  def getDeviceSelectorFromConnectionStatus(connectionStatus: typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothConnectionStatus): String = js.native
  
  /**
    * Creates an Advanced Query Syntax (AQS) filter string that contains a query for the Bluetooth LE device name. The AQS string is passed into the CreateWatcher method to return a collection of DeviceInformation objects containing the specified Bluetooth LE device name.
    * @param deviceName The Bluetooth LE device name used for constructing the AQS string.
    * @return An AQS string that is passed as a parameter to the CreateWatcher method.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Bluetooth.BluetoothLEDevice.getDeviceSelectorFromDeviceName")
  @js.native
  def getDeviceSelectorFromDeviceName(deviceName: String): String = js.native
  
  /**
    * Creates an Advanced Query Syntax (AQS) filter string that contains a query for Bluetooth LE devices that are either paired or unpaired. The AQS string is passed into the CreateWatcher method to return a collection of DeviceInformation objects.
    * @param pairingState The current pairing state for Bluetooth LE devices used for constructing the AQS string. Bluetooth LE devices can be either paired (true) or unpaired (false). The AQS Filter string will request scanning to be performed when the pairingState is false.
    * @return An AQS string that can be passed as a parameter to the CreateWatcher method.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Bluetooth.BluetoothLEDevice.getDeviceSelectorFromPairingState")
  @js.native
  def getDeviceSelectorFromPairingState(pairingState: Boolean): String = js.native
}
