package typings.winrtUwp.Windows.Devices.Bluetooth

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BluetoothCacheMode with Double] = js.native
  /* 0 */ @js.native
  object cached extends TopLevel[cached with Double]
  
  /* 1 */ @js.native
  object uncached extends TopLevel[uncached with Double]
  
}

