package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveFileFailCallbackResult extends StObject {
  
  /** 错误信息
    *
    * 可选值：
    * - 'fail tempFilePath file not exist': 指定的 tempFilePath 找不到文件;
    * - 'fail permission denied, open "${filePath}"': 指定的 filePath 路径没有写权限;
    * - 'fail no such file or directory "${dirPath}"': 上级目录不存在;
    * - 'fail the maximum size of the file storage limit is exceeded': 存储空间不足; */
  var errMsg: String = js.native
}
object SaveFileFailCallbackResult {
  
  @scala.inline
  def apply(errMsg: String): SaveFileFailCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveFileFailCallbackResult]
  }
  
  @scala.inline
  implicit class SaveFileFailCallbackResultMutableBuilder[Self <: SaveFileFailCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
