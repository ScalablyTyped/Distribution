package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs

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
  sealed trait accountProviderNotAvailable
    extends winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs.WebTokenRequestStatus
  
  /** The account associated with the request has switched. This status occurs when you attempt to use one web account, but the user indicates they wish to use a different web account instead. */
  @js.native
  sealed trait accountSwitch
    extends winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs.WebTokenRequestStatus
  
  /** There was a provider error. For information on how to handle this error, consult the provider's documentation. */
  @js.native
  sealed trait providerError
    extends winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs.WebTokenRequestStatus
  
  /** The request was successful. */
  @js.native
  sealed trait success
    extends winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs.WebTokenRequestStatus
  
  /** The request was cancelled by the user. */
  @js.native
  sealed trait userCancel
    extends winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs.WebTokenRequestStatus
  
  /** User interaction is required to complete the request. This option is only applicable to requests made with GetTokenSilentlyAsync . If this status is returned, repeat the request with RequestTokenAsync . */
  @js.native
  sealed trait userInteractionRequired
    extends winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs.WebTokenRequestStatus
  
  val accountProviderNotAvailable: accountProviderNotAvailable with java.lang.String = js.native
  val accountSwitch: accountSwitch with java.lang.String = js.native
  val providerError: providerError with java.lang.String = js.native
  val success: success with java.lang.String = js.native
  val userCancel: userCancel with java.lang.String = js.native
  val userInteractionRequired: userInteractionRequired with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs.WebTokenRequestStatus with java.lang.String
  ] = js.native
}

