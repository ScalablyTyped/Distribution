package typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for a Received event on a BluetoothLEAdvertisementWatcher . */
trait BluetoothLEAdvertisementReceivedEventArgs extends StObject {
  
  /** Gets the Bluetooth LE advertisement payload data received. */
  var advertisement: BluetoothLEAdvertisement
  
  /** Gets the type of the received Bluetooth LE advertisement packet. */
  var advertisementType: BluetoothLEAdvertisementType
  
  /** Gets the Bluetooth address of the device sending the Bluetooth LE advertisement. */
  var bluetoothAddress: Double
  
  /** Gets the received signal strength indicator (RSSI) value, in dBm, for this received Bluetooth LE advertisement event. */
  var rawSignalStrengthInDBm: Double
  
  /** Gets the timestamp when the Received event occurred. */
  var timestamp: Date
}
object BluetoothLEAdvertisementReceivedEventArgs {
  
  @scala.inline
  def apply(
    advertisement: BluetoothLEAdvertisement,
    advertisementType: BluetoothLEAdvertisementType,
    bluetoothAddress: Double,
    rawSignalStrengthInDBm: Double,
    timestamp: Date
  ): BluetoothLEAdvertisementReceivedEventArgs = {
    val __obj = js.Dynamic.literal(advertisement = advertisement.asInstanceOf[js.Any], advertisementType = advertisementType.asInstanceOf[js.Any], bluetoothAddress = bluetoothAddress.asInstanceOf[js.Any], rawSignalStrengthInDBm = rawSignalStrengthInDBm.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothLEAdvertisementReceivedEventArgs]
  }
  
  @scala.inline
  implicit class BluetoothLEAdvertisementReceivedEventArgsMutableBuilder[Self <: BluetoothLEAdvertisementReceivedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvertisement(value: BluetoothLEAdvertisement): Self = StObject.set(x, "advertisement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertisementType(value: BluetoothLEAdvertisementType): Self = StObject.set(x, "advertisementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBluetoothAddress(value: Double): Self = StObject.set(x, "bluetoothAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawSignalStrengthInDBm(value: Double): Self = StObject.set(x, "rawSignalStrengthInDBm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
