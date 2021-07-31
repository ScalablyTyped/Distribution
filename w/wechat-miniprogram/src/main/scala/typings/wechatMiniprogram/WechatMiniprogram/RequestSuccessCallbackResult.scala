package typings.wechatMiniprogram.WechatMiniprogram

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestSuccessCallbackResult extends StObject {
  
  /** 开发者服务器返回的 cookies，格式为字符串数组
    *
    * 最低基础库： `2.10.0` */
  var cookies: js.Array[String]
  
  /** 开发者服务器返回的数据 */
  var data: String | IAnyObject | ArrayBuffer
  
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
  
  @scala.inline
  def apply(
    cookies: js.Array[String],
    data: String | IAnyObject | ArrayBuffer,
    errMsg: String,
    header: IAnyObject,
    profile: RequestProfile,
    statusCode: Double
  ): RequestSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class RequestSuccessCallbackResultMutableBuilder[Self <: RequestSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCookies(value: js.Array[String]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookiesVarargs(value: String*): Self = StObject.set(x, "cookies", js.Array(value :_*))
    
    @scala.inline
    def setData(value: String | IAnyObject | ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: IAnyObject): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile(value: RequestProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
