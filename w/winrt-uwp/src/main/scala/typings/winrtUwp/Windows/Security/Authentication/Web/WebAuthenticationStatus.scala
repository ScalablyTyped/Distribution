package typings.winrtUwp.Windows.Security.Authentication.Web

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WebAuthenticationStatus extends StObject
/** Contains the status of the authentication operation. */
@JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationStatus")
@js.native
object WebAuthenticationStatus extends StObject {
  
  /** The operation failed because a specific HTTP error was returned, for example 404. */
  @js.native
  sealed trait errorHttp
    extends StObject
       with WebAuthenticationStatus
  
  /** The operation succeeded, and the response data is available. */
  @js.native
  sealed trait success
    extends StObject
       with WebAuthenticationStatus
  
  /** The operation was canceled by the user. */
  @js.native
  sealed trait userCancel
    extends StObject
       with WebAuthenticationStatus
}
