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
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getId: js.Function0[java.lang.String],
    getMethod: js.Function0[scala.Double],
    getMinutes: js.Function0[scala.Double],
    id: java.lang.String,
    method: scala.Double,
    minutes: scala.Double,
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): Reminder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("apiName")(apiName)
    __obj.updateDynamic("applyProperties")(applyProperties)
    __obj.updateDynamic("bubbleParent")(bubbleParent)
    __obj.updateDynamic("fireEvent")(fireEvent)
    __obj.updateDynamic("getApiName")(getApiName)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent)
    __obj.updateDynamic("getId")(getId)
    __obj.updateDynamic("getMethod")(getMethod)
    __obj.updateDynamic("getMinutes")(getMinutes)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("minutes")(minutes)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("setBubbleParent")(setBubbleParent)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Reminder]
  }
}

