package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BluetoothLEScanningMode extends js.Object

/** Specifies the Bluetooth LE scanning mode. */
@JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEScanningMode")
@js.native
object BluetoothLEScanningMode extends js.Object {
  /** Scanning mode is active. This indicates that scan request packets will be sent from the platform to actively query for more advertisement data of type BluetoothLEAdvertisementType.ScanResponse . */
  @js.native
  sealed trait active
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEScanningMode
  
  /** Scanning mode is passive. */
  @js.native
  sealed trait passive
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEScanningMode
  
  val active: active with java.lang.String = js.native
  val passive: passive with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEScanningMode with java.lang.String
  ] = js.native
}

