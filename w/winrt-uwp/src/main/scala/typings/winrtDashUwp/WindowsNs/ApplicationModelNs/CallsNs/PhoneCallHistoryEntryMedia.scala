package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.CallsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhoneCallHistoryEntryMedia extends js.Object

/** The type of media associated with a call. */
@JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryEntryMedia")
@js.native
object PhoneCallHistoryEntryMedia extends js.Object {
  /** The call contains audio media. */
  @js.native
  sealed trait audio extends PhoneCallHistoryEntryMedia
  
  /** The call contains video media. */
  @js.native
  sealed trait video extends PhoneCallHistoryEntryMedia
  
  /* 0 */ val audio: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.CallsNs.PhoneCallHistoryEntryMedia.audio with Double = js.native
  /* 1 */ val video: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.CallsNs.PhoneCallHistoryEntryMedia.video with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhoneCallHistoryEntryMedia with Double] = js.native
}

