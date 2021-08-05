package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyFileFailCallbackResult extends StObject {
  
  /** 错误信息
    *
    * 可选值：
    * - 'fail permission denied, copyFile ${srcPath} -> ${destPath}': 指定目标文件路径没有写权限;
    * - 'fail no such file or directory, copyFile ${srcPath} -> ${destPath}': 源文件不存在，或目标文件路径的上层目录不存在;
    * - 'fail the maximum size of the file storage limit is exceeded': 存储空间不足; */
  var errMsg: String
}
object CopyFileFailCallbackResult {
  
  inline def apply(errMsg: String): CopyFileFailCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyFileFailCallbackResult]
  }
  
  extension [Self <: CopyFileFailCallbackResult](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
