package typings
package titaniumLib.TitaniumNs.CalendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An object that represents a single reminder for an event in a calendar.
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
  			 * Gets the value of the <Titanium.Calendar.Reminder.id> property.
  			 */
  def getId(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Calendar.Reminder.method> property.
  			 */
  def getMethod(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Calendar.Reminder.minutes> property.
  			 */
  def getMinutes(): scala.Double
}

object Reminder {
  @scala.inline
  def apply(
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    bubbleParent: scala.Boolean,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    getApiName: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    getId: () => java.lang.String,
    getMethod: () => scala.Double,
    getMinutes: () => scala.Double,
    id: java.lang.String,
    method: scala.Double,
    minutes: scala.Double,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit,
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): Reminder = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getId = js.Any.fromFunction0(getId), getMethod = js.Any.fromFunction0(getMethod), getMinutes = js.Any.fromFunction0(getMinutes), id = id, method = method, minutes = minutes, removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Reminder]
  }
}

