package typings
package winrtDashUwpLib.WindowsNs.MediaNs

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
  sealed trait image
    extends winrtDashUwpLib.WindowsNs.MediaNs.MediaPlaybackType
  
  /** The media type is audio music. */
  @js.native
  sealed trait music
    extends winrtDashUwpLib.WindowsNs.MediaNs.MediaPlaybackType
  
  /** The media type is unknown. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.MediaNs.MediaPlaybackType
  
  /** The media type is video. */
  @js.native
  sealed trait video
    extends winrtDashUwpLib.WindowsNs.MediaNs.MediaPlaybackType
  
  val image: image with java.lang.String = js.native
  val music: music with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  val video: video with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.MediaPlaybackType with java.lang.String] = js.native
}

