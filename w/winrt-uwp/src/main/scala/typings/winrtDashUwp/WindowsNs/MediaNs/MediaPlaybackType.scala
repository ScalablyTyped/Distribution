package typings.winrtDashUwp.WindowsNs.MediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaPlaybackType extends js.Object

/** Defines values for the types of media playback. */
@JSGlobal("Windows.Media.MediaPlaybackType")
@js.native
object MediaPlaybackType extends js.Object {
  /** The media type is an image. */
  @js.native
  sealed trait image extends MediaPlaybackType
  
  /** The media type is audio music. */
  @js.native
  sealed trait music extends MediaPlaybackType
  
  /** The media type is unknown. */
  @js.native
  sealed trait unknown extends MediaPlaybackType
  
  /** The media type is video. */
  @js.native
  sealed trait video extends MediaPlaybackType
  
  /* 3 */ val image: typings.winrtDashUwp.WindowsNs.MediaNs.MediaPlaybackType.image with Double = js.native
  /* 1 */ val music: typings.winrtDashUwp.WindowsNs.MediaNs.MediaPlaybackType.music with Double = js.native
  /* 0 */ val unknown: typings.winrtDashUwp.WindowsNs.MediaNs.MediaPlaybackType.unknown with Double = js.native
  /* 2 */ val video: typings.winrtDashUwp.WindowsNs.MediaNs.MediaPlaybackType.video with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaPlaybackType with Double] = js.native
}

