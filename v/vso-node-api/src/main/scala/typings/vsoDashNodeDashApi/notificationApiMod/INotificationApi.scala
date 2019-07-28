package typings.vsoDashNodeDashApi.notificationApiMod

import typings.vsoDashNodeDashApi.clientApiBasesMod.ClientApiBase
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.VssNotificationEvent
import typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.BatchNotificationOperation
import typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.FieldValuesQuery
import typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.NotificationEventField
import typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.NotificationEventType
import typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.NotificationReason
import typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.NotificationSubscriber
import typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.NotificationSubscriberUpdateParameters
import typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.NotificationSubscription
import typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.NotificationSubscriptionCreateParameters
import typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.NotificationSubscriptionTemplate
import typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.NotificationSubscriptionUpdateParameters
import typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.NotificationTracing
import typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.NotificationTracingSetParameters
import typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriptionQuery
import typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriptionQueryFlags
import typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriptionUserSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def performBatchNotificationOperations(operation: BatchNotificationOperation): js.Promise[Unit] = js.native
  def publishEvent(notificationEvent: VssNotificationEvent): js.Promise[VssNotificationEvent] = js.native
  def queryEventTypes(inputValuesQuery: FieldValuesQuery, eventType: String): js.Promise[js.Array[NotificationEventField]] = js.native
  def querySubscriptions(subscriptionQuery: SubscriptionQuery): js.Promise[js.Array[NotificationSubscription]] = js.native
  def updateNotificationTracing(setParameters: NotificationTracingSetParameters, subscriptionId: String): js.Promise[NotificationTracing] = js.native
  def updateSubscriber(updateParameters: NotificationSubscriberUpdateParameters, subscriberId: String): js.Promise[NotificationSubscriber] = js.native
  def updateSubscription(updateParameters: NotificationSubscriptionUpdateParameters, subscriptionId: String): js.Promise[NotificationSubscription] = js.native
  def updateSubscriptionUserSettings(userSettings: SubscriptionUserSettings, subscriptionId: String, userId: String): js.Promise[SubscriptionUserSettings] = js.native
}

