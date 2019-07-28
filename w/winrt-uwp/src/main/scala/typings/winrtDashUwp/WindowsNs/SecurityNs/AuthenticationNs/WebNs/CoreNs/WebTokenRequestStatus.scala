package typings.winrtDashUwp.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WebTokenRequestStatus extends js.Object

/** Represents the status of a web token request. */
@JSGlobal("Windows.Security.Authentication.Web.Core.WebTokenRequestStatus")
@js.native
object WebTokenRequestStatus extends js.Object {
  /** The account provider was not available. */
  @js.native
  sealed trait accountProviderNotAvailable extends WebTokenRequestStatus
  
  /** The account associated with the request has switched. This status occurs when you attempt to use one web account, but the user indicates they wish to use a different web account instead. */
  @js.native
  sealed trait accountSwitch extends WebTokenRequestStatus
  
  /** There was a provider error. For information on how to handle this error, consult the provider's documentation. */
  @js.native
  sealed trait providerError extends WebTokenRequestStatus
  
  /** The request was successful. */
  @js.native
  sealed trait success extends WebTokenRequestStatus
  
  /** The request was cancelled by the user. */
  @js.native
  sealed trait userCancel extends WebTokenRequestStatus
  
  /** User interaction is required to complete the request. This option is only applicable to requests made with GetTokenSilentlyAsync . If this status is returned, repeat the request with RequestTokenAsync . */
  @js.native
  sealed trait userInteractionRequired extends WebTokenRequestStatus
  
  /* 4 */ val accountProviderNotAvailable: typings.winrtDashUwp.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs.WebTokenRequestStatus.accountProviderNotAvailable with Double = js.native
  /* 2 */ val accountSwitch: typings.winrtDashUwp.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs.WebTokenRequestStatus.accountSwitch with Double = js.native
  /* 5 */ val providerError: typings.winrtDashUwp.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs.WebTokenRequestStatus.providerError with Double = js.native
  /* 0 */ val success: typings.winrtDashUwp.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs.WebTokenRequestStatus.success with Double = js.native
  /* 1 */ val userCancel: typings.winrtDashUwp.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs.WebTokenRequestStatus.userCancel with Double = js.native
  /* 3 */ val userInteractionRequired: typings.winrtDashUwp.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs.WebTokenRequestStatus.userInteractionRequired with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WebTokenRequestStatus with Double] = js.native
}

