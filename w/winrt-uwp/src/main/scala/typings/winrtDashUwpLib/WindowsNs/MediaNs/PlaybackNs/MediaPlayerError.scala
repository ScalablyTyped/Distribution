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
  
  /* 1 */ val aborted: aborted with scala.Double = js.native
  /* 3 */ val decodingError: decodingError with scala.Double = js.native
  /* 2 */ val networkError: networkError with scala.Double = js.native
  /* 4 */ val sourceNotSupported: sourceNotSupported with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlayerError with scala.Double] = js.native
}

