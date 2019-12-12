package typings.winrtDashUwp.Windows.Media.Playback

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Media.Playback.MediaPlayerError.aborted
import typings.winrtDashUwp.Windows.Media.Playback.MediaPlayerError.decodingError
import typings.winrtDashUwp.Windows.Media.Playback.MediaPlayerError.networkError
import typings.winrtDashUwp.Windows.Media.Playback.MediaPlayerError.sourceNotSupported
import typings.winrtDashUwp.Windows.Media.Playback.MediaPlayerError.unknown
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaPlayerError with Double] = js.native
  /* 1 */ @js.native
  object aborted extends TopLevel[aborted with Double]
  
  /* 3 */ @js.native
  object decodingError extends TopLevel[decodingError with Double]
  
  /* 2 */ @js.native
  object networkError extends TopLevel[networkError with Double]
  
  /* 4 */ @js.native
  object sourceNotSupported extends TopLevel[sourceNotSupported with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

