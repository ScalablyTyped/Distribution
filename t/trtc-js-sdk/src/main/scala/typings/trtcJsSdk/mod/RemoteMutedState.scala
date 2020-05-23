package typings.trtcJsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteMutedState extends js.Object {
  /** 是否静音 */
  var audioMuted: Boolean
  /** 是否有视频 */
  var hasAudio: Boolean
  /** 是否有音频 */
  var hasVideo: Boolean
  /** 远端用户ID */
  var userId: String
  /** 是否关闭摄像头 */
  var videoMuted: Boolean
}

object RemoteMutedState {
  @scala.inline
  def apply(audioMuted: Boolean, hasAudio: Boolean, hasVideo: Boolean, userId: String, videoMuted: Boolean): RemoteMutedState = {
    val __obj = js.Dynamic.literal(audioMuted = audioMuted.asInstanceOf[js.Any], hasAudio = hasAudio.asInstanceOf[js.Any], hasVideo = hasVideo.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any], videoMuted = videoMuted.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteMutedState]
  }
}

