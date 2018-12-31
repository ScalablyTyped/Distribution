package typings
package titaniumLib.TitaniumNs.AndroidNs.CalendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * An object that represents a single calendar on Android.
			 */
trait Calendar
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * Indicates whether this calendar is hidden.
  				 */
  val hidden: scala.Boolean
  /**
  				 * Identifier of this calendar.
  				 */
  val id: java.lang.String
  /**
  				 * Display name of this calendar.
  				 */
  val name: java.lang.String
  /**
  				 * Indicates whether the calendar is selected.
  				 */
  val selected: scala.Boolean
  /**
  				 * Creates an event in this calendar.
  				 */
  def createEvent(properties: js.Any): Event
  /**
  				 * Gets the event with the specified identifier.
  				 */
  def getEventById(id: scala.Double): Event
  /**
  				 * Gets events that occur between two dates.
  				 */
  def getEventsBetweenDates(date1: stdLib.Date, date2: stdLib.Date): js.Array[Event]
  /**
  				 * Gets events that occur on a specified date.
  				 */
  def getEventsInDate(year: scala.Double, month: scala.Double, day: scala.Double): js.Array[Event]
  /**
  				 * Gets events that occur during a specified month.
  				 */
  def getEventsInMonth(year: scala.Double, month: scala.Double): js.Array[Event]
  /**
  				 * Gets all events that occur during a specified year.
  				 */
  def getEventsInYear(year: scala.Double): js.Array[Event]
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Calendar.hidden> property.
  				 */
  def getHidden(): scala.Boolean
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Calendar.id> property.
  				 */
  def getId(): java.lang.String
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Calendar.name> property.
  				 */
  def getName(): java.lang.String
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Calendar.selected> property.
  				 */
  def getSelected(): scala.Boolean
}

