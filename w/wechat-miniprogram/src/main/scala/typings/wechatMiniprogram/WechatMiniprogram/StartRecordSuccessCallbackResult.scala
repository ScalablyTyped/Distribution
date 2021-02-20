package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartRecordSuccessCallbackResult extends StObject {
  
  var errMsg: String = js.native
  
  /** 录音文件的临时路径 (本地路径) */
  var tempFilePath: String = js.native
}
object StartRecordSuccessCallbackResult {
  
  @scala.inline
  def apply(errMsg: String, tempFilePath: String): StartRecordSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], tempFilePath = tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartRecordSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class StartRecordSuccessCallbackResultMutableBuilder[Self <: StartRecordSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
  }
}
