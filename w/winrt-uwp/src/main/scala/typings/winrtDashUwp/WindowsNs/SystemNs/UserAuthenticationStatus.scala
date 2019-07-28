package typings.winrtDashUwp.WindowsNs.SystemNs

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
  
  /* 1 */ val locallyAuthenticated: typings.winrtDashUwp.WindowsNs.SystemNs.UserAuthenticationStatus.locallyAuthenticated with Double = js.native
  /* 2 */ val remotelyAuthenticated: typings.winrtDashUwp.WindowsNs.SystemNs.UserAuthenticationStatus.remotelyAuthenticated with Double = js.native
  /* 0 */ val unauthenticated: typings.winrtDashUwp.WindowsNs.SystemNs.UserAuthenticationStatus.unauthenticated with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserAuthenticationStatus with Double] = js.native
}

