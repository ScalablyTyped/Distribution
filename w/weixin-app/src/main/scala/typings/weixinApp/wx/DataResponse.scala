package typings.weixinApp.wx

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #region 基本参数
trait DataResponse extends StObject {
  
  /** 回调函数返回的内容 */
  var data: js.Object | String | ArrayBuffer
  
  /** 开发者服务器返回的 HTTP Response Header */
  var header: js.Object
  
  /** 开发者服务器返回的 HTTP 状态码 */
  var statusCode: Double
}
object DataResponse {
  
  @scala.inline
  def apply(data: js.Object | String | ArrayBuffer, header: js.Object, statusCode: Double): DataResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataResponse]
  }
  
  @scala.inline
  implicit class DataResponseMutableBuilder[Self <: DataResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Object | String | ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: js.Object): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
