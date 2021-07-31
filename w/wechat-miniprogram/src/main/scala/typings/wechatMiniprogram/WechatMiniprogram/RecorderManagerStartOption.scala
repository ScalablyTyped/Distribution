package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramNumbers.`11025`
import typings.wechatMiniprogram.wechatMiniprogramNumbers.`12000`
import typings.wechatMiniprogram.wechatMiniprogramNumbers.`16000`
import typings.wechatMiniprogram.wechatMiniprogramNumbers.`1`
import typings.wechatMiniprogram.wechatMiniprogramNumbers.`22050`
import typings.wechatMiniprogram.wechatMiniprogramNumbers.`24000`
import typings.wechatMiniprogram.wechatMiniprogramNumbers.`2`
import typings.wechatMiniprogram.wechatMiniprogramNumbers.`32000`
import typings.wechatMiniprogram.wechatMiniprogramNumbers.`44100`
import typings.wechatMiniprogram.wechatMiniprogramNumbers.`48000`
import typings.wechatMiniprogram.wechatMiniprogramNumbers.`8000`
import typings.wechatMiniprogram.wechatMiniprogramStrings.PCM
import typings.wechatMiniprogram.wechatMiniprogramStrings.aac
import typings.wechatMiniprogram.wechatMiniprogramStrings.auto
import typings.wechatMiniprogram.wechatMiniprogramStrings.buildInMic
import typings.wechatMiniprogram.wechatMiniprogramStrings.camcorder
import typings.wechatMiniprogram.wechatMiniprogramStrings.headsetMic
import typings.wechatMiniprogram.wechatMiniprogramStrings.mic
import typings.wechatMiniprogram.wechatMiniprogramStrings.mp3
import typings.wechatMiniprogram.wechatMiniprogramStrings.voice_communication
import typings.wechatMiniprogram.wechatMiniprogramStrings.voice_recognition
import typings.wechatMiniprogram.wechatMiniprogramStrings.wav
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecorderManagerStartOption extends StObject {
  
  /** 指定录音的音频输入源，可通过 [wx.getAvailableAudioSources()](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/wx.getAvailableAudioSources.html) 获取当前可用的音频源
    *
    * 可选值：
    * - 'auto': 自动设置，默认使用手机麦克风，插上耳麦后自动切换使用耳机麦克风，所有平台适用;
    * - 'buildInMic': 手机麦克风，仅限 iOS;
    * - 'headsetMic': 耳机麦克风，仅限 iOS;
    * - 'mic': 麦克风（没插耳麦时是手机麦克风，插耳麦时是耳机麦克风），仅限 Android;
    * - 'camcorder': 同 mic，适用于录制音视频内容，仅限 Android;
    * - 'voice_communication': 同 mic，适用于实时沟通，仅限 Android;
    * - 'voice_recognition': 同 mic，适用于语音识别，仅限 Android;
    *
    * 最低基础库： `2.1.0` */
  var audioSource: js.UndefOr[
    auto | buildInMic | headsetMic | mic | camcorder | voice_communication | voice_recognition
  ] = js.undefined
  
  /** 录音的时长，单位 ms，最大值 600000（10 分钟） */
  var duration: js.UndefOr[Double] = js.undefined
  
  /** 编码码率，有效值见下表格 */
  var encodeBitRate: js.UndefOr[Double] = js.undefined
  
  /** 音频格式
    *
    * 可选值：
    * - 'mp3': mp3 格式;
    * - 'aac': aac 格式;
    * - 'wav': wav 格式;
    * - 'PCM': pcm 格式; */
  var format: js.UndefOr[mp3 | aac | wav | PCM] = js.undefined
  
  /** 指定帧大小，单位 KB。传入 frameSize 后，每录制指定帧大小的内容后，会回调录制的文件内容，不指定则不会回调。暂仅支持 mp3 格式。 */
  var frameSize: js.UndefOr[Double] = js.undefined
  
  /** 录音通道数
    *
    * 可选值：
    * - 1: 1 个通道;
    * - 2: 2 个通道; */
  var numberOfChannels: js.UndefOr[`1` | `2`] = js.undefined
  
  /** 采样率
    *
    * 可选值：
    * - 8000: 8000 采样率;
    * - 11025: 11025 采样率;
    * - 12000: 12000 采样率;
    * - 16000: 16000 采样率;
    * - 22050: 22050 采样率;
    * - 24000: 24000 采样率;
    * - 32000: 32000 采样率;
    * - 44100: 44100 采样率;
    * - 48000: 48000 采样率; */
  var sampleRate: js.UndefOr[
    `8000` | `11025` | `12000` | `16000` | `22050` | `24000` | `32000` | `44100` | `48000`
  ] = js.undefined
}
object RecorderManagerStartOption {
  
  @scala.inline
  def apply(): RecorderManagerStartOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecorderManagerStartOption]
  }
  
  @scala.inline
  implicit class RecorderManagerStartOptionMutableBuilder[Self <: RecorderManagerStartOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioSource(value: auto | buildInMic | headsetMic | mic | camcorder | voice_communication | voice_recognition): Self = StObject.set(x, "audioSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioSourceUndefined: Self = StObject.set(x, "audioSource", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEncodeBitRate(value: Double): Self = StObject.set(x, "encodeBitRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodeBitRateUndefined: Self = StObject.set(x, "encodeBitRate", js.undefined)
    
    @scala.inline
    def setFormat(value: mp3 | aac | wav | PCM): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setFrameSize(value: Double): Self = StObject.set(x, "frameSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameSizeUndefined: Self = StObject.set(x, "frameSize", js.undefined)
    
    @scala.inline
    def setNumberOfChannels(value: `1` | `2`): Self = StObject.set(x, "numberOfChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfChannelsUndefined: Self = StObject.set(x, "numberOfChannels", js.undefined)
    
    @scala.inline
    def setSampleRate(value: `8000` | `11025` | `12000` | `16000` | `22050` | `24000` | `32000` | `44100` | `48000`): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
  }
}
