package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AzureSubscription extends js.Object {
  var displayName: String = js.native
  var subscriptionId: String = js.native
  var subscriptionTenantId: String = js.native
  var subscriptionTenantName: String = js.native
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
  @scala.inline
  implicit class AzureSubscriptionOps[Self <: AzureSubscription] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscriptionId(value: String): Self = this.set("subscriptionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscriptionTenantId(value: String): Self = this.set("subscriptionTenantId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscriptionTenantName(value: String): Self = this.set("subscriptionTenantName", value.asInstanceOf[js.Any])
  }
  
}

