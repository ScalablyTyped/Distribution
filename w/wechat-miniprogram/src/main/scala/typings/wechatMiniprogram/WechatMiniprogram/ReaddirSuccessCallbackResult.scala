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
  
  inline def apply(errMsg: String, files: js.Array[String]): ReaddirSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaddirSuccessCallbackResult]
  }
  
  extension [Self <: ReaddirSuccessCallbackResult](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
  }
}
