package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TakePhotoSuccessCallbackResult extends StObject {
  
  var errMsg: String
  
  /** 照片文件的临时路径 (本地路径)，安卓是jpg图片格式，ios是png */
  var tempImagePath: String
}
object TakePhotoSuccessCallbackResult {
  
  inline def apply(errMsg: String, tempImagePath: String): TakePhotoSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], tempImagePath = tempImagePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TakePhotoSuccessCallbackResult]
  }
  
  extension [Self <: TakePhotoSuccessCallbackResult](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setTempImagePath(value: String): Self = StObject.set(x, "tempImagePath", value.asInstanceOf[js.Any])
  }
}
