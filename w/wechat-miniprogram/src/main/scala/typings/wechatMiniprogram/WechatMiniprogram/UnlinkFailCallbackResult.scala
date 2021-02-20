package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnlinkFailCallbackResult extends StObject {
  
  /** 错误信息
    *
    * 可选值：
    * - 'fail permission denied, open ${path}': 指定的 path 路径没有读权限;
    * - 'fail no such file or directory ${path}': 文件不存在;
    * - 'fail operation not permitted, unlink ${filePath}': 传入的 filePath 是一个目录; */
  var errMsg: String = js.native
}
object UnlinkFailCallbackResult {
  
  @scala.inline
  def apply(errMsg: String): UnlinkFailCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnlinkFailCallbackResult]
  }
  
  @scala.inline
  implicit class UnlinkFailCallbackResultMutableBuilder[Self <: UnlinkFailCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
