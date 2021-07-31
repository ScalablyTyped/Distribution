package typings.winrtUwp.Windows.ApplicationModel.Calls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhoneCallHistorySourceIdKind extends StObject
/** The type of identifier that the PhoneCallHistoryEntry.SourceId refers to. */
@JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistorySourceIdKind")
@js.native
object PhoneCallHistorySourceIdKind extends StObject {
  
  /** The identifier is for a cellular phone line. */
  @js.native
  sealed trait cellularPhoneLineId
    extends StObject
       with PhoneCallHistorySourceIdKind
  
  /** The identifier is for a family package. */
  @js.native
  sealed trait packageFamilyName
    extends StObject
       with PhoneCallHistorySourceIdKind
}
