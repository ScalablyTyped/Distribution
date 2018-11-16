package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs

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
  sealed trait allEntriesLimitedReadWrite
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.PhoneCallHistoryStoreAccessType
  
  /** All the entries should have full read and write permissions. */
  @js.native
  sealed trait allEntriesReadWrite
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.PhoneCallHistoryStoreAccessType
  
  /** Only entries created by this application should have read and write permissions. */
  @js.native
  sealed trait appEntriesReadWrite
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.PhoneCallHistoryStoreAccessType
  
  val allEntriesLimitedReadWrite: allEntriesLimitedReadWrite with java.lang.String = js.native
  val allEntriesReadWrite: allEntriesReadWrite with java.lang.String = js.native
  val appEntriesReadWrite: appEntriesReadWrite with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.PhoneCallHistoryStoreAccessType with java.lang.String
  ] = js.native
}

