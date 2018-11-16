package typings
package winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaPlayerError extends js.Object

/** Indicates possible media player errors. */
@JSGlobal("Windows.Media.Playback.MediaPlayerError")
@js.native
object MediaPlayerError extends js.Object {
  /** The last operation was aborted. */
  @js.native
  sealed trait aborted
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlayerError
  
  /** A media decoding error occurred. */
  @js.native
  sealed trait decodingError
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlayerError
  
  /** A network error occurred. */
  @js.native
  sealed trait networkError
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlayerError
  
  /** The media type is not supported. */
  @js.native
  sealed trait sourceNotSupported
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlayerError
  
  /** The error is unknown. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlayerError
  
  val aborted: aborted with java.lang.String = js.native
  val decodingError: decodingError with java.lang.String = js.native
  val networkError: networkError with java.lang.String = js.native
  val sourceNotSupported: sourceNotSupported with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlayerError with java.lang.String
  ] = js.native
}

