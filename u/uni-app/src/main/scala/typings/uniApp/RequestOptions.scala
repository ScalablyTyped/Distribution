package typings.uniApp

import typings.std.ArrayBuffer
import typings.uniApp.uniAppStrings.CONNECT
import typings.uniApp.uniAppStrings.DELETE
import typings.uniApp.uniAppStrings.GET
import typings.uniApp.uniAppStrings.HEAD
import typings.uniApp.uniAppStrings.OPTIONS
import typings.uniApp.uniAppStrings.POST
import typings.uniApp.uniAppStrings.PUT
import typings.uniApp.uniAppStrings.TRACE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestOptions extends StObject {
  
  /**
    * 结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function1[/* result */ GeneralCallbackResult, Unit]] = js.undefined
  
  /**
    * 请求的参数
    */
  var data: js.UndefOr[String | js.Object | ArrayBuffer] = js.undefined
  
  /**
    * 如果设为json，会尝试对返回的数据做一次 JSON.parse
    */
  var dataType: js.UndefOr[String] = js.undefined
  
  /**
    * 失败的回调函数
    */
  var fail: js.UndefOr[js.Function1[/* result */ GeneralCallbackResult, Unit]] = js.undefined
  
  /**
    * 设置请求的 header，header 中不能设置 Referer。
    */
  var header: js.UndefOr[js.Any] = js.undefined
  
  /**
    * 默认为 GET
    * 可以是：OPTIONS，GET，HEAD，POST，PUT，DELETE，TRACE，CONNECT
    */
  var method: js.UndefOr[OPTIONS | GET | HEAD | POST | PUT | DELETE | TRACE | CONNECT] = js.undefined
  
  /**
    * 设置响应的数据类型。合法值：text、arraybuffer
    */
  var responseType: js.UndefOr[String] = js.undefined
  
  /**
    * 成功返回的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ RequestSuccessCallbackResult, Unit]] = js.undefined
  
  /**
    * 资源url
    */
  var url: js.UndefOr[String] = js.undefined
}
object RequestOptions {
  
  @scala.inline
  def apply(): RequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestOptions]
  }
  
  @scala.inline
  implicit class RequestOptionsMutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* result */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setData(value: String | js.Object | ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setFail(value: /* result */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setHeader(value: js.Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setMethod(value: OPTIONS | GET | HEAD | POST | PUT | DELETE | TRACE | CONNECT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* result */ RequestSuccessCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
