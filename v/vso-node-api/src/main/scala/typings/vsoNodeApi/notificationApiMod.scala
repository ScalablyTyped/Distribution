package typings.vsoNodeApi

import typings.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typings.vsoNodeApi.notificationInterfacesMod.BatchNotificationOperation
import typings.vsoNodeApi.notificationInterfacesMod.FieldValuesQuery
import typings.vsoNodeApi.notificationInterfacesMod.NotificationEventField
import typings.vsoNodeApi.notificationInterfacesMod.NotificationEventType
import typings.vsoNodeApi.notificationInterfacesMod.NotificationReason
import typings.vsoNodeApi.notificationInterfacesMod.NotificationSubscriber
import typings.vsoNodeApi.notificationInterfacesMod.NotificationSubscriberUpdateParameters
import typings.vsoNodeApi.notificationInterfacesMod.NotificationSubscription
import typings.vsoNodeApi.notificationInterfacesMod.NotificationSubscriptionCreateParameters
import typings.vsoNodeApi.notificationInterfacesMod.NotificationSubscriptionTemplate
import typings.vsoNodeApi.notificationInterfacesMod.NotificationSubscriptionUpdateParameters
import typings.vsoNodeApi.notificationInterfacesMod.NotificationTracing
import typings.vsoNodeApi.notificationInterfacesMod.NotificationTracingSetParameters
import typings.vsoNodeApi.notificationInterfacesMod.SubscriptionQuery
import typings.vsoNodeApi.notificationInterfacesMod.SubscriptionQueryFlags
import typings.vsoNodeApi.notificationInterfacesMod.SubscriptionUserSettings
import typings.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import typings.vsoNodeApi.vsoBaseInterfacesMod.IRequestOptions
import typings.vsoNodeApi.vssinterfacesMod.VssNotificationEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vso-node-api/NotificationApi", JSImport.Namespace)
@js.native
object notificationApiMod extends js.Object {
  
  @js.native
  trait INotificationApi extends ClientApiBase {
    
    def createSubscription(createParameters: NotificationSubscriptionCreateParameters): js.Promise[NotificationSubscription] = js.native
    
    def deleteSubscription(subscriptionId: String): js.Promise[Unit] = js.native
    
    def getEventType(eventType: String): js.Promise[NotificationEventType] = js.native
    
    def getNotificationReasons(notificationId: Double): js.Promise[NotificationReason] = js.native
    
    def getNotificationTracing(subscriptionId: String): js.Promise[NotificationTracing] = js.native
    
    def getSubscriber(subscriberId: String): js.Promise[NotificationSubscriber] = js.native
    
    def getSubscription(subscriptionId: String): js.Promise[NotificationSubscription] = js.native
    def getSubscription(subscriptionId: String, queryFlags: SubscriptionQueryFlags): js.Promise[NotificationSubscription] = js.native
    
    def getSubscriptionTemplates(): js.Promise[js.Array[NotificationSubscriptionTemplate]] = js.native
    
    def listEventTypes(): js.Promise[js.Array[NotificationEventType]] = js.native
    def listEventTypes(publisherId: String): js.Promise[js.Array[NotificationEventType]] = js.native
    
    def listNotificationReasons(): js.Promise[js.Array[NotificationReason]] = js.native
    def listNotificationReasons(notificationIds: Double): js.Promise[js.Array[NotificationReason]] = js.native
    
    def listSubscriptions(): js.Promise[js.Array[NotificationSubscription]] = js.native
    def listSubscriptions(
      targetId: js.UndefOr[scala.Nothing],
      ids: js.UndefOr[scala.Nothing],
      queryFlags: SubscriptionQueryFlags
    ): js.Promise[js.Array[NotificationSubscription]] = js.native
    def listSubscriptions(targetId: js.UndefOr[scala.Nothing], ids: js.Array[String]): js.Promise[js.Array[NotificationSubscription]] = js.native
    def listSubscriptions(targetId: js.UndefOr[scala.Nothing], ids: js.Array[String], queryFlags: SubscriptionQueryFlags): js.Promise[js.Array[NotificationSubscription]] = js.native
    def listSubscriptions(targetId: String): js.Promise[js.Array[NotificationSubscription]] = js.native
    def listSubscriptions(targetId: String, ids: js.UndefOr[scala.Nothing], queryFlags: SubscriptionQueryFlags): js.Promise[js.Array[NotificationSubscription]] = js.native
    def listSubscriptions(targetId: String, ids: js.Array[String]): js.Promise[js.Array[NotificationSubscription]] = js.native
    def listSubscriptions(targetId: String, ids: js.Array[String], queryFlags: SubscriptionQueryFlags): js.Promise[js.Array[NotificationSubscription]] = js.native
    
    def performBatchNotificationOperations(operation: BatchNotificationOperation): js.Promise[Unit] = js.native
    
    def publishEvent(notificationEvent: VssNotificationEvent): js.Promise[VssNotificationEvent] = js.native
    
    def queryEventTypes(inputValuesQuery: FieldValuesQuery, eventType: String): js.Promise[js.Array[NotificationEventField]] = js.native
    
    def querySubscriptions(subscriptionQuery: SubscriptionQuery): js.Promise[js.Array[NotificationSubscription]] = js.native
    
    def updateNotificationTracing(setParameters: NotificationTracingSetParameters, subscriptionId: String): js.Promise[NotificationTracing] = js.native
    
    def updateSubscriber(updateParameters: NotificationSubscriberUpdateParameters, subscriberId: String): js.Promise[NotificationSubscriber] = js.native
    
    def updateSubscription(updateParameters: NotificationSubscriptionUpdateParameters, subscriptionId: String): js.Promise[NotificationSubscription] = js.native
    
    def updateSubscriptionUserSettings(userSettings: SubscriptionUserSettings, subscriptionId: String, userId: String): js.Promise[SubscriptionUserSettings] = js.native
  }
  
  @js.native
  class NotificationApi protected () extends INotificationApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
}
