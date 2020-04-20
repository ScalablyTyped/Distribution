package typings.titanium.Titanium

import typings.std.Date
import typings.titanium.Dictionary
import typings.titanium.EventsAuthorizationResponse
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import typings.titanium.daysOfTheWeekDictionary
import typings.titanium.recurrenceEndDictionary
import typings.titanium.titaniumStrings.change
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The Calendar module provides an API for accessing the native calendar functionality.
	 */
@JSGlobal("Titanium.Calendar")
@js.native
class Calendar () extends Module

/**
	 * The Calendar module provides an API for accessing the native calendar functionality.
	 */
/* static members */
@JSGlobal("Titanium.Calendar")
@js.native
object Calendar extends js.Object {
  /**
  		 * An object that represents a single alert for an event in an calendar.
  		 */
  @js.native
  class Alert () extends Proxy {
    /**
    			 * The absolute date for the alarm.
    			 */
    var absoluteDate: Date = js.native
    /**
    			 * Date/time at which this alert alarm is set to trigger.
    			 */
    val alarmTime: Date = js.native
    /**
    			 * Start date/time for the corresponding event.
    			 */
    val begin: Date = js.native
    /**
    			 * End date/time for the corresponding event.
    			 */
    val end: Date = js.native
    /**
    			 * Identifier of the event for which this alert is set.
    			 */
    val eventId: Double = js.native
    /**
    			 * Identifier of this alert.
    			 */
    @JSName("id")
    val id_Alert: String = js.native
    /**
    			 * Reminder notice period in minutes, that determines how long prior to the event this alert
    			 * should trigger.
    			 */
    val minutes: Double = js.native
    /**
    			 * The offset from the start of an event, at which the alarm fires.
    			 */
    var relativeOffset: Double = js.native
    /**
    			 * The current state of the alert.
    			 */
    val state: Double = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Alert.absoluteDate> property.
    			 * @deprecated Access <Titanium.Calendar.Alert.absoluteDate> instead.
    			 */
    def getAbsoluteDate(): Date = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Alert.alarmTime> property.
    			 * @deprecated Access <Titanium.Calendar.Alert.alarmTime> instead.
    			 */
    def getAlarmTime(): Date = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Alert.begin> property.
    			 * @deprecated Access <Titanium.Calendar.Alert.begin> instead.
    			 */
    def getBegin(): Date = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Alert.end> property.
    			 * @deprecated Access <Titanium.Calendar.Alert.end> instead.
    			 */
    def getEnd(): Date = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Alert.eventId> property.
    			 * @deprecated Access <Titanium.Calendar.Alert.eventId> instead.
    			 */
    def getEventId(): Double = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Alert.id> property.
    			 * @deprecated Access <Titanium.Calendar.Alert.id> instead.
    			 */
    def getId(): String = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Alert.minutes> property.
    			 * @deprecated Access <Titanium.Calendar.Alert.minutes> instead.
    			 */
    def getMinutes(): Double = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Alert.relativeOffset> property.
    			 * @deprecated Access <Titanium.Calendar.Alert.relativeOffset> instead.
    			 */
    def getRelativeOffset(): Double = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Alert.state> property.
    			 * @deprecated Access <Titanium.Calendar.Alert.state> instead.
    			 */
    def getState(): Double = js.native
    /**
    			 * Sets the value of the <Titanium.Calendar.Alert.absoluteDate> property.
    			 * @deprecated Set the value using <Titanium.Calendar.Alert.absoluteDate> instead.
    			 */
    def setAbsoluteDate(absoluteDate: Date): Unit = js.native
    /**
    			 * Sets the value of the <Titanium.Calendar.Alert.relativeOffset> property.
    			 * @deprecated Set the value using <Titanium.Calendar.Alert.relativeOffset> instead.
    			 */
    def setRelativeOffset(relativeOffset: Double): Unit = js.native
  }
  
  /**
  		 * An object that represents a single attendee of an event.
  		 */
  @js.native
  class Attendee () extends Proxy {
    /**
    			 * The attendee email.
    			 */
    val email: String = js.native
    /**
    			 * Indicates whether this attendee is the event organizer.
    			 */
    val isOrganizer: Boolean = js.native
    /**
    			 * The attendee name.
    			 */
    val name: String = js.native
    /**
    			 * The role of the attendee.
    			 */
    val role: Double = js.native
    /**
    			 * The status of the attendee.
    			 */
    val status: Double = js.native
    /**
    			 * The type of the attendee.
    			 */
    val `type`: Double = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Attendee.email> property.
    			 * @deprecated Access <Titanium.Calendar.Attendee.email> instead.
    			 */
    def getEmail(): String = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Attendee.isOrganizer> property.
    			 * @deprecated Access <Titanium.Calendar.Attendee.isOrganizer> instead.
    			 */
    def getIsOrganizer(): Boolean = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Attendee.name> property.
    			 * @deprecated Access <Titanium.Calendar.Attendee.name> instead.
    			 */
    def getName(): String = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Attendee.role> property.
    			 * @deprecated Access <Titanium.Calendar.Attendee.role> instead.
    			 */
    def getRole(): Double = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Attendee.status> property.
    			 * @deprecated Access <Titanium.Calendar.Attendee.status> instead.
    			 */
    def getStatus(): Double = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Attendee.type> property.
    			 * @deprecated Access <Titanium.Calendar.Attendee.type> instead.
    			 */
    def getType(): Double = js.native
  }
  
  /**
  		 * An object that represents a single calendar.
  		 */
  @js.native
  class Calendar () extends Proxy {
    /**
    			 * Indicates whether this calendar can be edited or deleted.
    			 */
    val hidden: Boolean = js.native
    /**
    			 * Identifier of this calendar.
    			 */
    @JSName("id")
    val id_Calendar: String = js.native
    /**
    			 * Display name of this calendar.
    			 */
    val name: String = js.native
    /**
    			 * Indicates whether the calendar is selected.
    			 */
    val selected: Boolean = js.native
    /**
    			 * Displays the source identifier.
    			 */
    val sourceIdentifier: String = js.native
    /**
    			 * Displays the source title.
    			 */
    val sourceTitle: String = js.native
    /**
    			 * Displays the source type.
    			 */
    val sourceType: Double = js.native
    /**
    			 * Creates an event in this calendar.
    			 */
    def createEvent(properties: Dictionary[typings.titanium.Titanium.Calendar.Event]): typings.titanium.Titanium.Calendar.Event = js.native
    /**
    			 * Gets the event with the specified identifier.
    			 */
    def getEventById(id: String): typings.titanium.Titanium.Calendar.Event = js.native
    def getEventsBetweenDates(date1: String, date2: String): js.Array[typings.titanium.Titanium.Calendar.Event] = js.native
    def getEventsBetweenDates(date1: String, date2: Date): js.Array[typings.titanium.Titanium.Calendar.Event] = js.native
    def getEventsBetweenDates(date1: Date, date2: String): js.Array[typings.titanium.Titanium.Calendar.Event] = js.native
    /**
    			 * Gets events that occur between two dates.
    			 */
    def getEventsBetweenDates(date1: Date, date2: Date): js.Array[typings.titanium.Titanium.Calendar.Event] = js.native
    /**
    			 * Gets events that occur on a specified date.
    			 * @deprecated Use [Titanium.Calendar.Calendar.getEventsBetweenDates](Titanium.Calendar.Calendar.getEventsBetweenDates) instead.
    			 */
    def getEventsInDate(year: Double, month: Double, day: Double): js.Array[typings.titanium.Titanium.Calendar.Event] = js.native
    /**
    			 * Gets events that occur during a specified month.
    			 * @deprecated Use [Titanium.Calendar.Calendar.getEventsBetweenDates](Titanium.Calendar.Calendar.getEventsBetweenDates) instead.
    			 */
    def getEventsInMonth(year: Double, month: Double): js.Array[typings.titanium.Titanium.Calendar.Event] = js.native
    /**
    			 * Gets all events that occur during a specified year.
    			 * @deprecated Use [Titanium.Calendar.Calendar.getEventsBetweenDates](Titanium.Calendar.Calendar.getEventsBetweenDates) instead.
    			 */
    def getEventsInYear(year: Double): js.Array[typings.titanium.Titanium.Calendar.Event] = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Calendar.hidden> property.
    			 * @deprecated Access <Titanium.Calendar.Calendar.hidden> instead.
    			 */
    def getHidden(): Boolean = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Calendar.id> property.
    			 * @deprecated Access <Titanium.Calendar.Calendar.id> instead.
    			 */
    def getId(): String = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Calendar.name> property.
    			 * @deprecated Access <Titanium.Calendar.Calendar.name> instead.
    			 */
    def getName(): String = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Calendar.selected> property.
    			 * @deprecated Access <Titanium.Calendar.Calendar.selected> instead.
    			 */
    def getSelected(): Boolean = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Calendar.sourceIdentifier> property.
    			 * @deprecated Access <Titanium.Calendar.Calendar.sourceIdentifier> instead.
    			 */
    def getSourceIdentifier(): String = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Calendar.sourceTitle> property.
    			 * @deprecated Access <Titanium.Calendar.Calendar.sourceTitle> instead.
    			 */
    def getSourceTitle(): String = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Calendar.sourceType> property.
    			 * @deprecated Access <Titanium.Calendar.Calendar.sourceType> instead.
    			 */
    def getSourceType(): Double = js.native
  }
  
  /**
  		 * An object that represents a single event in a calendar.
  		 */
  @js.native
  class Event () extends Proxy {
    /**
    			 * Alarms associated with the calendar item, as an array of <Titanium.Calendar.Alert> objects.
    			 */
    var alerts: js.Array[Alert] = js.native
    /**
    			 * Indicates whether this event is all day.
    			 */
    var allDay: Boolean = js.native
    /**
    			 * The list of event attendees. This list will be empty if the event has no attendees.
    			 */
    val attendees: js.Array[Attendee] = js.native
    /**
    			 * Availability of this event.
    			 */
    var availability: Double = js.native
    /**
    			 * Start date/time of this event.
    			 */
    var begin: Date = js.native
    /**
    			 * Description of this event.
    			 */
    val description: String = js.native
    /**
    			 * End date/time of this event.
    			 */
    var end: Date = js.native
    /**
    			 * Extended properties of this event.
    			 */
    val extendedProperties: js.Any = js.native
    /**
    			 * Indicates whether an alarm is scheduled for this event.
    			 */
    val hasAlarm: Boolean = js.native
    /**
    			 * Identifier of this event.
    			 */
    @JSName("id")
    val id_Event: String = js.native
    /**
    			 * Boolean value that indicates whether an event is a detached instance of a
    			 * repeating event.
    			 */
    val isDetached: Boolean = js.native
    /**
    			 * Location of this event.
    			 */
    var location: String = js.native
    /**
    			 * Notes for this event.
    			 */
    var notes: String = js.native
    /**
    			 * The recurrence rules for the calendar item.
    			 */
    var recurrenceRules: js.Array[RecurrenceRule] = js.native
    /**
    			 * Existing reminders for this event.
    			 */
    val reminders: js.Array[Reminder] = js.native
    /**
    			 * Status of this event.
    			 */
    val status: Double = js.native
    /**
    			 * Title of this event.
    			 */
    var title: String = js.native
    /**
    			 * Visibility of this event.
    			 */
    val visibility: Double = js.native
    /**
    			 * Adds a recurrence rule to the recurrence rule array.
    			 */
    def addRecurrenceRule(rule: RecurrenceRule): Unit = js.native
    /**
    			 * Creates an alert for this event.
    			 */
    def createAlert(data: Dictionary[Alert]): Alert = js.native
    /**
    			 * Creates an recurrence pattern for a recurring event.
    			 * All of the properties for the recurrence rule must be set during creation.
    			 * The recurrence rule properties cannot be modified.
    			 */
    def createRecurrenceRule(data: Dictionary[RecurrenceRule]): RecurrenceRule = js.native
    /**
    			 * Creates a reminder for this event.
    			 */
    def createReminder(data: Dictionary[Reminder]): Reminder = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Event.alerts> property.
    			 * @deprecated Access <Titanium.Calendar.Event.alerts> instead.
    			 */
    def getAlerts(): js.Array[Alert] = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Event.allDay> property.
    			 * @deprecated Access <Titanium.Calendar.Event.allDay> instead.
    			 */
    def getAllDay(): Boolean = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Event.attendees> property.
    			 * @deprecated Access <Titanium.Calendar.Event.attendees> instead.
    			 */
    def getAttendees(): js.Array[Attendee] = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Event.availability> property.
    			 * @deprecated Access <Titanium.Calendar.Event.availability> instead.
    			 */
    def getAvailability(): Double = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Event.begin> property.
    			 * @deprecated Access <Titanium.Calendar.Event.begin> instead.
    			 */
    def getBegin(): Date = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Event.description> property.
    			 * @deprecated Access <Titanium.Calendar.Event.description> instead.
    			 */
    def getDescription(): String = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Event.end> property.
    			 * @deprecated Access <Titanium.Calendar.Event.end> instead.
    			 */
    def getEnd(): Date = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Event.extendedProperties> property.
    			 * @deprecated Access <Titanium.Calendar.Event.extendedProperties> instead.
    			 */
    def getExtendedProperties(): js.Any = js.native
    /**
    			 * Gets the value of the specified extended property.
    			 */
    def getExtendedProperty(name: String): String = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Event.hasAlarm> property.
    			 * @deprecated Access <Titanium.Calendar.Event.hasAlarm> instead.
    			 */
    def getHasAlarm(): Boolean = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Event.id> property.
    			 * @deprecated Access <Titanium.Calendar.Event.id> instead.
    			 */
    def getId(): String = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Event.isDetached> property.
    			 * @deprecated Access <Titanium.Calendar.Event.isDetached> instead.
    			 */
    def getIsDetached(): Boolean = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Event.location> property.
    			 * @deprecated Access <Titanium.Calendar.Event.location> instead.
    			 */
    def getLocation(): String = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Event.notes> property.
    			 * @deprecated Access <Titanium.Calendar.Event.notes> instead.
    			 */
    def getNotes(): String = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Event.recurrenceRules> property.
    			 * @deprecated Access <Titanium.Calendar.Event.recurrenceRules> instead.
    			 */
    def getRecurrenceRules(): js.Array[RecurrenceRule] = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Event.reminders> property.
    			 * @deprecated Access <Titanium.Calendar.Event.reminders> instead.
    			 */
    def getReminders(): js.Array[Reminder] = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Event.status> property.
    			 * @deprecated Access <Titanium.Calendar.Event.status> instead.
    			 */
    def getStatus(): Double = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Event.title> property.
    			 * @deprecated Access <Titanium.Calendar.Event.title> instead.
    			 */
    def getTitle(): String = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Event.visibility> property.
    			 * @deprecated Access <Titanium.Calendar.Event.visibility> instead.
    			 */
    def getVisibility(): Double = js.native
    /**
    			 * Updates the event's data with the current information in the Calendar database.
    			 */
    def refresh(): Boolean = js.native
    /**
    			 * Removes an event from the event store.
    			 */
    def remove(span: Double): Boolean = js.native
    /**
    			 * Removes a recurrence rule to the recurrence rule array.
    			 */
    def removeRecurrenceRule(rule: RecurrenceRule): Unit = js.native
    /**
    			 * Saves changes to an event permanently.
    			 */
    def save(span: Double): Boolean = js.native
    /**
    			 * Sets the value of the <Titanium.Calendar.Event.alerts> property.
    			 * @deprecated Set the value using <Titanium.Calendar.Event.alerts> instead.
    			 */
    def setAlerts(alerts: js.Array[Alert]): Unit = js.native
    /**
    			 * Sets the value of the <Titanium.Calendar.Event.allDay> property.
    			 * @deprecated Set the value using <Titanium.Calendar.Event.allDay> instead.
    			 */
    def setAllDay(allDay: Boolean): Unit = js.native
    /**
    			 * Sets the value of the <Titanium.Calendar.Event.availability> property.
    			 * @deprecated Set the value using <Titanium.Calendar.Event.availability> instead.
    			 */
    def setAvailability(availability: Double): Unit = js.native
    /**
    			 * Sets the value of the <Titanium.Calendar.Event.begin> property.
    			 * @deprecated Set the value using <Titanium.Calendar.Event.begin> instead.
    			 */
    def setBegin(begin: Date): Unit = js.native
    /**
    			 * Sets the value of the <Titanium.Calendar.Event.end> property.
    			 * @deprecated Set the value using <Titanium.Calendar.Event.end> instead.
    			 */
    def setEnd(end: Date): Unit = js.native
    /**
    			 * Sets the value of the specified extended property.
    			 */
    def setExtendedProperty(name: String, value: String): Unit = js.native
    /**
    			 * Sets the value of the <Titanium.Calendar.Event.location> property.
    			 * @deprecated Set the value using <Titanium.Calendar.Event.location> instead.
    			 */
    def setLocation(location: String): Unit = js.native
    /**
    			 * Sets the value of the <Titanium.Calendar.Event.notes> property.
    			 * @deprecated Set the value using <Titanium.Calendar.Event.notes> instead.
    			 */
    def setNotes(notes: String): Unit = js.native
    /**
    			 * Sets the value of the <Titanium.Calendar.Event.recurrenceRules> property.
    			 * @deprecated Set the value using <Titanium.Calendar.Event.recurrenceRules> instead.
    			 */
    def setRecurrenceRules(recurrenceRules: js.Array[RecurrenceRule]): Unit = js.native
    /**
    			 * Sets the value of the <Titanium.Calendar.Event.title> property.
    			 * @deprecated Set the value using <Titanium.Calendar.Event.title> instead.
    			 */
    def setTitle(title: String): Unit = js.native
  }
  
  /**
  		 * An object that is used to describe the recurrence pattern for a recurring event.
  		 */
  @js.native
  class RecurrenceRule () extends Proxy {
    /**
    			 * Identifier for the recurrence rule's calendar.
    			 */
    val calendarID: String = js.native
    /**
    			 * The days of the month that the event occurs, as an array of number objects.
    			 * Values can be from 1 to 31 and from -1 to -31. This parameter is only valid for
    			 * recurrence rules of type
    			 * [RECURRENCEFREQUENCY_MONTHLY](Titanium.Calendar.RECURRENCEFREQUENCY_MONTHLY).
    			 */
    val daysOfTheMonth: js.Array[Double] = js.native
    /**
    			 * The days of the week that the event occurs, as an array of objects `daysOfWeek` and `Week`.
    			 */
    val daysOfTheWeek: js.Array[daysOfTheWeekDictionary] = js.native
    /**
    			 * The days of the year that the event occurs, as an array of number objects.
    			 * Values can be from 1 to 366 and from -1 to -366. This parameter is only valid for
    			 * recurrence rules of type [RECURRENCEFREQUENCY_YEARLY](Titanium.Calendar.RECURRENCEFREQUENCY_YEARLY).
    			 */
    val daysOfTheYear: js.Array[Double] = js.native
    /**
    			 * End of a recurrence rule.
    			 */
    val end: recurrenceEndDictionary = js.native
    /**
    			 * Frequency of the recurrence rule.
    			 */
    val frequency: Double = js.native
    /**
    			 * The interval between instances of this recurrence. For example, a weekly
    			 * recurrence rule with an interval of 2 occurs every other week. Must be greater than 0.
    			 */
    val interval: Double = js.native
    /**
    			 * The months of the year that the event occurs, as an array of Number objects.
    			 * Values can be from 1 to 12. This parameter is only valid for recurrence rules of
    			 * type [RECURRENCEFREQUENCY_YEARLY](Titanium.Calendar.RECURRENCEFREQUENCY_YEARLY).
    			 */
    val monthsOfTheYear: js.Array[Double] = js.native
    /**
    			 * An array of ordinal numbers that filters which recurrences to include in the
    			 * recurrence rule's frequency. For example, a yearly recurrence rule that has a
    			 * [daysOfTheWeek](Titanium.Calendar.RecurrenceRule.daysOfTheWeek) value that specifies
    			 * Monday through Friday, and a `setPositions` array containing 2 and -1, occurs only
    			 * on the second weekday and last weekday of every year.
    			 */
    val setPositions: js.Array[Double] = js.native
    /**
    			 * The weeks of the year that the event occurs, as an array of number objects.
    			 * Values can be from 1 to 53 and from -1 to -53. This parameter is only valid for
    			 * recurrence rules of type [RECURRENCEFREQUENCY_YEARLY](Titanium.Calendar.RECURRENCEFREQUENCY_YEARLY).
    			 */
    val weeksOfTheYear: js.Array[Double] = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.calendarID> property.
    			 * @deprecated Access <Titanium.Calendar.RecurrenceRule.calendarID> instead.
    			 */
    def getCalendarID(): String = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.daysOfTheMonth> property.
    			 * @deprecated Access <Titanium.Calendar.RecurrenceRule.daysOfTheMonth> instead.
    			 */
    def getDaysOfTheMonth(): js.Array[Double] = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.daysOfTheWeek> property.
    			 * @deprecated Access <Titanium.Calendar.RecurrenceRule.daysOfTheWeek> instead.
    			 */
    def getDaysOfTheWeek(): js.Array[daysOfTheWeekDictionary] = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.daysOfTheYear> property.
    			 * @deprecated Access <Titanium.Calendar.RecurrenceRule.daysOfTheYear> instead.
    			 */
    def getDaysOfTheYear(): js.Array[Double] = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.end> property.
    			 * @deprecated Access <Titanium.Calendar.RecurrenceRule.end> instead.
    			 */
    def getEnd(): recurrenceEndDictionary = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.frequency> property.
    			 * @deprecated Access <Titanium.Calendar.RecurrenceRule.frequency> instead.
    			 */
    def getFrequency(): Double = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.interval> property.
    			 * @deprecated Access <Titanium.Calendar.RecurrenceRule.interval> instead.
    			 */
    def getInterval(): Double = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.monthsOfTheYear> property.
    			 * @deprecated Access <Titanium.Calendar.RecurrenceRule.monthsOfTheYear> instead.
    			 */
    def getMonthsOfTheYear(): js.Array[Double] = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.setPositions> property.
    			 * @deprecated Access <Titanium.Calendar.RecurrenceRule.setPositions> instead.
    			 */
    def getSetPositions(): js.Array[Double] = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.weeksOfTheYear> property.
    			 * @deprecated Access <Titanium.Calendar.RecurrenceRule.weeksOfTheYear> instead.
    			 */
    def getWeeksOfTheYear(): js.Array[Double] = js.native
  }
  
  /**
  		 * An object that represents a single reminder for an event in a calendar.
  		 */
  @js.native
  class Reminder () extends Proxy {
    /**
    			 * Identifier of this reminder.
    			 */
    @JSName("id")
    val id_Reminder: String = js.native
    /**
    			 * Method by which this reminder will be delivered.
    			 */
    val method: Double = js.native
    /**
    			 * Reminder notice period in minutes, that determines how long prior to the event this reminder
    			 * should trigger.
    			 */
    val minutes: Double = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Reminder.id> property.
    			 * @deprecated Access <Titanium.Calendar.Reminder.id> instead.
    			 */
    def getId(): String = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Reminder.method> property.
    			 * @deprecated Access <Titanium.Calendar.Reminder.method> instead.
    			 */
    def getMethod(): Double = js.native
    /**
    			 * Gets the value of the <Titanium.Calendar.Reminder.minutes> property.
    			 * @deprecated Access <Titanium.Calendar.Reminder.minutes> instead.
    			 */
    def getMinutes(): Double = js.native
  }
  
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
  		 * All alerts in selected calendars.
  		 */
  val allAlerts: js.Array[Alert] = js.native
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
  		 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  		 */
  var lifecycleContainer: Window | TabGroup = js.native
  /**
  		 * All calendars selected within the native calendar app, which may be a subset of `allCalendars`.
  		 */
  val selectableCalendars: js.Array[typings.titanium.Titanium.Calendar.Calendar] = js.native
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
  		 * Applies the properties to the proxy.
  		 */
  def applyProperties(props: js.Any): Unit = js.native
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
  def getAllAlerts(): js.Array[Alert] = js.native
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
}

