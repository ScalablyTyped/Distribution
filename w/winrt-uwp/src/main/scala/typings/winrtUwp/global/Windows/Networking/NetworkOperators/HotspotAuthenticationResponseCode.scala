package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines values used to indicate status of connection authentication with a mobile hotspot. Provides the response code from the WISPr server for an authentication attempt. */
@JSGlobal("Windows.Networking.NetworkOperators.HotspotAuthenticationResponseCode")
@js.native
object HotspotAuthenticationResponseCode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Networking.NetworkOperators.HotspotAuthenticationResponseCode & Double
  ] = js.native
  
  /* 6 */ val accessGatewayInternalError: typings.winrtUwp.Windows.Networking.NetworkOperators.HotspotAuthenticationResponseCode.accessGatewayInternalError & Double = js.native
  
  /* 5 */ val loginAborted: typings.winrtUwp.Windows.Networking.NetworkOperators.HotspotAuthenticationResponseCode.loginAborted & Double = js.native
  
  /* 2 */ val loginFailed: typings.winrtUwp.Windows.Networking.NetworkOperators.HotspotAuthenticationResponseCode.loginFailed & Double = js.native
  
  /* 1 */ val loginSucceeded: typings.winrtUwp.Windows.Networking.NetworkOperators.HotspotAuthenticationResponseCode.loginSucceeded & Double = js.native
  
  /* 4 */ val networkAdministratorError: typings.winrtUwp.Windows.Networking.NetworkOperators.HotspotAuthenticationResponseCode.networkAdministratorError & Double = js.native
  
  /* 0 */ val noError: typings.winrtUwp.Windows.Networking.NetworkOperators.HotspotAuthenticationResponseCode.noError & Double = js.native
  
  /* 3 */ val radiusServerError: typings.winrtUwp.Windows.Networking.NetworkOperators.HotspotAuthenticationResponseCode.radiusServerError & Double = js.native
}
