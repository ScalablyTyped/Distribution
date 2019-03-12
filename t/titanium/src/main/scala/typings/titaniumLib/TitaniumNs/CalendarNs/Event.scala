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
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    addRecurrenceRule: RecurrenceRule => scala.Unit,
    alerts: js.Array[Alert],
    allDay: scala.Boolean,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    attendees: js.Array[Attendee],
    availability: scala.Double,
    begin: stdLib.Date,
    bubbleParent: scala.Boolean,
    createAlert: js.Any => Alert,
    createRecurrenceRule: js.Any => RecurrenceRule,
    createReminder: js.Any => Reminder,
    description: java.lang.String,
    end: stdLib.Date,
    extendedProperties: js.Any,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    getAlerts: () => js.Array[Alert],
    getAllDay: () => scala.Boolean,
    getApiName: () => java.lang.String,
    getAttendees: () => js.Array[Attendee],
    getAvailability: () => scala.Double,
    getBegin: () => stdLib.Date,
    getBubbleParent: () => scala.Boolean,
    getDescription: () => java.lang.String,
    getEnd: () => stdLib.Date,
    getExtendedProperties: () => js.Any,
    getExtendedProperty: java.lang.String => java.lang.String,
    getHasAlarm: () => scala.Boolean,
    getId: () => java.lang.String,
    getIsDetached: () => scala.Boolean,
    getLocation: () => java.lang.String,
    getNotes: () => java.lang.String,
    getRecurrenceRules: () => js.Array[RecurrenceRule],
    getReminders: () => js.Array[Reminder],
    getStatus: () => scala.Double,
    getTitle: () => java.lang.String,
    getVisibility: () => scala.Double,
    hasAlarm: scala.Boolean,
    id: java.lang.String,
    isDetached: scala.Boolean,
    location: java.lang.String,
    notes: java.lang.String,
    recurrenceRules: js.Array[RecurrenceRule],
    refresh: () => scala.Boolean,
    reminders: js.Array[Reminder],
    remove: scala.Double => scala.Boolean,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    removeRecurrenceRule: RecurrenceRule => scala.Unit,
    save: scala.Double => scala.Boolean,
    setAlerts: js.Array[Alert] => scala.Unit,
    setAllDay: scala.Boolean => scala.Unit,
    setBegin: stdLib.Date => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit,
    setEnd: stdLib.Date => scala.Unit,
    setExtendedProperty: (java.lang.String, java.lang.String) => scala.Unit,
    setLocation: java.lang.String => scala.Unit,
    setNotes: java.lang.String => scala.Unit,
    setRecurrenceRules: js.Array[RecurrenceRule] => scala.Unit,
    setTitle: java.lang.String => scala.Unit,
    status: scala.Double,
    title: java.lang.String,
    visibility: scala.Double,
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): Event = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), addRecurrenceRule = js.Any.fromFunction1(addRecurrenceRule), alerts = alerts, allDay = allDay, apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), attendees = attendees, availability = availability, begin = begin, bubbleParent = bubbleParent, createAlert = js.Any.fromFunction1(createAlert), createRecurrenceRule = js.Any.fromFunction1(createRecurrenceRule), createReminder = js.Any.fromFunction1(createReminder), description = description, end = end, extendedProperties = extendedProperties, fireEvent = js.Any.fromFunction2(fireEvent), getAlerts = js.Any.fromFunction0(getAlerts), getAllDay = js.Any.fromFunction0(getAllDay), getApiName = js.Any.fromFunction0(getApiName), getAttendees = js.Any.fromFunction0(getAttendees), getAvailability = js.Any.fromFunction0(getAvailability), getBegin = js.Any.fromFunction0(getBegin), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getDescription = js.Any.fromFunction0(getDescription), getEnd = js.Any.fromFunction0(getEnd), getExtendedProperties = js.Any.fromFunction0(getExtendedProperties), getExtendedProperty = js.Any.fromFunction1(getExtendedProperty), getHasAlarm = js.Any.fromFunction0(getHasAlarm), getId = js.Any.fromFunction0(getId), getIsDetached = js.Any.fromFunction0(getIsDetached), getLocation = js.Any.fromFunction0(getLocation), getNotes = js.Any.fromFunction0(getNotes), getRecurrenceRules = js.Any.fromFunction0(getRecurrenceRules), getReminders = js.Any.fromFunction0(getReminders), getStatus = js.Any.fromFunction0(getStatus), getTitle = js.Any.fromFunction0(getTitle), getVisibility = js.Any.fromFunction0(getVisibility), hasAlarm = hasAlarm, id = id, isDetached = isDetached, location = location, notes = notes, recurrenceRules = recurrenceRules, refresh = js.Any.fromFunction0(refresh), reminders = reminders, remove = js.Any.fromFunction1(remove), removeEventListener = js.Any.fromFunction2(removeEventListener), removeRecurrenceRule = js.Any.fromFunction1(removeRecurrenceRule), save = js.Any.fromFunction1(save), setAlerts = js.Any.fromFunction1(setAlerts), setAllDay = js.Any.fromFunction1(setAllDay), setBegin = js.Any.fromFunction1(setBegin), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setEnd = js.Any.fromFunction1(setEnd), setExtendedProperty = js.Any.fromFunction2(setExtendedProperty), setLocation = js.Any.fromFunction1(setLocation), setNotes = js.Any.fromFunction1(setNotes), setRecurrenceRules = js.Any.fromFunction1(setRecurrenceRules), setTitle = js.Any.fromFunction1(setTitle), status = status, title = title, visibility = visibility)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Event]
  }
}

