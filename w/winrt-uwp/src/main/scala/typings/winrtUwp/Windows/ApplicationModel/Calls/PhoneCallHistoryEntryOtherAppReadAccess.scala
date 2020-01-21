package typings.winrtUwp.Windows.ApplicationModel.Calls

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhoneCallHistoryEntryOtherAppReadAccess with Double] = js.native
  /* 0 */ @js.native
  object full extends TopLevel[full with Double]
  
  /* 1 */ @js.native
  object systemOnly extends TopLevel[systemOnly with Double]
  
}

