package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.UserDataAccountsNs

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
  sealed trait full
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.UserDataAccountsNs.UserDataAccountOtherAppReadAccess
  
  /** Only the operating system can read data from this UserDataAccount . */
  @js.native
  sealed trait systemOnly
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.UserDataAccountsNs.UserDataAccountOtherAppReadAccess
  
  /* 1 */ val full: full with scala.Double = js.native
  /* 0 */ val systemOnly: systemOnly with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.UserDataAccountsNs.UserDataAccountOtherAppReadAccess with scala.Double
  ] = js.native
}

