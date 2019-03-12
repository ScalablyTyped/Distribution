package typings
package titaniumLib.TitaniumNs.CalendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Titanium.Calendar")
@js.native
object ^ extends js.Object {
  /**
  		 * Attendee role is chair.
  		 */
  val ATTENDEE_ROLE_CHAIR: scala.Double = js.native
  /**
  		 * Attendee is not a participant.
  		 */
  val ATTENDEE_ROLE_NON_PARTICIPANT: scala.Double = js.native
  /**
  		 * Attendee role is optional.
  		 */
  val ATTENDEE_ROLE_OPTIONAL: scala.Double = js.native
  /**
  		 * Attendee role is required.
  		 */
  val ATTENDEE_ROLE_REQUIRED: scala.Double = js.native
  /**
  		 * Attendee role is unknown.
  		 */
  val ATTENDEE_ROLE_UNKNOWN: scala.Double = js.native
  /**
  		 * Attendee status is accepted.
  		 */
  val ATTENDEE_STATUS_ACCEPTED: scala.Double = js.native
  /**
  		 * Attendee status is declined.
  		 */
  val ATTENDEE_STATUS_DECLINED: scala.Double = js.native
  /**
  		 * Attendee status is delegated.
  		 */
  val ATTENDEE_STATUS_DELEGATED: scala.Double = js.native
  /**
  		 * Attendee status is invited.
  		 */
  val ATTENDEE_STATUS_INVITED: scala.Double = js.native
  /**
  		 * Attendee status is in process.
  		 */
  val ATTENDEE_STATUS_IN_PROCESS: scala.Double = js.native
  /**
  		 * There is no Attendee status.
  		 */
  val ATTENDEE_STATUS_NONE: scala.Double = js.native
  /**
  		 * Attendee status is pending.
  		 */
  val ATTENDEE_STATUS_PENDING: scala.Double = js.native
  /**
  		 * Attendee status is tentative.
  		 */
  val ATTENDEE_STATUS_TENTATIVE: scala.Double = js.native
  /**
  		 * Attendee status is unknown.
  		 */
  val ATTENDEE_STATUS_UNKNOWN: scala.Double = js.native
  /**
  		 * Attendee type is group.
  		 */
  val ATTENDEE_TYPE_GROUP: scala.Double = js.native
  /**
  		 * There is not attendee type.
  		 */
  val ATTENDEE_TYPE_NONE: scala.Double = js.native
  /**
  		 * Attendee type is person.
  		 */
  val ATTENDEE_TYPE_PERSON: scala.Double = js.native
  /**
  		 * Attendee type is required.
  		 */
  val ATTENDEE_TYPE_REQUIRED: scala.Double = js.native
  /**
  		 * Attendee type is resource.
  		 */
  val ATTENDEE_TYPE_RESOURCE: scala.Double = js.native
  /**
  		 * Attendee type is room.
  		 */
  val ATTENDEE_TYPE_ROOM: scala.Double = js.native
  /**
  		 * Attendee type is unknown.
  		 */
  val ATTENDEE_TYPE_UNKNOWN: scala.Double = js.native
  /**
  		 * A [eventsAuthorization](Titanium.Calendar.eventsAuthorization) value
  		 * indicating that the application is authorized to use events in the Calendar.
  		 */
  val AUTHORIZATION_AUTHORIZED: scala.Double = js.native
  /**
  		 * A [eventsAuthorization](Titanium.Calendar.eventsAuthorization) value
  		 * indicating that the application is not authorized to use events in the Calendar.
  		 */
  val AUTHORIZATION_DENIED: scala.Double = js.native
  /**
  		 * A [eventsAuthorization](Titanium.Calendar.eventsAuthorization) value
  		 * indicating that the application is not authorized to use events in the Calendar.
  		 * the user cannot change this application's status.
  		 */
  val AUTHORIZATION_RESTRICTED: scala.Double = js.native
  /**
  		 * A [eventsAuthorization](Titanium.Calendar.eventsAuthorization) value
  		 * indicating that the authorization state is unknown.
  		 */
  val AUTHORIZATION_UNKNOWN: scala.Double = js.native
  /**
  		 * Event has a busy availability setting.
  		 */
  val AVAILABILITY_BUSY: scala.Double = js.native
  /**
  		 * Event has a free availability setting.
  		 */
  val AVAILABILITY_FREE: scala.Double = js.native
  /**
  		 * Availability settings are not supported by the event's calendar.
  		 */
  val AVAILABILITY_NOTSUPPORTED: scala.Double = js.native
  /**
  		 * Event has a tentative availability setting.
  		 */
  val AVAILABILITY_TENTATIVE: scala.Double = js.native
  /**
  		 * Event has a tentative availability setting.
  		 */
  val AVAILABILITY_UNAVAILABLE: scala.Double = js.native
  /**
  		 * Reminder alert delivery method.
  		 */
  val METHOD_ALERT: scala.Double = js.native
  /**
  		 * Reminder default delivery method.
  		 */
  val METHOD_DEFAULT: scala.Double = js.native
  /**
  		 * Reminder email delivery method.
  		 */
  val METHOD_EMAIL: scala.Double = js.native
  /**
  		 * Reminder SMS delivery method.
  		 */
  val METHOD_SMS: scala.Double = js.native
  /**
  		 * Indicates a daily recurrence rule for a events reccurance frequency.
  		 */
  val RECURRENCEFREQUENCY_DAILY: scala.Double = js.native
  /**
  		 * Indicates a monthly recurrence rule for a events reccurance frequency.
  		 */
  val RECURRENCEFREQUENCY_MONTHLY: scala.Double = js.native
  /**
  		 * Indicates a weekly recurrence rule for a events reccurance frequency.
  		 */
  val RECURRENCEFREQUENCY_WEEKLY: scala.Double = js.native
  /**
  		 * Indicates a yearly recurrence rule for a events reccurance frequency.
  		 */
  val RECURRENCEFREQUENCY_YEARLY: scala.Double = js.native
  /**
  		 * Relationship is attendee.
  		 */
  val RELATIONSHIP_ATTENDEE: scala.Double = js.native
  /**
  		 * There is no relationship.
  		 */
  val RELATIONSHIP_NONE: scala.Double = js.native
  /**
  		 * Attendee is organizer.
  		 */
  val RELATIONSHIP_ORGANIZER: scala.Double = js.native
  /**
  		 * Attendee is performer.
  		 */
  val RELATIONSHIP_PERFORMER: scala.Double = js.native
  /**
  		 * Attendee is speaker.
  		 */
  val RELATIONSHIP_SPEAKER: scala.Double = js.native
  /**
  		 * Relationship is unknown.
  		 */
  val RELATIONSHIP_UNKNOWN: scala.Double = js.native
  /**
  		 * A birthday calendar source.
  		 */
  val SOURCE_TYPE_BIRTHDAYS: scala.Double = js.native
  /**
  		 * A calDev calendar source.
  		 */
  val SOURCE_TYPE_CALDAV: scala.Double = js.native
  /**
  		 * A microsoft exchange calendar source.
  		 */
  val SOURCE_TYPE_EXCHANGE: scala.Double = js.native
  /**
  		 * A local calendar source.
  		 */
  val SOURCE_TYPE_LOCAL: scala.Double = js.native
  /**
  		 * A mobileMe calendar source.
  		 */
  val SOURCE_TYPE_MOBILEME: scala.Double = js.native
  /**
  		 * A subscribed calendar source.
  		 */
  val SOURCE_TYPE_SUBSCRIBED: scala.Double = js.native
  /**
  		 * A [save](Titanium.Calendar.Event.save)/[remove](Titanium.Calendar.Event.remove) event value,
  		 * indicating modifications to this event instance should also affect future instances of this event.
  		 */
  val SPAN_FUTUREEVENTS: scala.Double = js.native
  /**
  		 * A [save](Titanium.Calendar.Event.save)/[remove](Titanium.Calendar.Event.remove) event value,
  		 * indicating modifications to this event instance should affect only this instance.
  		 */
  val SPAN_THISEVENT: scala.Double = js.native
  /**
  		 * Alert dismissed state.
  		 */
  val STATE_DISMISSED: scala.Double = js.native
  /**
  		 * Alert fired state.
  		 */
  val STATE_FIRED: scala.Double = js.native
  /**
  		 * Alert scheduled status.
  		 */
  val STATE_SCHEDULED: scala.Double = js.native
  /**
  		 * Event canceled status.
  		 */
  val STATUS_CANCELED: scala.Double = js.native
  /**
  		 * Event canceled status.
  		 */
  val STATUS_CANCELLED: scala.Double = js.native
  /**
  		 * Event confirmed status.
  		 */
  val STATUS_CONFIRMED: scala.Double = js.native
  /**
  		 * Event has no status.
  		 */
  val STATUS_NONE: scala.Double = js.native
  /**
  		 * Event tentative status.
  		 */
  val STATUS_TENTATIVE: scala.Double = js.native
  /**
  		 * Event confidential visibility.
  		 */
  val VISIBILITY_CONFIDENTIAL: scala.Double = js.native
  /**
  		 * Event default visibility.
  		 */
  val VISIBILITY_DEFAULT: scala.Double = js.native
  /**
  		 * Event private visibility.
  		 */
  val VISIBILITY_PRIVATE: scala.Double = js.native
  /**
  		 * Event public visibility.
  		 */
  val VISIBILITY_PUBLIC: scala.Double = js.native
  /**
  		 * All alerts in selected calendars.
  		 */
  val allAlerts: js.Array[Alert] = js.native
  /**
  		 * All calendars known to the native calendar app.
  		 */
  val allCalendars: js.Array[Calendar] = js.native
  /**
  		 * All calendars known to the native calendar app that can add, edit, and
  		 * delete items in the calendar.
  		 */
  val allEditableCalendars: js.Array[Calendar] = js.native
  /**
  		 * The name of the API that this proxy corresponds to.
  		 */
  val apiName: java.lang.String = js.native
  /**
  		 * Indicates if the proxy will bubble an event to its parent.
  		 */
  var bubbleParent: scala.Boolean = js.native
  /**
  		 * Returns an authorization constant indicating if the application has access to the events in the EventKit.
  		 */
  val calendarAuthorization: scala.Double = js.native
  /**
  		 * Calendar that events are added to by default, as specified by user settings.
  		 */
  val defaultCalendar: Calendar = js.native
  /**
  		 * Returns an authorization constant indicating if the application has access to the events in the EventKit.
  		 */
  val eventsAuthorization: scala.Double = js.native
  /**
  		 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  		 */
  var lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  		 * All calendars selected within the native calendar app, which may be a subset of `allCalendars`.
  		 */
  val selectableCalendars: js.Array[Calendar] = js.native
  /**
  		 * Adds the specified callback as an event listener for the named event.
  		 */
  def addEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  		 * Applies the properties to the proxy.
  		 */
  def applyProperties(props: js.Any): scala.Unit = js.native
  /**
  		 * Fires a synthesized event to any registered listeners.
  		 */
  def fireEvent(name: java.lang.String, event: js.Any): scala.Unit = js.native
  /**
  		 * Gets the value of the <Titanium.Calendar.allAlerts> property.
  		 */
  def getAllAlerts(): js.Array[Alert] = js.native
  /**
  		 * Gets the value of the <Titanium.Calendar.allCalendars> property.
  		 */
  def getAllCalendars(): js.Array[Calendar] = js.native
  /**
  		 * Gets the value of the <Titanium.Calendar.allEditableCalendars> property.
  		 */
  def getAllEditableCalendars(): js.Array[Calendar] = js.native
  /**
  		 * Gets the value of the <Titanium.Calendar.apiName> property.
  		 */
  def getApiName(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Calendar.bubbleParent> property.
  		 */
  def getBubbleParent(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Calendar.calendarAuthorization> property.
  		 */
  def getCalendarAuthorization(): scala.Double = js.native
  /**
  		 * Gets the calendar with the specified identifier.
  		 */
  def getCalendarById(id: java.lang.String): Calendar = js.native
  /**
  		 * Gets the value of the <Titanium.Calendar.defaultCalendar> property.
  		 */
  def getDefaultCalendar(): Calendar = js.native
  /**
  		 * Gets the value of the <Titanium.Calendar.eventsAuthorization> property.
  		 */
  def getEventsAuthorization(): scala.Double = js.native
  /**
  		 * Gets the value of the <Titanium.Calendar.lifecycleContainer> property.
  		 */
  def getLifecycleContainer(): titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  		 * Gets the value of the <Titanium.Calendar.selectableCalendars> property.
  		 */
  def getSelectableCalendars(): js.Array[Calendar] = js.native
  /**
  		 * Returns `true` if the app has calendar access.
  		 */
  def hasCalendarPermissions(): scala.Boolean = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  		 * Requests for calendar access.
  		 */
  def requestCalendarPermissions(callback: js.Function1[/* param0 */ titaniumLib.EventsAuthorizationResponse, _]): scala.Unit = js.native
  /**
  		 * If authorization is unknown, will bring up a dialog requesting permission.
  		 */
  def requestEventsAuthorization(callback: js.Function1[/* param0 */ titaniumLib.EventsAuthorizationResponse, _]): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Calendar.bubbleParent> property.
  		 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Calendar.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.TabGroup): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Calendar.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window): scala.Unit = js.native
}

