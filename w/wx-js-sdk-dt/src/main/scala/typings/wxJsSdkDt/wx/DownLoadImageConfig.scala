package typings.wxJsSdkDt.wx

import typings.wxJsSdkDt.anon.LocalId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownLoadImageConfig
  extends StObject
     with WxBaseRequestConfig {
  
  var isShowProgressTips: js.UndefOr[Double] = js.undefined
  
  /**
    * serverId: 需要下载的图片的服务器端ID，由 uploadImage 接口获得
    */
  var serverId: String
  
  /**
    * var localId = res.localId;  返回图片下载后的本地 ID
    */
  @JSName("success")
  var success_DownLoadImageConfig: js.UndefOr[js.Function1[/* res */ LocalId, Unit]] = js.undefined
}
object DownLoadImageConfig {
  
  inline def apply(serverId: String): DownLoadImageConfig = {
    val __obj = js.Dynamic.literal(serverId = serverId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownLoadImageConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DownLoadImageConfig] (val x: Self) extends AnyVal {
    
    inline def setIsShowProgressTips(value: Double): Self = StObject.set(x, "isShowProgressTips", value.asInstanceOf[js.Any])
    
    inline def setIsShowProgressTipsUndefined: Self = StObject.set(x, "isShowProgressTips", js.undefined)
    
    inline def setServerId(value: String): Self = StObject.set(x, "serverId", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ LocalId => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
