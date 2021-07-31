package typings.winrtUwp.Windows.ApplicationModel.Calls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhoneCallHistoryEntryOtherAppReadAccess extends StObject
/** The level of read access provided to other applications. */
@JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryEntryOtherAppReadAccess")
@js.native
object PhoneCallHistoryEntryOtherAppReadAccess extends StObject {
  
  /** Other applications have full read access to this PhoneCallHistoryEntry object. */
  @js.native
  sealed trait full
    extends StObject
       with PhoneCallHistoryEntryOtherAppReadAccess
  
  /** Other applications can only read system-level information. */
  @js.native
  sealed trait systemOnly
    extends StObject
       with PhoneCallHistoryEntryOtherAppReadAccess
}
