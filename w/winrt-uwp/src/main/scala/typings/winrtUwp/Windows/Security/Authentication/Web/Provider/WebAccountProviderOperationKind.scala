package typings.winrtUwp.Windows.Security.Authentication.Web.Provider

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WebAccountProviderOperationKind with Double] = js.native
  /* 2 */ @js.native
  object addAccount extends TopLevel[addAccount with Double]
  
  /* 4 */ @js.native
  object deleteAccount extends TopLevel[deleteAccount with Double]
  
  /* 1 */ @js.native
  object getTokenSilently extends TopLevel[getTokenSilently with Double]
  
  /* 3 */ @js.native
  object manageAccount extends TopLevel[manageAccount with Double]
  
  /* 0 */ @js.native
  object requestToken extends TopLevel[requestToken with Double]
  
  /* 5 */ @js.native
  object retrieveCookies extends TopLevel[retrieveCookies with Double]
  
  /* 6 */ @js.native
  object signOutAccount extends TopLevel[signOutAccount with Double]
  
}

