package typings
package titaniumLib.TitaniumNs.CalendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An object that represents a single calendar.
		 */
@js.native
trait Calendar
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * Indicates whether this calendar can be edited or deleted.
  			 */
  val hidden: scala.Boolean = js.native
  /**
  			 * Identifier of this calendar.
  			 */
  val id: java.lang.String = js.native
  /**
  			 * Display name of this calendar.
  			 */
  val name: java.lang.String = js.native
  /**
  			 * Indicates whether the calendar is selected.
  			 */
  val selected: scala.Boolean = js.native
  /**
  			 * Displays the source identifier.
  			 */
  val sourceIdentifier: java.lang.String = js.native
  /**
  			 * Displays the source title.
  			 */
  val sourceTitle: java.lang.String = js.native
  /**
  			 * Displays the source type.
  			 */
  val sourceType: scala.Double = js.native
  /**
  			 * Creates an event in this calendar.
  			 */
  def createEvent(properties: js.Any): Event = js.native
  /**
  			 * Gets the event with the specified identifier.
  			 */
  def getEventById(id: scala.Double): Event = js.native
  /**
  			 * Gets events that occur between two dates.
  			 */
  def getEventsBetweenDates(date1: java.lang.String, date2: java.lang.String): js.Array[Event] = js.native
  /**
  			 * Gets events that occur between two dates.
  			 */
  def getEventsBetweenDates(date1: java.lang.String, date2: stdLib.Date): js.Array[Event] = js.native
  /**
  			 * Gets events that occur between two dates.
  			 */
  def getEventsBetweenDates(date1: stdLib.Date, date2: java.lang.String): js.Array[Event] = js.native
  /**
  			 * Gets events that occur between two dates.
  			 */
  def getEventsBetweenDates(date1: stdLib.Date, date2: stdLib.Date): js.Array[Event] = js.native
  /**
  			 * Gets events that occur on a specified date.
  			 */
  def getEventsInDate(year: scala.Double, month: scala.Double, day: scala.Double): js.Array[Event] = js.native
  /**
  			 * Gets events that occur during a specified month.
  			 */
  def getEventsInMonth(year: scala.Double, month: scala.Double): js.Array[Event] = js.native
  /**
  			 * Gets all events that occur during a specified year.
  			 */
  def getEventsInYear(year: scala.Double): js.Array[Event] = js.native
  /**
  			 * Gets the value of the <Titanium.Calendar.Calendar.hidden> property.
  			 */
  def getHidden(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Calendar.Calendar.id> property.
  			 */
  def getId(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Calendar.Calendar.name> property.
  			 */
  def getName(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Calendar.Calendar.selected> property.
  			 */
  def getSelected(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Calendar.Calendar.sourceIdentifier> property.
  			 */
  def getSourceIdentifier(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Calendar.Calendar.sourceTitle> property.
  			 */
  def getSourceTitle(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Calendar.Calendar.sourceType> property.
  			 */
  def getSourceType(): scala.Double = js.native
}

