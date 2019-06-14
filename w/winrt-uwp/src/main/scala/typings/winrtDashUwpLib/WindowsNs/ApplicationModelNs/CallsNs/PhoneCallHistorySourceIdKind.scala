package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhoneCallHistorySourceIdKind extends js.Object

/** The type of identifier that the PhoneCallHistoryEntry.SourceId refers to. */
@JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistorySourceIdKind")
@js.native
object PhoneCallHistorySourceIdKind extends js.Object {
  /** The identifier is for a cellular phone line. */
  @js.native
  sealed trait cellularPhoneLineId
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.PhoneCallHistorySourceIdKind
  
  /** The identifier is for a family package. */
  @js.native
  sealed trait packageFamilyName
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.PhoneCallHistorySourceIdKind
  
  /* 0 */ val cellularPhoneLineId: cellularPhoneLineId with scala.Double = js.native
  /* 1 */ val packageFamilyName: packageFamilyName with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.PhoneCallHistorySourceIdKind with scala.Double
  ] = js.native
}

