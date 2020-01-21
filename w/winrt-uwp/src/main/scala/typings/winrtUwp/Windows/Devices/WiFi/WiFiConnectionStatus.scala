package typings.winrtUwp.Windows.Devices.WiFi

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WiFiConnectionStatus with Double] = js.native
  /* 2 */ @js.native
  object accessRevoked extends TopLevel[accessRevoked with Double]
  
  /* 3 */ @js.native
  object invalidCredential extends TopLevel[invalidCredential with Double]
  
  /* 4 */ @js.native
  object networkNotAvailable extends TopLevel[networkNotAvailable with Double]
  
  /* 1 */ @js.native
  object success extends TopLevel[success with Double]
  
  /* 5 */ @js.native
  object timeout extends TopLevel[timeout with Double]
  
  /* 0 */ @js.native
  object unspecifiedFailure extends TopLevel[unspecifiedFailure with Double]
  
  /* 6 */ @js.native
  object unsupportedAuthenticationProtocol extends TopLevel[unsupportedAuthenticationProtocol with Double]
  
}

