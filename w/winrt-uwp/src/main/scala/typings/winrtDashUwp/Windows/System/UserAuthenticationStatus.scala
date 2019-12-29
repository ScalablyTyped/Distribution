package typings.winrtDashUwp.Windows.System

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UserAuthenticationStatus extends js.Object

/** Represents the authentication status of a user. */
@JSGlobal("Windows.System.UserAuthenticationStatus")
@js.native
object UserAuthenticationStatus extends js.Object {
  /** The user is locally authenticated. */
  @js.native
  sealed trait locallyAuthenticated extends UserAuthenticationStatus
  
  /** The user is remotely authenticated. */
  @js.native
  sealed trait remotelyAuthenticated extends UserAuthenticationStatus
  
  /** The user is unauthenticated. */
  @js.native
  sealed trait unauthenticated extends UserAuthenticationStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserAuthenticationStatus with Double] = js.native
  /* 1 */ @js.native
  object locallyAuthenticated extends TopLevel[locallyAuthenticated with Double]
  
  /* 2 */ @js.native
  object remotelyAuthenticated extends TopLevel[remotelyAuthenticated with Double]
  
  /* 0 */ @js.native
  object unauthenticated extends TopLevel[unauthenticated with Double]
  
}

