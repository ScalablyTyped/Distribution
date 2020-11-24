package typings.titanium.global.Titanium

import typings.titanium.EventsAuthorizationResponse
import typings.titanium.Titanium.CalendarChangeEvent
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import typings.titanium.titaniumStrings.change
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
/* static members */
@JSGlobal("Titanium.Calendar")
@js.native
object Calendar extends js.Object {
  
  /**
    * Attendee role is chair.
    */
  val ATTENDEE_ROLE_CHAIR: Double = js.native
  
  /**
    * Attendee is not a participant.
    */
  val ATTENDEE_ROLE_NON_PARTICIPANT: Double = js.native
  
  /**
    * Attendee role is optional.
    */
  val ATTENDEE_ROLE_OPTIONAL: Double = js.native
  
  /**
    * Attendee role is required.
    */
  val ATTENDEE_ROLE_REQUIRED: Double = js.native
  
  /**
    * Attendee role is unknown.
    */
  val ATTENDEE_ROLE_UNKNOWN: Double = js.native
  
  /**
    * Attendee status is accepted.
    */
  val ATTENDEE_STATUS_ACCEPTED: Double = js.native
  
  /**
    * Attendee status is declined.
    */
  val ATTENDEE_STATUS_DECLINED: Double = js.native
  
  /**
    * Attendee status is delegated.
    */
  val ATTENDEE_STATUS_DELEGATED: Double = js.native
  
  /**
    * Attendee status is invited.
    */
  val ATTENDEE_STATUS_INVITED: Double = js.native
  
  /**
    * Attendee status is in process.
    */
  val ATTENDEE_STATUS_IN_PROCESS: Double = js.native
  
  /**
    * There is no Attendee status.
    */
  val ATTENDEE_STATUS_NONE: Double = js.native
  
  /**
    * Attendee status is pending.
    */
  val ATTENDEE_STATUS_PENDING: Double = js.native
  
  /**
    * Attendee status is tentative.
    */
  val ATTENDEE_STATUS_TENTATIVE: Double = js.native
  
  /**
    * Attendee status is unknown.
    */
  val ATTENDEE_STATUS_UNKNOWN: Double = js.native
  
  /**
    * Attendee type is group.
    */
  val ATTENDEE_TYPE_GROUP: Double = js.native
  
  /**
    * There is not attendee type.
    */
  val ATTENDEE_TYPE_NONE: Double = js.native
  
  /**
    * Attendee type is person.
    */
  val ATTENDEE_TYPE_PERSON: Double = js.native
  
  /**
    * Attendee type is required.
    */
  val ATTENDEE_TYPE_REQUIRED: Double = js.native
  
  /**
    * Attendee type is resource.
    */
  val ATTENDEE_TYPE_RESOURCE: Double = js.native
  
  /**
    * Attendee type is room.
    */
  val ATTENDEE_TYPE_ROOM: Double = js.native
  
  /**
    * Attendee type is unknown.
    */
  val ATTENDEE_TYPE_UNKNOWN: Double = js.native
  
  /**
    * An [calendarAuthorization](Titanium.Calendar.calendarAuthorization) value
    * indicating that the application is authorized to use events in the Calendar.
    */
  val AUTHORIZATION_AUTHORIZED: Double = js.native
  
  /**
    * An [calendarAuthorization](Titanium.Calendar.calendarAuthorization) value
    * indicating that the application is not authorized to use events in the Calendar.
    */
  val AUTHORIZATION_DENIED: Double = js.native
  
  /**
    * An [calendarAuthorization](Titanium.Calendar.calendarAuthorization) value
    * indicating that the application is not authorized to use events in the Calendar.
    * the user cannot change this application's status.
    */
  val AUTHORIZATION_RESTRICTED: Double = js.native
  
  /**
    * An [calendarAuthorization](Titanium.Calendar.calendarAuthorization) value
    * indicating that the authorization state is unknown.
    */
  val AUTHORIZATION_UNKNOWN: Double = js.native
  
  /**
    * Event has a busy availability setting.
    */
  val AVAILABILITY_BUSY: Double = js.native
  
  /**
    * Event has a free availability setting.
    */
  val AVAILABILITY_FREE: Double = js.native
  
  /**
    * Availability settings are not supported by the event's calendar.
    */
  val AVAILABILITY_NOTSUPPORTED: Double = js.native
  
  /**
    * Event has a tentative availability setting.
    */
  val AVAILABILITY_TENTATIVE: Double = js.native
  
  /**
    * Event has a tentative availability setting.
    */
  val AVAILABILITY_UNAVAILABLE: Double = js.native
  
  /**
    * Reminder alert delivery method.
    */
  val METHOD_ALERT: Double = js.native
  
  /**
    * Reminder default delivery method.
    */
  val METHOD_DEFAULT: Double = js.native
  
  /**
    * Reminder email delivery method.
    */
  val METHOD_EMAIL: Double = js.native
  
  /**
    * Reminder SMS delivery method.
    */
  val METHOD_SMS: Double = js.native
  
  /**
    * Indicates a daily recurrence rule for a events reccurance frequency.
    */
  val RECURRENCEFREQUENCY_DAILY: Double = js.native
  
  /**
    * Indicates a monthly recurrence rule for a events reccurance frequency.
    */
  val RECURRENCEFREQUENCY_MONTHLY: Double = js.native
  
  /**
    * Indicates a weekly recurrence rule for a events reccurance frequency.
    */
  val RECURRENCEFREQUENCY_WEEKLY: Double = js.native
  
  /**
    * Indicates a yearly recurrence rule for a events reccurance frequency.
    */
  val RECURRENCEFREQUENCY_YEARLY: Double = js.native
  
  /**
    * Relationship is attendee.
    */
  val RELATIONSHIP_ATTENDEE: Double = js.native
  
  /**
    * There is no relationship.
    */
  val RELATIONSHIP_NONE: Double = js.native
  
  /**
    * Attendee is organizer.
    */
  val RELATIONSHIP_ORGANIZER: Double = js.native
  
  /**
    * Attendee is performer.
    */
  val RELATIONSHIP_PERFORMER: Double = js.native
  
  /**
    * Attendee is speaker.
    */
  val RELATIONSHIP_SPEAKER: Double = js.native
  
  /**
    * Relationship is unknown.
    */
  val RELATIONSHIP_UNKNOWN: Double = js.native
  
  /**
    * A birthday calendar source.
    */
  val SOURCE_TYPE_BIRTHDAYS: Double = js.native
  
  /**
    * A calDev calendar source.
    */
  val SOURCE_TYPE_CALDAV: Double = js.native
  
  /**
    * A microsoft exchange calendar source.
    */
  val SOURCE_TYPE_EXCHANGE: Double = js.native
  
  /**
    * A local calendar source.
    */
  val SOURCE_TYPE_LOCAL: Double = js.native
  
  /**
    * A mobileMe calendar source.
    */
  val SOURCE_TYPE_MOBILEME: Double = js.native
  
  /**
    * A subscribed calendar source.
    */
  val SOURCE_TYPE_SUBSCRIBED: Double = js.native
  
  /**
    * A [save](Titanium.Calendar.Event.save)/[remove](Titanium.Calendar.Event.remove) event value,
    * indicating modifications to this event instance should also affect future instances of this event.
    */
  val SPAN_FUTUREEVENTS: Double = js.native
  
  /**
    * A [save](Titanium.Calendar.Event.save)/[remove](Titanium.Calendar.Event.remove) event value,
    * indicating modifications to this event instance should affect only this instance.
    */
  val SPAN_THISEVENT: Double = js.native
  
  /**
    * Alert dismissed state.
    */
  val STATE_DISMISSED: Double = js.native
  
  /**
    * Alert fired state.
    */
  val STATE_FIRED: Double = js.native
  
  /**
    * Alert scheduled status.
    */
  val STATE_SCHEDULED: Double = js.native
  
  /**
    * Event canceled status.
    */
  val STATUS_CANCELED: Double = js.native
  
  /**
    * Event canceled status.
    * @deprecated Use [Titanium.Calendar.STATUS_CANCELED](Titanium.Calendar.STATUS_CANCELED) instead.
    */
  val STATUS_CANCELLED: scala.Nothing = js.native
  
  /**
    * Event confirmed status.
    */
  val STATUS_CONFIRMED: Double = js.native
  
  /**
    * Event has no status.
    */
  val STATUS_NONE: Double = js.native
  
  /**
    * Event tentative status.
    */
  val STATUS_TENTATIVE: Double = js.native
  
  /**
    * Event confidential visibility.
    */
  val VISIBILITY_CONFIDENTIAL: Double = js.native
  
  /**
    * Event default visibility.
    */
  val VISIBILITY_DEFAULT: Double = js.native
  
  /**
    * Event private visibility.
    */
  val VISIBILITY_PRIVATE: Double = js.native
  
  /**
    * Event public visibility.
    */
  val VISIBILITY_PUBLIC: Double = js.native
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ typings.titanium.Titanium.Event, Unit]): Unit = js.native
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  @JSName("addEventListener")
  def addEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ CalendarChangeEvent, Unit]
  ): Unit = js.native
  
  /**
    * All alerts in selected calendars.
    */
  val allAlerts: js.Array[typings.titanium.Titanium.Calendar.Alert] = js.native
  
  /**
    * All calendars known to the native calendar app.
    */
  val allCalendars: js.Array[typings.titanium.Titanium.Calendar.Calendar] = js.native
  
  /**
    * All calendars known to the native calendar app that can add, edit, and
    * delete items in the calendar.
    */
  val allEditableCalendars: js.Array[typings.titanium.Titanium.Calendar.Calendar] = js.native
  
  /**
    * The name of the API that this proxy corresponds to.
    */
  val apiName: String = js.native
  
  /**
    * Applies the properties to the proxy.
    */
  def applyProperties(props: js.Any): Unit = js.native
  
  /**
    * Indicates if the proxy will bubble an event to its parent.
    */
  var bubbleParent: Boolean = js.native
  
  /**
    * Returns an authorization constant indicating if the application has access to the events in the EventKit.
    */
  val calendarAuthorization: Double = js.native
  
  /**
    * Calendar that events are added to by default, as specified by user settings.
    */
  val defaultCalendar: typings.titanium.Titanium.Calendar.Calendar = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  def fireEvent(name: String): Unit = js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
    * Fires a synthesized event to any registered listeners.
    */
  @JSName("fireEvent")
  def fireEvent_change(name: change): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_change(name: change, event: CalendarChangeEvent): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.Calendar.allAlerts> property.
    * @deprecated Access <Titanium.Calendar.allAlerts> instead.
    */
  def getAllAlerts(): js.Array[typings.titanium.Titanium.Calendar.Alert] = js.native
  
  /**
    * Gets the value of the <Titanium.Calendar.allCalendars> property.
    * @deprecated Access <Titanium.Calendar.allCalendars> instead.
    */
  def getAllCalendars(): js.Array[typings.titanium.Titanium.Calendar.Calendar] = js.native
  
  /**
    * Gets the value of the <Titanium.Calendar.allEditableCalendars> property.
    * @deprecated Access <Titanium.Calendar.allEditableCalendars> instead.
    */
  def getAllEditableCalendars(): js.Array[typings.titanium.Titanium.Calendar.Calendar] = js.native
  
  /**
    * Gets the value of the <Titanium.Calendar.apiName> property.
    * @deprecated Access <Titanium.Calendar.apiName> instead.
    */
  def getApiName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Calendar.bubbleParent> property.
    * @deprecated Access <Titanium.Calendar.bubbleParent> instead.
    */
  def getBubbleParent(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Calendar.calendarAuthorization> property.
    * @deprecated Access <Titanium.Calendar.calendarAuthorization> instead.
    */
  def getCalendarAuthorization(): Double = js.native
  
  /**
    * Gets the calendar with the specified identifier.
    */
  def getCalendarById(id: String): typings.titanium.Titanium.Calendar.Calendar = js.native
  
  /**
    * Gets the value of the <Titanium.Calendar.defaultCalendar> property.
    * @deprecated Access <Titanium.Calendar.defaultCalendar> instead.
    */
  def getDefaultCalendar(): typings.titanium.Titanium.Calendar.Calendar = js.native
  
  /**
    * Gets the value of the <Titanium.Calendar.lifecycleContainer> property.
    * @deprecated Access <Titanium.Calendar.lifecycleContainer> instead.
    */
  def getLifecycleContainer(): Window | TabGroup = js.native
  
  /**
    * Gets the value of the <Titanium.Calendar.selectableCalendars> property.
    * @deprecated Access <Titanium.Calendar.selectableCalendars> instead.
    */
  def getSelectableCalendars(): js.Array[typings.titanium.Titanium.Calendar.Calendar] = js.native
  
  /**
    * Returns `true` if the app has calendar access.
    */
  def hasCalendarPermissions(): Boolean = js.native
  
  /**
    * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
    */
  var lifecycleContainer: Window | TabGroup = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ typings.titanium.Titanium.Event, Unit]): Unit = js.native
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  @JSName("removeEventListener")
  def removeEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ CalendarChangeEvent, Unit]
  ): Unit = js.native
  
  /**
    * Requests for calendar access.
    */
  def requestCalendarPermissions(callback: js.Function1[/* param0 */ EventsAuthorizationResponse, Unit]): Unit = js.native
  
  /**
    * All calendars selected within the native calendar app, which may be a subset of `allCalendars`.
    */
  val selectableCalendars: js.Array[typings.titanium.Titanium.Calendar.Calendar] = js.native
  
  /**
    * Sets the value of the <Titanium.Calendar.bubbleParent> property.
    * @deprecated Set the value using <Titanium.Calendar.bubbleParent> instead.
    */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
    * Sets the value of the <Titanium.Calendar.lifecycleContainer> property.
    * @deprecated Set the value using <Titanium.Calendar.lifecycleContainer> instead.
    */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  
  /**
    * An object that represents a single alert for an event in an calendar.
    */
  @js.native
  class Alert ()
    extends typings.titanium.Titanium.Calendar.Alert
  
  /**
    * An object that represents a single attendee of an event.
    */
  @js.native
  class Attendee ()
    extends typings.titanium.Titanium.Calendar.Attendee
  
  /**
    * An object that represents a single calendar.
    */
  @js.native
  class Calendar ()
    extends typings.titanium.Titanium.Calendar.Calendar
  
  /**
    * An object that represents a single event in a calendar.
    */
  @js.native
  class Event ()
    extends typings.titanium.Titanium.Calendar.Event
  
  /**
    * An object that is used to describe the recurrence pattern for a recurring event.
    */
  @js.native
  class RecurrenceRule ()
    extends typings.titanium.Titanium.Calendar.RecurrenceRule
  
  /**
    * An object that represents a single reminder for an event in a calendar.
    */
  @js.native
  class Reminder ()
    extends typings.titanium.Titanium.Calendar.Reminder
}
