package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NotificationStatisticType extends StObject
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "NotificationStatisticType")
@js.native
object NotificationStatisticType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotificationStatisticType & Double] = js.native
  
  @js.native
  sealed trait DelayRangeStart
    extends StObject
       with NotificationStatisticType
  /* 200 */ val DelayRangeStart: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.DelayRangeStart & Double = js.native
  
  @js.native
  sealed trait EventPipelineTime
    extends StObject
       with NotificationStatisticType
  /* 203 */ val EventPipelineTime: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.EventPipelineTime & Double = js.native
  
  @js.native
  sealed trait Events
    extends StObject
       with NotificationStatisticType
  /* 5 */ val Events: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.Events & Double = js.native
  
  @js.native
  sealed trait EventsByEventType
    extends StObject
       with NotificationStatisticType
  /* 1 */ val EventsByEventType: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.EventsByEventType & Double = js.native
  
  @js.native
  sealed trait EventsByEventTypePerUser
    extends StObject
       with NotificationStatisticType
  /* 3 */ val EventsByEventTypePerUser: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.EventsByEventTypePerUser & Double = js.native
  
  @js.native
  sealed trait HourlyEventPipelineTime
    extends StObject
       with NotificationStatisticType
  /* 1203 */ val HourlyEventPipelineTime: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.HourlyEventPipelineTime & Double = js.native
  
  @js.native
  sealed trait HourlyEvents
    extends StObject
       with NotificationStatisticType
  /* 1003 */ val HourlyEvents: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.HourlyEvents & Double = js.native
  
  @js.native
  sealed trait HourlyEventsByEventTypePerUser
    extends StObject
       with NotificationStatisticType
  /* 1002 */ val HourlyEventsByEventTypePerUser: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.HourlyEventsByEventTypePerUser & Double = js.native
  
  @js.native
  sealed trait HourlyNotificationBySubscription
    extends StObject
       with NotificationStatisticType
  /* 1001 */ val HourlyNotificationBySubscription: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.HourlyNotificationBySubscription & Double = js.native
  
  @js.native
  sealed trait HourlyNotificationPipelineTime
    extends StObject
       with NotificationStatisticType
  /* 1202 */ val HourlyNotificationPipelineTime: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.HourlyNotificationPipelineTime & Double = js.native
  
  @js.native
  sealed trait HourlyNotifications
    extends StObject
       with NotificationStatisticType
  /* 1004 */ val HourlyNotifications: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.HourlyNotifications & Double = js.native
  
  @js.native
  sealed trait HourlyRangeStart
    extends StObject
       with NotificationStatisticType
  /* 1000 */ val HourlyRangeStart: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.HourlyRangeStart & Double = js.native
  
  @js.native
  sealed trait HourlyTotalPipelineTime
    extends StObject
       with NotificationStatisticType
  /* 1201 */ val HourlyTotalPipelineTime: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.HourlyTotalPipelineTime & Double = js.native
  
  @js.native
  sealed trait HourlyUnprocessedEventDelayByPublisher
    extends StObject
       with NotificationStatisticType
  /* 1102 */ val HourlyUnprocessedEventDelayByPublisher: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.HourlyUnprocessedEventDelayByPublisher & Double = js.native
  
  @js.native
  sealed trait HourlyUnprocessedEventsByPublisher
    extends StObject
       with NotificationStatisticType
  /* 1101 */ val HourlyUnprocessedEventsByPublisher: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.HourlyUnprocessedEventsByPublisher & Double = js.native
  
  @js.native
  sealed trait HourlyUnprocessedNotificationDelayByChannelByPublisher
    extends StObject
       with NotificationStatisticType
  /* 1104 */ val HourlyUnprocessedNotificationDelayByChannelByPublisher: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.HourlyUnprocessedNotificationDelayByChannelByPublisher & Double = js.native
  
  @js.native
  sealed trait HourlyUnprocessedNotificationsByChannelByPublisher
    extends StObject
       with NotificationStatisticType
  /* 1103 */ val HourlyUnprocessedNotificationsByChannelByPublisher: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.HourlyUnprocessedNotificationsByChannelByPublisher & Double = js.native
  
  @js.native
  sealed trait NotificationByEventType
    extends StObject
       with NotificationStatisticType
  /* 2 */ val NotificationByEventType: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.NotificationByEventType & Double = js.native
  
  @js.native
  sealed trait NotificationByEventTypePerUser
    extends StObject
       with NotificationStatisticType
  /* 4 */ val NotificationByEventTypePerUser: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.NotificationByEventTypePerUser & Double = js.native
  
  @js.native
  sealed trait NotificationBySubscription
    extends StObject
       with NotificationStatisticType
  /* 0 */ val NotificationBySubscription: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.NotificationBySubscription & Double = js.native
  
  @js.native
  sealed trait NotificationFailureBySubscription
    extends StObject
       with NotificationStatisticType
  /* 7 */ val NotificationFailureBySubscription: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.NotificationFailureBySubscription & Double = js.native
  
  @js.native
  sealed trait NotificationPipelineTime
    extends StObject
       with NotificationStatisticType
  /* 202 */ val NotificationPipelineTime: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.NotificationPipelineTime & Double = js.native
  
  @js.native
  sealed trait Notifications
    extends StObject
       with NotificationStatisticType
  /* 6 */ val Notifications: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.Notifications & Double = js.native
  
  @js.native
  sealed trait TotalPipelineTime
    extends StObject
       with NotificationStatisticType
  /* 201 */ val TotalPipelineTime: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.TotalPipelineTime & Double = js.native
  
  @js.native
  sealed trait UnprocessedEventDelayByPublisher
    extends StObject
       with NotificationStatisticType
  /* 102 */ val UnprocessedEventDelayByPublisher: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.UnprocessedEventDelayByPublisher & Double = js.native
  
  @js.native
  sealed trait UnprocessedEventsByPublisher
    extends StObject
       with NotificationStatisticType
  /* 101 */ val UnprocessedEventsByPublisher: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.UnprocessedEventsByPublisher & Double = js.native
  
  @js.native
  sealed trait UnprocessedNotificationDelayByChannelByPublisher
    extends StObject
       with NotificationStatisticType
  /* 104 */ val UnprocessedNotificationDelayByChannelByPublisher: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.UnprocessedNotificationDelayByChannelByPublisher & Double = js.native
  
  @js.native
  sealed trait UnprocessedNotificationsByChannelByPublisher
    extends StObject
       with NotificationStatisticType
  /* 103 */ val UnprocessedNotificationsByChannelByPublisher: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.UnprocessedNotificationsByChannelByPublisher & Double = js.native
  
  @js.native
  sealed trait UnprocessedRangeStart
    extends StObject
       with NotificationStatisticType
  /* 100 */ val UnprocessedRangeStart: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.UnprocessedRangeStart & Double = js.native
}
