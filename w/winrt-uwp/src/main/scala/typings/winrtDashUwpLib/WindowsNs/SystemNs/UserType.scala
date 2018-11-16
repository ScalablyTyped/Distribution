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
  
  val localGuest: localGuest with java.lang.String = js.native
  val localUser: localUser with java.lang.String = js.native
  val remoteGuest: remoteGuest with java.lang.String = js.native
  val remoteUser: remoteUser with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.SystemNs.UserType with java.lang.String] = js.native
}

