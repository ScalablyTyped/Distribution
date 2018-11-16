package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WiFiConnectionStatus extends js.Object

/** Status of the connection attempt. */
@JSGlobal("Windows.Devices.WiFi.WiFiConnectionStatus")
@js.native
object WiFiConnectionStatus extends js.Object {
  /** Connection failed because access to the network has been revoked. */
  @js.native
  sealed trait accessRevoked
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiConnectionStatus
  
  /** Connection failed because an invalid credential was presented. */
  @js.native
  sealed trait invalidCredential
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiConnectionStatus
  
  /** Connection failed because the network is not available. */
  @js.native
  sealed trait networkNotAvailable
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiConnectionStatus
  
  /** Connection succeeded. */
  @js.native
  sealed trait success
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiConnectionStatus
  
  /** Connection failed because the connection attempt timed out. */
  @js.native
  sealed trait timeout
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiConnectionStatus
  
  /** Connection failed for a reason other than those in this list. */
  @js.native
  sealed trait unspecifiedFailure
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiConnectionStatus
  
  /** Connection failed because the authentication protocol is not supported. */
  @js.native
  sealed trait unsupportedAuthenticationProtocol
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiConnectionStatus
  
  val accessRevoked: accessRevoked with java.lang.String = js.native
  val invalidCredential: invalidCredential with java.lang.String = js.native
  val networkNotAvailable: networkNotAvailable with java.lang.String = js.native
  val success: success with java.lang.String = js.native
  val timeout: timeout with java.lang.String = js.native
  val unspecifiedFailure: unspecifiedFailure with java.lang.String = js.native
  val unsupportedAuthenticationProtocol: unsupportedAuthenticationProtocol with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiConnectionStatus with java.lang.String
  ] = js.native
}

