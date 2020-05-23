package typings.titanium.Titanium

import typings.std.Date
import typings.titanium.Dictionary
import typings.titanium.daysOfTheWeekDictionary
import typings.titanium.recurrenceEndDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Calendar module provides an API for accessing the native calendar functionality.
  */
@JSGlobal("Titanium.Calendar")
@js.native
object Calendar extends js.Object {
  /**
    * An object that represents a single alert for an event in an calendar.
    */
  @js.native
  trait Alert extends Proxy {
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
  trait Attendee extends Proxy {
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
  trait Calendar extends Proxy {
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
  trait Event extends Proxy {
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
  trait RecurrenceRule extends Proxy {
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
  trait Reminder extends Proxy {
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
  
}

