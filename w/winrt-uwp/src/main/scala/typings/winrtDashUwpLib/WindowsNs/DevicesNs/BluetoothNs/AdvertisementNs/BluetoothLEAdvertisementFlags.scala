package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs

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
  sealed trait classicNotSupported
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementFlags
  
  /** Simultaneous Bluetooth LE and BR/EDR to same device capable (controller). */
  @js.native
  sealed trait dualModeControllerCapable
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementFlags
  
  /** Simultaneous Bluetooth LE and BR/EDR to same device capable (host) */
  @js.native
  sealed trait dualModeHostCapable
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementFlags
  
  /** Bluetooth LE General Discoverable Mode. */
  @js.native
  sealed trait generalDiscoverableMode
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementFlags
  
  /** Bluetooth LE Limited Discoverable Mode. */
  @js.native
  sealed trait limitedDiscoverableMode
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementFlags
  
  /** None */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementFlags
  
  val classicNotSupported: classicNotSupported with java.lang.String = js.native
  val dualModeControllerCapable: dualModeControllerCapable with java.lang.String = js.native
  val dualModeHostCapable: dualModeHostCapable with java.lang.String = js.native
  val generalDiscoverableMode: generalDiscoverableMode with java.lang.String = js.native
  val limitedDiscoverableMode: limitedDiscoverableMode with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementFlags with java.lang.String
  ] = js.native
}

