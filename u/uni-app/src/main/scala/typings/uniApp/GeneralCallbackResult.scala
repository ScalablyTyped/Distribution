package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeneralCallbackResult extends StObject {
  
  /**
    * 错误信息
    */
  var errMsg: js.UndefOr[String] = js.native
}
object GeneralCallbackResult {
  
  @scala.inline
  def apply(): GeneralCallbackResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneralCallbackResult]
  }
  
  @scala.inline
  implicit class GeneralCallbackResultMutableBuilder[Self <: GeneralCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsgUndefined: Self = StObject.set(x, "errMsg", js.undefined)
  }
}
