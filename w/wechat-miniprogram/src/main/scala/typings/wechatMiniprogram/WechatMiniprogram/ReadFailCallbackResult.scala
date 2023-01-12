package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadFailCallbackResult extends StObject {
  
  /** 错误信息
    *
    * 可选值：
    * - 'bad file descriptor': 无效的文件描述符;
    * - 'fail permission denied': 指定的 fd 路径没有读权限;
    * - 'fail the value of "offset" is out of range': 传入的 offset 不合法;
    * - 'fail the value of "length" is out of range': 传入的 length 不合法;
    * - 'fail sdcard not mounted': android sdcard 挂载失败;
    * - 'bad file descriptor': 无效的文件描述符; */
  var errMsg: String
}
object ReadFailCallbackResult {
  
  inline def apply(errMsg: String): ReadFailCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadFailCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadFailCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
