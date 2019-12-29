package typings.winrtDashUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HotspotAuthenticationResponseCode with Double] = js.native
  /* 6 */ @js.native
  object accessGatewayInternalError extends TopLevel[accessGatewayInternalError with Double]
  
  /* 5 */ @js.native
  object loginAborted extends TopLevel[loginAborted with Double]
  
  /* 2 */ @js.native
  object loginFailed extends TopLevel[loginFailed with Double]
  
  /* 1 */ @js.native
  object loginSucceeded extends TopLevel[loginSucceeded with Double]
  
  /* 4 */ @js.native
  object networkAdministratorError extends TopLevel[networkAdministratorError with Double]
  
  /* 0 */ @js.native
  object noError extends TopLevel[noError with Double]
  
  /* 3 */ @js.native
  object radiusServerError extends TopLevel[radiusServerError with Double]
  
}

