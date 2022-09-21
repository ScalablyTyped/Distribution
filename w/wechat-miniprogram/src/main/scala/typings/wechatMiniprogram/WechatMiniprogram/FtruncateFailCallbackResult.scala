package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FtruncateFailCallbackResult extends StObject {
  
  /** 错误信息
    *
    * 可选值：
    * - 'bad file descriptor': 无效的文件描述符;
    * - 'fail permission denied': 指定的 fd 没有写权限;
    * - 'fail the maximum size of the file storage limit is exceeded': 存储空间不足;
    * - 'fail sdcard not mounted': android sdcard 挂载失败; */
  var errMsg: String
}
object FtruncateFailCallbackResult {
  
  inline def apply(errMsg: String): FtruncateFailCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[FtruncateFailCallbackResult]
  }
  
  extension [Self <: FtruncateFailCallbackResult](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
