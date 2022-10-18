package typings.vsoNodeApi

import typings.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typings.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import typings.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
import typings.vsoNodeApi.interfacesCommonVssinterfacesMod.VssNotificationEvent
import typings.vsoNodeApi.interfacesNotificationInterfacesMod.BatchNotificationOperation
import typings.vsoNodeApi.interfacesNotificationInterfacesMod.FieldValuesQuery
import typings.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationEventField
import typings.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationEventType
import typings.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationReason
import typings.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationSubscriber
import typings.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationSubscriberUpdateParameters
import typings.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationSubscription
import typings.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationSubscriptionCreateParameters
import typings.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationSubscriptionTemplate
import typings.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationSubscriptionUpdateParameters
import typings.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationTracing
import typings.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationTracingSetParameters
import typings.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriptionQuery
import typings.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriptionQueryFlags
import typings.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriptionUserSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationApiMod {
  
  @JSImport("vso-node-api/NotificationApi", "NotificationApi")
  @js.native
  open class NotificationApi protected () extends INotificationApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  
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
    def listSubscriptions(targetId: String): js.Promise[js.Array[NotificationSubscription]] = js.native
    def listSubscriptions(targetId: String, ids: js.Array[String]): js.Promise[js.Array[NotificationSubscription]] = js.native
    def listSubscriptions(targetId: String, ids: js.Array[String], queryFlags: SubscriptionQueryFlags): js.Promise[js.Array[NotificationSubscription]] = js.native
    def listSubscriptions(targetId: String, ids: Unit, queryFlags: SubscriptionQueryFlags): js.Promise[js.Array[NotificationSubscription]] = js.native
    def listSubscriptions(targetId: Unit, ids: js.Array[String]): js.Promise[js.Array[NotificationSubscription]] = js.native
    def listSubscriptions(targetId: Unit, ids: js.Array[String], queryFlags: SubscriptionQueryFlags): js.Promise[js.Array[NotificationSubscription]] = js.native
    def listSubscriptions(targetId: Unit, ids: Unit, queryFlags: SubscriptionQueryFlags): js.Promise[js.Array[NotificationSubscription]] = js.native
    
    def performBatchNotificationOperations(operation: BatchNotificationOperation): js.Promise[Unit] = js.native
    
    def publishEvent(notificationEvent: VssNotificationEvent): js.Promise[VssNotificationEvent] = js.native
    
    def queryEventTypes(inputValuesQuery: FieldValuesQuery, eventType: String): js.Promise[js.Array[NotificationEventField]] = js.native
    
    def querySubscriptions(subscriptionQuery: SubscriptionQuery): js.Promise[js.Array[NotificationSubscription]] = js.native
    
    def updateNotificationTracing(setParameters: NotificationTracingSetParameters, subscriptionId: String): js.Promise[NotificationTracing] = js.native
    
    def updateSubscriber(updateParameters: NotificationSubscriberUpdateParameters, subscriberId: String): js.Promise[NotificationSubscriber] = js.native
    
    def updateSubscription(updateParameters: NotificationSubscriptionUpdateParameters, subscriptionId: String): js.Promise[NotificationSubscription] = js.native
    
    def updateSubscriptionUserSettings(userSettings: SubscriptionUserSettings, subscriptionId: String, userId: String): js.Promise[SubscriptionUserSettings] = js.native
  }
}
