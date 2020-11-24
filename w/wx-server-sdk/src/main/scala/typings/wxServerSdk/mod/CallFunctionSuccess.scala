package typings.wxServerSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallFunctionSuccess extends js.Object {
  
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
  implicit class CallFunctionSuccessOps[Self <: CallFunctionSuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestID(value: String): Self = this.set("requestID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: String): Self = this.set("result", value.asInstanceOf[js.Any])
  }
}
