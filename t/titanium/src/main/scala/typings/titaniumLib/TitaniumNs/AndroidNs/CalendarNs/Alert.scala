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

object Alert {
  @scala.inline
  def apply(
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    alarmTime: stdLib.Date,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    begin: stdLib.Date,
    bubbleParent: scala.Boolean,
    end: stdLib.Date,
    eventId: scala.Double,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    getAlarmTime: () => stdLib.Date,
    getApiName: () => java.lang.String,
    getBegin: () => stdLib.Date,
    getBubbleParent: () => scala.Boolean,
    getEnd: () => stdLib.Date,
    getEventId: () => scala.Double,
    getId: () => java.lang.String,
    getMinutes: () => scala.Double,
    getState: () => scala.Double,
    id: java.lang.String,
    minutes: scala.Double,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit,
    state: scala.Double,
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): Alert = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), alarmTime = alarmTime, apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), begin = begin, bubbleParent = bubbleParent, end = end, eventId = eventId, fireEvent = js.Any.fromFunction2(fireEvent), getAlarmTime = js.Any.fromFunction0(getAlarmTime), getApiName = js.Any.fromFunction0(getApiName), getBegin = js.Any.fromFunction0(getBegin), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getEnd = js.Any.fromFunction0(getEnd), getEventId = js.Any.fromFunction0(getEventId), getId = js.Any.fromFunction0(getId), getMinutes = js.Any.fromFunction0(getMinutes), getState = js.Any.fromFunction0(getState), id = id, minutes = minutes, removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent), state = state)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Alert]
  }
}

