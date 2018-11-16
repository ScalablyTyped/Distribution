package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs

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
  sealed trait cached
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothCacheMode
  
  /** Retrieve values from the Bluetooth device. */
  @js.native
  sealed trait uncached
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothCacheMode
  
  val cached: cached with java.lang.String = js.native
  val uncached: uncached with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothCacheMode with java.lang.String
  ] = js.native
}

