package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines values used to indicate status of connection authentication with a mobile hotspot. Provides the response code from the WISPr server for an authentication attempt. */
@JSGlobal("Windows.Networking.NetworkOperators.HotspotAuthenticationResponseCode")
@js.native
object HotspotAuthenticationResponseCode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Networking.NetworkOperators.HotspotAuthenticationResponseCode with Double
  ] = js.native
  
  /* 6 */ val accessGatewayInternalError: typings.winrtUwp.Windows.Networking.NetworkOperators.HotspotAuthenticationResponseCode.accessGatewayInternalError with Double = js.native
  
  /* 5 */ val loginAborted: typings.winrtUwp.Windows.Networking.NetworkOperators.HotspotAuthenticationResponseCode.loginAborted with Double = js.native
  
  /* 2 */ val loginFailed: typings.winrtUwp.Windows.Networking.NetworkOperators.HotspotAuthenticationResponseCode.loginFailed with Double = js.native
  
  /* 1 */ val loginSucceeded: typings.winrtUwp.Windows.Networking.NetworkOperators.HotspotAuthenticationResponseCode.loginSucceeded with Double = js.native
  
  /* 4 */ val networkAdministratorError: typings.winrtUwp.Windows.Networking.NetworkOperators.HotspotAuthenticationResponseCode.networkAdministratorError with Double = js.native
  
  /* 0 */ val noError: typings.winrtUwp.Windows.Networking.NetworkOperators.HotspotAuthenticationResponseCode.noError with Double = js.native
  
  /* 3 */ val radiusServerError: typings.winrtUwp.Windows.Networking.NetworkOperators.HotspotAuthenticationResponseCode.radiusServerError with Double = js.native
}
