package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs

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
  sealed trait all
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.PhoneCallHistoryEntryQueryDesiredMedia
  
  /** Audio media. */
  @js.native
  sealed trait audio
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.PhoneCallHistoryEntryQueryDesiredMedia
  
  /** No associated media. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.PhoneCallHistoryEntryQueryDesiredMedia
  
  /** Video media. */
  @js.native
  sealed trait video
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.PhoneCallHistoryEntryQueryDesiredMedia
  
  val all: all with java.lang.String = js.native
  val audio: audio with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val video: video with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.PhoneCallHistoryEntryQueryDesiredMedia with java.lang.String
  ] = js.native
}

