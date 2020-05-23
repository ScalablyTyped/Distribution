package typings.trtcJsSdk.mod

import typings.std.MediaStreamTrack
import typings.trtcJsSdk.trtcJsSdkStrings.environment
import typings.trtcJsSdk.trtcJsSdkStrings.user
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamConfig extends js.Object {
  /** 是否从麦克风采集音频 */
  var audio: Boolean
  /** 音频源 */
  var audioSource: js.UndefOr[MediaStreamTrack] = js.undefined
  /** 摄像头设备 deviceId，通过 getCameras() 获取 */
  var cameraId: js.UndefOr[String] = js.undefined
  /**
    * 在移动设备上，可通过该参数选择使用前置或后置摄像头：
    * - `user`：前置摄像头
    * - `environment`：后置摄像头
    *
    * **注意** 请勿同时使用 cameraId 和 facingMode 参数。
    */
  var facingMode: js.UndefOr[user | environment] = js.undefined
  /** 麦克风设备 deviceId，通过 getMicrophones() 获取 */
  var microphoneId: js.UndefOr[String] = js.undefined
  /** 视频显示是否为镜像，默认为 true。建议在使用前置摄像头时开启，使用后置摄像头时关闭。镜像设置不适用于屏幕分享。 */
  var mirror: js.UndefOr[Boolean] = js.undefined
  /** 是否采集屏幕分享流 */
  var screen: js.UndefOr[Boolean] = js.undefined
  /** 是否从摄像头采集视频 */
  var video: Boolean
  /** 视频源 */
  var videoSource: js.UndefOr[MediaStreamTrack] = js.undefined
}

object StreamConfig {
  @scala.inline
  def apply(
    audio: Boolean,
    video: Boolean,
    audioSource: MediaStreamTrack = null,
    cameraId: String = null,
    facingMode: user | environment = null,
    microphoneId: String = null,
    mirror: js.UndefOr[Boolean] = js.undefined,
    screen: js.UndefOr[Boolean] = js.undefined,
    videoSource: MediaStreamTrack = null
  ): StreamConfig = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    if (audioSource != null) __obj.updateDynamic("audioSource")(audioSource.asInstanceOf[js.Any])
    if (cameraId != null) __obj.updateDynamic("cameraId")(cameraId.asInstanceOf[js.Any])
    if (facingMode != null) __obj.updateDynamic("facingMode")(facingMode.asInstanceOf[js.Any])
    if (microphoneId != null) __obj.updateDynamic("microphoneId")(microphoneId.asInstanceOf[js.Any])
    if (!js.isUndefined(mirror)) __obj.updateDynamic("mirror")(mirror.get.asInstanceOf[js.Any])
    if (!js.isUndefined(screen)) __obj.updateDynamic("screen")(screen.get.asInstanceOf[js.Any])
    if (videoSource != null) __obj.updateDynamic("videoSource")(videoSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamConfig]
  }
}

