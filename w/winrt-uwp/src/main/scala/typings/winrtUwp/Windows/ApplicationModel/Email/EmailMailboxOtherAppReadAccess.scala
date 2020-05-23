package typings.winrtUwp.Windows.ApplicationModel.Email

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
  
}

