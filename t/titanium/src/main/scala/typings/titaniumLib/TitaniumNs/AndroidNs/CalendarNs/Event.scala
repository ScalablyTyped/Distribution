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

