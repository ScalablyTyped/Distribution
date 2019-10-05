package typings.titanium.Titanium.Calendar

import typings.std.Date
import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An object that represents a single event in a calendar.
		 */
trait Event extends Proxy {
  /**
  			 * Alarms associated with the calendar item, as an array of <Titanium.Calendar.Alert> objects.
  			 */
  var alerts: js.Array[Alert]
  /**
  			 * Indicates whether this event is all day.
  			 */
  var allDay: Boolean
  /**
  			 * The list of event attendees. This list will be empty if the event has no attendees.
  			 */
  val attendees: js.Array[Attendee]
  /**
  			 * Availability of this event.
  			 */
  val availability: Double
  /**
  			 * Start date/time of this event.
  			 */
  var begin: Date
  /**
  			 * Description of this event.
  			 */
  val description: String
  /**
  			 * End date/time of this event.
  			 */
  var end: Date
  /**
  			 * Extended properties of this event.
  			 */
  val extendedProperties: js.Any
  /**
  			 * Indicates whether an alarm is scheduled for this event.
  			 */
  val hasAlarm: Boolean
  /**
  			 * Identifier of this event.
  			 */
  val id: String
  /**
  			 * Boolean value that indicates whether an event is a detached instance of a
  			 * repeating event.
  			 */
  val isDetached: Boolean
  /**
  			 * Location of this event.
  			 */
  var location: String
  /**
  			 * Notes for this event.
  			 */
  var notes: String
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
  val status: Double
  /**
  			 * Title of this event.
  			 */
  var title: String
  /**
  			 * Visibility of this event.
  			 */
  val visibility: Double
  /**
  			 * Adds a recurrence rule to the recurrence rule array.
  			 */
  def addRecurrenceRule(rule: RecurrenceRule): Unit
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
  def getAllDay(): Boolean
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.attendees> property.
  			 */
  def getAttendees(): js.Array[Attendee]
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.availability> property.
  			 */
  def getAvailability(): Double
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.begin> property.
  			 */
  def getBegin(): Date
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.description> property.
  			 */
  def getDescription(): String
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.end> property.
  			 */
  def getEnd(): Date
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.extendedProperties> property.
  			 */
  def getExtendedProperties(): js.Any
  /**
  			 * Gets the value of the specified extended property.
  			 */
  def getExtendedProperty(name: String): String
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.hasAlarm> property.
  			 */
  def getHasAlarm(): Boolean
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.id> property.
  			 */
  def getId(): String
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.isDetached> property.
  			 */
  def getIsDetached(): Boolean
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.location> property.
  			 */
  def getLocation(): String
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.notes> property.
  			 */
  def getNotes(): String
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
  def getStatus(): Double
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.title> property.
  			 */
  def getTitle(): String
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.visibility> property.
  			 */
  def getVisibility(): Double
  /**
  			 * Updates the event's data with the current information in the Calendar database.
  			 */
  def refresh(): Boolean
  /**
  			 * Removes an event from the event store.
  			 */
  def remove(span: Double): Boolean
  /**
  			 * Removes a recurrence rule to the recurrence rule array.
  			 */
  def removeRecurrenceRule(rule: RecurrenceRule): Unit
  /**
  			 * Saves changes to an event permanently.
  			 */
  def save(span: Double): Boolean
  /**
  			 * Sets the value of the <Titanium.Calendar.Event.alerts> property.
  			 */
  def setAlerts(alerts: js.Array[Alert]): Unit
  /**
  			 * Sets the value of the <Titanium.Calendar.Event.allDay> property.
  			 */
  def setAllDay(allDay: Boolean): Unit
  /**
  			 * Sets the value of the <Titanium.Calendar.Event.begin> property.
  			 */
  def setBegin(begin: Date): Unit
  /**
  			 * Sets the value of the <Titanium.Calendar.Event.end> property.
  			 */
  def setEnd(end: Date): Unit
  /**
  			 * Sets the value of the specified extended property.
  			 */
  def setExtendedProperty(name: String, value: String): Unit
  /**
  			 * Sets the value of the <Titanium.Calendar.Event.location> property.
  			 */
  def setLocation(location: String): Unit
  /**
  			 * Sets the value of the <Titanium.Calendar.Event.notes> property.
  			 */
  def setNotes(notes: String): Unit
  /**
  			 * Sets the value of the <Titanium.Calendar.Event.recurrenceRules> property.
  			 */
  def setRecurrenceRules(recurrenceRules: js.Array[RecurrenceRule]): Unit
  /**
  			 * Sets the value of the <Titanium.Calendar.Event.title> property.
  			 */
  def setTitle(title: String): Unit
}

object Event {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    addRecurrenceRule: RecurrenceRule => Unit,
    alerts: js.Array[Alert],
    allDay: Boolean,
    apiName: String,
    applyProperties: js.Any => Unit,
    attendees: js.Array[Attendee],
    availability: Double,
    begin: Date,
    bubbleParent: Boolean,
    createAlert: js.Any => Alert,
    createRecurrenceRule: js.Any => RecurrenceRule,
    createReminder: js.Any => Reminder,
    description: String,
    end: Date,
    extendedProperties: js.Any,
    fireEvent: (String, js.Any) => Unit,
    getAlerts: () => js.Array[Alert],
    getAllDay: () => Boolean,
    getApiName: () => String,
    getAttendees: () => js.Array[Attendee],
    getAvailability: () => Double,
    getBegin: () => Date,
    getBubbleParent: () => Boolean,
    getDescription: () => String,
    getEnd: () => Date,
    getExtendedProperties: () => js.Any,
    getExtendedProperty: String => String,
    getHasAlarm: () => Boolean,
    getId: () => String,
    getIsDetached: () => Boolean,
    getLocation: () => String,
    getNotes: () => String,
    getRecurrenceRules: () => js.Array[RecurrenceRule],
    getReminders: () => js.Array[Reminder],
    getStatus: () => Double,
    getTitle: () => String,
    getVisibility: () => Double,
    hasAlarm: Boolean,
    id: String,
    isDetached: Boolean,
    location: String,
    notes: String,
    recurrenceRules: js.Array[RecurrenceRule],
    refresh: () => Boolean,
    reminders: js.Array[Reminder],
    remove: Double => Boolean,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    removeRecurrenceRule: RecurrenceRule => Unit,
    save: Double => Boolean,
    setAlerts: js.Array[Alert] => Unit,
    setAllDay: Boolean => Unit,
    setBegin: Date => Unit,
    setBubbleParent: Boolean => Unit,
    setEnd: Date => Unit,
    setExtendedProperty: (String, String) => Unit,
    setLocation: String => Unit,
    setNotes: String => Unit,
    setRecurrenceRules: js.Array[RecurrenceRule] => Unit,
    setTitle: String => Unit,
    status: Double,
    title: String,
    visibility: Double,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): Event = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), addRecurrenceRule = js.Any.fromFunction1(addRecurrenceRule), alerts = alerts, allDay = allDay, apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), attendees = attendees, availability = availability, begin = begin, bubbleParent = bubbleParent, createAlert = js.Any.fromFunction1(createAlert), createRecurrenceRule = js.Any.fromFunction1(createRecurrenceRule), createReminder = js.Any.fromFunction1(createReminder), description = description, end = end, extendedProperties = extendedProperties, fireEvent = js.Any.fromFunction2(fireEvent), getAlerts = js.Any.fromFunction0(getAlerts), getAllDay = js.Any.fromFunction0(getAllDay), getApiName = js.Any.fromFunction0(getApiName), getAttendees = js.Any.fromFunction0(getAttendees), getAvailability = js.Any.fromFunction0(getAvailability), getBegin = js.Any.fromFunction0(getBegin), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getDescription = js.Any.fromFunction0(getDescription), getEnd = js.Any.fromFunction0(getEnd), getExtendedProperties = js.Any.fromFunction0(getExtendedProperties), getExtendedProperty = js.Any.fromFunction1(getExtendedProperty), getHasAlarm = js.Any.fromFunction0(getHasAlarm), getId = js.Any.fromFunction0(getId), getIsDetached = js.Any.fromFunction0(getIsDetached), getLocation = js.Any.fromFunction0(getLocation), getNotes = js.Any.fromFunction0(getNotes), getRecurrenceRules = js.Any.fromFunction0(getRecurrenceRules), getReminders = js.Any.fromFunction0(getReminders), getStatus = js.Any.fromFunction0(getStatus), getTitle = js.Any.fromFunction0(getTitle), getVisibility = js.Any.fromFunction0(getVisibility), hasAlarm = hasAlarm, id = id, isDetached = isDetached, location = location, notes = notes, recurrenceRules = recurrenceRules, refresh = js.Any.fromFunction0(refresh), reminders = reminders, remove = js.Any.fromFunction1(remove), removeEventListener = js.Any.fromFunction2(removeEventListener), removeRecurrenceRule = js.Any.fromFunction1(removeRecurrenceRule), save = js.Any.fromFunction1(save), setAlerts = js.Any.fromFunction1(setAlerts), setAllDay = js.Any.fromFunction1(setAllDay), setBegin = js.Any.fromFunction1(setBegin), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setEnd = js.Any.fromFunction1(setEnd), setExtendedProperty = js.Any.fromFunction2(setExtendedProperty), setLocation = js.Any.fromFunction1(setLocation), setNotes = js.Any.fromFunction1(setNotes), setRecurrenceRules = js.Any.fromFunction1(setRecurrenceRules), setTitle = js.Any.fromFunction1(setTitle), status = status, title = title, visibility = visibility)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Event]
  }
}

