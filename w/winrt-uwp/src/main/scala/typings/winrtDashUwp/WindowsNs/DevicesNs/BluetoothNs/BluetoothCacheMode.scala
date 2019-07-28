package typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BluetoothCacheMode extends js.Object

/** Indicates whether certain Bluetooth API methods should operate on values cached in the system or retrieve those values from the Bluetooth device. */
@JSGlobal("Windows.Devices.Bluetooth.BluetoothCacheMode")
@js.native
object BluetoothCacheMode extends js.Object {
  /** Use system-cached values. */
  @js.native
  sealed trait cached extends BluetoothCacheMode
  
  /** Retrieve values from the Bluetooth device. */
  @js.native
  sealed trait uncached extends BluetoothCacheMode
  
  /* 0 */ val cached: typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.BluetoothCacheMode.cached with Double = js.native
  /* 1 */ val uncached: typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.BluetoothCacheMode.uncached with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BluetoothCacheMode with Double] = js.native
}

