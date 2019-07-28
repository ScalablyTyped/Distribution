package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs

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
  
  /* 1 */ val allMailboxesLimitedReadWrite: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailStoreAccessType.allMailboxesLimitedReadWrite with Double = js.native
  /* 0 */ val appMailboxesReadWrite: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailStoreAccessType.appMailboxesReadWrite with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailStoreAccessType with Double] = js.native
}

