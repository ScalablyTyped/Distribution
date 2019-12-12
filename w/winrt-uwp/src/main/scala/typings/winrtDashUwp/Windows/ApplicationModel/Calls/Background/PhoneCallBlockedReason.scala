package typings.winrtDashUwp.Windows.ApplicationModel.Calls.Background

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.ApplicationModel.Calls.Background.PhoneCallBlockedReason.inCallBlockingList
import typings.winrtDashUwp.Windows.ApplicationModel.Calls.Background.PhoneCallBlockedReason.privateNumber
import typings.winrtDashUwp.Windows.ApplicationModel.Calls.Background.PhoneCallBlockedReason.unknownNumber
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhoneCallBlockedReason with Double] = js.native
  /* 0 */ @js.native
  object inCallBlockingList extends TopLevel[inCallBlockingList with Double]
  
  /* 1 */ @js.native
  object privateNumber extends TopLevel[privateNumber with Double]
  
  /* 2 */ @js.native
  object unknownNumber extends TopLevel[unknownNumber with Double]
  
}

