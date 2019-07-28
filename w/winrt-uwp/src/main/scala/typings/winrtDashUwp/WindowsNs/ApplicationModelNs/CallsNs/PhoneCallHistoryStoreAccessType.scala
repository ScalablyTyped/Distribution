package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.CallsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhoneCallHistoryStoreAccessType extends js.Object

/** The type of store you want to retrieve. */
@JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryStoreAccessType")
@js.native
object PhoneCallHistoryStoreAccessType extends js.Object {
  /** All of the entries should have limited read and write permissions. */
  @js.native
  sealed trait allEntriesLimitedReadWrite extends PhoneCallHistoryStoreAccessType
  
  /** All the entries should have full read and write permissions. */
  @js.native
  sealed trait allEntriesReadWrite extends PhoneCallHistoryStoreAccessType
  
  /** Only entries created by this application should have read and write permissions. */
  @js.native
  sealed trait appEntriesReadWrite extends PhoneCallHistoryStoreAccessType
  
  /* 1 */ val allEntriesLimitedReadWrite: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.CallsNs.PhoneCallHistoryStoreAccessType.allEntriesLimitedReadWrite with Double = js.native
  /* 2 */ val allEntriesReadWrite: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.CallsNs.PhoneCallHistoryStoreAccessType.allEntriesReadWrite with Double = js.native
  /* 0 */ val appEntriesReadWrite: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.CallsNs.PhoneCallHistoryStoreAccessType.appEntriesReadWrite with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhoneCallHistoryStoreAccessType with Double] = js.native
}

