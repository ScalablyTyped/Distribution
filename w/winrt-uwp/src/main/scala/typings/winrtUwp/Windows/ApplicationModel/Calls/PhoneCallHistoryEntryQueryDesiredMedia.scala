package typings.winrtUwp.Windows.ApplicationModel.Calls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhoneCallHistoryEntryQueryDesiredMedia extends js.Object

/** A filter used to retrieve call entries based on the contained media. */
@JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryEntryQueryDesiredMedia")
@js.native
object PhoneCallHistoryEntryQueryDesiredMedia extends js.Object {
  /** All media types. */
  @js.native
  sealed trait all extends PhoneCallHistoryEntryQueryDesiredMedia
  
  /** Audio media. */
  @js.native
  sealed trait audio extends PhoneCallHistoryEntryQueryDesiredMedia
  
  /** No associated media. */
  @js.native
  sealed trait none extends PhoneCallHistoryEntryQueryDesiredMedia
  
  /** Video media. */
  @js.native
  sealed trait video extends PhoneCallHistoryEntryQueryDesiredMedia
  
}

