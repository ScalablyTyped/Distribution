package typings
package titaniumLib.TitaniumNs.AndroidNs.CalendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * An object that represents a single reminder for an event in an Android calendar.
			 */
trait Reminder
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * Identifier of this reminder.
  				 */
  val id: java.lang.String
  /**
  				 * Method by which this reminder will be delivered.
  				 */
  val method: scala.Double
  /**
  				 * Reminder notice period in minutes, that determines how long prior to the event this reminder
  				 * should trigger.
  				 */
  val minutes: scala.Double
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Reminder.id> property.
  				 */
  def getId(): java.lang.String
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Reminder.method> property.
  				 */
  def getMethod(): scala.Double
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Reminder.minutes> property.
  				 */
  def getMinutes(): scala.Double
}

