package typings.winrtUwp.Windows.Media

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaPlaybackStatus extends js.Object

/** Defines values for the status of the media playback. */
@JSGlobal("Windows.Media.MediaPlaybackStatus")
@js.native
object MediaPlaybackStatus extends js.Object {
  /** The media is changing. */
  @js.native
  sealed trait changing extends MediaPlaybackStatus
  
  /** The media is closd. */
  @js.native
  sealed trait closed extends MediaPlaybackStatus
  
  /** The media is paused. */
  @js.native
  sealed trait paused extends MediaPlaybackStatus
  
  /** The media is playing. */
  @js.native
  sealed trait playing extends MediaPlaybackStatus
  
  /** The media is stopped. */
  @js.native
  sealed trait stopped extends MediaPlaybackStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaPlaybackStatus with Double] = js.native
  /* 1 */ @js.native
  object changing extends TopLevel[changing with Double]
  
  /* 0 */ @js.native
  object closed extends TopLevel[closed with Double]
  
  /* 4 */ @js.native
  object paused extends TopLevel[paused with Double]
  
  /* 3 */ @js.native
  object playing extends TopLevel[playing with Double]
  
  /* 2 */ @js.native
  object stopped extends TopLevel[stopped with Double]
  
}

