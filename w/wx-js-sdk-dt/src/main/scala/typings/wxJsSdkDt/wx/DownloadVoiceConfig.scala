package typings.wxJsSdkDt.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadVoiceConfig extends WxBaseRequestConfig {
  
  /**
    * 默认为1，显示进度提示
    */
  var isShowProgressTips: js.UndefOr[Double] = js.native
  
  /**
    * 需要下载的音频的服务器端 ID，由 uploadVoice 接口获得
    */
  var serverId: String = js.native
  
  /**
    * 下载成功回调
    */
  @JSName("success")
  def success_MDownloadVoiceConfig(res: js.Any): Unit = js.native
}
object DownloadVoiceConfig {
  
  @scala.inline
  def apply(serverId: String, success: js.Any => Unit): DownloadVoiceConfig = {
    val __obj = js.Dynamic.literal(serverId = serverId.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[DownloadVoiceConfig]
  }
  
  @scala.inline
  implicit class DownloadVoiceConfigMutableBuilder[Self <: DownloadVoiceConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsShowProgressTips(value: Double): Self = StObject.set(x, "isShowProgressTips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsShowProgressTipsUndefined: Self = StObject.set(x, "isShowProgressTips", js.undefined)
    
    @scala.inline
    def setServerId(value: String): Self = StObject.set(x, "serverId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: js.Any => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
