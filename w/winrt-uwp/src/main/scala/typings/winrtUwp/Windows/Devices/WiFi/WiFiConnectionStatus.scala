package typings.winrtUwp.Windows.Devices.WiFi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WiFiConnectionStatus extends StObject
/** Status of the connection attempt. */
@JSGlobal("Windows.Devices.WiFi.WiFiConnectionStatus")
@js.native
object WiFiConnectionStatus extends StObject {
  
  /** Connection failed because access to the network has been revoked. */
  @js.native
  sealed trait accessRevoked
    extends StObject
       with WiFiConnectionStatus
  
  /** Connection failed because an invalid credential was presented. */
  @js.native
  sealed trait invalidCredential
    extends StObject
       with WiFiConnectionStatus
  
  /** Connection failed because the network is not available. */
  @js.native
  sealed trait networkNotAvailable
    extends StObject
       with WiFiConnectionStatus
  
  /** Connection succeeded. */
  @js.native
  sealed trait success
    extends StObject
       with WiFiConnectionStatus
  
  /** Connection failed because the connection attempt timed out. */
  @js.native
  sealed trait timeout
    extends StObject
       with WiFiConnectionStatus
  
  /** Connection failed for a reason other than those in this list. */
  @js.native
  sealed trait unspecifiedFailure
    extends StObject
       with WiFiConnectionStatus
  
  /** Connection failed because the authentication protocol is not supported. */
  @js.native
  sealed trait unsupportedAuthenticationProtocol
    extends StObject
       with WiFiConnectionStatus
}
