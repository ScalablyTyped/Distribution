package typings.twilioDashVideo.twilioDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLocalTracksOptions extends js.Object {
  var audio: js.UndefOr[Boolean | CreateLocalTrackOptions] = js.undefined
  var logLevel: js.UndefOr[LogLevel | LogLevels] = js.undefined
  var video: js.UndefOr[Boolean | CreateLocalTrackOptions] = js.undefined
}

object CreateLocalTracksOptions {
  @scala.inline
  def apply(
    audio: Boolean | CreateLocalTrackOptions = null,
    logLevel: LogLevel | LogLevels = null,
    video: Boolean | CreateLocalTrackOptions = null
  ): CreateLocalTracksOptions = {
    val __obj = js.Dynamic.literal()
    if (audio != null) __obj.updateDynamic("audio")(audio.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLocalTracksOptions]
  }
}

