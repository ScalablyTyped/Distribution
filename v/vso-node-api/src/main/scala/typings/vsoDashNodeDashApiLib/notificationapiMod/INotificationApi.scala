package typings
package vsoDashNodeDashApiLib.notificationapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INotificationApi
  extends vsoDashNodeDashApiLib.clientapibasesMod.ClientApiBase {
  def createSubscription(
    createParameters: vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationSubscriptionCreateParameters
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationSubscription
  ] = js.native
  def deleteSubscription(subscriptionId: java.lang.String): js.Promise[scala.Unit] = js.native
  def getEventType(eventType: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationEventType] = js.native
  def getNotificationReasons(notificationId: scala.Double): js.Promise[vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationReason] = js.native
  def getNotificationTracing(subscriptionId: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationTracing] = js.native
  def getSubscriber(subscriberId: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationSubscriber] = js.native
  def getSubscription(subscriptionId: java.lang.String): js.Promise[
    vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationSubscription
  ] = js.native
  def getSubscription(
    subscriptionId: java.lang.String,
    queryFlags: vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionQueryFlags
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationSubscription
  ] = js.native
  def getSubscriptionTemplates(): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationSubscriptionTemplate
    ]
  ] = js.native
  def listEventTypes(): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationEventType]
  ] = js.native
  def listEventTypes(publisherId: java.lang.String): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationEventType]
  ] = js.native
  def listNotificationReasons(): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationReason]
  ] = js.native
  def listNotificationReasons(notificationIds: scala.Double): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationReason]
  ] = js.native
  def listSubscriptions(): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationSubscription
    ]
  ] = js.native
  def listSubscriptions(targetId: java.lang.String): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationSubscription
    ]
  ] = js.native
  def listSubscriptions(targetId: java.lang.String, ids: js.Array[java.lang.String]): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationSubscription
    ]
  ] = js.native
  def listSubscriptions(
    targetId: java.lang.String,
    ids: js.Array[java.lang.String],
    queryFlags: vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionQueryFlags
  ): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationSubscription
    ]
  ] = js.native
  def performBatchNotificationOperations(operation: vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.BatchNotificationOperation): js.Promise[scala.Unit] = js.native
  def publishEvent(notificationEvent: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.VssNotificationEvent): js.Promise[vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.VssNotificationEvent] = js.native
  def queryEventTypes(
    inputValuesQuery: vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.FieldValuesQuery,
    eventType: java.lang.String
  ): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationEventField]
  ] = js.native
  def querySubscriptions(subscriptionQuery: vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionQuery): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationSubscription
    ]
  ] = js.native
  def updateNotificationTracing(
    setParameters: vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationTracingSetParameters,
    subscriptionId: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationTracing] = js.native
  def updateSubscriber(
    updateParameters: vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationSubscriberUpdateParameters,
    subscriberId: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationSubscriber] = js.native
  def updateSubscription(
    updateParameters: vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationSubscriptionUpdateParameters,
    subscriptionId: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationSubscription
  ] = js.native
  def updateSubscriptionUserSettings(
    userSettings: vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionUserSettings,
    subscriptionId: java.lang.String,
    userId: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionUserSettings
  ] = js.native
}

