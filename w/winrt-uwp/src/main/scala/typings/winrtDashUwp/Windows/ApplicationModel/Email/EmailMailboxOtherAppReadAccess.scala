package typings.winrtDashUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmailMailboxOtherAppReadAccess extends js.Object

/** Defines whether an application can read from a mailbox. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxOtherAppReadAccess")
@js.native
object EmailMailboxOtherAppReadAccess extends js.Object {
  /** All applications can read from this mailbox. */
  @js.native
  sealed trait full extends EmailMailboxOtherAppReadAccess
  
  /** Only system level applications can read from this mailbox. */
  @js.native
  sealed trait systemOnly extends EmailMailboxOtherAppReadAccess
  
  /* 1 */ val full: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxOtherAppReadAccess.full with Double = js.native
  /* 0 */ val systemOnly: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxOtherAppReadAccess.systemOnly with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailMailboxOtherAppReadAccess with Double] = js.native
}

