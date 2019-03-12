package typings
package titaniumLib.TitaniumNs.AndroidNs.CalendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * An object that represents a single event in an Android calendar.
			 */
trait Event
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * Existing alerts for this event.
  				 */
  val alerts: js.Array[Alert]
  /**
  				 * Indicates whether this event is all day.
  				 */
  val allDay: scala.Boolean
  /**
  				 * Start date/time of this event.
  				 */
  val begin: stdLib.Date
  /**
  				 * Description of this event.
  				 */
  val description: java.lang.String
  /**
  				 * End date/time of this event.
  				 */
  val end: stdLib.Date
  /**
  				 * Extended properties of this event.
  				 */
  val extendedProperties: js.Any
  /**
  				 * Indicates whether an alarm is scheduled for this event.
  				 */
  val hasAlarm: scala.Boolean
  /**
  				 * Indicates whether [extendedProperties](Titanium.Android.Calendar.Event.extendedProperties)
  				 * exists for this event.
  				 */
  val hasExtendedProperties: scala.Boolean
  /**
  				 * Identifier of this event.
  				 */
  val id: java.lang.String
  /**
  				 * Location of this event.
  				 */
  val location: java.lang.String
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
  val title: java.lang.String
  /**
  				 * Visibility of this event.
  				 */
  val visibility: scala.Double
  /**
  				 * Creates an alert for this event.
  				 */
  def createAlert(data: js.Any): Alert
  /**
  				 * Creates a reminder for this event.
  				 */
  def createReminder(data: js.Any): Reminder
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.alerts> property.
  				 */
  def getAlerts(): js.Array[Alert]
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.allDay> property.
  				 */
  def getAllDay(): scala.Boolean
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.begin> property.
  				 */
  def getBegin(): stdLib.Date
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.description> property.
  				 */
  def getDescription(): java.lang.String
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.end> property.
  				 */
  def getEnd(): stdLib.Date
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.extendedProperties> property.
  				 */
  def getExtendedProperties(): js.Any
  /**
  				 * Gets the value of the specified extended property.
  				 */
  def getExtendedProperty(name: java.lang.String): java.lang.String
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.hasAlarm> property.
  				 */
  def getHasAlarm(): scala.Boolean
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.hasExtendedProperties> property.
  				 */
  def getHasExtendedProperties(): scala.Boolean
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.id> property.
  				 */
  def getId(): java.lang.String
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.location> property.
  				 */
  def getLocation(): java.lang.String
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.reminders> property.
  				 */
  def getReminders(): js.Array[Reminder]
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.status> property.
  				 */
  def getStatus(): scala.Double
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.title> property.
  				 */
  def getTitle(): java.lang.String
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.visibility> property.
  				 */
  def getVisibility(): scala.Double
  /**
  				 * Sets the value of the specified extended property.
  				 */
  def setExtendedProperty(name: java.lang.String, value: java.lang.String): scala.Unit
}

object Event {
  @scala.inline
  def apply(
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    alerts: js.Array[Alert],
    allDay: scala.Boolean,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    begin: stdLib.Date,
    bubbleParent: scala.Boolean,
    createAlert: js.Any => Alert,
    createReminder: js.Any => Reminder,
    description: java.lang.String,
    end: stdLib.Date,
    extendedProperties: js.Any,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    getAlerts: () => js.Array[Alert],
    getAllDay: () => scala.Boolean,
    getApiName: () => java.lang.String,
    getBegin: () => stdLib.Date,
    getBubbleParent: () => scala.Boolean,
    getDescription: () => java.lang.String,
    getEnd: () => stdLib.Date,
    getExtendedProperties: () => js.Any,
    getExtendedProperty: java.lang.String => java.lang.String,
    getHasAlarm: () => scala.Boolean,
    getHasExtendedProperties: () => scala.Boolean,
    getId: () => java.lang.String,
    getLocation: () => java.lang.String,
    getReminders: () => js.Array[Reminder],
    getStatus: () => scala.Double,
    getTitle: () => java.lang.String,
    getVisibility: () => scala.Double,
    hasAlarm: scala.Boolean,
    hasExtendedProperties: scala.Boolean,
    id: java.lang.String,
    location: java.lang.String,
    reminders: js.Array[Reminder],
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit,
    setExtendedProperty: (java.lang.String, java.lang.String) => scala.Unit,
    status: scala.Double,
    title: java.lang.String,
    visibility: scala.Double,
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): Event = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), alerts = alerts, allDay = allDay, apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), begin = begin, bubbleParent = bubbleParent, createAlert = js.Any.fromFunction1(createAlert), createReminder = js.Any.fromFunction1(createReminder), description = description, end = end, extendedProperties = extendedProperties, fireEvent = js.Any.fromFunction2(fireEvent), getAlerts = js.Any.fromFunction0(getAlerts), getAllDay = js.Any.fromFunction0(getAllDay), getApiName = js.Any.fromFunction0(getApiName), getBegin = js.Any.fromFunction0(getBegin), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getDescription = js.Any.fromFunction0(getDescription), getEnd = js.Any.fromFunction0(getEnd), getExtendedProperties = js.Any.fromFunction0(getExtendedProperties), getExtendedProperty = js.Any.fromFunction1(getExtendedProperty), getHasAlarm = js.Any.fromFunction0(getHasAlarm), getHasExtendedProperties = js.Any.fromFunction0(getHasExtendedProperties), getId = js.Any.fromFunction0(getId), getLocation = js.Any.fromFunction0(getLocation), getReminders = js.Any.fromFunction0(getReminders), getStatus = js.Any.fromFunction0(getStatus), getTitle = js.Any.fromFunction0(getTitle), getVisibility = js.Any.fromFunction0(getVisibility), hasAlarm = hasAlarm, hasExtendedProperties = hasExtendedProperties, id = id, location = location, reminders = reminders, removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setExtendedProperty = js.Any.fromFunction2(setExtendedProperty), status = status, title = title, visibility = visibility)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Event]
  }
}

