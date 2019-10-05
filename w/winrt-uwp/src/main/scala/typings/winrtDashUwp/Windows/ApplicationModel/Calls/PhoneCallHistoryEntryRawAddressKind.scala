package typings.winrtDashUwp.Windows.ApplicationModel.Calls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhoneCallHistoryEntryRawAddressKind extends js.Object

/** The type of address used by the PhoneCallHistoryEntryAddress . */
@JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryEntryRawAddressKind")
@js.native
object PhoneCallHistoryEntryRawAddressKind extends js.Object {
  /** The raw address is a custom string. */
  @js.native
  sealed trait custom extends PhoneCallHistoryEntryRawAddressKind
  
  /** The raw address is a phone number. */
  @js.native
  sealed trait phoneNumber extends PhoneCallHistoryEntryRawAddressKind
  
  /* 1 */ val custom: typings.winrtDashUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryRawAddressKind.custom with Double = js.native
  /* 0 */ val phoneNumber: typings.winrtDashUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryRawAddressKind.phoneNumber with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhoneCallHistoryEntryRawAddressKind with Double] = js.native
}

