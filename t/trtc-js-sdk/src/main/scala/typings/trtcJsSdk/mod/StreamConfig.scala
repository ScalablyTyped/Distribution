package typings.trtcJsSdk.mod

import typings.std.MediaStreamTrack
import typings.trtcJsSdk.trtcJsSdkStrings.environment
import typings.trtcJsSdk.trtcJsSdkStrings.user
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamConfig extends StObject {
  
  /** 是否从麦克风采集音频 */
  var audio: Boolean = js.native
  
  /** 音频源 */
  var audioSource: js.UndefOr[MediaStreamTrack] = js.native
  
  /** 摄像头设备 deviceId，通过 getCameras() 获取 */
  var cameraId: js.UndefOr[String] = js.native
  
  /**
    * 在移动设备上，可通过该参数选择使用前置或后置摄像头：
    * - `user`：前置摄像头
    * - `environment`：后置摄像头
    *
    * **注意** 请勿同时使用 cameraId 和 facingMode 参数。
    */
  var facingMode: js.UndefOr[user | environment] = js.native
  
  /** 麦克风设备 deviceId，通过 getMicrophones() 获取 */
  var microphoneId: js.UndefOr[String] = js.native
  
  /** 视频显示是否为镜像，默认为 true。建议在使用前置摄像头时开启，使用后置摄像头时关闭。镜像设置不适用于屏幕分享。 */
  var mirror: js.UndefOr[Boolean] = js.native
  
  /** 是否采集屏幕分享流 */
  var screen: js.UndefOr[Boolean] = js.native
  
  /** 是否从摄像头采集视频 */
  var video: Boolean = js.native
  
  /** 视频源 */
  var videoSource: js.UndefOr[MediaStreamTrack] = js.native
}
object StreamConfig {
  
  @scala.inline
  def apply(audio: Boolean, video: Boolean): StreamConfig = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamConfig]
  }
  
  @scala.inline
  implicit class StreamConfigMutableBuilder[Self <: StreamConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudio(value: Boolean): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioSource(value: MediaStreamTrack): Self = StObject.set(x, "audioSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioSourceUndefined: Self = StObject.set(x, "audioSource", js.undefined)
    
    @scala.inline
    def setCameraId(value: String): Self = StObject.set(x, "cameraId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraIdUndefined: Self = StObject.set(x, "cameraId", js.undefined)
    
    @scala.inline
    def setFacingMode(value: user | environment): Self = StObject.set(x, "facingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacingModeUndefined: Self = StObject.set(x, "facingMode", js.undefined)
    
    @scala.inline
    def setMicrophoneId(value: String): Self = StObject.set(x, "microphoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMicrophoneIdUndefined: Self = StObject.set(x, "microphoneId", js.undefined)
    
    @scala.inline
    def setMirror(value: Boolean): Self = StObject.set(x, "mirror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMirrorUndefined: Self = StObject.set(x, "mirror", js.undefined)
    
    @scala.inline
    def setScreen(value: Boolean): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenUndefined: Self = StObject.set(x, "screen", js.undefined)
    
    @scala.inline
    def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoSource(value: MediaStreamTrack): Self = StObject.set(x, "videoSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoSourceUndefined: Self = StObject.set(x, "videoSource", js.undefined)
  }
}
