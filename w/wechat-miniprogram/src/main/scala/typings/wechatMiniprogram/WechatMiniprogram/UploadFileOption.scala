package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadFileOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[UploadFileCompleteCallback] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[UploadFileFailCallback] = js.native
  
  /** 要上传文件资源的路径 (本地路径) */
  var filePath: String = js.native
  
  /** HTTP 请求中其他额外的 form data */
  var formData: js.UndefOr[IAnyObject] = js.native
  
  /** HTTP 请求 Header，Header 中不能设置 Referer */
  var header: js.UndefOr[IAnyObject] = js.native
  
  /** 文件对应的 key，开发者在服务端可以通过这个 key 获取文件的二进制内容 */
  var name: String = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[UploadFileSuccessCallback] = js.native
  
  /** 超时时间，单位为毫秒
    *
    * 最低基础库： `2.10.0` */
  var timeout: js.UndefOr[Double] = js.native
  
  /** 开发者服务器地址 */
  var url: String = js.native
}
object UploadFileOption {
  
  @scala.inline
  def apply(filePath: String, name: String, url: String): UploadFileOption = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFileOption]
  }
  
  @scala.inline
  implicit class UploadFileOptionMutableBuilder[Self <: UploadFileOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormData(value: IAnyObject): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
    
    @scala.inline
    def setHeader(value: IAnyObject): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* result */ UploadFileSuccessCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
