package typings.trtcJsSdk.mod

import typings.std.MediaStreamTrack
import typings.trtcJsSdk.trtcJsSdkStrings.environment
import typings.trtcJsSdk.trtcJsSdkStrings.user
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamConfig extends StObject {
  
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
  
  /**
    * 是否采集系统音频
    * 请勿同时设置 audio 和 screenAudio 为 true。
    * 采集系统声音只支持 Chrome M74+ ，在 Windows 和 Chrome OS 上，可以捕获整个系统的音频，在 Linux 和 Mac 上，只能捕获选项卡的音频。其它 Chrome 版本、其它系统、其它浏览器均不支持。
    * 屏幕分享获取指引：https://trtc-1252463788.file.myqcloud.com/web/docs/tutorial-06-advanced-screencast.html。
    */
  var screenAudio: js.UndefOr[Boolean] = js.undefined
  
  /** 用户ID */
  var userId: String
  
  /** 是否从摄像头采集视频 */
  var video: Boolean
  
  /** 视频源 */
  var videoSource: js.UndefOr[MediaStreamTrack] = js.undefined
}
object StreamConfig {
  
  inline def apply(audio: Boolean, userId: String, video: Boolean): StreamConfig = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamConfig]
  }
  
  extension [Self <: StreamConfig](x: Self) {
    
    inline def setAudio(value: Boolean): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioSource(value: MediaStreamTrack): Self = StObject.set(x, "audioSource", value.asInstanceOf[js.Any])
    
    inline def setAudioSourceUndefined: Self = StObject.set(x, "audioSource", js.undefined)
    
    inline def setCameraId(value: String): Self = StObject.set(x, "cameraId", value.asInstanceOf[js.Any])
    
    inline def setCameraIdUndefined: Self = StObject.set(x, "cameraId", js.undefined)
    
    inline def setFacingMode(value: user | environment): Self = StObject.set(x, "facingMode", value.asInstanceOf[js.Any])
    
    inline def setFacingModeUndefined: Self = StObject.set(x, "facingMode", js.undefined)
    
    inline def setMicrophoneId(value: String): Self = StObject.set(x, "microphoneId", value.asInstanceOf[js.Any])
    
    inline def setMicrophoneIdUndefined: Self = StObject.set(x, "microphoneId", js.undefined)
    
    inline def setMirror(value: Boolean): Self = StObject.set(x, "mirror", value.asInstanceOf[js.Any])
    
    inline def setMirrorUndefined: Self = StObject.set(x, "mirror", js.undefined)
    
    inline def setScreen(value: Boolean): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
    
    inline def setScreenAudio(value: Boolean): Self = StObject.set(x, "screenAudio", value.asInstanceOf[js.Any])
    
    inline def setScreenAudioUndefined: Self = StObject.set(x, "screenAudio", js.undefined)
    
    inline def setScreenUndefined: Self = StObject.set(x, "screen", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoSource(value: MediaStreamTrack): Self = StObject.set(x, "videoSource", value.asInstanceOf[js.Any])
    
    inline def setVideoSourceUndefined: Self = StObject.set(x, "videoSource", js.undefined)
  }
}
