package typings.winrtDashUwp.Windows.Devices.Bluetooth.Advertisement

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
  sealed trait active extends BluetoothLEScanningMode
  
  /** Scanning mode is passive. */
  @js.native
  sealed trait passive extends BluetoothLEScanningMode
  
  /* 1 */ val active: typings.winrtDashUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEScanningMode.active with Double = js.native
  /* 0 */ val passive: typings.winrtDashUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEScanningMode.passive with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BluetoothLEScanningMode with Double] = js.native
}

