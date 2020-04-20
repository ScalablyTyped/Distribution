package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AzureSubscriptionQueryResult extends js.Object {
  var errorMessage: String
  var value: js.Array[AzureSubscription]
}

object AzureSubscriptionQueryResult {
  @scala.inline
  def apply(errorMessage: String, value: js.Array[AzureSubscription]): AzureSubscriptionQueryResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureSubscriptionQueryResult]
  }
}

