package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WxGetFileInfoSuccessCallbackResult extends StObject {
  
  /** 按照传入的 digestAlgorithm 计算得出的的文件摘要 */
  var digest: String = js.native
  
  var errMsg: String = js.native
  
  /** 文件大小，以字节为单位 */
  var size: Double = js.native
}
object WxGetFileInfoSuccessCallbackResult {
  
  @scala.inline
  def apply(digest: String, errMsg: String, size: Double): WxGetFileInfoSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(digest = digest.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[WxGetFileInfoSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class WxGetFileInfoSuccessCallbackResultMutableBuilder[Self <: WxGetFileInfoSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
