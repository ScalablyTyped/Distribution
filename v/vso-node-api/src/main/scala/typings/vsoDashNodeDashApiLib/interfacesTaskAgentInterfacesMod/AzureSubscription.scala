package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AzureSubscription extends js.Object {
  var displayName: java.lang.String
  var subscriptionId: java.lang.String
  var subscriptionTenantId: java.lang.String
  var subscriptionTenantName: java.lang.String
}

object AzureSubscription {
  @scala.inline
  def apply(
    displayName: java.lang.String,
    subscriptionId: java.lang.String,
    subscriptionTenantId: java.lang.String,
    subscriptionTenantName: java.lang.String
  ): AzureSubscription = {
    val __obj = js.Dynamic.literal(displayName = displayName, subscriptionId = subscriptionId, subscriptionTenantId = subscriptionTenantId, subscriptionTenantName = subscriptionTenantName)
  
    __obj.asInstanceOf[AzureSubscription]
  }
}

