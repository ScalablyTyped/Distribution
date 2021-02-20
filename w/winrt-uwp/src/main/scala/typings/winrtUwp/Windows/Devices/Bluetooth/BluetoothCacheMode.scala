package typings.winrtUwp.Windows.Devices.Bluetooth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BluetoothCacheMode extends StObject
/** Indicates whether certain Bluetooth API methods should operate on values cached in the system or retrieve those values from the Bluetooth device. */
@JSGlobal("Windows.Devices.Bluetooth.BluetoothCacheMode")
@js.native
object BluetoothCacheMode extends StObject {
  
  /** Use system-cached values. */
  @js.native
  sealed trait cached extends BluetoothCacheMode
  
  /** Retrieve values from the Bluetooth device. */
  @js.native
  sealed trait uncached extends BluetoothCacheMode
}
