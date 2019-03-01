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

object Event {
  @scala.inline
  def apply(
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    addRecurrenceRule: js.Function1[RecurrenceRule, scala.Unit],
    alerts: js.Array[Alert],
    allDay: scala.Boolean,
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    attendees: js.Array[Attendee],
    availability: scala.Double,
    begin: stdLib.Date,
    bubbleParent: scala.Boolean,
    createAlert: js.Function1[js.Any, Alert],
    createRecurrenceRule: js.Function1[js.Any, RecurrenceRule],
    createReminder: js.Function1[js.Any, Reminder],
    description: java.lang.String,
    end: stdLib.Date,
    extendedProperties: js.Any,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getAlerts: js.Function0[js.Array[Alert]],
    getAllDay: js.Function0[scala.Boolean],
    getApiName: js.Function0[java.lang.String],
    getAttendees: js.Function0[js.Array[Attendee]],
    getAvailability: js.Function0[scala.Double],
    getBegin: js.Function0[stdLib.Date],
    getBubbleParent: js.Function0[scala.Boolean],
    getDescription: js.Function0[java.lang.String],
    getEnd: js.Function0[stdLib.Date],
    getExtendedProperties: js.Function0[js.Any],
    getExtendedProperty: js.Function1[java.lang.String, java.lang.String],
    getHasAlarm: js.Function0[scala.Boolean],
    getId: js.Function0[java.lang.String],
    getIsDetached: js.Function0[scala.Boolean],
    getLocation: js.Function0[java.lang.String],
    getNotes: js.Function0[java.lang.String],
    getRecurrenceRules: js.Function0[js.Array[RecurrenceRule]],
    getReminders: js.Function0[js.Array[Reminder]],
    getStatus: js.Function0[scala.Double],
    getTitle: js.Function0[java.lang.String],
    getVisibility: js.Function0[scala.Double],
    hasAlarm: scala.Boolean,
    id: java.lang.String,
    isDetached: scala.Boolean,
    location: java.lang.String,
    notes: java.lang.String,
    recurrenceRules: js.Array[RecurrenceRule],
    refresh: js.Function0[scala.Boolean],
    reminders: js.Array[Reminder],
    remove: js.Function1[scala.Double, scala.Boolean],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    removeRecurrenceRule: js.Function1[RecurrenceRule, scala.Unit],
    save: js.Function1[scala.Double, scala.Boolean],
    setAlerts: js.Function1[js.Array[Alert], scala.Unit],
    setAllDay: js.Function1[scala.Boolean, scala.Unit],
    setBegin: js.Function1[stdLib.Date, scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setEnd: js.Function1[stdLib.Date, scala.Unit],
    setExtendedProperty: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    setLocation: js.Function1[java.lang.String, scala.Unit],
    setNotes: js.Function1[java.lang.String, scala.Unit],
    setRecurrenceRules: js.Function1[js.Array[RecurrenceRule], scala.Unit],
    setTitle: js.Function1[java.lang.String, scala.Unit],
    status: scala.Double,
    title: java.lang.String,
    visibility: scala.Double,
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): Event = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addRecurrenceRule")(addRecurrenceRule)
    __obj.updateDynamic("alerts")(alerts)
    __obj.updateDynamic("allDay")(allDay)
    __obj.updateDynamic("apiName")(apiName)
    __obj.updateDynamic("applyProperties")(applyProperties)
    __obj.updateDynamic("attendees")(attendees)
    __obj.updateDynamic("availability")(availability)
    __obj.updateDynamic("begin")(begin)
    __obj.updateDynamic("bubbleParent")(bubbleParent)
    __obj.updateDynamic("createAlert")(createAlert)
    __obj.updateDynamic("createRecurrenceRule")(createRecurrenceRule)
    __obj.updateDynamic("createReminder")(createReminder)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("extendedProperties")(extendedProperties)
    __obj.updateDynamic("fireEvent")(fireEvent)
    __obj.updateDynamic("getAlerts")(getAlerts)
    __obj.updateDynamic("getAllDay")(getAllDay)
    __obj.updateDynamic("getApiName")(getApiName)
    __obj.updateDynamic("getAttendees")(getAttendees)
    __obj.updateDynamic("getAvailability")(getAvailability)
    __obj.updateDynamic("getBegin")(getBegin)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent)
    __obj.updateDynamic("getDescription")(getDescription)
    __obj.updateDynamic("getEnd")(getEnd)
    __obj.updateDynamic("getExtendedProperties")(getExtendedProperties)
    __obj.updateDynamic("getExtendedProperty")(getExtendedProperty)
    __obj.updateDynamic("getHasAlarm")(getHasAlarm)
    __obj.updateDynamic("getId")(getId)
    __obj.updateDynamic("getIsDetached")(getIsDetached)
    __obj.updateDynamic("getLocation")(getLocation)
    __obj.updateDynamic("getNotes")(getNotes)
    __obj.updateDynamic("getRecurrenceRules")(getRecurrenceRules)
    __obj.updateDynamic("getReminders")(getReminders)
    __obj.updateDynamic("getStatus")(getStatus)
    __obj.updateDynamic("getTitle")(getTitle)
    __obj.updateDynamic("getVisibility")(getVisibility)
    __obj.updateDynamic("hasAlarm")(hasAlarm)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isDetached")(isDetached)
    __obj.updateDynamic("location")(location)
    __obj.updateDynamic("notes")(notes)
    __obj.updateDynamic("recurrenceRules")(recurrenceRules)
    __obj.updateDynamic("refresh")(refresh)
    __obj.updateDynamic("reminders")(reminders)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removeRecurrenceRule")(removeRecurrenceRule)
    __obj.updateDynamic("save")(save)
    __obj.updateDynamic("setAlerts")(setAlerts)
    __obj.updateDynamic("setAllDay")(setAllDay)
    __obj.updateDynamic("setBegin")(setBegin)
    __obj.updateDynamic("setBubbleParent")(setBubbleParent)
    __obj.updateDynamic("setEnd")(setEnd)
    __obj.updateDynamic("setExtendedProperty")(setExtendedProperty)
    __obj.updateDynamic("setLocation")(setLocation)
    __obj.updateDynamic("setNotes")(setNotes)
    __obj.updateDynamic("setRecurrenceRules")(setRecurrenceRules)
    __obj.updateDynamic("setTitle")(setTitle)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("visibility")(visibility)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Event]
  }
}

