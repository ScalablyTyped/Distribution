package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReaddirSuccessCallbackResult extends StObject {
  
  var errMsg: String
  
  /** 指定目录下的文件名数组。 */
  var files: js.Array[String]
}
object ReaddirSuccessCallbackResult {
  
  @scala.inline
  def apply(errMsg: String, files: js.Array[String]): ReaddirSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaddirSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class ReaddirSuccessCallbackResultMutableBuilder[Self <: ReaddirSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
  }
}
