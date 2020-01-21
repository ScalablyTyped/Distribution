package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AzureSubscription extends js.Object {
  var displayName: String
  var subscriptionId: String
  var subscriptionTenantId: String
  var subscriptionTenantName: String
}

object AzureSubscription {
  @scala.inline
  def apply(
    displayName: String,
    subscriptionId: String,
    subscriptionTenantId: String,
    subscriptionTenantName: String
  ): AzureSubscription = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], subscriptionId = subscriptionId.asInstanceOf[js.Any], subscriptionTenantId = subscriptionTenantId.asInstanceOf[js.Any], subscriptionTenantName = subscriptionTenantName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AzureSubscription]
  }
}

