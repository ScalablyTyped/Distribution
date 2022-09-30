package typings.trtcJsSdk.mod

import typings.trtcJsSdk.trtcJsSdkInts.`1`
import typings.trtcJsSdk.trtcJsSdkInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MixTranscodeConfig extends StObject {
  
  /** 转码后的音频码率（kbps），默认值为 64，取值范围为[32, 192] */
  var audioBitrate: js.UndefOr[Double] = js.undefined
  
  /** 转码后的音频声道数， 默认值为 1，取值范围为 1 或 2 */
  var audioChannels: js.UndefOr[`1` | `2`] = js.undefined
  
  /** 转码后的音频采样率（Hz），默认值为 48000 */
  var audioSampleRate: js.UndefOr[Double] = js.undefined
  
  /** 混合后画面的背景颜色，格式为十六进制数字，默认值为 0x000000（黑色） */
  var backgroundColor: js.UndefOr[Double] = js.undefined
  
  /** 混合后画面的背景图，默认值为 '' */
  var backgroundImage: js.UndefOr[String] = js.undefined
  
  /** 混入用户流的信息列表[必填]，必须包含接口调用者的信息 */
  var mixUsers: js.Array[MixUser]
  
  /** 混流转码后的流 ID，默认值为'' */
  var streamId: js.UndefOr[String] = js.undefined
  
  /** 转码后的视频码率（kbps），如果传入值为 0，码率值将由 videoWidth 和 videoHeight 决定 */
  var videoBitrate: js.UndefOr[Double] = js.undefined
  
  /** 转码后的视频帧率（fps），默认值为 15， 取值范围为(0, 30] */
  var videoFramerate: js.UndefOr[Double] = js.undefined
  
  /** 转码后的视频关键帧间隔（s），默认值为 2，取值范围为[1, 8] */
  var videoGOP: js.UndefOr[Double] = js.undefined
  
  /** 转码后视频分辨率的高度（px），转码后视频的高度设置必须大于等于 0 且能容纳所有混入视频，默认值为 480 */
  var videoHeight: js.UndefOr[Double] = js.undefined
  
  /** 转码后视频分辨率的宽度（px），转码后视频的宽度设置必须大于等于 0 且能容纳所有混入视频，默认值为 640 */
  var videoWidth: js.UndefOr[Double] = js.undefined
}
object MixTranscodeConfig {
  
  inline def apply(mixUsers: js.Array[MixUser]): MixTranscodeConfig = {
    val __obj = js.Dynamic.literal(mixUsers = mixUsers.asInstanceOf[js.Any])
    __obj.asInstanceOf[MixTranscodeConfig]
  }
  
  extension [Self <: MixTranscodeConfig](x: Self) {
    
    inline def setAudioBitrate(value: Double): Self = StObject.set(x, "audioBitrate", value.asInstanceOf[js.Any])
    
    inline def setAudioBitrateUndefined: Self = StObject.set(x, "audioBitrate", js.undefined)
    
    inline def setAudioChannels(value: `1` | `2`): Self = StObject.set(x, "audioChannels", value.asInstanceOf[js.Any])
    
    inline def setAudioChannelsUndefined: Self = StObject.set(x, "audioChannels", js.undefined)
    
    inline def setAudioSampleRate(value: Double): Self = StObject.set(x, "audioSampleRate", value.asInstanceOf[js.Any])
    
    inline def setAudioSampleRateUndefined: Self = StObject.set(x, "audioSampleRate", js.undefined)
    
    inline def setBackgroundColor(value: Double): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBackgroundImage(value: String): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
    
    inline def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
    
    inline def setMixUsers(value: js.Array[MixUser]): Self = StObject.set(x, "mixUsers", value.asInstanceOf[js.Any])
    
    inline def setMixUsersVarargs(value: MixUser*): Self = StObject.set(x, "mixUsers", js.Array(value*))
    
    inline def setStreamId(value: String): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    inline def setStreamIdUndefined: Self = StObject.set(x, "streamId", js.undefined)
    
    inline def setVideoBitrate(value: Double): Self = StObject.set(x, "videoBitrate", value.asInstanceOf[js.Any])
    
    inline def setVideoBitrateUndefined: Self = StObject.set(x, "videoBitrate", js.undefined)
    
    inline def setVideoFramerate(value: Double): Self = StObject.set(x, "videoFramerate", value.asInstanceOf[js.Any])
    
    inline def setVideoFramerateUndefined: Self = StObject.set(x, "videoFramerate", js.undefined)
    
    inline def setVideoGOP(value: Double): Self = StObject.set(x, "videoGOP", value.asInstanceOf[js.Any])
    
    inline def setVideoGOPUndefined: Self = StObject.set(x, "videoGOP", js.undefined)
    
    inline def setVideoHeight(value: Double): Self = StObject.set(x, "videoHeight", value.asInstanceOf[js.Any])
    
    inline def setVideoHeightUndefined: Self = StObject.set(x, "videoHeight", js.undefined)
    
    inline def setVideoWidth(value: Double): Self = StObject.set(x, "videoWidth", value.asInstanceOf[js.Any])
    
    inline def setVideoWidthUndefined: Self = StObject.set(x, "videoWidth", js.undefined)
  }
}
