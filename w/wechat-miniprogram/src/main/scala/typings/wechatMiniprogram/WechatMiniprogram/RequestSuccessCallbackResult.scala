package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestSuccessCallbackResult[T /* <: String | IAnyObject | js.typedarray.ArrayBuffer */] extends StObject {
  
  /** 开发者服务器返回的 cookies，格式为字符串数组
    *
    * 最低基础库： `2.10.0` */
  var cookies: js.Array[String]
  
  /** 开发者服务器返回的数据 */
  var data: T
  
  var errMsg: String
  
  /** 开发者服务器返回的 HTTP Response Header
    *
    * 最低基础库： `1.2.0` */
  var header: IAnyObject
  
  /** 网络请求过程中一些调试信息
    *
    * 最低基础库： `2.10.4` */
  var profile: RequestProfile
  
  /** 开发者服务器返回的 HTTP 状态码 */
  var statusCode: Double
}
object RequestSuccessCallbackResult {
  
  inline def apply[T /* <: String | IAnyObject | js.typedarray.ArrayBuffer */](
    cookies: js.Array[String],
    data: T,
    errMsg: String,
    header: IAnyObject,
    profile: RequestProfile,
    statusCode: Double
  ): RequestSuccessCallbackResult[T] = {
    val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestSuccessCallbackResult[T]]
  }
  
  extension [Self <: RequestSuccessCallbackResult[?], T /* <: String | IAnyObject | js.typedarray.ArrayBuffer */](x: Self & RequestSuccessCallbackResult[T]) {
    
    inline def setCookies(value: js.Array[String]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    inline def setCookiesVarargs(value: String*): Self = StObject.set(x, "cookies", js.Array(value*))
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: IAnyObject): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setProfile(value: RequestProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
