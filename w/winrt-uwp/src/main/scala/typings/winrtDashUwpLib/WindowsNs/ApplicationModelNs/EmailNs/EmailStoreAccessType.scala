package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

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
  sealed trait allMailboxesLimitedReadWrite
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailStoreAccessType
  
  /** Full access to all APIs. */
  @js.native
  sealed trait appMailboxesReadWrite
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailStoreAccessType
  
  val allMailboxesLimitedReadWrite: allMailboxesLimitedReadWrite with java.lang.String = js.native
  val appMailboxesReadWrite: appMailboxesReadWrite with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailStoreAccessType with java.lang.String
  ] = js.native
}

