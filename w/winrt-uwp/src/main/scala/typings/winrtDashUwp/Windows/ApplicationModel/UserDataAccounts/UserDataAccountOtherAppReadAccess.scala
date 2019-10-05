package typings.winrtDashUwp.Windows.ApplicationModel.UserDataAccounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UserDataAccountOtherAppReadAccess extends js.Object

/** Specifies the rights granted to other apps for reading this UserDataAccount . */
@JSGlobal("Windows.ApplicationModel.UserDataAccounts.UserDataAccountOtherAppReadAccess")
@js.native
object UserDataAccountOtherAppReadAccess extends js.Object {
  /** Other apps on the device can read all properties of this UserDataAccount . */
  @js.native
  sealed trait full extends UserDataAccountOtherAppReadAccess
  
  /** Only the operating system can read data from this UserDataAccount . */
  @js.native
  sealed trait systemOnly extends UserDataAccountOtherAppReadAccess
  
  /* 1 */ val full: typings.winrtDashUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountOtherAppReadAccess.full with Double = js.native
  /* 0 */ val systemOnly: typings.winrtDashUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountOtherAppReadAccess.systemOnly with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserDataAccountOtherAppReadAccess with Double] = js.native
}

