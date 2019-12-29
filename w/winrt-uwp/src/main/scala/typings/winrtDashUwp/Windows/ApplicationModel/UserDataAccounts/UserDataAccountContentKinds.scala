package typings.winrtDashUwp.Windows.ApplicationModel.UserDataAccounts

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UserDataAccountContentKinds extends js.Object

/** The type of user data content. */
@JSGlobal("Windows.ApplicationModel.UserDataAccounts.UserDataAccountContentKinds")
@js.native
object UserDataAccountContentKinds extends js.Object {
  /** Appointment data content. */
  @js.native
  sealed trait appointment extends UserDataAccountContentKinds
  
  /** Contact data content. */
  @js.native
  sealed trait contact extends UserDataAccountContentKinds
  
  /** Email data content. */
  @js.native
  sealed trait email extends UserDataAccountContentKinds
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserDataAccountContentKinds with Double] = js.native
  /* 2 */ @js.native
  object appointment extends TopLevel[appointment with Double]
  
  /* 1 */ @js.native
  object contact extends TopLevel[contact with Double]
  
  /* 0 */ @js.native
  object email extends TopLevel[email with Double]
  
}

