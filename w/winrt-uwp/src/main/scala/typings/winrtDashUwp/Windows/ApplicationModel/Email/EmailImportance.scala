package typings.winrtDashUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmailImportance extends js.Object

/** Defines the importance of an email message. */
@JSGlobal("Windows.ApplicationModel.Email.EmailImportance")
@js.native
object EmailImportance extends js.Object {
  /** The email message is of high importance. */
  @js.native
  sealed trait high extends EmailImportance
  
  /** The email message is of low importance. */
  @js.native
  sealed trait low extends EmailImportance
  
  /** The email message is of normal importance. */
  @js.native
  sealed trait normal extends EmailImportance
  
  /* 1 */ val high: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailImportance.high with Double = js.native
  /* 2 */ val low: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailImportance.low with Double = js.native
  /* 0 */ val normal: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailImportance.normal with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailImportance with Double] = js.native
}

