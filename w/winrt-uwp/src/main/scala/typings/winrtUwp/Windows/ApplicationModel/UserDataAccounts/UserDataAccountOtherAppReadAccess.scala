package typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
