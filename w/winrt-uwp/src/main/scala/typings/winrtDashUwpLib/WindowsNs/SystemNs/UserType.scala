package typings
package winrtDashUwpLib.WindowsNs.SystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UserType extends js.Object

/** Represents user types. */
@JSGlobal("Windows.System.UserType")
@js.native
object UserType extends js.Object {
  /** The user is a local guest. */
  @js.native
  sealed trait localGuest
    extends winrtDashUwpLib.WindowsNs.SystemNs.UserType
  
  /** The user is a local user. */
  @js.native
  sealed trait localUser
    extends winrtDashUwpLib.WindowsNs.SystemNs.UserType
  
  /** The user is a remote guest. */
  @js.native
  sealed trait remoteGuest
    extends winrtDashUwpLib.WindowsNs.SystemNs.UserType
  
  /** The user is a remote user. */
  @js.native
  sealed trait remoteUser
    extends winrtDashUwpLib.WindowsNs.SystemNs.UserType
  
  /* 2 */ val localGuest: localGuest with scala.Double = js.native
  /* 0 */ val localUser: localUser with scala.Double = js.native
  /* 3 */ val remoteGuest: remoteGuest with scala.Double = js.native
  /* 1 */ val remoteUser: remoteUser with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.SystemNs.UserType with scala.Double] = js.native
}

