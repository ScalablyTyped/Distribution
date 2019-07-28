package typings.titanium.TitaniumNs.AndroidNs.CalendarNs

import typings.titanium.TitaniumNs.Proxy
import typings.titanium.TitaniumNs.UINs.TabGroup
import typings.titanium.TitaniumNs.UINs.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * An object that represents a single reminder for an event in an Android calendar.
			 */
trait Reminder extends Proxy {
  /**
  				 * Identifier of this reminder.
  				 */
  val id: String
  /**
  				 * Method by which this reminder will be delivered.
  				 */
  val method: Double
  /**
  				 * Reminder notice period in minutes, that determines how long prior to the event this reminder
  				 * should trigger.
  				 */
  val minutes: Double
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Reminder.id> property.
  				 */
  def getId(): String
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Reminder.method> property.
  				 */
  def getMethod(): Double
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Reminder.minutes> property.
  				 */
  def getMinutes(): Double
}

object Reminder {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getId: () => String,
    getMethod: () => Double,
    getMinutes: () => Double,
    id: String,
    method: Double,
    minutes: Double,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setBubbleParent: Boolean => Unit,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): Reminder = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getId = js.Any.fromFunction0(getId), getMethod = js.Any.fromFunction0(getMethod), getMinutes = js.Any.fromFunction0(getMinutes), id = id, method = method, minutes = minutes, removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Reminder]
  }
}

