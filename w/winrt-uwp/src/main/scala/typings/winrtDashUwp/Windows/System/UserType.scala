package typings.winrtDashUwp.Windows.System

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
  sealed trait localGuest extends UserType
  
  /** The user is a local user. */
  @js.native
  sealed trait localUser extends UserType
  
  /** The user is a remote guest. */
  @js.native
  sealed trait remoteGuest extends UserType
  
  /** The user is a remote user. */
  @js.native
  sealed trait remoteUser extends UserType
  
  /* 2 */ val localGuest: typings.winrtDashUwp.Windows.System.UserType.localGuest with Double = js.native
  /* 0 */ val localUser: typings.winrtDashUwp.Windows.System.UserType.localUser with Double = js.native
  /* 3 */ val remoteGuest: typings.winrtDashUwp.Windows.System.UserType.remoteGuest with Double = js.native
  /* 1 */ val remoteUser: typings.winrtDashUwp.Windows.System.UserType.remoteUser with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserType with Double] = js.native
}

