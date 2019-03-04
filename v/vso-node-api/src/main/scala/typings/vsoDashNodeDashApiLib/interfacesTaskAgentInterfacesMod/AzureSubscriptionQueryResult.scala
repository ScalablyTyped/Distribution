package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AzureSubscriptionQueryResult extends js.Object {
  var errorMessage: java.lang.String
  var value: js.Array[AzureSubscription]
}

object AzureSubscriptionQueryResult {
  @scala.inline
  def apply(errorMessage: java.lang.String, value: js.Array[AzureSubscription]): AzureSubscriptionQueryResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage, value = value)
  
    __obj.asInstanceOf[AzureSubscriptionQueryResult]
  }
}

