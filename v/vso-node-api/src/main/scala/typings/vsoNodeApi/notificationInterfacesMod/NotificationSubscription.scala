package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
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
  var description: String
  /**
    * Diagnostics for this subscription.
    */
  var diagnostics: SubscriptionDiagnostics
  /**
    * Any extra properties like detailed description for different contexts, user/group contexts
    */
  var extendedProperties: StringDictionary[String]
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
  var id: String
  /**
    * User that last modified (or created) the subscription.
    */
  var lastModifiedBy: IdentityRef
  /**
    * Date when the subscription was last modified. If the subscription has not been updated since it was created, this value will indicate when the subscription was created.
    */
  var modifiedDate: Date
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
  var statusMessage: String
  /**
    * User or group that will receive notifications for events matching the subscription's filter criteria.
    */
  var subscriber: IdentityRef
  /**
    * REST API URL of the subscriotion.
    */
  var url: String
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
    description: String,
    diagnostics: SubscriptionDiagnostics,
    extendedProperties: StringDictionary[String],
    filter: ISubscriptionFilter,
    flags: SubscriptionFlags,
    id: String,
    lastModifiedBy: IdentityRef,
    modifiedDate: Date,
    permissions: SubscriptionPermissions,
    scope: SubscriptionScope,
    status: SubscriptionStatus,
    statusMessage: String,
    subscriber: IdentityRef,
    url: String,
    userSettings: SubscriptionUserSettings
  ): NotificationSubscription = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], adminSettings = adminSettings.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], diagnostics = diagnostics.asInstanceOf[js.Any], extendedProperties = extendedProperties.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastModifiedBy = lastModifiedBy.asInstanceOf[js.Any], modifiedDate = modifiedDate.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], subscriber = subscriber.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], userSettings = userSettings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NotificationSubscription]
  }
}

