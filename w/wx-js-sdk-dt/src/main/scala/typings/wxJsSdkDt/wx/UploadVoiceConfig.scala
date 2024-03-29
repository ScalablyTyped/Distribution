package typings.wxJsSdkDt.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadVoiceConfig
  extends StObject
     with WxBaseRequestConfig {
  
  var isShowProgressTips: js.UndefOr[Double] = js.undefined
  
  var localId: String
  
  @JSName("success")
  def success_MUploadVoiceConfig(res: Any): Unit
}
object UploadVoiceConfig {
  
  inline def apply(localId: String, success: Any => Unit): UploadVoiceConfig = {
    val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[UploadVoiceConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadVoiceConfig] (val x: Self) extends AnyVal {
    
    inline def setIsShowProgressTips(value: Double): Self = StObject.set(x, "isShowProgressTips", value.asInstanceOf[js.Any])
    
    inline def setIsShowProgressTipsUndefined: Self = StObject.set(x, "isShowProgressTips", js.undefined)
    
    inline def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Any => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
