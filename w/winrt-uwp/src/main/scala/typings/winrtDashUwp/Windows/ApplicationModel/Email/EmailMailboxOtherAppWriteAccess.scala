package typings.winrtDashUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmailMailboxOtherAppWriteAccess extends js.Object

/** Defines whether an application can write to a mailbox. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxOtherAppWriteAccess")
@js.native
object EmailMailboxOtherAppWriteAccess extends js.Object {
  /** Specific applications may write to this mailbox. */
  @js.native
  sealed trait limited extends EmailMailboxOtherAppWriteAccess
  
  /** No external applications may write to this mailbox. */
  @js.native
  sealed trait none extends EmailMailboxOtherAppWriteAccess
  
  /* 1 */ val limited: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxOtherAppWriteAccess.limited with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxOtherAppWriteAccess.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailMailboxOtherAppWriteAccess with Double] = js.native
}

