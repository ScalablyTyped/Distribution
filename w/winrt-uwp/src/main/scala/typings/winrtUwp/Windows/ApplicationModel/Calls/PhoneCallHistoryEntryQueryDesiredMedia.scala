package typings.winrtUwp.Windows.ApplicationModel.Calls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhoneCallHistoryEntryQueryDesiredMedia extends StObject
/** A filter used to retrieve call entries based on the contained media. */
@JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryEntryQueryDesiredMedia")
@js.native
object PhoneCallHistoryEntryQueryDesiredMedia extends StObject {
  
  /** All media types. */
  @js.native
  sealed trait all
    extends StObject
       with PhoneCallHistoryEntryQueryDesiredMedia
  
  /** Audio media. */
  @js.native
  sealed trait audio
    extends StObject
       with PhoneCallHistoryEntryQueryDesiredMedia
  
  /** No associated media. */
  @js.native
  sealed trait none
    extends StObject
       with PhoneCallHistoryEntryQueryDesiredMedia
  
  /** Video media. */
  @js.native
  sealed trait video
    extends StObject
       with PhoneCallHistoryEntryQueryDesiredMedia
}
