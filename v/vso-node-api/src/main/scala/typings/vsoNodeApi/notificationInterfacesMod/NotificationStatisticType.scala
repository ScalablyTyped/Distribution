package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NotificationStatisticType extends StObject
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "NotificationStatisticType")
@js.native
object NotificationStatisticType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotificationStatisticType with Double] = js.native
  
  @js.native
  sealed trait DelayRangeStart extends NotificationStatisticType
  /* 200 */ val DelayRangeStart: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.DelayRangeStart with Double = js.native
  
  @js.native
  sealed trait EventPipelineTime extends NotificationStatisticType
  /* 203 */ val EventPipelineTime: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.EventPipelineTime with Double = js.native
  
  @js.native
  sealed trait Events extends NotificationStatisticType
  /* 5 */ val Events: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.Events with Double = js.native
  
  @js.native
  sealed trait EventsByEventType extends NotificationStatisticType
  /* 1 */ val EventsByEventType: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.EventsByEventType with Double = js.native
  
  @js.native
  sealed trait EventsByEventTypePerUser extends NotificationStatisticType
  /* 3 */ val EventsByEventTypePerUser: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.EventsByEventTypePerUser with Double = js.native
  
  @js.native
  sealed trait HourlyEventPipelineTime extends NotificationStatisticType
  /* 1203 */ val HourlyEventPipelineTime: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.HourlyEventPipelineTime with Double = js.native
  
  @js.native
  sealed trait HourlyEvents extends NotificationStatisticType
  /* 1003 */ val HourlyEvents: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.HourlyEvents with Double = js.native
  
  @js.native
  sealed trait HourlyEventsByEventTypePerUser extends NotificationStatisticType
  /* 1002 */ val HourlyEventsByEventTypePerUser: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.HourlyEventsByEventTypePerUser with Double = js.native
  
  @js.native
  sealed trait HourlyNotificationBySubscription extends NotificationStatisticType
  /* 1001 */ val HourlyNotificationBySubscription: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.HourlyNotificationBySubscription with Double = js.native
  
  @js.native
  sealed trait HourlyNotificationPipelineTime extends NotificationStatisticType
  /* 1202 */ val HourlyNotificationPipelineTime: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.HourlyNotificationPipelineTime with Double = js.native
  
  @js.native
  sealed trait HourlyNotifications extends NotificationStatisticType
  /* 1004 */ val HourlyNotifications: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.HourlyNotifications with Double = js.native
  
  @js.native
  sealed trait HourlyRangeStart extends NotificationStatisticType
  /* 1000 */ val HourlyRangeStart: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.HourlyRangeStart with Double = js.native
  
  @js.native
  sealed trait HourlyTotalPipelineTime extends NotificationStatisticType
  /* 1201 */ val HourlyTotalPipelineTime: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.HourlyTotalPipelineTime with Double = js.native
  
  @js.native
  sealed trait HourlyUnprocessedEventDelayByPublisher extends NotificationStatisticType
  /* 1102 */ val HourlyUnprocessedEventDelayByPublisher: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.HourlyUnprocessedEventDelayByPublisher with Double = js.native
  
  @js.native
  sealed trait HourlyUnprocessedEventsByPublisher extends NotificationStatisticType
  /* 1101 */ val HourlyUnprocessedEventsByPublisher: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.HourlyUnprocessedEventsByPublisher with Double = js.native
  
  @js.native
  sealed trait HourlyUnprocessedNotificationDelayByChannelByPublisher extends NotificationStatisticType
  /* 1104 */ val HourlyUnprocessedNotificationDelayByChannelByPublisher: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.HourlyUnprocessedNotificationDelayByChannelByPublisher with Double = js.native
  
  @js.native
  sealed trait HourlyUnprocessedNotificationsByChannelByPublisher extends NotificationStatisticType
  /* 1103 */ val HourlyUnprocessedNotificationsByChannelByPublisher: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.HourlyUnprocessedNotificationsByChannelByPublisher with Double = js.native
  
  @js.native
  sealed trait NotificationByEventType extends NotificationStatisticType
  /* 2 */ val NotificationByEventType: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.NotificationByEventType with Double = js.native
  
  @js.native
  sealed trait NotificationByEventTypePerUser extends NotificationStatisticType
  /* 4 */ val NotificationByEventTypePerUser: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.NotificationByEventTypePerUser with Double = js.native
  
  @js.native
  sealed trait NotificationBySubscription extends NotificationStatisticType
  /* 0 */ val NotificationBySubscription: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.NotificationBySubscription with Double = js.native
  
  @js.native
  sealed trait NotificationFailureBySubscription extends NotificationStatisticType
  /* 7 */ val NotificationFailureBySubscription: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.NotificationFailureBySubscription with Double = js.native
  
  @js.native
  sealed trait NotificationPipelineTime extends NotificationStatisticType
  /* 202 */ val NotificationPipelineTime: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.NotificationPipelineTime with Double = js.native
  
  @js.native
  sealed trait Notifications extends NotificationStatisticType
  /* 6 */ val Notifications: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.Notifications with Double = js.native
  
  @js.native
  sealed trait TotalPipelineTime extends NotificationStatisticType
  /* 201 */ val TotalPipelineTime: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.TotalPipelineTime with Double = js.native
  
  @js.native
  sealed trait UnprocessedEventDelayByPublisher extends NotificationStatisticType
  /* 102 */ val UnprocessedEventDelayByPublisher: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.UnprocessedEventDelayByPublisher with Double = js.native
  
  @js.native
  sealed trait UnprocessedEventsByPublisher extends NotificationStatisticType
  /* 101 */ val UnprocessedEventsByPublisher: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.UnprocessedEventsByPublisher with Double = js.native
  
  @js.native
  sealed trait UnprocessedNotificationDelayByChannelByPublisher extends NotificationStatisticType
  /* 104 */ val UnprocessedNotificationDelayByChannelByPublisher: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.UnprocessedNotificationDelayByChannelByPublisher with Double = js.native
  
  @js.native
  sealed trait UnprocessedNotificationsByChannelByPublisher extends NotificationStatisticType
  /* 103 */ val UnprocessedNotificationsByChannelByPublisher: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.UnprocessedNotificationsByChannelByPublisher with Double = js.native
  
  @js.native
  sealed trait UnprocessedRangeStart extends NotificationStatisticType
  /* 100 */ val UnprocessedRangeStart: typings.vsoNodeApi.notificationInterfacesMod.NotificationStatisticType.UnprocessedRangeStart with Double = js.native
}
