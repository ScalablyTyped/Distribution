package typings.trtcJsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteMutedState extends js.Object {
  /** 是否静音 */
  var audioMuted: Boolean = js.native
  /** 是否有视频 */
  var hasAudio: Boolean = js.native
  /** 是否有音频 */
  var hasVideo: Boolean = js.native
  /** 远端用户ID */
  var userId: String = js.native
  /** 是否关闭摄像头 */
  var videoMuted: Boolean = js.native
}

object RemoteMutedState {
  @scala.inline
  def apply(audioMuted: Boolean, hasAudio: Boolean, hasVideo: Boolean, userId: String, videoMuted: Boolean): RemoteMutedState = {
    val __obj = js.Dynamic.literal(audioMuted = audioMuted.asInstanceOf[js.Any], hasAudio = hasAudio.asInstanceOf[js.Any], hasVideo = hasVideo.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any], videoMuted = videoMuted.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteMutedState]
  }
  @scala.inline
  implicit class RemoteMutedStateOps[Self <: RemoteMutedState] (val x: Self) extends AnyVal {
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
    def setAudioMuted(value: Boolean): Self = this.set("audioMuted", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasAudio(value: Boolean): Self = this.set("hasAudio", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasVideo(value: Boolean): Self = this.set("hasVideo", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVideoMuted(value: Boolean): Self = this.set("videoMuted", value.asInstanceOf[js.Any])
  }
  
}

