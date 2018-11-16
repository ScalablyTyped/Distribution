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
  
  val audio: audio with java.lang.String = js.native
  val video: video with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.PhoneCallHistoryEntryMedia with java.lang.String
  ] = js.native
}

