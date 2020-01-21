package typings.winrtUwp.Windows.ApplicationModel.Calls

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhoneCallHistoryEntryRawAddressKind with Double] = js.native
  /* 1 */ @js.native
  object custom extends TopLevel[custom with Double]
  
  /* 0 */ @js.native
  object phoneNumber extends TopLevel[phoneNumber with Double]
  
}

