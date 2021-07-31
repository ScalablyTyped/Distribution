package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestSuccessCallbackResult extends StObject {
  
  /**
    * 开发者服务器返回的数据
    */
  var data: js.UndefOr[String] = js.undefined
  
  /**
    * 开发者服务器返回的 HTTP Response Header
    */
  var header: js.UndefOr[js.Any] = js.undefined
  
  /**
    * 开发者服务器返回的 HTTP 状态码
    */
  var statusCode: js.UndefOr[Double] = js.undefined
}
object RequestSuccessCallbackResult {
  
  @scala.inline
  def apply(): RequestSuccessCallbackResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class RequestSuccessCallbackResultMutableBuilder[Self <: RequestSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setHeader(value: js.Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
