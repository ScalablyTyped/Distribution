package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckIsSupportSoterAuthenticationRes extends StObject {
  
  /**
    * 接口调用结果
    */
  var errMsg: js.UndefOr[String] = js.undefined
  
  /**
    * 接口调用成功的回调函数
    */
  var supportMode: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object CheckIsSupportSoterAuthenticationRes {
  
  @scala.inline
  def apply(): CheckIsSupportSoterAuthenticationRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckIsSupportSoterAuthenticationRes]
  }
  
  @scala.inline
  implicit class CheckIsSupportSoterAuthenticationResMutableBuilder[Self <: CheckIsSupportSoterAuthenticationRes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsgUndefined: Self = StObject.set(x, "errMsg", js.undefined)
    
    @scala.inline
    def setSupportMode(value: js.Array[js.Any]): Self = StObject.set(x, "supportMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportModeUndefined: Self = StObject.set(x, "supportMode", js.undefined)
    
    @scala.inline
    def setSupportModeVarargs(value: js.Any*): Self = StObject.set(x, "supportMode", js.Array(value :_*))
  }
}
