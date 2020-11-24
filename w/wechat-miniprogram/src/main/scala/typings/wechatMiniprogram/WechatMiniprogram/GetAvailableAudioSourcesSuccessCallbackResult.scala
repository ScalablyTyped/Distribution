package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.auto
import typings.wechatMiniprogram.wechatMiniprogramStrings.buildInMic
import typings.wechatMiniprogram.wechatMiniprogramStrings.camcorder
import typings.wechatMiniprogram.wechatMiniprogramStrings.headsetMic
import typings.wechatMiniprogram.wechatMiniprogramStrings.mic
import typings.wechatMiniprogram.wechatMiniprogramStrings.voice_communication
import typings.wechatMiniprogram.wechatMiniprogramStrings.voice_recognition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAvailableAudioSourcesSuccessCallbackResult extends js.Object {
  
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
  ] = js.native
  
  var errMsg: String = js.native
}
object GetAvailableAudioSourcesSuccessCallbackResult {
  
  @scala.inline
  def apply(
    audioSources: js.Array[
      auto | buildInMic | headsetMic | mic | camcorder | voice_communication | voice_recognition
    ],
    errMsg: String
  ): GetAvailableAudioSourcesSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(audioSources = audioSources.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAvailableAudioSourcesSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class GetAvailableAudioSourcesSuccessCallbackResultOps[Self <: GetAvailableAudioSourcesSuccessCallbackResult] (val x: Self) extends AnyVal {
    
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
    def setAudioSourcesVarargs(
      value: (auto | buildInMic | headsetMic | mic | camcorder | voice_communication | voice_recognition)*
    ): Self = this.set("audioSources", js.Array(value :_*))
    
    @scala.inline
    def setAudioSources(
      value: js.Array[
          auto | buildInMic | headsetMic | mic | camcorder | voice_communication | voice_recognition
        ]
    ): Self = this.set("audioSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
  }
}
