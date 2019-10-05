package typings.winrtDashUwp.Windows.ApplicationModel.Calls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhoneCallHistoryEntryOtherAppReadAccess extends js.Object

/** The level of read access provided to other applications. */
@JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryEntryOtherAppReadAccess")
@js.native
object PhoneCallHistoryEntryOtherAppReadAccess extends js.Object {
  /** Other applications have full read access to this PhoneCallHistoryEntry object. */
  @js.native
  sealed trait full extends PhoneCallHistoryEntryOtherAppReadAccess
  
  /** Other applications can only read system-level information. */
  @js.native
  sealed trait systemOnly extends PhoneCallHistoryEntryOtherAppReadAccess
  
  /* 0 */ val full: typings.winrtDashUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryOtherAppReadAccess.full with Double = js.native
  /* 1 */ val systemOnly: typings.winrtDashUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryOtherAppReadAccess.systemOnly with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhoneCallHistoryEntryOtherAppReadAccess with Double] = js.native
}

