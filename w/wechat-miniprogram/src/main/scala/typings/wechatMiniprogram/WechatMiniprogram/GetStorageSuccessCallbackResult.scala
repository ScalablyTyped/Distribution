package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStorageSuccessCallbackResult[T] extends StObject {
  
  /** key对应的内容 */
  var data: T
  
  var errMsg: String
}
object GetStorageSuccessCallbackResult {
  
  inline def apply[T](data: T, errMsg: String): GetStorageSuccessCallbackResult[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStorageSuccessCallbackResult[T]]
  }
  
  extension [Self <: GetStorageSuccessCallbackResult[?], T](x: Self & GetStorageSuccessCallbackResult[T]) {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
