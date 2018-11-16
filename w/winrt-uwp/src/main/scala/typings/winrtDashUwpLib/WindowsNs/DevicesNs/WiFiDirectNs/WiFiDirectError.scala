package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs

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
  sealed trait radioNotAvailable
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.WiFiDirectError
  
  /** The operation cannot be serviced because the necessary resources are currently in use. */
  @js.native
  sealed trait resourceInUse
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.WiFiDirectError
  
  /** The operation was successfully completed or serviced. */
  @js.native
  sealed trait success
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.WiFiDirectError
  
  val radioNotAvailable: radioNotAvailable with java.lang.String = js.native
  val resourceInUse: resourceInUse with java.lang.String = js.native
  val success: success with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.WiFiDirectError with java.lang.String
  ] = js.native
}

