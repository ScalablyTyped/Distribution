package typings.wxServerSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallFunctionSuccess extends StObject {
  
  var errMsg: String = js.native
  
  var requestID: String = js.native
  
  var result: String = js.native
}
object CallFunctionSuccess {
  
  @scala.inline
  def apply(errMsg: String, requestID: String, result: String): CallFunctionSuccess = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], requestID = requestID.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallFunctionSuccess]
  }
  
  @scala.inline
  implicit class CallFunctionSuccessMutableBuilder[Self <: CallFunctionSuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestID(value: String): Self = StObject.set(x, "requestID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
