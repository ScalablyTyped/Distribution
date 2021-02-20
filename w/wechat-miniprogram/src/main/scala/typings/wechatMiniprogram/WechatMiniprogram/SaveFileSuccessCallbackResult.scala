package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveFileSuccessCallbackResult extends StObject {
  
  var errMsg: String = js.native
  
  /** 存储后的文件路径 (本地路径) */
  var savedFilePath: String = js.native
}
object SaveFileSuccessCallbackResult {
  
  @scala.inline
  def apply(errMsg: String, savedFilePath: String): SaveFileSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], savedFilePath = savedFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveFileSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class SaveFileSuccessCallbackResultMutableBuilder[Self <: SaveFileSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavedFilePath(value: String): Self = StObject.set(x, "savedFilePath", value.asInstanceOf[js.Any])
  }
}
