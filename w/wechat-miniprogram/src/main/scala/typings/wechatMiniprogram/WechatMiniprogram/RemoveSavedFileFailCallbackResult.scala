package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveSavedFileFailCallbackResult extends StObject {
  
  /** 错误信息
    *
    * 可选值：
    * - 'fail file not exist': 指定的 tempFilePath 找不到文件; */
  var errMsg: String
}
object RemoveSavedFileFailCallbackResult {
  
  inline def apply(errMsg: String): RemoveSavedFileFailCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveSavedFileFailCallbackResult]
  }
  
  extension [Self <: RemoveSavedFileFailCallbackResult](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
