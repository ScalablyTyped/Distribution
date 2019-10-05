package typings.winrtDashUwp.Windows.Devices.WiFi

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
  sealed trait accessRevoked extends WiFiConnectionStatus
  
  /** Connection failed because an invalid credential was presented. */
  @js.native
  sealed trait invalidCredential extends WiFiConnectionStatus
  
  /** Connection failed because the network is not available. */
  @js.native
  sealed trait networkNotAvailable extends WiFiConnectionStatus
  
  /** Connection succeeded. */
  @js.native
  sealed trait success extends WiFiConnectionStatus
  
  /** Connection failed because the connection attempt timed out. */
  @js.native
  sealed trait timeout extends WiFiConnectionStatus
  
  /** Connection failed for a reason other than those in this list. */
  @js.native
  sealed trait unspecifiedFailure extends WiFiConnectionStatus
  
  /** Connection failed because the authentication protocol is not supported. */
  @js.native
  sealed trait unsupportedAuthenticationProtocol extends WiFiConnectionStatus
  
  /* 2 */ val accessRevoked: typings.winrtDashUwp.Windows.Devices.WiFi.WiFiConnectionStatus.accessRevoked with Double = js.native
  /* 3 */ val invalidCredential: typings.winrtDashUwp.Windows.Devices.WiFi.WiFiConnectionStatus.invalidCredential with Double = js.native
  /* 4 */ val networkNotAvailable: typings.winrtDashUwp.Windows.Devices.WiFi.WiFiConnectionStatus.networkNotAvailable with Double = js.native
  /* 1 */ val success: typings.winrtDashUwp.Windows.Devices.WiFi.WiFiConnectionStatus.success with Double = js.native
  /* 5 */ val timeout: typings.winrtDashUwp.Windows.Devices.WiFi.WiFiConnectionStatus.timeout with Double = js.native
  /* 0 */ val unspecifiedFailure: typings.winrtDashUwp.Windows.Devices.WiFi.WiFiConnectionStatus.unspecifiedFailure with Double = js.native
  /* 6 */ val unsupportedAuthenticationProtocol: typings.winrtDashUwp.Windows.Devices.WiFi.WiFiConnectionStatus.unsupportedAuthenticationProtocol with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WiFiConnectionStatus with Double] = js.native
}

