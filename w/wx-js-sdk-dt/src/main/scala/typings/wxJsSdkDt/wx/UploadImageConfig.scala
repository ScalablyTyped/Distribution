package typings.wxJsSdkDt.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadImageConfig
  extends StObject
     with WxBaseRequestConfig {
  
  /**
    * 默认为1，显示进度提示
    */
  var isShowProgressTips: js.UndefOr[Double] = js.undefined
  
  /**
    * 要上传的图片的本地 ID，由 chooseImage 接口获得
    */
  var localId: String
  
  /**
    * res: var serverId = res.serverId;  返回图片的服务器端 ID
    */
  @JSName("success")
  def success_MUploadImageConfig(res: js.Any): Unit
}
object UploadImageConfig {
  
  @scala.inline
  def apply(localId: String, success: js.Any => Unit): UploadImageConfig = {
    val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[UploadImageConfig]
  }
  
  @scala.inline
  implicit class UploadImageConfigMutableBuilder[Self <: UploadImageConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsShowProgressTips(value: Double): Self = StObject.set(x, "isShowProgressTips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsShowProgressTipsUndefined: Self = StObject.set(x, "isShowProgressTips", js.undefined)
    
    @scala.inline
    def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: js.Any => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
