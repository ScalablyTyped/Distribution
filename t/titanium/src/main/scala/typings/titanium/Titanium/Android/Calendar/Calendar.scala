package typings.titanium.Titanium.Android.Calendar

import typings.std.Date
import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * An object that represents a single calendar on Android.
			 */
trait Calendar extends Proxy {
  /**
  				 * Indicates whether this calendar is hidden.
  				 */
  val hidden: Boolean
  /**
  				 * Identifier of this calendar.
  				 */
  val id: String
  /**
  				 * Display name of this calendar.
  				 */
  val name: String
  /**
  				 * Indicates whether the calendar is selected.
  				 */
  val selected: Boolean
  /**
  				 * Creates an event in this calendar.
  				 */
  def createEvent(properties: js.Any): Event
  /**
  				 * Gets the event with the specified identifier.
  				 */
  def getEventById(id: Double): Event
  /**
  				 * Gets events that occur between two dates.
  				 */
  def getEventsBetweenDates(date1: Date, date2: Date): js.Array[Event]
  /**
  				 * Gets events that occur on a specified date.
  				 */
  def getEventsInDate(year: Double, month: Double, day: Double): js.Array[Event]
  /**
  				 * Gets events that occur during a specified month.
  				 */
  def getEventsInMonth(year: Double, month: Double): js.Array[Event]
  /**
  				 * Gets all events that occur during a specified year.
  				 */
  def getEventsInYear(year: Double): js.Array[Event]
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Calendar.hidden> property.
  				 */
  def getHidden(): Boolean
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Calendar.id> property.
  				 */
  def getId(): String
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Calendar.name> property.
  				 */
  def getName(): String
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Calendar.selected> property.
  				 */
  def getSelected(): Boolean
}

object Calendar {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    createEvent: js.Any => Event,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getEventById: Double => Event,
    getEventsBetweenDates: (Date, Date) => js.Array[Event],
    getEventsInDate: (Double, Double, Double) => js.Array[Event],
    getEventsInMonth: (Double, Double) => js.Array[Event],
    getEventsInYear: Double => js.Array[Event],
    getHidden: () => Boolean,
    getId: () => String,
    getName: () => String,
    getSelected: () => Boolean,
    hidden: Boolean,
    id: String,
    name: String,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    selected: Boolean,
    setBubbleParent: Boolean => Unit,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): Calendar = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName.asInstanceOf[js.Any], applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent.asInstanceOf[js.Any], createEvent = js.Any.fromFunction1(createEvent), fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getEventById = js.Any.fromFunction1(getEventById), getEventsBetweenDates = js.Any.fromFunction2(getEventsBetweenDates), getEventsInDate = js.Any.fromFunction3(getEventsInDate), getEventsInMonth = js.Any.fromFunction2(getEventsInMonth), getEventsInYear = js.Any.fromFunction1(getEventsInYear), getHidden = js.Any.fromFunction0(getHidden), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), getSelected = js.Any.fromFunction0(getSelected), hidden = hidden.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2(removeEventListener), selected = selected.asInstanceOf[js.Any], setBubbleParent = js.Any.fromFunction1(setBubbleParent))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calendar]
  }
}

