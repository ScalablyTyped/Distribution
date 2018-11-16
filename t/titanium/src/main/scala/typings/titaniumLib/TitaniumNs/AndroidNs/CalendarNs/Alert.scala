package typings
package titaniumLib.TitaniumNs.AndroidNs.CalendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * An object that represents a single alert for an event in an Android calendar.
			 */

trait Alert
  extends titaniumLib.TitaniumNs.Proxy {
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
  				 * The current state of the alert.
  				 */
  val state: scala.Double
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Alert.alarmTime> property.
  				 */
  def getAlarmTime(): stdLib.Date
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Alert.begin> property.
  				 */
  def getBegin(): stdLib.Date
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Alert.end> property.
  				 */
  def getEnd(): stdLib.Date
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Alert.eventId> property.
  				 */
  def getEventId(): scala.Double
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Alert.id> property.
  				 */
  def getId(): java.lang.String
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Alert.minutes> property.
  				 */
  def getMinutes(): scala.Double
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Alert.state> property.
  				 */
  def getState(): scala.Double
}

