package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecorderManagerStartOptions extends StObject {
  
  /**
    * 指定录音的时长，单位 ms
    * 如果传入了合法的 duration
    * 在到达指定的 duration 后会自动停止录音，最大值 600000（10 分钟）,默认值 60000（1 分钟）
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * 编码码率
    * 采样率和码率有一定要求，具体有效值如下：
    * 采样率 编码码率
    * + 8000 16000 ~ 48000
    * + 11025 16000 ~ 48000
    * + 12000 24000 ~ 64000
    * + 16000 24000 ~ 96000
    * + 22050 32000 ~ 128000
    * + 24000 32000 ~ 128000
    * + 32000 48000 ~ 192000
    * + 44100 64000 ~ 320000
    * + 48000 64000 ~ 320000
    */
  var encodeBitRate: Double
  
  /** 音频格式，有效值 aac/mp3 */
  var format: String
  
  /**
    * 指定帧大小，单位 KB
    * 传入 frameSize 后，每录制指定帧大小的内容后
    * 会回调录制的文件内容，不指定则不会回调。暂仅支持 mp3 格式。
    */
  var frameSize: Double
  
  /**
    * 否 录音通道数，有效值 1/2
    */
  var numberOfChannels: js.UndefOr[Double] = js.undefined
  
  /**
    * 采样率，有效值 8000/16000/44100
    */
  var sampleRate: js.UndefOr[Double] = js.undefined
}
object RecorderManagerStartOptions {
  
  @scala.inline
  def apply(encodeBitRate: Double, format: String, frameSize: Double): RecorderManagerStartOptions = {
    val __obj = js.Dynamic.literal(encodeBitRate = encodeBitRate.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], frameSize = frameSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecorderManagerStartOptions]
  }
  
  @scala.inline
  implicit class RecorderManagerStartOptionsMutableBuilder[Self <: RecorderManagerStartOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEncodeBitRate(value: Double): Self = StObject.set(x, "encodeBitRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameSize(value: Double): Self = StObject.set(x, "frameSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfChannels(value: Double): Self = StObject.set(x, "numberOfChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfChannelsUndefined: Self = StObject.set(x, "numberOfChannels", js.undefined)
    
    @scala.inline
    def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
  }
}
