package typings.winrtUwp.Windows.ApplicationModel.Calls

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
  sealed trait cellularPhoneLineId extends PhoneCallHistorySourceIdKind
  
  /** The identifier is for a family package. */
  @js.native
  sealed trait packageFamilyName extends PhoneCallHistorySourceIdKind
  
}

