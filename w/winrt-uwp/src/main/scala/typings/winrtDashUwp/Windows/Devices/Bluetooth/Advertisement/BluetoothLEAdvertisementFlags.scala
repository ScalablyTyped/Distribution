package typings.winrtDashUwp.Windows.Devices.Bluetooth.Advertisement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BluetoothLEAdvertisementFlags extends js.Object

/** Specifies flags used to match flags contained inside a Bluetooth LE advertisement payload. */
@JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFlags")
@js.native
object BluetoothLEAdvertisementFlags extends js.Object {
  /** Bluetooth BR/EDR not supported. */
  @js.native
  sealed trait classicNotSupported extends BluetoothLEAdvertisementFlags
  
  /** Simultaneous Bluetooth LE and BR/EDR to same device capable (controller). */
  @js.native
  sealed trait dualModeControllerCapable extends BluetoothLEAdvertisementFlags
  
  /** Simultaneous Bluetooth LE and BR/EDR to same device capable (host) */
  @js.native
  sealed trait dualModeHostCapable extends BluetoothLEAdvertisementFlags
  
  /** Bluetooth LE General Discoverable Mode. */
  @js.native
  sealed trait generalDiscoverableMode extends BluetoothLEAdvertisementFlags
  
  /** Bluetooth LE Limited Discoverable Mode. */
  @js.native
  sealed trait limitedDiscoverableMode extends BluetoothLEAdvertisementFlags
  
  /** None */
  @js.native
  sealed trait none extends BluetoothLEAdvertisementFlags
  
  /* 3 */ val classicNotSupported: typings.winrtDashUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFlags.classicNotSupported with Double = js.native
  /* 4 */ val dualModeControllerCapable: typings.winrtDashUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFlags.dualModeControllerCapable with Double = js.native
  /* 5 */ val dualModeHostCapable: typings.winrtDashUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFlags.dualModeHostCapable with Double = js.native
  /* 2 */ val generalDiscoverableMode: typings.winrtDashUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFlags.generalDiscoverableMode with Double = js.native
  /* 1 */ val limitedDiscoverableMode: typings.winrtDashUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFlags.limitedDiscoverableMode with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFlags.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BluetoothLEAdvertisementFlags with Double] = js.native
}

