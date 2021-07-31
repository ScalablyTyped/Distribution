package typings.winrtUwp.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UserAuthenticationStatus extends StObject
/** Represents the authentication status of a user. */
@JSGlobal("Windows.System.UserAuthenticationStatus")
@js.native
object UserAuthenticationStatus extends StObject {
  
  /** The user is locally authenticated. */
  @js.native
  sealed trait locallyAuthenticated
    extends StObject
       with UserAuthenticationStatus
  
  /** The user is remotely authenticated. */
  @js.native
  sealed trait remotelyAuthenticated
    extends StObject
       with UserAuthenticationStatus
  
  /** The user is unauthenticated. */
  @js.native
  sealed trait unauthenticated
    extends StObject
       with UserAuthenticationStatus
}
