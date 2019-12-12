package typings.winrtDashUwp.Windows.ApplicationModel.Calls

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.ApplicationModel.Calls.PhoneCallHistorySourceIdKind.cellularPhoneLineId
import typings.winrtDashUwp.Windows.ApplicationModel.Calls.PhoneCallHistorySourceIdKind.packageFamilyName
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhoneCallHistorySourceIdKind with Double] = js.native
  /* 0 */ @js.native
  object cellularPhoneLineId extends TopLevel[cellularPhoneLineId with Double]
  
  /* 1 */ @js.native
  object packageFamilyName extends TopLevel[packageFamilyName with Double]
  
}

