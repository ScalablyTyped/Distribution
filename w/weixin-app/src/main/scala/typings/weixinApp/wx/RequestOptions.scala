package typings.weixinApp.wx

import typings.std.ArrayBuffer
import typings.weixinApp.weixinAppStrings.CONNECT
import typings.weixinApp.weixinAppStrings.DELETE
import typings.weixinApp.weixinAppStrings.GET
import typings.weixinApp.weixinAppStrings.HEAD
import typings.weixinApp.weixinAppStrings.OPTIONS
import typings.weixinApp.weixinAppStrings.POST
import typings.weixinApp.weixinAppStrings.PUT
import typings.weixinApp.weixinAppStrings.TRACE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestOptions
  extends StObject
     with BaseOptions[DataResponse, js.Any] {
  
  /** 请求的参数 */
  var data: js.UndefOr[String | js.Object | ArrayBuffer] = js.undefined
  
  /** 如果设为json，会尝试对返回的数据做一次 JSON.parse */
  var dataType: js.UndefOr[String] = js.undefined
  
  /** 设置请求的 header , header 中不能设置 Referer */
  var header: js.UndefOr[RequestHeader] = js.undefined
  
  /** 默认为 GET，有效值：OPTIONS, GET, HEAD, POST, PUT, DELETE, TRACE, CONNECT */
  var method: js.UndefOr[GET | OPTIONS | HEAD | POST | PUT | DELETE | TRACE | CONNECT] = js.undefined
  
  /**
    * 设置响应的数据类型。合法值：text、arraybuffer
    * @version 1.7.0
    */
  var responseType: js.UndefOr[String] = js.undefined
  
  /** 开发者服务器接口地址 */
  var url: String
}
object RequestOptions {
  
  @scala.inline
  def apply(url: String): RequestOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
  
  @scala.inline
  implicit class RequestOptionsMutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String | js.Object | ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setHeader(value: RequestHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setMethod(value: GET | OPTIONS | HEAD | POST | PUT | DELETE | TRACE | CONNECT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
