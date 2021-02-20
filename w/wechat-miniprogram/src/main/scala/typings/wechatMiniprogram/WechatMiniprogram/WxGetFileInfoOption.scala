package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.md5_
import typings.wechatMiniprogram.wechatMiniprogramStrings.sha1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WxGetFileInfoOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[GetFileInfoCompleteCallback] = js.native
  
  /** 计算文件摘要的算法
    *
    * 可选值：
    * - 'md5': md5 算法;
    * - 'sha1': sha1 算法; */
  var digestAlgorithm: js.UndefOr[md5_ | sha1] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[WxGetFileInfoFailCallback] = js.native
  
  /** 本地文件路径 (本地路径) */
  var filePath: String = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[WxGetFileInfoSuccessCallback] = js.native
}
object WxGetFileInfoOption {
  
  @scala.inline
  def apply(filePath: String): WxGetFileInfoOption = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[WxGetFileInfoOption]
  }
  
  @scala.inline
  implicit class WxGetFileInfoOptionMutableBuilder[Self <: WxGetFileInfoOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setDigestAlgorithm(value: md5_ | sha1): Self = StObject.set(x, "digestAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestAlgorithmUndefined: Self = StObject.set(x, "digestAlgorithm", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* result */ WxGetFileInfoSuccessCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
