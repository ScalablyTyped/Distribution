package typings.winrtDashUwp.Windows.ApplicationModel.Calls

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
  
  /* 3 */ val all: typings.winrtDashUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryQueryDesiredMedia.all with Double = js.native
  /* 1 */ val audio: typings.winrtDashUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryQueryDesiredMedia.audio with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryQueryDesiredMedia.none with Double = js.native
  /* 2 */ val video: typings.winrtDashUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryQueryDesiredMedia.video with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhoneCallHistoryEntryQueryDesiredMedia with Double] = js.native
}

