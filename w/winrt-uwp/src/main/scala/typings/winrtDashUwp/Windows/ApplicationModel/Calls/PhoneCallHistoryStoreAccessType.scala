package typings.winrtDashUwp.Windows.ApplicationModel.Calls

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhoneCallHistoryStoreAccessType with Double] = js.native
  /* 1 */ @js.native
  object allEntriesLimitedReadWrite extends TopLevel[allEntriesLimitedReadWrite with Double]
  
  /* 2 */ @js.native
  object allEntriesReadWrite extends TopLevel[allEntriesReadWrite with Double]
  
  /* 0 */ @js.native
  object appEntriesReadWrite extends TopLevel[appEntriesReadWrite with Double]
  
}

