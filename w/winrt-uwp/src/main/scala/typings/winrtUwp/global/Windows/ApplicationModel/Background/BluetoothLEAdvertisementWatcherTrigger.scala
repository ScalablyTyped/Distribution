package typings.winrtUwp.global.Windows.ApplicationModel.Background

import typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFilter
import typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothSignalStrengthFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a trigger that is registered to scan for Bluetooth LE advertisement in the background. */
@JSGlobal("Windows.ApplicationModel.Background.BluetoothLEAdvertisementWatcherTrigger")
@js.native
/** Creates a new instance of the BluetoothLEAdvertisementWatcherTrigger class. */
class BluetoothLEAdvertisementWatcherTrigger ()
  extends typings.winrtUwp.Windows.ApplicationModel.Background.BluetoothLEAdvertisementWatcherTrigger {
  /** Gets or sets the configuration of Bluetooth LE advertisement filtering that uses payload section-based filtering. */
  /* CompleteClass */
  override var advertisementFilter: BluetoothLEAdvertisementFilter = js.native
  /** Gets the maximum out of range timeout supported for the SignalStrengthFilter property of this trigger. */
  /* CompleteClass */
  override var maxOutOfRangeTimeout: Double = js.native
  /** Gets the maximum sampling interval supported for the SignalStrengthFilter property of this trigger. The maximum sampling interval is used to deactivate the sampling filter and only trigger received events based on the device coming in and out of range. */
  /* CompleteClass */
  override var maxSamplingInterval: Double = js.native
  /** Gets the minimum out of range timeout supported for the SignalStrengthFilter property of this trigger. */
  /* CompleteClass */
  override var minOutOfRangeTimeout: Double = js.native
  /** Gets the minimum sampling interval supported for the SignalStrengthFilter property of this trigger. The minimum sampling interval for the background watcher cannot be zero unlike its foreground counterpart. */
  /* CompleteClass */
  override var minSamplingInterval: Double = js.native
  /** Gets or sets the configuration of Bluetooth LE advertisement filtering that uses signal strength-based filtering. */
  /* CompleteClass */
  override var signalStrengthFilter: BluetoothSignalStrengthFilter = js.native
}

