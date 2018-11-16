package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs

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
  sealed trait addAccount
    extends winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs.WebAccountProviderOperationKind
  
  /** Delete a web account. */
  @js.native
  sealed trait deleteAccount
    extends winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs.WebAccountProviderOperationKind
  
  /** Get an authentication token without showing any UI. */
  @js.native
  sealed trait getTokenSilently
    extends winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs.WebAccountProviderOperationKind
  
  /** Manage a web account. */
  @js.native
  sealed trait manageAccount
    extends winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs.WebAccountProviderOperationKind
  
  /** Request an authentication token. */
  @js.native
  sealed trait requestToken
    extends winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs.WebAccountProviderOperationKind
  
  /** Retrieve cookies. */
  @js.native
  sealed trait retrieveCookies
    extends winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs.WebAccountProviderOperationKind
  
  /** Sign out a web account. */
  @js.native
  sealed trait signOutAccount
    extends winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs.WebAccountProviderOperationKind
  
  val addAccount: addAccount with java.lang.String = js.native
  val deleteAccount: deleteAccount with java.lang.String = js.native
  val getTokenSilently: getTokenSilently with java.lang.String = js.native
  val manageAccount: manageAccount with java.lang.String = js.native
  val requestToken: requestToken with java.lang.String = js.native
  val retrieveCookies: retrieveCookies with java.lang.String = js.native
  val signOutAccount: signOutAccount with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs.WebAccountProviderOperationKind with java.lang.String
  ] = js.native
}

