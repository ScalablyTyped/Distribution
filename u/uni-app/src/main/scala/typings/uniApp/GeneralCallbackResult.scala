package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneralCallbackResult extends StObject {
  
  /**
    * 错误信息
    */
  var errMsg: js.UndefOr[String] = js.undefined
}
object GeneralCallbackResult {
  
  inline def apply(): GeneralCallbackResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneralCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeneralCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setErrMsgUndefined: Self = StObject.set(x, "errMsg", js.undefined)
  }
}
