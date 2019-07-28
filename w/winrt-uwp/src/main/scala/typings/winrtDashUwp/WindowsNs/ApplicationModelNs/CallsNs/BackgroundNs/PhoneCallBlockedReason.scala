package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs

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
  sealed trait inCallBlockingList extends PhoneCallBlockedReason
  
  /** The call was rejected because it was a private number and private numbers are blocked. */
  @js.native
  sealed trait privateNumber extends PhoneCallBlockedReason
  
  /** The call was rejected because it was an unknown number and unknown numbers are blocked. */
  @js.native
  sealed trait unknownNumber extends PhoneCallBlockedReason
  
  /* 0 */ val inCallBlockingList: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneCallBlockedReason.inCallBlockingList with Double = js.native
  /* 1 */ val privateNumber: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneCallBlockedReason.privateNumber with Double = js.native
  /* 2 */ val unknownNumber: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneCallBlockedReason.unknownNumber with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhoneCallBlockedReason with Double] = js.native
}

