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
  ): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationSubscription
  ] = js.native
  def deleteSubscription(subscriptionId: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def getEventType(eventType: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationEventType] = js.native
  def getNotificationReasons(notificationId: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationReason] = js.native
  def getNotificationTracing(subscriptionId: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationTracing] = js.native
  def getSubscriber(subscriberId: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationSubscriber] = js.native
  def getSubscription(subscriptionId: java.lang.String): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationSubscription
  ] = js.native
  def getSubscription(
    subscriptionId: java.lang.String,
    queryFlags: vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionQueryFlags
  ): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationSubscription
  ] = js.native
  def getSubscriptionTemplates(): stdLib.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationSubscriptionTemplate
    ]
  ] = js.native
  def listEventTypes(): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationEventType]
  ] = js.native
  def listEventTypes(publisherId: java.lang.String): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationEventType]
  ] = js.native
  def listNotificationReasons(): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationReason]
  ] = js.native
  def listNotificationReasons(notificationIds: scala.Double): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationReason]
  ] = js.native
  def listSubscriptions(): stdLib.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationSubscription
    ]
  ] = js.native
  def listSubscriptions(targetId: java.lang.String): stdLib.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationSubscription
    ]
  ] = js.native
  def listSubscriptions(targetId: java.lang.String, ids: js.Array[java.lang.String]): stdLib.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationSubscription
    ]
  ] = js.native
  def listSubscriptions(
    targetId: java.lang.String,
    ids: js.Array[java.lang.String],
    queryFlags: vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionQueryFlags
  ): stdLib.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationSubscription
    ]
  ] = js.native
  def performBatchNotificationOperations(operation: vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.BatchNotificationOperation): stdLib.Promise[scala.Unit] = js.native
  def publishEvent(notificationEvent: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.VssNotificationEvent): stdLib.Promise[vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.VssNotificationEvent] = js.native
  def queryEventTypes(
    inputValuesQuery: vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.FieldValuesQuery,
    eventType: java.lang.String
  ): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationEventField]
  ] = js.native
  def querySubscriptions(subscriptionQuery: vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionQuery): stdLib.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationSubscription
    ]
  ] = js.native
  def updateNotificationTracing(
    setParameters: vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationTracingSetParameters,
    subscriptionId: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationTracing] = js.native
  def updateSubscriber(
    updateParameters: vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationSubscriberUpdateParameters,
    subscriberId: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationSubscriber] = js.native
  def updateSubscription(
    updateParameters: vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationSubscriptionUpdateParameters,
    subscriptionId: java.lang.String
  ): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.NotificationSubscription
  ] = js.native
  def updateSubscriptionUserSettings(
    userSettings: vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionUserSettings,
    subscriptionId: java.lang.String,
    userId: java.lang.String
  ): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionUserSettings
  ] = js.native
}

