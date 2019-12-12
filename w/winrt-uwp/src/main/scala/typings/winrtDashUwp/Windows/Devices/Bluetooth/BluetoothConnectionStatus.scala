package typings.winrtDashUwp.Windows.Devices.Bluetooth

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothConnectionStatus.connected
import typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothConnectionStatus.disconnected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BluetoothConnectionStatus extends js.Object

/** Indicates the connection status of the device. */
@JSGlobal("Windows.Devices.Bluetooth.BluetoothConnectionStatus")
@js.native
object BluetoothConnectionStatus extends js.Object {
  /** The device is connected. */
  @js.native
  sealed trait connected extends BluetoothConnectionStatus
  
  /** The device is disconnected. */
  @js.native
  sealed trait disconnected extends BluetoothConnectionStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BluetoothConnectionStatus with Double] = js.native
  /* 1 */ @js.native
  object connected extends TopLevel[connected with Double]
  
  /* 0 */ @js.native
  object disconnected extends TopLevel[disconnected with Double]
  
}

