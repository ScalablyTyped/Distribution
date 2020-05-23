package typings.titanium.Titanium.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the currently playing movie changes.
  */
trait VideoPlayerPlayingEvent extends VideoPlayerBaseEvent {
  /**
    * URL of the media.
    */
  var url: String
}

object VideoPlayerPlayingEvent {
  @scala.inline
  def apply(source: VideoPlayer, url: String): VideoPlayerPlayingEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoPlayerPlayingEvent]
  }
}

