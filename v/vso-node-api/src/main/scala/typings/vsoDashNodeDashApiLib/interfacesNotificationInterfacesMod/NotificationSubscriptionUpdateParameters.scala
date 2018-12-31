package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationSubscriptionUpdateParameters extends js.Object {
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
  var description: java.lang.String
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
  var statusMessage: java.lang.String
  /**
    * User-managed settings for the subscription. Only applies to subscriptions where the subscriber is a group. Typically used to opt-in or opt-out a user from a group subscription.
    */
  var userSettings: SubscriptionUserSettings
}

