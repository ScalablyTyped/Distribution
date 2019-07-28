package typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WiFiDirectError extends js.Object

/** Specifies some common Wi-Fi Direct error cases. */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectError")
@js.native
object WiFiDirectError extends js.Object {
  /** The Wi-Fi Direct radio was not available. This error occurs when the Wi-Fi Direct radio has been turned off. */
  @js.native
  sealed trait radioNotAvailable extends WiFiDirectError
  
  /** The operation cannot be serviced because the necessary resources are currently in use. */
  @js.native
  sealed trait resourceInUse extends WiFiDirectError
  
  /** The operation was successfully completed or serviced. */
  @js.native
  sealed trait success extends WiFiDirectError
  
  /* 1 */ val radioNotAvailable: typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs.WiFiDirectError.radioNotAvailable with Double = js.native
  /* 2 */ val resourceInUse: typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs.WiFiDirectError.resourceInUse with Double = js.native
  /* 0 */ val success: typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs.WiFiDirectError.success with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WiFiDirectError with Double] = js.native
}

