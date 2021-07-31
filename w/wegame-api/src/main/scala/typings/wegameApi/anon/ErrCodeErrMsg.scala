package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrCodeErrMsg extends StObject {
  
  /**
    * 错误码
    */
  var errCode: Double
  
  /**
    * 调用结果（错误原因）
    */
  var errMsg: String
}
object ErrCodeErrMsg {
  
  @scala.inline
  def apply(errCode: Double, errMsg: String): ErrCodeErrMsg = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrCodeErrMsg]
  }
  
  @scala.inline
  implicit class ErrCodeErrMsgMutableBuilder[Self <: ErrCodeErrMsg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrCode(value: Double): Self = StObject.set(x, "errCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
