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
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    alerts: js.Array[Alert],
    allDay: scala.Boolean,
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    begin: stdLib.Date,
    bubbleParent: scala.Boolean,
    createAlert: js.Function1[js.Any, Alert],
    createReminder: js.Function1[js.Any, Reminder],
    description: java.lang.String,
    end: stdLib.Date,
    extendedProperties: js.Any,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getAlerts: js.Function0[js.Array[Alert]],
    getAllDay: js.Function0[scala.Boolean],
    getApiName: js.Function0[java.lang.String],
    getBegin: js.Function0[stdLib.Date],
    getBubbleParent: js.Function0[scala.Boolean],
    getDescription: js.Function0[java.lang.String],
    getEnd: js.Function0[stdLib.Date],
    getExtendedProperties: js.Function0[js.Any],
    getExtendedProperty: js.Function1[java.lang.String, java.lang.String],
    getHasAlarm: js.Function0[scala.Boolean],
    getHasExtendedProperties: js.Function0[scala.Boolean],
    getId: js.Function0[java.lang.String],
    getLocation: js.Function0[java.lang.String],
    getReminders: js.Function0[js.Array[Reminder]],
    getStatus: js.Function0[scala.Double],
    getTitle: js.Function0[java.lang.String],
    getVisibility: js.Function0[scala.Double],
    hasAlarm: scala.Boolean,
    hasExtendedProperties: scala.Boolean,
    id: java.lang.String,
    location: java.lang.String,
    reminders: js.Array[Reminder],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setExtendedProperty: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    status: scala.Double,
    title: java.lang.String,
    visibility: scala.Double,
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): Event = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener, alerts = alerts, allDay = allDay, apiName = apiName, applyProperties = applyProperties, begin = begin, bubbleParent = bubbleParent, createAlert = createAlert, createReminder = createReminder, description = description, end = end, extendedProperties = extendedProperties, fireEvent = fireEvent, getAlerts = getAlerts, getAllDay = getAllDay, getApiName = getApiName, getBegin = getBegin, getBubbleParent = getBubbleParent, getDescription = getDescription, getEnd = getEnd, getExtendedProperties = getExtendedProperties, getExtendedProperty = getExtendedProperty, getHasAlarm = getHasAlarm, getHasExtendedProperties = getHasExtendedProperties, getId = getId, getLocation = getLocation, getReminders = getReminders, getStatus = getStatus, getTitle = getTitle, getVisibility = getVisibility, hasAlarm = hasAlarm, hasExtendedProperties = hasExtendedProperties, id = id, location = location, reminders = reminders, removeEventListener = removeEventListener, setBubbleParent = setBubbleParent, setExtendedProperty = setExtendedProperty, status = status, title = title, visibility = visibility)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Event]
  }
}

