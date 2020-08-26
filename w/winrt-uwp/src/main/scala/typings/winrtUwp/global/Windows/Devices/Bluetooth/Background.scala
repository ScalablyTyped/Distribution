package typings.winrtUwp.global.Windows.Devices.Bluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides class describing trigger details for Bluetooth triggers. */
@JSGlobal("Windows.Devices.Bluetooth.Background")
@js.native
object Background extends js.Object {
  /** Provides information about a BluetoothLEAdvertisementPublisher trigger. */
  @js.native
  abstract class BluetoothLEAdvertisementPublisherTriggerDetails ()
    extends typings.winrtUwp.Windows.Devices.Bluetooth.Background.BluetoothLEAdvertisementPublisherTriggerDetails
  
  /** Provides information about a BluetoothLEAdvertisementWatcher trigger. */
  @js.native
  abstract class BluetoothLEAdvertisementWatcherTriggerDetails ()
    extends typings.winrtUwp.Windows.Devices.Bluetooth.Background.BluetoothLEAdvertisementWatcherTriggerDetails
  
  /** Provides information about the Bluetooth LE device that caused this trigger to fire. */
  @js.native
  abstract class GattCharacteristicNotificationTriggerDetails ()
    extends typings.winrtUwp.Windows.Devices.Bluetooth.Background.GattCharacteristicNotificationTriggerDetails
  
  /** Provides information about the Bluetooth device that caused this trigger to fire. */
  @js.native
  abstract class RfcommConnectionTriggerDetails ()
    extends typings.winrtUwp.Windows.Devices.Bluetooth.Background.RfcommConnectionTriggerDetails
  
  /** Provides information about incoming RFCOMM connections. If an app wants the system to listen for incoming connections on behalf of an RfcommConnectionTrigger , the app must create this object and attach it to the RfcommConnectionTrigger. */
  @js.native
  abstract class RfcommInboundConnectionInformation ()
    extends typings.winrtUwp.Windows.Devices.Bluetooth.Background.RfcommInboundConnectionInformation
  
  /** Provides information for RFCOMM outbound connections. If an app wants the system to create outbound connections on its behalf, the app must create this object and attach it to the RfcommConnectionTrigger . */
  @js.native
  abstract class RfcommOutboundConnectionInformation ()
    extends typings.winrtUwp.Windows.Devices.Bluetooth.Background.RfcommOutboundConnectionInformation
  
}

