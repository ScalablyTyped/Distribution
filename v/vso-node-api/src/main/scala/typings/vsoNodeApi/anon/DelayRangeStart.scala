package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DelayRangeStart extends js.Object {
  
  var delayRangeStart: scala.Double = js.native
  
  var eventPipelineTime: scala.Double = js.native
  
  var events: scala.Double = js.native
  
  var eventsByEventType: scala.Double = js.native
  
  var eventsByEventTypePerUser: scala.Double = js.native
  
  var hourlyEventPipelineTime: scala.Double = js.native
  
  var hourlyEvents: scala.Double = js.native
  
  var hourlyEventsByEventTypePerUser: scala.Double = js.native
  
  var hourlyNotificationBySubscription: scala.Double = js.native
  
  var hourlyNotificationPipelineTime: scala.Double = js.native
  
  var hourlyNotifications: scala.Double = js.native
  
  var hourlyRangeStart: scala.Double = js.native
  
  var hourlyTotalPipelineTime: scala.Double = js.native
  
  var hourlyUnprocessedEventDelayByPublisher: scala.Double = js.native
  
  var hourlyUnprocessedEventsByPublisher: scala.Double = js.native
  
  var hourlyUnprocessedNotificationDelayByChannelByPublisher: scala.Double = js.native
  
  var hourlyUnprocessedNotificationsByChannelByPublisher: scala.Double = js.native
  
  var notificationByEventType: scala.Double = js.native
  
  var notificationByEventTypePerUser: scala.Double = js.native
  
  var notificationBySubscription: scala.Double = js.native
  
  var notificationFailureBySubscription: scala.Double = js.native
  
  var notificationPipelineTime: scala.Double = js.native
  
  var notifications: scala.Double = js.native
  
  var totalPipelineTime: scala.Double = js.native
  
  var unprocessedEventDelayByPublisher: scala.Double = js.native
  
  var unprocessedEventsByPublisher: scala.Double = js.native
  
  var unprocessedNotificationDelayByChannelByPublisher: scala.Double = js.native
  
  var unprocessedNotificationsByChannelByPublisher: scala.Double = js.native
  
  var unprocessedRangeStart: scala.Double = js.native
}
object DelayRangeStart {
  
  @scala.inline
  def apply(
    delayRangeStart: scala.Double,
    eventPipelineTime: scala.Double,
    events: scala.Double,
    eventsByEventType: scala.Double,
    eventsByEventTypePerUser: scala.Double,
    hourlyEventPipelineTime: scala.Double,
    hourlyEvents: scala.Double,
    hourlyEventsByEventTypePerUser: scala.Double,
    hourlyNotificationBySubscription: scala.Double,
    hourlyNotificationPipelineTime: scala.Double,
    hourlyNotifications: scala.Double,
    hourlyRangeStart: scala.Double,
    hourlyTotalPipelineTime: scala.Double,
    hourlyUnprocessedEventDelayByPublisher: scala.Double,
    hourlyUnprocessedEventsByPublisher: scala.Double,
    hourlyUnprocessedNotificationDelayByChannelByPublisher: scala.Double,
    hourlyUnprocessedNotificationsByChannelByPublisher: scala.Double,
    notificationByEventType: scala.Double,
    notificationByEventTypePerUser: scala.Double,
    notificationBySubscription: scala.Double,
    notificationFailureBySubscription: scala.Double,
    notificationPipelineTime: scala.Double,
    notifications: scala.Double,
    totalPipelineTime: scala.Double,
    unprocessedEventDelayByPublisher: scala.Double,
    unprocessedEventsByPublisher: scala.Double,
    unprocessedNotificationDelayByChannelByPublisher: scala.Double,
    unprocessedNotificationsByChannelByPublisher: scala.Double,
    unprocessedRangeStart: scala.Double
  ): DelayRangeStart = {
    val __obj = js.Dynamic.literal(delayRangeStart = delayRangeStart.asInstanceOf[js.Any], eventPipelineTime = eventPipelineTime.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], eventsByEventType = eventsByEventType.asInstanceOf[js.Any], eventsByEventTypePerUser = eventsByEventTypePerUser.asInstanceOf[js.Any], hourlyEventPipelineTime = hourlyEventPipelineTime.asInstanceOf[js.Any], hourlyEvents = hourlyEvents.asInstanceOf[js.Any], hourlyEventsByEventTypePerUser = hourlyEventsByEventTypePerUser.asInstanceOf[js.Any], hourlyNotificationBySubscription = hourlyNotificationBySubscription.asInstanceOf[js.Any], hourlyNotificationPipelineTime = hourlyNotificationPipelineTime.asInstanceOf[js.Any], hourlyNotifications = hourlyNotifications.asInstanceOf[js.Any], hourlyRangeStart = hourlyRangeStart.asInstanceOf[js.Any], hourlyTotalPipelineTime = hourlyTotalPipelineTime.asInstanceOf[js.Any], hourlyUnprocessedEventDelayByPublisher = hourlyUnprocessedEventDelayByPublisher.asInstanceOf[js.Any], hourlyUnprocessedEventsByPublisher = hourlyUnprocessedEventsByPublisher.asInstanceOf[js.Any], hourlyUnprocessedNotificationDelayByChannelByPublisher = hourlyUnprocessedNotificationDelayByChannelByPublisher.asInstanceOf[js.Any], hourlyUnprocessedNotificationsByChannelByPublisher = hourlyUnprocessedNotificationsByChannelByPublisher.asInstanceOf[js.Any], notificationByEventType = notificationByEventType.asInstanceOf[js.Any], notificationByEventTypePerUser = notificationByEventTypePerUser.asInstanceOf[js.Any], notificationBySubscription = notificationBySubscription.asInstanceOf[js.Any], notificationFailureBySubscription = notificationFailureBySubscription.asInstanceOf[js.Any], notificationPipelineTime = notificationPipelineTime.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], totalPipelineTime = totalPipelineTime.asInstanceOf[js.Any], unprocessedEventDelayByPublisher = unprocessedEventDelayByPublisher.asInstanceOf[js.Any], unprocessedEventsByPublisher = unprocessedEventsByPublisher.asInstanceOf[js.Any], unprocessedNotificationDelayByChannelByPublisher = unprocessedNotificationDelayByChannelByPublisher.asInstanceOf[js.Any], unprocessedNotificationsByChannelByPublisher = unprocessedNotificationsByChannelByPublisher.asInstanceOf[js.Any], unprocessedRangeStart = unprocessedRangeStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelayRangeStart]
  }
  
  @scala.inline
  implicit class DelayRangeStartOps[Self <: DelayRangeStart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDelayRangeStart(value: scala.Double): Self = this.set("delayRangeStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventPipelineTime(value: scala.Double): Self = this.set("eventPipelineTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvents(value: scala.Double): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsByEventType(value: scala.Double): Self = this.set("eventsByEventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsByEventTypePerUser(value: scala.Double): Self = this.set("eventsByEventTypePerUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourlyEventPipelineTime(value: scala.Double): Self = this.set("hourlyEventPipelineTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourlyEvents(value: scala.Double): Self = this.set("hourlyEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourlyEventsByEventTypePerUser(value: scala.Double): Self = this.set("hourlyEventsByEventTypePerUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourlyNotificationBySubscription(value: scala.Double): Self = this.set("hourlyNotificationBySubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourlyNotificationPipelineTime(value: scala.Double): Self = this.set("hourlyNotificationPipelineTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourlyNotifications(value: scala.Double): Self = this.set("hourlyNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourlyRangeStart(value: scala.Double): Self = this.set("hourlyRangeStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourlyTotalPipelineTime(value: scala.Double): Self = this.set("hourlyTotalPipelineTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourlyUnprocessedEventDelayByPublisher(value: scala.Double): Self = this.set("hourlyUnprocessedEventDelayByPublisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourlyUnprocessedEventsByPublisher(value: scala.Double): Self = this.set("hourlyUnprocessedEventsByPublisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourlyUnprocessedNotificationDelayByChannelByPublisher(value: scala.Double): Self = this.set("hourlyUnprocessedNotificationDelayByChannelByPublisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourlyUnprocessedNotificationsByChannelByPublisher(value: scala.Double): Self = this.set("hourlyUnprocessedNotificationsByChannelByPublisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationByEventType(value: scala.Double): Self = this.set("notificationByEventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationByEventTypePerUser(value: scala.Double): Self = this.set("notificationByEventTypePerUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationBySubscription(value: scala.Double): Self = this.set("notificationBySubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationFailureBySubscription(value: scala.Double): Self = this.set("notificationFailureBySubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationPipelineTime(value: scala.Double): Self = this.set("notificationPipelineTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotifications(value: scala.Double): Self = this.set("notifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalPipelineTime(value: scala.Double): Self = this.set("totalPipelineTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprocessedEventDelayByPublisher(value: scala.Double): Self = this.set("unprocessedEventDelayByPublisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprocessedEventsByPublisher(value: scala.Double): Self = this.set("unprocessedEventsByPublisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprocessedNotificationDelayByChannelByPublisher(value: scala.Double): Self = this.set("unprocessedNotificationDelayByChannelByPublisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprocessedNotificationsByChannelByPublisher(value: scala.Double): Self = this.set("unprocessedNotificationsByChannelByPublisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprocessedRangeStart(value: scala.Double): Self = this.set("unprocessedRangeStart", value.asInstanceOf[js.Any])
  }
}
