package typings.vsoNodeApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationSubscriptionUpdateParameters extends StObject {
  
  /**
    * Admin-managed settings for the subscription. Only applies to subscriptions where the subscriber is a group.
    */
  var adminSettings: SubscriptionAdminSettings
  
  /**
    * Channel for delivering notifications triggered by the subscription.
    */
  var channel: ISubscriptionChannel
  
  /**
    * Updated description for the subscription. Typically describes filter criteria which helps identity the subscription.
    */
  var description: String
  
  /**
    * Matching criteria for the subscription. ExpressionFilter
    */
  var filter: ISubscriptionFilter
  
  /**
    * The container in which events must be published from in order to be matched by the new subscription. If not specified, defaults to the current host (typically the current account or project collection). For example, a subscription scoped to project A will not produce notifications for events published from project B.
    */
  var scope: SubscriptionScope
  
  /**
    * Updated status for the subscription. Typically used to enable or disable a subscription.
    */
  var status: SubscriptionStatus
  
  /**
    * Optional message that provides more details about the updated status.
    */
  var statusMessage: String
  
  /**
    * User-managed settings for the subscription. Only applies to subscriptions where the subscriber is a group. Typically used to opt-in or opt-out a user from a group subscription.
    */
  var userSettings: SubscriptionUserSettings
}
object NotificationSubscriptionUpdateParameters {
  
  inline def apply(
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
  
  extension [Self <: NotificationSubscriptionUpdateParameters](x: Self) {
    
    inline def setAdminSettings(value: SubscriptionAdminSettings): Self = StObject.set(x, "adminSettings", value.asInstanceOf[js.Any])
    
    inline def setChannel(value: ISubscriptionChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: ISubscriptionFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setScope(value: SubscriptionScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: SubscriptionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setUserSettings(value: SubscriptionUserSettings): Self = StObject.set(x, "userSettings", value.asInstanceOf[js.Any])
  }
}
