package typings.winrtUwp.Windows.Security.Authentication.Web.Provider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WebAccountProviderOperationKind extends StObject
/** Represents different operations a web account provider can perform. Use this to determine what operation to perform when the provider is activated. */
@JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind")
@js.native
object WebAccountProviderOperationKind extends StObject {
  
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
}
