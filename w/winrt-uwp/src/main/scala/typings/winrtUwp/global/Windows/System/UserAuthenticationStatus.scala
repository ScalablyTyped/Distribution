package typings.winrtUwp.global.Windows.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the authentication status of a user. */
@JSGlobal("Windows.System.UserAuthenticationStatus")
@js.native
object UserAuthenticationStatus extends js.Object {
  /* 1 */ val locallyAuthenticated: typings.winrtUwp.Windows.System.UserAuthenticationStatus.locallyAuthenticated with Double = js.native
  /* 2 */ val remotelyAuthenticated: typings.winrtUwp.Windows.System.UserAuthenticationStatus.remotelyAuthenticated with Double = js.native
  /* 0 */ val unauthenticated: typings.winrtUwp.Windows.System.UserAuthenticationStatus.unauthenticated with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.System.UserAuthenticationStatus with Double] = js.native
}

