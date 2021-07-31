package typings.winrtUwp.Windows.ApplicationModel.Calls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhoneCallHistoryEntryMedia extends StObject
/** The type of media associated with a call. */
@JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryEntryMedia")
@js.native
object PhoneCallHistoryEntryMedia extends StObject {
  
  /** The call contains audio media. */
  @js.native
  sealed trait audio
    extends StObject
       with PhoneCallHistoryEntryMedia
  
  /** The call contains video media. */
  @js.native
  sealed trait video
    extends StObject
       with PhoneCallHistoryEntryMedia
}
