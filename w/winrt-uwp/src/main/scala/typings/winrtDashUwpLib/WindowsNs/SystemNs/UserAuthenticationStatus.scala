package typings
package winrtDashUwpLib.WindowsNs.SystemNs

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
  sealed trait locallyAuthenticated
    extends winrtDashUwpLib.WindowsNs.SystemNs.UserAuthenticationStatus
  
  /** The user is remotely authenticated. */
  @js.native
  sealed trait remotelyAuthenticated
    extends winrtDashUwpLib.WindowsNs.SystemNs.UserAuthenticationStatus
  
  /** The user is unauthenticated. */
  @js.native
  sealed trait unauthenticated
    extends winrtDashUwpLib.WindowsNs.SystemNs.UserAuthenticationStatus
  
  val locallyAuthenticated: locallyAuthenticated with java.lang.String = js.native
  val remotelyAuthenticated: remotelyAuthenticated with java.lang.String = js.native
  val unauthenticated: unauthenticated with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SystemNs.UserAuthenticationStatus with java.lang.String
  ] = js.native
}

