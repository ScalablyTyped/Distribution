package typings.winrtUwp.Windows.Security.Authentication.Web.Provider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WebAccountProviderOperationKind extends StObject
/** Represents different operations a web account provider can perform. Use this to determine what operation to perform when the provider is activated. */
@JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind")
@js.native
object WebAccountProviderOperationKind extends StObject {
  
  /** Add a web account. */
  @js.native
  sealed trait addAccount
    extends StObject
       with WebAccountProviderOperationKind
  
  /** Delete a web account. */
  @js.native
  sealed trait deleteAccount
    extends StObject
       with WebAccountProviderOperationKind
  
  /** Get an authentication token without showing any UI. */
  @js.native
  sealed trait getTokenSilently
    extends StObject
       with WebAccountProviderOperationKind
  
  /** Manage a web account. */
  @js.native
  sealed trait manageAccount
    extends StObject
       with WebAccountProviderOperationKind
  
  /** Request an authentication token. */
  @js.native
  sealed trait requestToken
    extends StObject
       with WebAccountProviderOperationKind
  
  /** Retrieve cookies. */
  @js.native
  sealed trait retrieveCookies
    extends StObject
       with WebAccountProviderOperationKind
  
  /** Sign out a web account. */
  @js.native
  sealed trait signOutAccount
    extends StObject
       with WebAccountProviderOperationKind
}
