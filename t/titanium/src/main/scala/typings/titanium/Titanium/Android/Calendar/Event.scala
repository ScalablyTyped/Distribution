package typings.titanium.Titanium.Android.Calendar

import typings.std.Date
import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * An object that represents a single event in an Android calendar.
			 */
trait Event extends Proxy {
  /**
  				 * Existing alerts for this event.
  				 */
  val alerts: js.Array[Alert]
  /**
  				 * Indicates whether this event is all day.
  				 */
  val allDay: Boolean
  /**
  				 * Start date/time of this event.
  				 */
  val begin: Date
  /**
  				 * Description of this event.
  				 */
  val description: String
  /**
  				 * End date/time of this event.
  				 */
  val end: Date
  /**
  				 * Extended properties of this event.
  				 */
  val extendedProperties: js.Any
  /**
  				 * Indicates whether an alarm is scheduled for this event.
  				 */
  val hasAlarm: Boolean
  /**
  				 * Indicates whether [extendedProperties](Titanium.Android.Calendar.Event.extendedProperties)
  				 * exists for this event.
  				 */
  val hasExtendedProperties: Boolean
  /**
  				 * Identifier of this event.
  				 */
  val id: String
  /**
  				 * Location of this event.
  				 */
  val location: String
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
  val title: String
  /**
  				 * Visibility of this event.
  				 */
  val visibility: Double
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
  def getAllDay(): Boolean
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.begin> property.
  				 */
  def getBegin(): Date
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.description> property.
  				 */
  def getDescription(): String
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.end> property.
  				 */
  def getEnd(): Date
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.extendedProperties> property.
  				 */
  def getExtendedProperties(): js.Any
  /**
  				 * Gets the value of the specified extended property.
  				 */
  def getExtendedProperty(name: String): String
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.hasAlarm> property.
  				 */
  def getHasAlarm(): Boolean
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.hasExtendedProperties> property.
  				 */
  def getHasExtendedProperties(): Boolean
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.id> property.
  				 */
  def getId(): String
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.location> property.
  				 */
  def getLocation(): String
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.reminders> property.
  				 */
  def getReminders(): js.Array[Reminder]
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.status> property.
  				 */
  def getStatus(): Double
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.title> property.
  				 */
  def getTitle(): String
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.visibility> property.
  				 */
  def getVisibility(): Double
  /**
  				 * Sets the value of the specified extended property.
  				 */
  def setExtendedProperty(name: String, value: String): Unit
}

object Event {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    alerts: js.Array[Alert],
    allDay: Boolean,
    apiName: String,
    applyProperties: js.Any => Unit,
    begin: Date,
    bubbleParent: Boolean,
    createAlert: js.Any => Alert,
    createReminder: js.Any => Reminder,
    description: String,
    end: Date,
    extendedProperties: js.Any,
    fireEvent: (String, js.Any) => Unit,
    getAlerts: () => js.Array[Alert],
    getAllDay: () => Boolean,
    getApiName: () => String,
    getBegin: () => Date,
    getBubbleParent: () => Boolean,
    getDescription: () => String,
    getEnd: () => Date,
    getExtendedProperties: () => js.Any,
    getExtendedProperty: String => String,
    getHasAlarm: () => Boolean,
    getHasExtendedProperties: () => Boolean,
    getId: () => String,
    getLocation: () => String,
    getReminders: () => js.Array[Reminder],
    getStatus: () => Double,
    getTitle: () => String,
    getVisibility: () => Double,
    hasAlarm: Boolean,
    hasExtendedProperties: Boolean,
    id: String,
    location: String,
    reminders: js.Array[Reminder],
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setBubbleParent: Boolean => Unit,
    setExtendedProperty: (String, String) => Unit,
    status: Double,
    title: String,
    visibility: Double,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): Event = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), alerts = alerts.asInstanceOf[js.Any], allDay = allDay.asInstanceOf[js.Any], apiName = apiName.asInstanceOf[js.Any], applyProperties = js.Any.fromFunction1(applyProperties), begin = begin.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], createAlert = js.Any.fromFunction1(createAlert), createReminder = js.Any.fromFunction1(createReminder), description = description.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], extendedProperties = extendedProperties.asInstanceOf[js.Any], fireEvent = js.Any.fromFunction2(fireEvent), getAlerts = js.Any.fromFunction0(getAlerts), getAllDay = js.Any.fromFunction0(getAllDay), getApiName = js.Any.fromFunction0(getApiName), getBegin = js.Any.fromFunction0(getBegin), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getDescription = js.Any.fromFunction0(getDescription), getEnd = js.Any.fromFunction0(getEnd), getExtendedProperties = js.Any.fromFunction0(getExtendedProperties), getExtendedProperty = js.Any.fromFunction1(getExtendedProperty), getHasAlarm = js.Any.fromFunction0(getHasAlarm), getHasExtendedProperties = js.Any.fromFunction0(getHasExtendedProperties), getId = js.Any.fromFunction0(getId), getLocation = js.Any.fromFunction0(getLocation), getReminders = js.Any.fromFunction0(getReminders), getStatus = js.Any.fromFunction0(getStatus), getTitle = js.Any.fromFunction0(getTitle), getVisibility = js.Any.fromFunction0(getVisibility), hasAlarm = hasAlarm.asInstanceOf[js.Any], hasExtendedProperties = hasExtendedProperties.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], reminders = reminders.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setExtendedProperty = js.Any.fromFunction2(setExtendedProperty), status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

