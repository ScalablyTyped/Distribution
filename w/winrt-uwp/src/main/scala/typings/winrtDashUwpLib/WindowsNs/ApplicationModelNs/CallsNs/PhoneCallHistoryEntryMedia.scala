package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs

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
  sealed trait audio
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.PhoneCallHistoryEntryMedia
  
  /** The call contains video media. */
  @js.native
  sealed trait video
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.PhoneCallHistoryEntryMedia
  
  /* 0 */ val audio: audio with scala.Double = js.native
  /* 1 */ val video: video with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.PhoneCallHistoryEntryMedia with scala.Double
  ] = js.native
}

