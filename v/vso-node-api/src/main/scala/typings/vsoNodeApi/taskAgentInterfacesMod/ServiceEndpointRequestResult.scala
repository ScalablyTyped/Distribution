package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceEndpointRequestResult extends js.Object {
  var errorMessage: String = js.native
  var result: js.Any = js.native
  var statusCode: String = js.native
}

object ServiceEndpointRequestResult {
  @scala.inline
  def apply(errorMessage: String, result: js.Any, statusCode: String): ServiceEndpointRequestResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceEndpointRequestResult]
  }
  @scala.inline
  implicit class ServiceEndpointRequestResultOps[Self <: ServiceEndpointRequestResult] (val x: Self) extends AnyVal {
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
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: js.Any): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: String): Self = this.set("statusCode", value.asInstanceOf[js.Any])
  }
  
}

