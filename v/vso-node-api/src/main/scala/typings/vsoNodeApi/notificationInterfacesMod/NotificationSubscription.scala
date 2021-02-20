package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationSubscription extends StObject {
  
  /**
    * Links to related resources, APIs, and views for the subscription.
    */
  var _links: js.Any = js.native
  
  /**
    * Admin-managed settings for the subscription. Only applies when the subscriber is a group.
    */
  var adminSettings: SubscriptionAdminSettings = js.native
  
  /**
    * Channel for delivering notifications triggered by the subscription.
    */
  var channel: ISubscriptionChannel = js.native
  
  /**
    * Description of the subscription. Typically describes filter criteria which helps identity the subscription.
    */
  var description: String = js.native
  
  /**
    * Diagnostics for this subscription.
    */
  var diagnostics: SubscriptionDiagnostics = js.native
  
  /**
    * Any extra properties like detailed description for different contexts, user/group contexts
    */
  var extendedProperties: StringDictionary[String] = js.native
  
  /**
    * Matching criteria for the subscription. ExpressionFilter
    */
  var filter: ISubscriptionFilter = js.native
  
  /**
    * Read-only indicators that further describe the subscription.
    */
  var flags: SubscriptionFlags = js.native
  
  /**
    * Subscription identifier.
    */
  var id: String = js.native
  
  /**
    * User that last modified (or created) the subscription.
    */
  var lastModifiedBy: IdentityRef = js.native
  
  /**
    * Date when the subscription was last modified. If the subscription has not been updated since it was created, this value will indicate when the subscription was created.
    */
  var modifiedDate: Date = js.native
  
  /**
    * The permissions the user have for this subscriptions.
    */
  var permissions: SubscriptionPermissions = js.native
  
  /**
    * The container in which events must be published from in order to be matched by the subscription. If empty, the scope is the current host (typically an account or project collection). For example, a subscription scoped to project A will not produce notifications for events published from project B.
    */
  var scope: SubscriptionScope = js.native
  
  /**
    * Status of the subscription. Typically indicates whether the subscription is enabled or not.
    */
  var status: SubscriptionStatus = js.native
  
  /**
    * Message that provides more details about the status of the subscription.
    */
  var statusMessage: String = js.native
  
  /**
    * User or group that will receive notifications for events matching the subscription's filter criteria.
    */
  var subscriber: IdentityRef = js.native
  
  /**
    * REST API URL of the subscriotion.
    */
  var url: String = js.native
  
  /**
    * User-managed settings for the subscription. Only applies when the subscriber is a group. Typically used to indicate whether the calling user is opted in or out of a group subscription.
    */
  var userSettings: SubscriptionUserSettings = js.native
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
  
  @scala.inline
  implicit class NotificationSubscriptionMutableBuilder[Self <: NotificationSubscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdminSettings(value: SubscriptionAdminSettings): Self = StObject.set(x, "adminSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannel(value: ISubscriptionChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagnostics(value: SubscriptionDiagnostics): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedProperties(value: StringDictionary[String]): Self = StObject.set(x, "extendedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: ISubscriptionFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: SubscriptionFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedBy(value: IdentityRef): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedDate(value: Date): Self = StObject.set(x, "modifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissions(value: SubscriptionPermissions): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: SubscriptionScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: SubscriptionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriber(value: IdentityRef): Self = StObject.set(x, "subscriber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserSettings(value: SubscriptionUserSettings): Self = StObject.set(x, "userSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
