package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

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
    val __obj = js.Dynamic.literal(displayName = displayName, subscriptionId = subscriptionId, subscriptionTenantId = subscriptionTenantId, subscriptionTenantName = subscriptionTenantName)
  
    __obj.asInstanceOf[AzureSubscription]
  }
}

