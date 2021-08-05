package typings.wegameApi.wx.types

import org.scalablytyped.runtime.StringDictionary
import typings.wegameApi.anon.Header
import typings.wegameApi.wegameApiStrings.arraybuffer
import typings.wegameApi.wegameApiStrings.json
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestParams extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 请求的参数
    */
  var data: js.UndefOr[String | StringDictionary[js.Any]] = js.undefined
  
  /**
    * 返回的数据格式
    */
  var dataType: js.UndefOr[json | arraybuffer] = js.undefined
  
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 设置请求的 header，header 中不能设置 Referer
    */
  var header: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * HTTP 请求方法
    */
  var method: js.UndefOr[RequestMethod] = js.undefined
  
  /**
    * res.data usually can be string or ArrayBuffer
    */
  var success: js.UndefOr[js.Function1[/* res */ Header, Unit]] = js.undefined
  
  /**
    * 开发者服务器接口地址
    */
  var url: String
}
object RequestParams {
  
  inline def apply(url: String): RequestParams = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestParams]
  }
  
  extension [Self <: RequestParams](x: Self) {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setData(value: String | StringDictionary[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataType(value: json | arraybuffer): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setHeader(value: StringDictionary[String]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setMethod(value: RequestMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setSuccess(value: /* res */ Header => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
