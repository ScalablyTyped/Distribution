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
  
  inline def apply(): RequestSuccessCallbackResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestSuccessCallbackResult]
  }
  
  extension [Self <: RequestSuccessCallbackResult](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setHeader(value: js.Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
