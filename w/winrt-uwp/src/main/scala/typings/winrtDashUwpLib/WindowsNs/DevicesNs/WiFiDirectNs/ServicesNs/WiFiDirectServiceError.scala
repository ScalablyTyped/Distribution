package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WiFiDirectServiceError extends js.Object

/** Values used for the WiFiDirectServiceAdvertiser.ServiceError property. */
@JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceError")
@js.native
object WiFiDirectServiceError extends js.Object {
  /** No Wi-Fi adapter is found. */
  @js.native
  sealed trait noHardware
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceError
  
  /** The Wi-Fi Direct radio is not available. */
  @js.native
  sealed trait radioNotAvailable
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceError
  
  /** A required resource is in use. */
  @js.native
  sealed trait resourceInUse
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceError
  
  /** No error. */
  @js.native
  sealed trait success
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceError
  
  /** The Wi-Fi adapter does not support Wi-Fi Direct. */
  @js.native
  sealed trait unsupportedHardware
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceError
  
  val noHardware: noHardware with java.lang.String = js.native
  val radioNotAvailable: radioNotAvailable with java.lang.String = js.native
  val resourceInUse: resourceInUse with java.lang.String = js.native
  val success: success with java.lang.String = js.native
  val unsupportedHardware: unsupportedHardware with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceError with java.lang.String
  ] = js.native
}

