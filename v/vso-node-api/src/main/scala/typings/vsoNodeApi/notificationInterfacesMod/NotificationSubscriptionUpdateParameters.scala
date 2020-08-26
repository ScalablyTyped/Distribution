package typings.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationSubscriptionUpdateParameters extends js.Object {
  /**
    * Admin-managed settings for the subscription. Only applies to subscriptions where the subscriber is a group.
    */
  var adminSettings: SubscriptionAdminSettings = js.native
  /**
    * Channel for delivering notifications triggered by the subscription.
    */
  var channel: ISubscriptionChannel = js.native
  /**
    * Updated description for the subscription. Typically describes filter criteria which helps identity the subscription.
    */
  var description: String = js.native
  /**
    * Matching criteria for the subscription. ExpressionFilter
    */
  var filter: ISubscriptionFilter = js.native
  /**
    * The container in which events must be published from in order to be matched by the new subscription. If not specified, defaults to the current host (typically the current account or project collection). For example, a subscription scoped to project A will not produce notifications for events published from project B.
    */
  var scope: SubscriptionScope = js.native
  /**
    * Updated status for the subscription. Typically used to enable or disable a subscription.
    */
  var status: SubscriptionStatus = js.native
  /**
    * Optional message that provides more details about the updated status.
    */
  var statusMessage: String = js.native
  /**
    * User-managed settings for the subscription. Only applies to subscriptions where the subscriber is a group. Typically used to opt-in or opt-out a user from a group subscription.
    */
  var userSettings: SubscriptionUserSettings = js.native
}

object NotificationSubscriptionUpdateParameters {
  @scala.inline
  def apply(
    adminSettings: SubscriptionAdminSettings,
    channel: ISubscriptionChannel,
    description: String,
    filter: ISubscriptionFilter,
    scope: SubscriptionScope,
    status: SubscriptionStatus,
    statusMessage: String,
    userSettings: SubscriptionUserSettings
  ): NotificationSubscriptionUpdateParameters = {
    val __obj = js.Dynamic.literal(adminSettings = adminSettings.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], userSettings = userSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationSubscriptionUpdateParameters]
  }
  @scala.inline
  implicit class NotificationSubscriptionUpdateParametersOps[Self <: NotificationSubscriptionUpdateParameters] (val x: Self) extends AnyVal {
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
    def setAdminSettings(value: SubscriptionAdminSettings): Self = this.set("adminSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannel(value: ISubscriptionChannel): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilter(value: ISubscriptionFilter): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def setScope(value: SubscriptionScope): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: SubscriptionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserSettings(value: SubscriptionUserSettings): Self = this.set("userSettings", value.asInstanceOf[js.Any])
  }
  
}

