package typings.winrtDashUwp.Windows.System

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.System.UserType.localGuest
import typings.winrtDashUwp.Windows.System.UserType.localUser
import typings.winrtDashUwp.Windows.System.UserType.remoteGuest
import typings.winrtDashUwp.Windows.System.UserType.remoteUser
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserType with Double] = js.native
  /* 2 */ @js.native
  object localGuest extends TopLevel[localGuest with Double]
  
  /* 0 */ @js.native
  object localUser extends TopLevel[localUser with Double]
  
  /* 3 */ @js.native
  object remoteGuest extends TopLevel[remoteGuest with Double]
  
  /* 1 */ @js.native
  object remoteUser extends TopLevel[remoteUser with Double]
  
}

