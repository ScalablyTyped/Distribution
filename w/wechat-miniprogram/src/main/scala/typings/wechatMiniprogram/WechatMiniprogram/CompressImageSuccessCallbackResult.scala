package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompressImageSuccessCallbackResult extends StObject {
  
  var errMsg: String = js.native
  
  /** 压缩后图片的临时文件路径 (本地路径) */
  var tempFilePath: String = js.native
}
object CompressImageSuccessCallbackResult {
  
  @scala.inline
  def apply(errMsg: String, tempFilePath: String): CompressImageSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], tempFilePath = tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompressImageSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class CompressImageSuccessCallbackResultMutableBuilder[Self <: CompressImageSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
  }
}
