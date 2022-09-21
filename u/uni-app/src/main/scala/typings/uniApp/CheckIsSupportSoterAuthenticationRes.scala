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
  var supportMode: js.UndefOr[js.Array[Any]] = js.undefined
}
object CheckIsSupportSoterAuthenticationRes {
  
  inline def apply(): CheckIsSupportSoterAuthenticationRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckIsSupportSoterAuthenticationRes]
  }
  
  extension [Self <: CheckIsSupportSoterAuthenticationRes](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setErrMsgUndefined: Self = StObject.set(x, "errMsg", js.undefined)
    
    inline def setSupportMode(value: js.Array[Any]): Self = StObject.set(x, "supportMode", value.asInstanceOf[js.Any])
    
    inline def setSupportModeUndefined: Self = StObject.set(x, "supportMode", js.undefined)
    
    inline def setSupportModeVarargs(value: Any*): Self = StObject.set(x, "supportMode", js.Array(value*))
  }
}
