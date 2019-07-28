package typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs

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
  
  /* 3 */ val classicNotSupported: typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementFlags.classicNotSupported with Double = js.native
  /* 4 */ val dualModeControllerCapable: typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementFlags.dualModeControllerCapable with Double = js.native
  /* 5 */ val dualModeHostCapable: typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementFlags.dualModeHostCapable with Double = js.native
  /* 2 */ val generalDiscoverableMode: typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementFlags.generalDiscoverableMode with Double = js.native
  /* 1 */ val limitedDiscoverableMode: typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementFlags.limitedDiscoverableMode with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementFlags.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BluetoothLEAdvertisementFlags with Double] = js.native
}

