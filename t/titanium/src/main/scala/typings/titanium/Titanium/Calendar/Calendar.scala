package typings.titanium.Titanium.Calendar

import typings.std.Date
import typings.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  val id: String = js.native
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
  def createEvent(properties: js.Any): typings.titanium.Titanium.Calendar.Event = js.native
  /**
  			 * Gets the event with the specified identifier.
  			 */
  def getEventById(id: Double): typings.titanium.Titanium.Calendar.Event = js.native
  def getEventsBetweenDates(date1: String, date2: String): js.Array[typings.titanium.Titanium.Calendar.Event] = js.native
  /**
  			 * Gets events that occur between two dates.
  			 */
  def getEventsBetweenDates(date1: String, date2: Date): js.Array[typings.titanium.Titanium.Calendar.Event] = js.native
  def getEventsBetweenDates(date1: Date, date2: String): js.Array[typings.titanium.Titanium.Calendar.Event] = js.native
  /**
  			 * Gets events that occur between two dates.
  			 */
  def getEventsBetweenDates(date1: Date, date2: Date): js.Array[typings.titanium.Titanium.Calendar.Event] = js.native
  /**
  			 * Gets events that occur on a specified date.
  			 */
  def getEventsInDate(year: Double, month: Double, day: Double): js.Array[typings.titanium.Titanium.Calendar.Event] = js.native
  /**
  			 * Gets events that occur during a specified month.
  			 */
  def getEventsInMonth(year: Double, month: Double): js.Array[typings.titanium.Titanium.Calendar.Event] = js.native
  /**
  			 * Gets all events that occur during a specified year.
  			 */
  def getEventsInYear(year: Double): js.Array[typings.titanium.Titanium.Calendar.Event] = js.native
  /**
  			 * Gets the value of the <Titanium.Calendar.Calendar.hidden> property.
  			 */
  def getHidden(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Calendar.Calendar.id> property.
  			 */
  def getId(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Calendar.Calendar.name> property.
  			 */
  def getName(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Calendar.Calendar.selected> property.
  			 */
  def getSelected(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Calendar.Calendar.sourceIdentifier> property.
  			 */
  def getSourceIdentifier(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Calendar.Calendar.sourceTitle> property.
  			 */
  def getSourceTitle(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Calendar.Calendar.sourceType> property.
  			 */
  def getSourceType(): Double = js.native
}

