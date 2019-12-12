package typings.winrtDashUwp.Windows.Media

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Media.MediaPlaybackType.image
import typings.winrtDashUwp.Windows.Media.MediaPlaybackType.music
import typings.winrtDashUwp.Windows.Media.MediaPlaybackType.unknown
import typings.winrtDashUwp.Windows.Media.MediaPlaybackType.video
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaPlaybackType with Double] = js.native
  /* 3 */ @js.native
  object image extends TopLevel[image with Double]
  
  /* 1 */ @js.native
  object music extends TopLevel[music with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
  /* 2 */ @js.native
  object video extends TopLevel[video with Double]
  
}

