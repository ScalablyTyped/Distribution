package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.auto
import typings.wechatMiniprogram.wechatMiniprogramStrings.buildInMic
import typings.wechatMiniprogram.wechatMiniprogramStrings.camcorder
import typings.wechatMiniprogram.wechatMiniprogramStrings.headsetMic
import typings.wechatMiniprogram.wechatMiniprogramStrings.mic
import typings.wechatMiniprogram.wechatMiniprogramStrings.voice_communication
import typings.wechatMiniprogram.wechatMiniprogramStrings.voice_recognition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAvailableAudioSourcesSuccessCallbackResult extends StObject {
  
  /** 支持的音频输入源列表，可在 [RecorderManager.start()](https://developers.weixin.qq.com/miniprogram/dev/api/media/recorder/RecorderManager.start.html) 接口中使用。返回值定义参考 https://developer.android.com/reference/kotlin/android/media/MediaRecorder.AudioSource
    *
    * 可选值：
    * - 'auto': 自动设置，默认使用手机麦克风，插上耳麦后自动切换使用耳机麦克风，所有平台适用;
    * - 'buildInMic': 手机麦克风，仅限 iOS;
    * - 'headsetMic': 耳机麦克风，仅限 iOS;
    * - 'mic': 麦克风（没插耳麦时是手机麦克风，插耳麦时是耳机麦克风），仅限 Android;
    * - 'camcorder': 同 mic，适用于录制音视频内容，仅限 Android;
    * - 'voice_communication': 同 mic，适用于实时沟通，仅限 Android;
    * - 'voice_recognition': 同 mic，适用于语音识别，仅限 Android; */
  var audioSources: js.Array[
    auto | buildInMic | headsetMic | mic | camcorder | voice_communication | voice_recognition
  ]
  
  var errMsg: String
}
object GetAvailableAudioSourcesSuccessCallbackResult {
  
  inline def apply(
    audioSources: js.Array[
      auto | buildInMic | headsetMic | mic | camcorder | voice_communication | voice_recognition
    ],
    errMsg: String
  ): GetAvailableAudioSourcesSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(audioSources = audioSources.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAvailableAudioSourcesSuccessCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAvailableAudioSourcesSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setAudioSources(
      value: js.Array[
          auto | buildInMic | headsetMic | mic | camcorder | voice_communication | voice_recognition
        ]
    ): Self = StObject.set(x, "audioSources", value.asInstanceOf[js.Any])
    
    inline def setAudioSourcesVarargs(
      value: (auto | buildInMic | headsetMic | mic | camcorder | voice_communication | voice_recognition)*
    ): Self = StObject.set(x, "audioSources", js.Array(value*))
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
