package typings.webrtc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaStreamConstraints extends js.Object {
  var audio: js.UndefOr[Boolean | MediaTrackConstraints] = js.native
  var video: js.UndefOr[Boolean | MediaTrackConstraints] = js.native
}

object MediaStreamConstraints {
  @scala.inline
  def apply(): MediaStreamConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaStreamConstraints]
  }
  @scala.inline
  implicit class MediaStreamConstraintsOps[Self <: MediaStreamConstraints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAudio(value: Boolean | MediaTrackConstraints): Self = this.set("audio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudio: Self = this.set("audio", js.undefined)
    @scala.inline
    def setVideo(value: Boolean | MediaTrackConstraints): Self = this.set("video", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
  }
  
}

