package typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserDataAccountOtherAppReadAccess with Double] = js.native
  /* 1 */ @js.native
  object full extends TopLevel[full with Double]
  
  /* 0 */ @js.native
  object systemOnly extends TopLevel[systemOnly with Double]
  
}

