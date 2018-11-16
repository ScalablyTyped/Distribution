package typings
package titaniumLib.TitaniumNs.CalendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An object that represents a single event in a calendar.
		 */

trait Event
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * Alarms associated with the calendar item, as an array of <Titanium.Calendar.Alert> objects.
  			 */
  var alerts: js.Array[Alert]
  /**
  			 * Indicates whether this event is all day.
  			 */
  var allDay: scala.Boolean
  /**
  			 * The list of event attendees. This list will be empty if the event has no attendees.
  			 */
  val attendees: js.Array[Attendee]
  /**
  			 * Availability of this event.
  			 */
  val availability: scala.Double
  /**
  			 * Start date/time of this event.
  			 */
  var begin: stdLib.Date
  /**
  			 * Description of this event.
  			 */
  val description: java.lang.String
  /**
  			 * End date/time of this event.
  			 */
  var end: stdLib.Date
  /**
  			 * Extended properties of this event.
  			 */
  val extendedProperties: js.Any
  /**
  			 * Indicates whether an alarm is scheduled for this event.
  			 */
  val hasAlarm: scala.Boolean
  /**
  			 * Identifier of this event.
  			 */
  val id: java.lang.String
  /**
  			 * Boolean value that indicates whether an event is a detached instance of a
  			 * repeating event.
  			 */
  val isDetached: scala.Boolean
  /**
  			 * Location of this event.
  			 */
  var location: java.lang.String
  /**
  			 * Notes for this event.
  			 */
  var notes: java.lang.String
  /**
  			 * The recurrence rules for the calendar item.
  			 */
  var recurrenceRules: js.Array[RecurrenceRule]
  /**
  			 * Existing reminders for this event.
  			 */
  val reminders: js.Array[Reminder]
  /**
  			 * Status of this event.
  			 */
  val status: scala.Double
  /**
  			 * Title of this event.
  			 */
  var title: java.lang.String
  /**
  			 * Visibility of this event.
  			 */
  val visibility: scala.Double
  /**
  			 * Adds a recurrence rule to the recurrence rule array.
  			 */
  def addRecurrenceRule(rule: RecurrenceRule): scala.Unit
  /**
  			 * Creates an alert for this event.
  			 */
  def createAlert(data: js.Any): Alert
  /**
  			 * Creates an recurrence pattern for a recurring event.
  			 * All of the properties for the recurrence rule must be set during creation.
  			 * The recurrence rule properties cannot be modified.
  			 */
  def createRecurrenceRule(data: js.Any): RecurrenceRule
  /**
  			 * Creates a reminder for this event.
  			 */
  def createReminder(data: js.Any): Reminder
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.alerts> property.
  			 */
  def getAlerts(): js.Array[Alert]
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.allDay> property.
  			 */
  def getAllDay(): scala.Boolean
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.attendees> property.
  			 */
  def getAttendees(): js.Array[Attendee]
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.availability> property.
  			 */
  def getAvailability(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.begin> property.
  			 */
  def getBegin(): stdLib.Date
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.description> property.
  			 */
  def getDescription(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.end> property.
  			 */
  def getEnd(): stdLib.Date
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.extendedProperties> property.
  			 */
  def getExtendedProperties(): js.Any
  /**
  			 * Gets the value of the specified extended property.
  			 */
  def getExtendedProperty(name: java.lang.String): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.hasAlarm> property.
  			 */
  def getHasAlarm(): scala.Boolean
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.id> property.
  			 */
  def getId(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.isDetached> property.
  			 */
  def getIsDetached(): scala.Boolean
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.location> property.
  			 */
  def getLocation(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.notes> property.
  			 */
  def getNotes(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.recurrenceRules> property.
  			 */
  def getRecurrenceRules(): js.Array[RecurrenceRule]
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.reminders> property.
  			 */
  def getReminders(): js.Array[Reminder]
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.status> property.
  			 */
  def getStatus(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.title> property.
  			 */
  def getTitle(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.visibility> property.
  			 */
  def getVisibility(): scala.Double
  /**
  			 * Updates the event's data with the current information in the Calendar database.
  			 */
  def refresh(): scala.Boolean
  /**
  			 * Removes an event from the event store.
  			 */
  def remove(span: scala.Double): scala.Boolean
  /**
  			 * Removes a recurrence rule to the recurrence rule array.
  			 */
  def removeRecurrenceRule(rule: RecurrenceRule): scala.Unit
  /**
  			 * Saves changes to an event permanently.
  			 */
  def save(span: scala.Double): scala.Boolean
  /**
  			 * Sets the value of the <Titanium.Calendar.Event.alerts> property.
  			 */
  def setAlerts(alerts: js.Array[Alert]): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Calendar.Event.allDay> property.
  			 */
  def setAllDay(allDay: scala.Boolean): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Calendar.Event.begin> property.
  			 */
  def setBegin(begin: stdLib.Date): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Calendar.Event.end> property.
  			 */
  def setEnd(end: stdLib.Date): scala.Unit
  /**
  			 * Sets the value of the specified extended property.
  			 */
  def setExtendedProperty(name: java.lang.String, value: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Calendar.Event.location> property.
  			 */
  def setLocation(location: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Calendar.Event.notes> property.
  			 */
  def setNotes(notes: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Calendar.Event.recurrenceRules> property.
  			 */
  def setRecurrenceRules(recurrenceRules: js.Array[RecurrenceRule]): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Calendar.Event.title> property.
  			 */
  def setTitle(title: java.lang.String): scala.Unit
}

