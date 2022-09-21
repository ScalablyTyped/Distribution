package typings.trtcJsSdk.mod

import typings.trtcJsSdk.trtcJsSdkNumbers.`1`
import typings.trtcJsSdk.trtcJsSdkNumbers.`2`
import typings.trtcJsSdk.trtcJsSdkStrings.live
import typings.trtcJsSdk.trtcJsSdkStrings.rtc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientConfig extends StObject {
  
  /**
    * autoSubscribe flag instead of deprecated Client.setDefaultMuteRemoteStreams
    * default: true
    */
  var autoSubscribe: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 应用场景,目前支持以下两种场景:
    * - `rtc` 实时通话模式
    * - `live` 互动直播模式
    */
  var mode: rtc | live
  
  /**
    * 纯音频推流模式,需要旁路直播和录制时需要带上此参数:
    * - 1 表示本次是纯音频推流，不需要录制 MP3 文件
    * - 2 表示本次是纯音频推流，录制文件为 MP3
    */
  var pureAudioPushMode: js.UndefOr[`1` | `2`] = js.undefined
  
  /** 应用的 sdkAppId */
  var sdkAppId: Double
  
  /** 绑定腾讯云直播 CDN 流 ID，设置之后，您就可以在腾讯云直播 CDN 上通过标准直播方案（FLV|HLS）播放该用户的音视频流。 */
  var streamId: js.UndefOr[String] = js.undefined
  
  /** 是否使用 String 类型的 roomId，支持 v4.3.0+ 版本。 */
  var useStringRoomId: js.UndefOr[Boolean] = js.undefined
  
  /** 设置云端录制完成后的回调消息中的 "userdefinerecordid" 字段内容，便于您更方便的识别录制回调。 */
  var userDefineRecordId: js.UndefOr[String] = js.undefined
  
  /** 用户ID */
  var userId: String
  
  /** 用户签名 */
  var userSig: String
}
object ClientConfig {
  
  inline def apply(mode: rtc | live, sdkAppId: Double, userId: String, userSig: String): ClientConfig = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], sdkAppId = sdkAppId.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any], userSig = userSig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientConfig]
  }
  
  extension [Self <: ClientConfig](x: Self) {
    
    inline def setAutoSubscribe(value: Boolean): Self = StObject.set(x, "autoSubscribe", value.asInstanceOf[js.Any])
    
    inline def setAutoSubscribeUndefined: Self = StObject.set(x, "autoSubscribe", js.undefined)
    
    inline def setMode(value: rtc | live): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setPureAudioPushMode(value: `1` | `2`): Self = StObject.set(x, "pureAudioPushMode", value.asInstanceOf[js.Any])
    
    inline def setPureAudioPushModeUndefined: Self = StObject.set(x, "pureAudioPushMode", js.undefined)
    
    inline def setSdkAppId(value: Double): Self = StObject.set(x, "sdkAppId", value.asInstanceOf[js.Any])
    
    inline def setStreamId(value: String): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    inline def setStreamIdUndefined: Self = StObject.set(x, "streamId", js.undefined)
    
    inline def setUseStringRoomId(value: Boolean): Self = StObject.set(x, "useStringRoomId", value.asInstanceOf[js.Any])
    
    inline def setUseStringRoomIdUndefined: Self = StObject.set(x, "useStringRoomId", js.undefined)
    
    inline def setUserDefineRecordId(value: String): Self = StObject.set(x, "userDefineRecordId", value.asInstanceOf[js.Any])
    
    inline def setUserDefineRecordIdUndefined: Self = StObject.set(x, "userDefineRecordId", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserSig(value: String): Self = StObject.set(x, "userSig", value.asInstanceOf[js.Any])
  }
}
