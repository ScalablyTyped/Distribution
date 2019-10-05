package typings.winrtDashUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HotspotAuthenticationResponseCode extends js.Object

/** Defines values used to indicate status of connection authentication with a mobile hotspot. Provides the response code from the WISPr server for an authentication attempt. */
@JSGlobal("Windows.Networking.NetworkOperators.HotspotAuthenticationResponseCode")
@js.native
object HotspotAuthenticationResponseCode extends js.Object {
  /** An internal error occurred in the access gateway. */
  @js.native
  sealed trait accessGatewayInternalError extends HotspotAuthenticationResponseCode
  
  /** The authentication request was aborted. */
  @js.native
  sealed trait loginAborted extends HotspotAuthenticationResponseCode
  
  /** Hotspot authentication failed. */
  @js.native
  sealed trait loginFailed extends HotspotAuthenticationResponseCode
  
  /** Hotspot authentication successful. */
  @js.native
  sealed trait loginSucceeded extends HotspotAuthenticationResponseCode
  
  /** An error occurred that requires contacting the network administrator. */
  @js.native
  sealed trait networkAdministratorError extends HotspotAuthenticationResponseCode
  
  /** No response returned. */
  @js.native
  sealed trait noError extends HotspotAuthenticationResponseCode
  
  /** No response from authentication server. */
  @js.native
  sealed trait radiusServerError extends HotspotAuthenticationResponseCode
  
  /* 6 */ val accessGatewayInternalError: typings.winrtDashUwp.Windows.Networking.NetworkOperators.HotspotAuthenticationResponseCode.accessGatewayInternalError with Double = js.native
  /* 5 */ val loginAborted: typings.winrtDashUwp.Windows.Networking.NetworkOperators.HotspotAuthenticationResponseCode.loginAborted with Double = js.native
  /* 2 */ val loginFailed: typings.winrtDashUwp.Windows.Networking.NetworkOperators.HotspotAuthenticationResponseCode.loginFailed with Double = js.native
  /* 1 */ val loginSucceeded: typings.winrtDashUwp.Windows.Networking.NetworkOperators.HotspotAuthenticationResponseCode.loginSucceeded with Double = js.native
  /* 4 */ val networkAdministratorError: typings.winrtDashUwp.Windows.Networking.NetworkOperators.HotspotAuthenticationResponseCode.networkAdministratorError with Double = js.native
  /* 0 */ val noError: typings.winrtDashUwp.Windows.Networking.NetworkOperators.HotspotAuthenticationResponseCode.noError with Double = js.native
  /* 3 */ val radiusServerError: typings.winrtDashUwp.Windows.Networking.NetworkOperators.HotspotAuthenticationResponseCode.radiusServerError with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HotspotAuthenticationResponseCode with Double] = js.native
}

