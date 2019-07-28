package typings.winrtDashUwp.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WebAccountProviderOperationKind extends js.Object

/** Represents different operations a web account provider can perform. Use this to determine what operation to perform when the provider is activated. */
@JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind")
@js.native
object WebAccountProviderOperationKind extends js.Object {
  /** Add a web account. */
  @js.native
  sealed trait addAccount extends WebAccountProviderOperationKind
  
  /** Delete a web account. */
  @js.native
  sealed trait deleteAccount extends WebAccountProviderOperationKind
  
  /** Get an authentication token without showing any UI. */
  @js.native
  sealed trait getTokenSilently extends WebAccountProviderOperationKind
  
  /** Manage a web account. */
  @js.native
  sealed trait manageAccount extends WebAccountProviderOperationKind
  
  /** Request an authentication token. */
  @js.native
  sealed trait requestToken extends WebAccountProviderOperationKind
  
  /** Retrieve cookies. */
  @js.native
  sealed trait retrieveCookies extends WebAccountProviderOperationKind
  
  /** Sign out a web account. */
  @js.native
  sealed trait signOutAccount extends WebAccountProviderOperationKind
  
  /* 2 */ val addAccount: typings.winrtDashUwp.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs.WebAccountProviderOperationKind.addAccount with Double = js.native
  /* 4 */ val deleteAccount: typings.winrtDashUwp.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs.WebAccountProviderOperationKind.deleteAccount with Double = js.native
  /* 1 */ val getTokenSilently: typings.winrtDashUwp.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs.WebAccountProviderOperationKind.getTokenSilently with Double = js.native
  /* 3 */ val manageAccount: typings.winrtDashUwp.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs.WebAccountProviderOperationKind.manageAccount with Double = js.native
  /* 0 */ val requestToken: typings.winrtDashUwp.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs.WebAccountProviderOperationKind.requestToken with Double = js.native
  /* 5 */ val retrieveCookies: typings.winrtDashUwp.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs.WebAccountProviderOperationKind.retrieveCookies with Double = js.native
  /* 6 */ val signOutAccount: typings.winrtDashUwp.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs.WebAccountProviderOperationKind.signOutAccount with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WebAccountProviderOperationKind with Double] = js.native
}

