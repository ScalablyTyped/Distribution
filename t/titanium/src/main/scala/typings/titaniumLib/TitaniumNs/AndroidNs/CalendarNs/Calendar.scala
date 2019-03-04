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

object Calendar {
  @scala.inline
  def apply(
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    createEvent: js.Function1[js.Any, Event],
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getEventById: js.Function1[scala.Double, Event],
    getEventsBetweenDates: js.Function2[stdLib.Date, stdLib.Date, js.Array[Event]],
    getEventsInDate: js.Function3[scala.Double, scala.Double, scala.Double, js.Array[Event]],
    getEventsInMonth: js.Function2[scala.Double, scala.Double, js.Array[Event]],
    getEventsInYear: js.Function1[scala.Double, js.Array[Event]],
    getHidden: js.Function0[scala.Boolean],
    getId: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    getSelected: js.Function0[scala.Boolean],
    hidden: scala.Boolean,
    id: java.lang.String,
    name: java.lang.String,
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    selected: scala.Boolean,
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): Calendar = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener, apiName = apiName, applyProperties = applyProperties, bubbleParent = bubbleParent, createEvent = createEvent, fireEvent = fireEvent, getApiName = getApiName, getBubbleParent = getBubbleParent, getEventById = getEventById, getEventsBetweenDates = getEventsBetweenDates, getEventsInDate = getEventsInDate, getEventsInMonth = getEventsInMonth, getEventsInYear = getEventsInYear, getHidden = getHidden, getId = getId, getName = getName, getSelected = getSelected, hidden = hidden, id = id, name = name, removeEventListener = removeEventListener, selected = selected, setBubbleParent = setBubbleParent)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Calendar]
  }
}

