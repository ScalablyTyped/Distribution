package typings.winrtUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmailStoreAccessType extends js.Object

/** Defines the scope for store access. */
@JSGlobal("Windows.ApplicationModel.Email.EmailStoreAccessType")
@js.native
object EmailStoreAccessType extends js.Object {
  /** Scope limited to read all data but only call write APIs that are on the mailbox and do not save. */
  @js.native
  sealed trait allMailboxesLimitedReadWrite extends EmailStoreAccessType
  
  /** Full access to all APIs. */
  @js.native
  sealed trait appMailboxesReadWrite extends EmailStoreAccessType
  
}

