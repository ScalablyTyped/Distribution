package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationSubscription extends js.Object {
  /**
    * Links to related resources, APIs, and views for the subscription.
    */
  var _links: js.Any
  /**
    * Admin-managed settings for the subscription. Only applies when the subscriber is a group.
    */
  var adminSettings: SubscriptionAdminSettings
  /**
    * Channel for delivering notifications triggered by the subscription.
    */
  var channel: ISubscriptionChannel
  /**
    * Description of the subscription. Typically describes filter criteria which helps identity the subscription.
    */
  var description: java.lang.String
  /**
    * Diagnostics for this subscription.
    */
  var diagnostics: SubscriptionDiagnostics
  /**
    * Any extra properties like detailed description for different contexts, user/group contexts
    */
  var extendedProperties: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
    * Matching criteria for the subscription. ExpressionFilter
    */
  var filter: ISubscriptionFilter
  /**
    * Read-only indicators that further describe the subscription.
    */
  var flags: SubscriptionFlags
  /**
    * Subscription identifier.
    */
  var id: java.lang.String
  /**
    * User that last modified (or created) the subscription.
    */
  var lastModifiedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * Date when the subscription was last modified. If the subscription has not been updated since it was created, this value will indicate when the subscription was created.
    */
  var modifiedDate: stdLib.Date
  /**
    * The permissions the user have for this subscriptions.
    */
  var permissions: SubscriptionPermissions
  /**
    * The container in which events must be published from in order to be matched by the subscription. If empty, the scope is the current host (typically an account or project collection). For example, a subscription scoped to project A will not produce notifications for events published from project B.
    */
  var scope: SubscriptionScope
  /**
    * Status of the subscription. Typically indicates whether the subscription is enabled or not.
    */
  var status: SubscriptionStatus
  /**
    * Message that provides more details about the status of the subscription.
    */
  var statusMessage: java.lang.String
  /**
    * User or group that will receive notifications for events matching the subscription's filter criteria.
    */
  var subscriber: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * REST API URL of the subscriotion.
    */
  var url: java.lang.String
  /**
    * User-managed settings for the subscription. Only applies when the subscriber is a group. Typically used to indicate whether the calling user is opted in or out of a group subscription.
    */
  var userSettings: SubscriptionUserSettings
}

object NotificationSubscription {
  @scala.inline
  def apply(
    _links: js.Any,
    adminSettings: SubscriptionAdminSettings,
    channel: ISubscriptionChannel,
    description: java.lang.String,
    diagnostics: SubscriptionDiagnostics,
    extendedProperties: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    filter: ISubscriptionFilter,
    flags: SubscriptionFlags,
    id: java.lang.String,
    lastModifiedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    modifiedDate: stdLib.Date,
    permissions: SubscriptionPermissions,
    scope: SubscriptionScope,
    status: SubscriptionStatus,
    statusMessage: java.lang.String,
    subscriber: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    url: java.lang.String,
    userSettings: SubscriptionUserSettings
  ): NotificationSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("adminSettings")(adminSettings)
    __obj.updateDynamic("channel")(channel)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("diagnostics")(diagnostics)
    __obj.updateDynamic("extendedProperties")(extendedProperties)
    __obj.updateDynamic("filter")(filter)
    __obj.updateDynamic("flags")(flags)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("lastModifiedBy")(lastModifiedBy)
    __obj.updateDynamic("modifiedDate")(modifiedDate)
    __obj.updateDynamic("permissions")(permissions)
    __obj.updateDynamic("scope")(scope)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("statusMessage")(statusMessage)
    __obj.updateDynamic("subscriber")(subscriber)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("userSettings")(userSettings)
    __obj.asInstanceOf[NotificationSubscription]
  }
}

