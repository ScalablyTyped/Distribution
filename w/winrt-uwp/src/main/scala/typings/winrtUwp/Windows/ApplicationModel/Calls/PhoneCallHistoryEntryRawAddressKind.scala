package typings.winrtUwp.Windows.ApplicationModel.Calls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhoneCallHistoryEntryRawAddressKind extends StObject
/** The type of address used by the PhoneCallHistoryEntryAddress . */
@JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryEntryRawAddressKind")
@js.native
object PhoneCallHistoryEntryRawAddressKind extends StObject {
  
  /** The raw address is a custom string. */
  @js.native
  sealed trait custom
    extends StObject
       with PhoneCallHistoryEntryRawAddressKind
  
  /** The raw address is a phone number. */
  @js.native
  sealed trait phoneNumber
    extends StObject
       with PhoneCallHistoryEntryRawAddressKind
}
