package typings.wxJsSdkDt.wx

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
  implicit class DownloadVoiceConfigOps[Self <: DownloadVoiceConfig] (val x: Self) extends AnyVal {
    
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
    def setServerId(value: String): Self = this.set("serverId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: js.Any => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsShowProgressTips(value: Double): Self = this.set("isShowProgressTips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsShowProgressTips: Self = this.set("isShowProgressTips", js.undefined)
  }
}
