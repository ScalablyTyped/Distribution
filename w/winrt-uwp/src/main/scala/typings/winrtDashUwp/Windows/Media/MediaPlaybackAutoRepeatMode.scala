package typings.winrtDashUwp.Windows.Media

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaPlaybackAutoRepeatMode extends js.Object

/** Specifies the auto repeat mode for media playback. */
@JSGlobal("Windows.Media.MediaPlaybackAutoRepeatMode")
@js.native
object MediaPlaybackAutoRepeatMode extends js.Object {
  /** Repeat the current list of tracks. */
  @js.native
  sealed trait list extends MediaPlaybackAutoRepeatMode
  
  /** No repeating. */
  @js.native
  sealed trait none extends MediaPlaybackAutoRepeatMode
  
  /** Repeat the current track. */
  @js.native
  sealed trait track extends MediaPlaybackAutoRepeatMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaPlaybackAutoRepeatMode with Double] = js.native
  /* 2 */ @js.native
  object list extends TopLevel[list with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object track extends TopLevel[track with Double]
  
}

