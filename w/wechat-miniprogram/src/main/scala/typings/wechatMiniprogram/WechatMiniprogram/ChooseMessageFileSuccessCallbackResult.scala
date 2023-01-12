package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChooseMessageFileSuccessCallbackResult extends StObject {
  
  var errMsg: String
  
  /** 返回选择的文件的本地临时文件对象数组 */
  var tempFiles: js.Array[ChooseFile]
}
object ChooseMessageFileSuccessCallbackResult {
  
  inline def apply(errMsg: String, tempFiles: js.Array[ChooseFile]): ChooseMessageFileSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], tempFiles = tempFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseMessageFileSuccessCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChooseMessageFileSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setTempFiles(value: js.Array[ChooseFile]): Self = StObject.set(x, "tempFiles", value.asInstanceOf[js.Any])
    
    inline def setTempFilesVarargs(value: ChooseFile*): Self = StObject.set(x, "tempFiles", js.Array(value*))
  }
}
