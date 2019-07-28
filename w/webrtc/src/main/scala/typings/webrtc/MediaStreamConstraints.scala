package typings.webrtc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaStreamConstraints extends js.Object {
  var audio: js.UndefOr[Boolean | MediaTrackConstraints] = js.undefined
  var video: js.UndefOr[Boolean | MediaTrackConstraints] = js.undefined
}

object MediaStreamConstraints {
  @scala.inline
  def apply(audio: Boolean | MediaTrackConstraints = null, video: Boolean | MediaTrackConstraints = null): MediaStreamConstraints = {
    val __obj = js.Dynamic.literal()
    if (audio != null) __obj.updateDynamic("audio")(audio.asInstanceOf[js.Any])
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamConstraints]
  }
}

