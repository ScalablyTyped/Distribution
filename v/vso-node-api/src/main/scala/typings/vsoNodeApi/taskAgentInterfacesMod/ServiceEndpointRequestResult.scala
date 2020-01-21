package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceEndpointRequestResult extends js.Object {
  var errorMessage: String
  var result: js.Any
  var statusCode: String
}

object ServiceEndpointRequestResult {
  @scala.inline
  def apply(errorMessage: String, result: js.Any, statusCode: String): ServiceEndpointRequestResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServiceEndpointRequestResult]
  }
}

