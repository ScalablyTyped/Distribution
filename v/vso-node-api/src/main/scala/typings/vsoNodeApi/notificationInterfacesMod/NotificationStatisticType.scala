package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NotificationStatisticType extends js.Object
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "NotificationStatisticType")
@js.native
object NotificationStatisticType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotificationStatisticType with Double] = js.native
  
  @js.native
  sealed trait DelayRangeStart extends NotificationStatisticType
  /* 200 */ @js.native
  object DelayRangeStart extends TopLevel[DelayRangeStart with Double]
  
  @js.native
  sealed trait EventPipelineTime extends NotificationStatisticType
  /* 203 */ @js.native
  object EventPipelineTime extends TopLevel[EventPipelineTime with Double]
  
  @js.native
  sealed trait Events extends NotificationStatisticType
  /* 5 */ @js.native
  object Events extends TopLevel[Events with Double]
  
  @js.native
  sealed trait EventsByEventType extends NotificationStatisticType
  /* 1 */ @js.native
  object EventsByEventType extends TopLevel[EventsByEventType with Double]
  
  @js.native
  sealed trait EventsByEventTypePerUser extends NotificationStatisticType
  /* 3 */ @js.native
  object EventsByEventTypePerUser extends TopLevel[EventsByEventTypePerUser with Double]
  
  @js.native
  sealed trait HourlyEventPipelineTime extends NotificationStatisticType
  /* 1203 */ @js.native
  object HourlyEventPipelineTime extends TopLevel[HourlyEventPipelineTime with Double]
  
  @js.native
  sealed trait HourlyEvents extends NotificationStatisticType
  /* 1003 */ @js.native
  object HourlyEvents extends TopLevel[HourlyEvents with Double]
  
  @js.native
  sealed trait HourlyEventsByEventTypePerUser extends NotificationStatisticType
  /* 1002 */ @js.native
  object HourlyEventsByEventTypePerUser extends TopLevel[HourlyEventsByEventTypePerUser with Double]
  
  @js.native
  sealed trait HourlyNotificationBySubscription extends NotificationStatisticType
  /* 1001 */ @js.native
  object HourlyNotificationBySubscription extends TopLevel[HourlyNotificationBySubscription with Double]
  
  @js.native
  sealed trait HourlyNotificationPipelineTime extends NotificationStatisticType
  /* 1202 */ @js.native
  object HourlyNotificationPipelineTime extends TopLevel[HourlyNotificationPipelineTime with Double]
  
  @js.native
  sealed trait HourlyNotifications extends NotificationStatisticType
  /* 1004 */ @js.native
  object HourlyNotifications extends TopLevel[HourlyNotifications with Double]
  
  @js.native
  sealed trait HourlyRangeStart extends NotificationStatisticType
  /* 1000 */ @js.native
  object HourlyRangeStart extends TopLevel[HourlyRangeStart with Double]
  
  @js.native
  sealed trait HourlyTotalPipelineTime extends NotificationStatisticType
  /* 1201 */ @js.native
  object HourlyTotalPipelineTime extends TopLevel[HourlyTotalPipelineTime with Double]
  
  @js.native
  sealed trait HourlyUnprocessedEventDelayByPublisher extends NotificationStatisticType
  /* 1102 */ @js.native
  object HourlyUnprocessedEventDelayByPublisher extends TopLevel[HourlyUnprocessedEventDelayByPublisher with Double]
  
  @js.native
  sealed trait HourlyUnprocessedEventsByPublisher extends NotificationStatisticType
  /* 1101 */ @js.native
  object HourlyUnprocessedEventsByPublisher extends TopLevel[HourlyUnprocessedEventsByPublisher with Double]
  
  @js.native
  sealed trait HourlyUnprocessedNotificationDelayByChannelByPublisher extends NotificationStatisticType
  /* 1104 */ @js.native
  object HourlyUnprocessedNotificationDelayByChannelByPublisher extends TopLevel[HourlyUnprocessedNotificationDelayByChannelByPublisher with Double]
  
  @js.native
  sealed trait HourlyUnprocessedNotificationsByChannelByPublisher extends NotificationStatisticType
  /* 1103 */ @js.native
  object HourlyUnprocessedNotificationsByChannelByPublisher extends TopLevel[HourlyUnprocessedNotificationsByChannelByPublisher with Double]
  
  @js.native
  sealed trait NotificationByEventType extends NotificationStatisticType
  /* 2 */ @js.native
  object NotificationByEventType extends TopLevel[NotificationByEventType with Double]
  
  @js.native
  sealed trait NotificationByEventTypePerUser extends NotificationStatisticType
  /* 4 */ @js.native
  object NotificationByEventTypePerUser extends TopLevel[NotificationByEventTypePerUser with Double]
  
  @js.native
  sealed trait NotificationBySubscription extends NotificationStatisticType
  /* 0 */ @js.native
  object NotificationBySubscription extends TopLevel[NotificationBySubscription with Double]
  
  @js.native
  sealed trait NotificationFailureBySubscription extends NotificationStatisticType
  /* 7 */ @js.native
  object NotificationFailureBySubscription extends TopLevel[NotificationFailureBySubscription with Double]
  
  @js.native
  sealed trait NotificationPipelineTime extends NotificationStatisticType
  /* 202 */ @js.native
  object NotificationPipelineTime extends TopLevel[NotificationPipelineTime with Double]
  
  @js.native
  sealed trait Notifications extends NotificationStatisticType
  /* 6 */ @js.native
  object Notifications extends TopLevel[Notifications with Double]
  
  @js.native
  sealed trait TotalPipelineTime extends NotificationStatisticType
  /* 201 */ @js.native
  object TotalPipelineTime extends TopLevel[TotalPipelineTime with Double]
  
  @js.native
  sealed trait UnprocessedEventDelayByPublisher extends NotificationStatisticType
  /* 102 */ @js.native
  object UnprocessedEventDelayByPublisher extends TopLevel[UnprocessedEventDelayByPublisher with Double]
  
  @js.native
  sealed trait UnprocessedEventsByPublisher extends NotificationStatisticType
  /* 101 */ @js.native
  object UnprocessedEventsByPublisher extends TopLevel[UnprocessedEventsByPublisher with Double]
  
  @js.native
  sealed trait UnprocessedNotificationDelayByChannelByPublisher extends NotificationStatisticType
  /* 104 */ @js.native
  object UnprocessedNotificationDelayByChannelByPublisher extends TopLevel[UnprocessedNotificationDelayByChannelByPublisher with Double]
  
  @js.native
  sealed trait UnprocessedNotificationsByChannelByPublisher extends NotificationStatisticType
  /* 103 */ @js.native
  object UnprocessedNotificationsByChannelByPublisher extends TopLevel[UnprocessedNotificationsByChannelByPublisher with Double]
  
  @js.native
  sealed trait UnprocessedRangeStart extends NotificationStatisticType
  /* 100 */ @js.native
  object UnprocessedRangeStart extends TopLevel[UnprocessedRangeStart with Double]
}
