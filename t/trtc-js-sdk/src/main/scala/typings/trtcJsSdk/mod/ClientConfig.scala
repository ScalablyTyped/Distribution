package typings.trtcJsSdk.mod

import typings.trtcJsSdk.trtcJsSdkNumbers.`1`
import typings.trtcJsSdk.trtcJsSdkNumbers.`2`
import typings.trtcJsSdk.trtcJsSdkStrings.live
import typings.trtcJsSdk.trtcJsSdkStrings.videoCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientConfig extends StObject {
  
  /**
    * 应用场景,目前支持以下两种场景:
    * - `videoCall` 实时通话模式
    * - `live` 互动直播模式
    */
  var mode: videoCall | live = js.native
  
  /**
    * 纯音频推流模式,需要旁路直播和录制时需要带上此参数:
    * - 1 表示本次是纯音频推流，不需要录制 MP3 文件
    * - 2 表示本次是纯音频推流，录制文件为 MP3
    */
  var pureAudioPushMode: js.UndefOr[`1` | `2`] = js.native
  
  /** 自动录制时业务自定义ID(32位整型)，将在录制完成后通过直播录制回调接口通知业务方 */
  var recordId: js.UndefOr[Double] = js.native
  
  /** 应用的 sdkAppId */
  var sdkAppId: Double = js.native
  
  /** 绑定腾讯云直播 CDN 流 ID，设置之后，您就可以在腾讯云直播 CDN 上通过标准直播方案（FLV|HLS）播放该用户的音视频流。 */
  var streamId: js.UndefOr[String] = js.native
  
  /** 设置云端录制完成后的回调消息中的 "userdefinerecordid" 字段内容，便于您更方便的识别录制回调。 */
  var userDefineRecordId: js.UndefOr[String] = js.native
  
  /** 用户ID */
  var userId: String = js.native
  
  /** 用户签名 */
  var userSig: String = js.native
}
object ClientConfig {
  
  @scala.inline
  def apply(mode: videoCall | live, sdkAppId: Double, userId: String, userSig: String): ClientConfig = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], sdkAppId = sdkAppId.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any], userSig = userSig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientConfig]
  }
  
  @scala.inline
  implicit class ClientConfigMutableBuilder[Self <: ClientConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: videoCall | live): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPureAudioPushMode(value: `1` | `2`): Self = StObject.set(x, "pureAudioPushMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPureAudioPushModeUndefined: Self = StObject.set(x, "pureAudioPushMode", js.undefined)
    
    @scala.inline
    def setRecordId(value: Double): Self = StObject.set(x, "recordId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordIdUndefined: Self = StObject.set(x, "recordId", js.undefined)
    
    @scala.inline
    def setSdkAppId(value: Double): Self = StObject.set(x, "sdkAppId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamId(value: String): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamIdUndefined: Self = StObject.set(x, "streamId", js.undefined)
    
    @scala.inline
    def setUserDefineRecordId(value: String): Self = StObject.set(x, "userDefineRecordId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDefineRecordIdUndefined: Self = StObject.set(x, "userDefineRecordId", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserSig(value: String): Self = StObject.set(x, "userSig", value.asInstanceOf[js.Any])
  }
}
