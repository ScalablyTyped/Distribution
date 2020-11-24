package typings.winrtUwp.global.Windows.Media.Playback

import typings.winrtUwp.Windows.Media.Core.MediaSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a media item that can be played back. This class acts as a wrapper around a MediaSource that exposes the audio tracks, video tracks, and timed metadata tracks included in the media source. */
@JSGlobal("Windows.Media.Playback.MediaPlaybackItem")
@js.native
class MediaPlaybackItem protected ()
  extends typings.winrtUwp.Windows.Media.Playback.MediaPlaybackItem {
   /* unmapped type */ /**
    * Initializes a new instance of the MediaPlaybackItem class.
    * @param source The media source from which the MediaPlaybackItem is created.
    */
  def this(source: MediaSource) = this()
}
/* static members */
@JSGlobal("Windows.Media.Playback.MediaPlaybackItem")
@js.native
object MediaPlaybackItem extends js.Object {
  
  var findFromMediaSource: js.Any = js.native
}
