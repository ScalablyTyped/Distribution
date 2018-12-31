package typings
package titaniumLib.TitaniumNs.CalendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An object that represents a single alert for an event in an calendar.
		 */
trait Alert
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * The absolute date for the alarm.
  			 */
  var absoluteDate: stdLib.Date
  /**
  			 * Date/time at which this alert alarm is set to trigger.
  			 */
  val alarmTime: stdLib.Date
  /**
  			 * Start date/time for the corresponding event.
  			 */
  val begin: stdLib.Date
  /**
  			 * End date/time for the corresponding event.
  			 */
  val end: stdLib.Date
  /**
  			 * Identifier of the event for which this alert is set.
  			 */
  val eventId: scala.Double
  /**
  			 * Identifier of this alert.
  			 */
  val id: java.lang.String
  /**
  			 * Reminder notice period in minutes, that determines how long prior to the event this alert
  			 * should trigger.
  			 */
  val minutes: scala.Double
  /**
  			 * The offset from the start of an event, at which the alarm fires.
  			 */
  var relativeOffset: scala.Double
  /**
  			 * The current state of the alert.
  			 */
  val state: scala.Double
  /**
  			 * Gets the value of the <Titanium.Calendar.Alert.absoluteDate> property.
  			 */
  def getAbsoluteDate(): stdLib.Date
  /**
  			 * Gets the value of the <Titanium.Calendar.Alert.alarmTime> property.
  			 */
  def getAlarmTime(): stdLib.Date
  /**
  			 * Gets the value of the <Titanium.Calendar.Alert.begin> property.
  			 */
  def getBegin(): stdLib.Date
  /**
  			 * Gets the value of the <Titanium.Calendar.Alert.end> property.
  			 */
  def getEnd(): stdLib.Date
  /**
  			 * Gets the value of the <Titanium.Calendar.Alert.eventId> property.
  			 */
  def getEventId(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Calendar.Alert.id> property.
  			 */
  def getId(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Calendar.Alert.minutes> property.
  			 */
  def getMinutes(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Calendar.Alert.relativeOffset> property.
  			 */
  def getRelativeOffset(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Calendar.Alert.state> property.
  			 */
  def getState(): scala.Double
  /**
  			 * Sets the value of the <Titanium.Calendar.Alert.absoluteDate> property.
  			 */
  def setAbsoluteDate(absoluteDate: stdLib.Date): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Calendar.Alert.relativeOffset> property.
  			 */
  def setRelativeOffset(relativeOffset: scala.Double): scala.Unit
}

