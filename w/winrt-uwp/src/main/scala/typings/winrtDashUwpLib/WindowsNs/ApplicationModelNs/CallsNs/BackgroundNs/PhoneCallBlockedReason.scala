package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhoneCallBlockedReason extends js.Object

/** Provides the reason why a phone call was rejected. */
@JSGlobal("Windows.ApplicationModel.Calls.Background.PhoneCallBlockedReason")
@js.native
object PhoneCallBlockedReason extends js.Object {
  /** The call was rejected because it was in the blocking list. */
  @js.native
  sealed trait inCallBlockingList
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneCallBlockedReason
  
  /** The call was rejected because it was a private number and private numbers are blocked. */
  @js.native
  sealed trait privateNumber
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneCallBlockedReason
  
  /** The call was rejected because it was an unknown number and unknown numbers are blocked. */
  @js.native
  sealed trait unknownNumber
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneCallBlockedReason
  
  /* 0 */ val inCallBlockingList: inCallBlockingList with scala.Double = js.native
  /* 1 */ val privateNumber: privateNumber with scala.Double = js.native
  /* 2 */ val unknownNumber: unknownNumber with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneCallBlockedReason with scala.Double
  ] = js.native
}

