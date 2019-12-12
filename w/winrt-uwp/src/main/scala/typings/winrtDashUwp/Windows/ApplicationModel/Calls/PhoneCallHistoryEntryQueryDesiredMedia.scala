package typings.winrtDashUwp.Windows.ApplicationModel.Calls

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryQueryDesiredMedia.all
import typings.winrtDashUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryQueryDesiredMedia.audio
import typings.winrtDashUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryQueryDesiredMedia.none
import typings.winrtDashUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryQueryDesiredMedia.video
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhoneCallHistoryEntryQueryDesiredMedia with Double] = js.native
  /* 3 */ @js.native
  object all extends TopLevel[all with Double]
  
  /* 1 */ @js.native
  object audio extends TopLevel[audio with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object video extends TopLevel[video with Double]
  
}

