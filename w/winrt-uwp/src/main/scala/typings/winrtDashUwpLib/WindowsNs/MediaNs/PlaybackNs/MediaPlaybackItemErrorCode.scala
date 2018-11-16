package typings
package winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaPlaybackItemErrorCode extends js.Object

/** Specifies the type of error that occurred while opening a MediaPlaybackItem . */
@JSGlobal("Windows.Media.Playback.MediaPlaybackItemErrorCode")
@js.native
object MediaPlaybackItemErrorCode extends js.Object {
  /** Opening of the playback item was aborted. */
  @js.native
  sealed trait aborted
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlaybackItemErrorCode
  
  /** An error occurred while decoding the playback item. */
  @js.native
  sealed trait decodeError
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlaybackItemErrorCode
  
  /** An error occurred related to the playback item's encryption. */
  @js.native
  sealed trait encryptionError
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlaybackItemErrorCode
  
  /** A network error occurred while opening the playback item. */
  @js.native
  sealed trait networkError
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlaybackItemErrorCode
  
  /** No error code. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlaybackItemErrorCode
  
  /** The media source of the playback item is not supported. */
  @js.native
  sealed trait sourceNotSupportedError
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlaybackItemErrorCode
  
  val aborted: aborted with java.lang.String = js.native
  val decodeError: decodeError with java.lang.String = js.native
  val encryptionError: encryptionError with java.lang.String = js.native
  val networkError: networkError with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val sourceNotSupportedError: sourceNotSupportedError with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlaybackItemErrorCode with java.lang.String
  ] = js.native
}

