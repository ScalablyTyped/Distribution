package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AzureSpnOperationStatus extends js.Object {
  var state: String
  var statusMessage: String
}

object AzureSpnOperationStatus {
  @scala.inline
  def apply(state: String, statusMessage: String): AzureSpnOperationStatus = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AzureSpnOperationStatus]
  }
}

