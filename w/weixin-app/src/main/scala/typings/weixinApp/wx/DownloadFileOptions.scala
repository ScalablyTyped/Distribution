package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadFileOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /** HTTP 请求 Header */
  var header: js.UndefOr[RequestHeader] = js.undefined
  
  /** 下载成功后以 tempFilePath 的形式传给页面，res = {tempFilePath: '文件的临时路径'} */
  @JSName("success")
  var success_DownloadFileOptions: js.UndefOr[js.Function1[/* res */ TempFileResponse, Unit]] = js.undefined
  
  /** 下载资源的类型，用于客户端识别处理，有效值：image/audio/video */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** 下载资源的 url */
  var url: String
}
object DownloadFileOptions {
  
  inline def apply(url: String): DownloadFileOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadFileOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DownloadFileOptions] (val x: Self) extends AnyVal {
    
    inline def setHeader(value: RequestHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setSuccess(value: /* res */ TempFileResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
