package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs

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
  sealed trait custom
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.PhoneCallHistoryEntryRawAddressKind
  
  /** The raw address is a phone number. */
  @js.native
  sealed trait phoneNumber
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.PhoneCallHistoryEntryRawAddressKind
  
  val custom: custom with java.lang.String = js.native
  val phoneNumber: phoneNumber with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.PhoneCallHistoryEntryRawAddressKind with java.lang.String
  ] = js.native
}

