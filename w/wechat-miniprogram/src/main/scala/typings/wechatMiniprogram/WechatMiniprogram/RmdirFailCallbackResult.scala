package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RmdirFailCallbackResult extends StObject {
  
  /** 错误信息
    *
    * 可选值：
    * - 'fail no such file or directory ${dirPath}': 目录不存在;
    * - 'fail directory not empty': 目录不为空;
    * - 'fail permission denied, open ${dirPath}': 指定的 dirPath 路径没有写权限; */
  var errMsg: String = js.native
}
object RmdirFailCallbackResult {
  
  @scala.inline
  def apply(errMsg: String): RmdirFailCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[RmdirFailCallbackResult]
  }
  
  @scala.inline
  implicit class RmdirFailCallbackResultMutableBuilder[Self <: RmdirFailCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
