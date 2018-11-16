package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs

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
  sealed trait full
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.PhoneCallHistoryEntryOtherAppReadAccess
  
  /** Other applications can only read system-level information. */
  @js.native
  sealed trait systemOnly
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.PhoneCallHistoryEntryOtherAppReadAccess
  
  val full: full with java.lang.String = js.native
  val systemOnly: systemOnly with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.PhoneCallHistoryEntryOtherAppReadAccess with java.lang.String
  ] = js.native
}

