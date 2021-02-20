package typings.titanium.global.Titanium

import typings.titanium.EventsAuthorizationResponse
import typings.titanium.Titanium.CalendarChangeEvent
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import typings.titanium.titaniumStrings.change
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Calendar module provides an API for accessing the native calendar functionality.
  */
@JSGlobal("Titanium.Calendar")
@js.native
class Calendar ()
  extends typings.titanium.Titanium.Proxy
/**
  * The Calendar module provides an API for accessing the native calendar functionality.
  */
object Calendar {
  
  @JSGlobal("Titanium.Calendar")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Attendee role is chair.
    */
  @JSGlobal("Titanium.Calendar.ATTENDEE_ROLE_CHAIR")
  @js.native
  val ATTENDEE_ROLE_CHAIR: Double = js.native
  
  /**
    * Attendee is not a participant.
    */
  @JSGlobal("Titanium.Calendar.ATTENDEE_ROLE_NON_PARTICIPANT")
  @js.native
  val ATTENDEE_ROLE_NON_PARTICIPANT: Double = js.native
  
  /**
    * Attendee role is optional.
    */
  @JSGlobal("Titanium.Calendar.ATTENDEE_ROLE_OPTIONAL")
  @js.native
  val ATTENDEE_ROLE_OPTIONAL: Double = js.native
  
  /**
    * Attendee role is required.
    */
  @JSGlobal("Titanium.Calendar.ATTENDEE_ROLE_REQUIRED")
  @js.native
  val ATTENDEE_ROLE_REQUIRED: Double = js.native
  
  /**
    * Attendee role is unknown.
    */
  @JSGlobal("Titanium.Calendar.ATTENDEE_ROLE_UNKNOWN")
  @js.native
  val ATTENDEE_ROLE_UNKNOWN: Double = js.native
  
  /**
    * Attendee status is accepted.
    */
  @JSGlobal("Titanium.Calendar.ATTENDEE_STATUS_ACCEPTED")
  @js.native
  val ATTENDEE_STATUS_ACCEPTED: Double = js.native
  
  /**
    * Attendee status is declined.
    */
  @JSGlobal("Titanium.Calendar.ATTENDEE_STATUS_DECLINED")
  @js.native
  val ATTENDEE_STATUS_DECLINED: Double = js.native
  
  /**
    * Attendee status is delegated.
    */
  @JSGlobal("Titanium.Calendar.ATTENDEE_STATUS_DELEGATED")
  @js.native
  val ATTENDEE_STATUS_DELEGATED: Double = js.native
  
  /**
    * Attendee status is invited.
    */
  @JSGlobal("Titanium.Calendar.ATTENDEE_STATUS_INVITED")
  @js.native
  val ATTENDEE_STATUS_INVITED: Double = js.native
  
  /**
    * Attendee status is in process.
    */
  @JSGlobal("Titanium.Calendar.ATTENDEE_STATUS_IN_PROCESS")
  @js.native
  val ATTENDEE_STATUS_IN_PROCESS: Double = js.native
  
  /**
    * There is no Attendee status.
    */
  @JSGlobal("Titanium.Calendar.ATTENDEE_STATUS_NONE")
  @js.native
  val ATTENDEE_STATUS_NONE: Double = js.native
  
  /**
    * Attendee status is pending.
    */
  @JSGlobal("Titanium.Calendar.ATTENDEE_STATUS_PENDING")
  @js.native
  val ATTENDEE_STATUS_PENDING: Double = js.native
  
  /**
    * Attendee status is tentative.
    */
  @JSGlobal("Titanium.Calendar.ATTENDEE_STATUS_TENTATIVE")
  @js.native
  val ATTENDEE_STATUS_TENTATIVE: Double = js.native
  
  /**
    * Attendee status is unknown.
    */
  @JSGlobal("Titanium.Calendar.ATTENDEE_STATUS_UNKNOWN")
  @js.native
  val ATTENDEE_STATUS_UNKNOWN: Double = js.native
  
  /**
    * Attendee type is group.
    */
  @JSGlobal("Titanium.Calendar.ATTENDEE_TYPE_GROUP")
  @js.native
  val ATTENDEE_TYPE_GROUP: Double = js.native
  
  /**
    * There is not attendee type.
    */
  @JSGlobal("Titanium.Calendar.ATTENDEE_TYPE_NONE")
  @js.native
  val ATTENDEE_TYPE_NONE: Double = js.native
  
  /**
    * Attendee type is person.
    */
  @JSGlobal("Titanium.Calendar.ATTENDEE_TYPE_PERSON")
  @js.native
  val ATTENDEE_TYPE_PERSON: Double = js.native
  
  /**
    * Attendee type is required.
    */
  @JSGlobal("Titanium.Calendar.ATTENDEE_TYPE_REQUIRED")
  @js.native
  val ATTENDEE_TYPE_REQUIRED: Double = js.native
  
  /**
    * Attendee type is resource.
    */
  @JSGlobal("Titanium.Calendar.ATTENDEE_TYPE_RESOURCE")
  @js.native
  val ATTENDEE_TYPE_RESOURCE: Double = js.native
  
  /**
    * Attendee type is room.
    */
  @JSGlobal("Titanium.Calendar.ATTENDEE_TYPE_ROOM")
  @js.native
  val ATTENDEE_TYPE_ROOM: Double = js.native
  
  /**
    * Attendee type is unknown.
    */
  @JSGlobal("Titanium.Calendar.ATTENDEE_TYPE_UNKNOWN")
  @js.native
  val ATTENDEE_TYPE_UNKNOWN: Double = js.native
  
  /**
    * An [calendarAuthorization](Titanium.Calendar.calendarAuthorization) value
    * indicating that the application is authorized to use events in the Calendar.
    */
  @JSGlobal("Titanium.Calendar.AUTHORIZATION_AUTHORIZED")
  @js.native
  val AUTHORIZATION_AUTHORIZED: Double = js.native
  
  /**
    * An [calendarAuthorization](Titanium.Calendar.calendarAuthorization) value
    * indicating that the application is not authorized to use events in the Calendar.
    */
  @JSGlobal("Titanium.Calendar.AUTHORIZATION_DENIED")
  @js.native
  val AUTHORIZATION_DENIED: Double = js.native
  
  /**
    * An [calendarAuthorization](Titanium.Calendar.calendarAuthorization) value
    * indicating that the application is not authorized to use events in the Calendar.
    * the user cannot change this application's status.
    */
  @JSGlobal("Titanium.Calendar.AUTHORIZATION_RESTRICTED")
  @js.native
  val AUTHORIZATION_RESTRICTED: Double = js.native
  
  /**
    * An [calendarAuthorization](Titanium.Calendar.calendarAuthorization) value
    * indicating that the authorization state is unknown.
    */
  @JSGlobal("Titanium.Calendar.AUTHORIZATION_UNKNOWN")
  @js.native
  val AUTHORIZATION_UNKNOWN: Double = js.native
  
  /**
    * Event has a busy availability setting.
    */
  @JSGlobal("Titanium.Calendar.AVAILABILITY_BUSY")
  @js.native
  val AVAILABILITY_BUSY: Double = js.native
  
  /**
    * Event has a free availability setting.
    */
  @JSGlobal("Titanium.Calendar.AVAILABILITY_FREE")
  @js.native
  val AVAILABILITY_FREE: Double = js.native
  
  /**
    * Availability settings are not supported by the event's calendar.
    */
  @JSGlobal("Titanium.Calendar.AVAILABILITY_NOTSUPPORTED")
  @js.native
  val AVAILABILITY_NOTSUPPORTED: Double = js.native
  
  /**
    * Event has a tentative availability setting.
    */
  @JSGlobal("Titanium.Calendar.AVAILABILITY_TENTATIVE")
  @js.native
  val AVAILABILITY_TENTATIVE: Double = js.native
  
  /**
    * Event has a tentative availability setting.
    */
  @JSGlobal("Titanium.Calendar.AVAILABILITY_UNAVAILABLE")
  @js.native
  val AVAILABILITY_UNAVAILABLE: Double = js.native
  
  /**
    * An object that represents a single alert for an event in an calendar.
    */
  @JSGlobal("Titanium.Calendar.Alert")
  @js.native
  class Alert ()
    extends typings.titanium.Titanium.Calendar.Alert
  
  /**
    * An object that represents a single attendee of an event.
    */
  @JSGlobal("Titanium.Calendar.Attendee")
  @js.native
  class Attendee ()
    extends typings.titanium.Titanium.Calendar.Attendee
  
  /**
    * An object that represents a single calendar.
    */
  @JSGlobal("Titanium.Calendar.Calendar")
  @js.native
  class Calendar ()
    extends typings.titanium.Titanium.Calendar.Calendar
  
  /**
    * An object that represents a single event in a calendar.
    */
  @JSGlobal("Titanium.Calendar.Event")
  @js.native
  class Event ()
    extends typings.titanium.Titanium.Calendar.Event
  
  /**
    * Reminder alert delivery method.
    */
  @JSGlobal("Titanium.Calendar.METHOD_ALERT")
  @js.native
  val METHOD_ALERT: Double = js.native
  
  /**
    * Reminder default delivery method.
    */
  @JSGlobal("Titanium.Calendar.METHOD_DEFAULT")
  @js.native
  val METHOD_DEFAULT: Double = js.native
  
  /**
    * Reminder email delivery method.
    */
  @JSGlobal("Titanium.Calendar.METHOD_EMAIL")
  @js.native
  val METHOD_EMAIL: Double = js.native
  
  /**
    * Reminder SMS delivery method.
    */
  @JSGlobal("Titanium.Calendar.METHOD_SMS")
  @js.native
  val METHOD_SMS: Double = js.native
  
  /**
    * Indicates a daily recurrence rule for a events reccurance frequency.
    */
  @JSGlobal("Titanium.Calendar.RECURRENCEFREQUENCY_DAILY")
  @js.native
  val RECURRENCEFREQUENCY_DAILY: Double = js.native
  
  /**
    * Indicates a monthly recurrence rule for a events reccurance frequency.
    */
  @JSGlobal("Titanium.Calendar.RECURRENCEFREQUENCY_MONTHLY")
  @js.native
  val RECURRENCEFREQUENCY_MONTHLY: Double = js.native
  
  /**
    * Indicates a weekly recurrence rule for a events reccurance frequency.
    */
  @JSGlobal("Titanium.Calendar.RECURRENCEFREQUENCY_WEEKLY")
  @js.native
  val RECURRENCEFREQUENCY_WEEKLY: Double = js.native
  
  /**
    * Indicates a yearly recurrence rule for a events reccurance frequency.
    */
  @JSGlobal("Titanium.Calendar.RECURRENCEFREQUENCY_YEARLY")
  @js.native
  val RECURRENCEFREQUENCY_YEARLY: Double = js.native
  
  /**
    * Relationship is attendee.
    */
  @JSGlobal("Titanium.Calendar.RELATIONSHIP_ATTENDEE")
  @js.native
  val RELATIONSHIP_ATTENDEE: Double = js.native
  
  /**
    * There is no relationship.
    */
  @JSGlobal("Titanium.Calendar.RELATIONSHIP_NONE")
  @js.native
  val RELATIONSHIP_NONE: Double = js.native
  
  /**
    * Attendee is organizer.
    */
  @JSGlobal("Titanium.Calendar.RELATIONSHIP_ORGANIZER")
  @js.native
  val RELATIONSHIP_ORGANIZER: Double = js.native
  
  /**
    * Attendee is performer.
    */
  @JSGlobal("Titanium.Calendar.RELATIONSHIP_PERFORMER")
  @js.native
  val RELATIONSHIP_PERFORMER: Double = js.native
  
  /**
    * Attendee is speaker.
    */
  @JSGlobal("Titanium.Calendar.RELATIONSHIP_SPEAKER")
  @js.native
  val RELATIONSHIP_SPEAKER: Double = js.native
  
  /**
    * Relationship is unknown.
    */
  @JSGlobal("Titanium.Calendar.RELATIONSHIP_UNKNOWN")
  @js.native
  val RELATIONSHIP_UNKNOWN: Double = js.native
  
  /**
    * An object that is used to describe the recurrence pattern for a recurring event.
    */
  @JSGlobal("Titanium.Calendar.RecurrenceRule")
  @js.native
  class RecurrenceRule ()
    extends typings.titanium.Titanium.Calendar.RecurrenceRule
  
  /**
    * An object that represents a single reminder for an event in a calendar.
    */
  @JSGlobal("Titanium.Calendar.Reminder")
  @js.native
  class Reminder ()
    extends typings.titanium.Titanium.Calendar.Reminder
  
  /**
    * A birthday calendar source.
    */
  @JSGlobal("Titanium.Calendar.SOURCE_TYPE_BIRTHDAYS")
  @js.native
  val SOURCE_TYPE_BIRTHDAYS: Double = js.native
  
  /**
    * A calDev calendar source.
    */
  @JSGlobal("Titanium.Calendar.SOURCE_TYPE_CALDAV")
  @js.native
  val SOURCE_TYPE_CALDAV: Double = js.native
  
  /**
    * A microsoft exchange calendar source.
    */
  @JSGlobal("Titanium.Calendar.SOURCE_TYPE_EXCHANGE")
  @js.native
  val SOURCE_TYPE_EXCHANGE: Double = js.native
  
  /**
    * A local calendar source.
    */
  @JSGlobal("Titanium.Calendar.SOURCE_TYPE_LOCAL")
  @js.native
  val SOURCE_TYPE_LOCAL: Double = js.native
  
  /**
    * A mobileMe calendar source.
    */
  @JSGlobal("Titanium.Calendar.SOURCE_TYPE_MOBILEME")
  @js.native
  val SOURCE_TYPE_MOBILEME: Double = js.native
  
  /**
    * A subscribed calendar source.
    */
  @JSGlobal("Titanium.Calendar.SOURCE_TYPE_SUBSCRIBED")
  @js.native
  val SOURCE_TYPE_SUBSCRIBED: Double = js.native
  
  /**
    * A [save](Titanium.Calendar.Event.save)/[remove](Titanium.Calendar.Event.remove) event value,
    * indicating modifications to this event instance should also affect future instances of this event.
    */
  @JSGlobal("Titanium.Calendar.SPAN_FUTUREEVENTS")
  @js.native
  val SPAN_FUTUREEVENTS: Double = js.native
  
  /**
    * A [save](Titanium.Calendar.Event.save)/[remove](Titanium.Calendar.Event.remove) event value,
    * indicating modifications to this event instance should affect only this instance.
    */
  @JSGlobal("Titanium.Calendar.SPAN_THISEVENT")
  @js.native
  val SPAN_THISEVENT: Double = js.native
  
  /**
    * Alert dismissed state.
    */
  @JSGlobal("Titanium.Calendar.STATE_DISMISSED")
  @js.native
  val STATE_DISMISSED: Double = js.native
  
  /**
    * Alert fired state.
    */
  @JSGlobal("Titanium.Calendar.STATE_FIRED")
  @js.native
  val STATE_FIRED: Double = js.native
  
  /**
    * Alert scheduled status.
    */
  @JSGlobal("Titanium.Calendar.STATE_SCHEDULED")
  @js.native
  val STATE_SCHEDULED: Double = js.native
  
  /**
    * Event canceled status.
    */
  @JSGlobal("Titanium.Calendar.STATUS_CANCELED")
  @js.native
  val STATUS_CANCELED: Double = js.native
  
  /**
    * Event canceled status.
    * @deprecated Use [Titanium.Calendar.STATUS_CANCELED](Titanium.Calendar.STATUS_CANCELED) instead.
    */
  @JSGlobal("Titanium.Calendar.STATUS_CANCELLED")
  @js.native
  val STATUS_CANCELLED: scala.Nothing = js.native
  
  /**
    * Event confirmed status.
    */
  @JSGlobal("Titanium.Calendar.STATUS_CONFIRMED")
  @js.native
  val STATUS_CONFIRMED: Double = js.native
  
  /**
    * Event has no status.
    */
  @JSGlobal("Titanium.Calendar.STATUS_NONE")
  @js.native
  val STATUS_NONE: Double = js.native
  
  /**
    * Event tentative status.
    */
  @JSGlobal("Titanium.Calendar.STATUS_TENTATIVE")
  @js.native
  val STATUS_TENTATIVE: Double = js.native
  
  /**
    * Event confidential visibility.
    */
  @JSGlobal("Titanium.Calendar.VISIBILITY_CONFIDENTIAL")
  @js.native
  val VISIBILITY_CONFIDENTIAL: Double = js.native
  
  /**
    * Event default visibility.
    */
  @JSGlobal("Titanium.Calendar.VISIBILITY_DEFAULT")
  @js.native
  val VISIBILITY_DEFAULT: Double = js.native
  
  /**
    * Event private visibility.
    */
  @JSGlobal("Titanium.Calendar.VISIBILITY_PRIVATE")
  @js.native
  val VISIBILITY_PRIVATE: Double = js.native
  
  /**
    * Event public visibility.
    */
  @JSGlobal("Titanium.Calendar.VISIBILITY_PUBLIC")
  @js.native
  val VISIBILITY_PUBLIC: Double = js.native
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Calendar.addEventListener")
  @js.native
  def addEventListener(name: String, callback: js.Function1[/* param0 */ typings.titanium.Titanium.Event, Unit]): Unit = js.native
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Calendar.addEventListener")
  @js.native
  def addEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.Calendar, /* event */ CalendarChangeEvent, Unit]
  ): Unit = js.native
  
  /**
    * All alerts in selected calendars.
    */
  /* static member */
  @JSGlobal("Titanium.Calendar.allAlerts")
  @js.native
  val allAlerts: js.Array[typings.titanium.Titanium.Calendar.Alert] = js.native
  
  /**
    * All calendars known to the native calendar app.
    */
  /* static member */
  @JSGlobal("Titanium.Calendar.allCalendars")
  @js.native
  val allCalendars: js.Array[typings.titanium.Titanium.Calendar.Calendar] = js.native
  
  /**
    * All calendars known to the native calendar app that can add, edit, and
    * delete items in the calendar.
    */
  /* static member */
  @JSGlobal("Titanium.Calendar.allEditableCalendars")
  @js.native
  val allEditableCalendars: js.Array[typings.titanium.Titanium.Calendar.Calendar] = js.native
  
  /**
    * The name of the API that this proxy corresponds to.
    */
  /* static member */
  @JSGlobal("Titanium.Calendar.apiName")
  @js.native
  val apiName: String = js.native
  
  /**
    * Applies the properties to the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.Calendar.applyProperties")
  @js.native
  def applyProperties(props: js.Any): Unit = js.native
  
  /**
    * Indicates if the proxy will bubble an event to its parent.
    */
  /* static member */
  @JSGlobal("Titanium.Calendar.bubbleParent")
  @js.native
  def bubbleParent: Boolean = js.native
  @scala.inline
  def bubbleParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bubbleParent")(x.asInstanceOf[js.Any])
  
  /**
    * Returns an authorization constant indicating if the application has access to the events in the EventKit.
    */
  /* static member */
  @JSGlobal("Titanium.Calendar.calendarAuthorization")
  @js.native
  val calendarAuthorization: Double = js.native
  
  /**
    * Calendar that events are added to by default, as specified by user settings.
    */
  /* static member */
  @JSGlobal("Titanium.Calendar.defaultCalendar")
  @js.native
  val defaultCalendar: typings.titanium.Titanium.Calendar.Calendar = js.native
  
  /**
    * Returns an authorization constant indicating if the application has access to the events in the EventKit.
    * @deprecated Use [Titanium.Calendar.calendarAuthorization](Titanium.Calendar.calendarAuthorization) instead.
    */
  /* static member */
  @JSGlobal("Titanium.Calendar.eventsAuthorization")
  @js.native
  val eventsAuthorization: scala.Nothing = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  /* static member */
  @JSGlobal("Titanium.Calendar.fireEvent")
  @js.native
  def fireEvent(name: String): Unit = js.native
  @JSGlobal("Titanium.Calendar.fireEvent")
  @js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
    * Fires a synthesized event to any registered listeners.
    */
  /* static member */
  @JSGlobal("Titanium.Calendar.fireEvent")
  @js.native
  def fireEvent_change(name: change): Unit = js.native
  @JSGlobal("Titanium.Calendar.fireEvent")
  @js.native
  def fireEvent_change(name: change, event: CalendarChangeEvent): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.Calendar.allAlerts> property.
    * @deprecated Access <Titanium.Calendar.allAlerts> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Calendar.getAllAlerts")
  @js.native
  def getAllAlerts(): js.Array[typings.titanium.Titanium.Calendar.Alert] = js.native
  
  /**
    * Gets the value of the <Titanium.Calendar.allCalendars> property.
    * @deprecated Access <Titanium.Calendar.allCalendars> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Calendar.getAllCalendars")
  @js.native
  def getAllCalendars(): js.Array[typings.titanium.Titanium.Calendar.Calendar] = js.native
  
  /**
    * Gets the value of the <Titanium.Calendar.allEditableCalendars> property.
    * @deprecated Access <Titanium.Calendar.allEditableCalendars> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Calendar.getAllEditableCalendars")
  @js.native
  def getAllEditableCalendars(): js.Array[typings.titanium.Titanium.Calendar.Calendar] = js.native
  
  /**
    * Gets the value of the <Titanium.Calendar.apiName> property.
    * @deprecated Access <Titanium.Calendar.apiName> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Calendar.getApiName")
  @js.native
  def getApiName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Calendar.bubbleParent> property.
    * @deprecated Access <Titanium.Calendar.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Calendar.getBubbleParent")
  @js.native
  def getBubbleParent(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Calendar.calendarAuthorization> property.
    * @deprecated Access <Titanium.Calendar.calendarAuthorization> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Calendar.getCalendarAuthorization")
  @js.native
  def getCalendarAuthorization(): Double = js.native
  
  /**
    * Gets the calendar with the specified identifier.
    */
  /* static member */
  @JSGlobal("Titanium.Calendar.getCalendarById")
  @js.native
  def getCalendarById(id: String): typings.titanium.Titanium.Calendar.Calendar = js.native
  
  /**
    * Gets the value of the <Titanium.Calendar.defaultCalendar> property.
    * @deprecated Access <Titanium.Calendar.defaultCalendar> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Calendar.getDefaultCalendar")
  @js.native
  def getDefaultCalendar(): typings.titanium.Titanium.Calendar.Calendar = js.native
  
  /**
    * Gets the value of the <Titanium.Calendar.eventsAuthorization> property.
    * @deprecated Use [Titanium.Calendar.calendarAuthorization](Titanium.Calendar.calendarAuthorization) instead.
    */
  /* static member */
  @JSGlobal("Titanium.Calendar.getEventsAuthorization")
  @js.native
  def getEventsAuthorization: scala.Nothing = js.native
  @scala.inline
  def getEventsAuthorization_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getEventsAuthorization")(x.asInstanceOf[js.Any])
  
  /**
    * Gets the value of the <Titanium.Calendar.lifecycleContainer> property.
    * @deprecated Access <Titanium.Calendar.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Calendar.getLifecycleContainer")
  @js.native
  def getLifecycleContainer(): Window | TabGroup = js.native
  
  /**
    * Gets the value of the <Titanium.Calendar.selectableCalendars> property.
    * @deprecated Access <Titanium.Calendar.selectableCalendars> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Calendar.getSelectableCalendars")
  @js.native
  def getSelectableCalendars(): js.Array[typings.titanium.Titanium.Calendar.Calendar] = js.native
  
  /**
    * Returns `true` if the app has calendar access.
    */
  /* static member */
  @JSGlobal("Titanium.Calendar.hasCalendarPermissions")
  @js.native
  def hasCalendarPermissions(): Boolean = js.native
  
  /**
    * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.Calendar.lifecycleContainer")
  @js.native
  def lifecycleContainer: Window | TabGroup = js.native
  @scala.inline
  def lifecycleContainer_=(x: Window | TabGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lifecycleContainer")(x.asInstanceOf[js.Any])
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Calendar.removeEventListener")
  @js.native
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ typings.titanium.Titanium.Event, Unit]): Unit = js.native
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Calendar.removeEventListener")
  @js.native
  def removeEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.Calendar, /* event */ CalendarChangeEvent, Unit]
  ): Unit = js.native
  
  /**
    * Requests for calendar access.
    */
  /* static member */
  @JSGlobal("Titanium.Calendar.requestCalendarPermissions")
  @js.native
  def requestCalendarPermissions(callback: js.Function1[/* param0 */ EventsAuthorizationResponse, Unit]): Unit = js.native
  
  /**
    * If authorization is unknown, the system will bring up a dialog requesting permission.
    * @deprecated Use [Titanium.Calendar.requestCalendarPermissions](Titanium.Calendar.requestCalendarPermissions) instead.
    */
  /* static member */
  @JSGlobal("Titanium.Calendar.requestEventsAuthorization")
  @js.native
  def requestEventsAuthorization: scala.Nothing = js.native
  @scala.inline
  def requestEventsAuthorization_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requestEventsAuthorization")(x.asInstanceOf[js.Any])
  
  /**
    * All calendars selected within the native calendar app, which may be a subset of `allCalendars`.
    */
  /* static member */
  @JSGlobal("Titanium.Calendar.selectableCalendars")
  @js.native
  val selectableCalendars: js.Array[typings.titanium.Titanium.Calendar.Calendar] = js.native
  
  /**
    * Sets the value of the <Titanium.Calendar.bubbleParent> property.
    * @deprecated Set the value using <Titanium.Calendar.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Calendar.setBubbleParent")
  @js.native
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  
  @JSGlobal("Titanium.Calendar.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
    * Sets the value of the <Titanium.Calendar.lifecycleContainer> property.
    * @deprecated Set the value using <Titanium.Calendar.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Calendar.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
}
