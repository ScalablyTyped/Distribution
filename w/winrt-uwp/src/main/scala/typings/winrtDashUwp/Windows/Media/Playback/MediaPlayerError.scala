package typings.winrtDashUwp.Windows.Media.Playback

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
  sealed trait aborted extends MediaPlayerError
  
  /** A media decoding error occurred. */
  @js.native
  sealed trait decodingError extends MediaPlayerError
  
  /** A network error occurred. */
  @js.native
  sealed trait networkError extends MediaPlayerError
  
  /** The media type is not supported. */
  @js.native
  sealed trait sourceNotSupported extends MediaPlayerError
  
  /** The error is unknown. */
  @js.native
  sealed trait unknown extends MediaPlayerError
  
  /* 1 */ val aborted: typings.winrtDashUwp.Windows.Media.Playback.MediaPlayerError.aborted with Double = js.native
  /* 3 */ val decodingError: typings.winrtDashUwp.Windows.Media.Playback.MediaPlayerError.decodingError with Double = js.native
  /* 2 */ val networkError: typings.winrtDashUwp.Windows.Media.Playback.MediaPlayerError.networkError with Double = js.native
  /* 4 */ val sourceNotSupported: typings.winrtDashUwp.Windows.Media.Playback.MediaPlayerError.sourceNotSupported with Double = js.native
  /* 0 */ val unknown: typings.winrtDashUwp.Windows.Media.Playback.MediaPlayerError.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaPlayerError with Double] = js.native
}

