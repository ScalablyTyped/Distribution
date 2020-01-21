package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecreateSubscriptionResult extends js.Object {
  var eventType: String
  var repositoryType: String
}

object RecreateSubscriptionResult {
  @scala.inline
  def apply(eventType: String, repositoryType: String): RecreateSubscriptionResult = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], repositoryType = repositoryType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RecreateSubscriptionResult]
  }
}

