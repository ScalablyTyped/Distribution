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
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    alarmTime: stdLib.Date,
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    begin: stdLib.Date,
    bubbleParent: scala.Boolean,
    end: stdLib.Date,
    eventId: scala.Double,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getAlarmTime: js.Function0[stdLib.Date],
    getApiName: js.Function0[java.lang.String],
    getBegin: js.Function0[stdLib.Date],
    getBubbleParent: js.Function0[scala.Boolean],
    getEnd: js.Function0[stdLib.Date],
    getEventId: js.Function0[scala.Double],
    getId: js.Function0[java.lang.String],
    getMinutes: js.Function0[scala.Double],
    getState: js.Function0[scala.Double],
    id: java.lang.String,
    minutes: scala.Double,
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    state: scala.Double,
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): Alert = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener, alarmTime = alarmTime, apiName = apiName, applyProperties = applyProperties, begin = begin, bubbleParent = bubbleParent, end = end, eventId = eventId, fireEvent = fireEvent, getAlarmTime = getAlarmTime, getApiName = getApiName, getBegin = getBegin, getBubbleParent = getBubbleParent, getEnd = getEnd, getEventId = getEventId, getId = getId, getMinutes = getMinutes, getState = getState, id = id, minutes = minutes, removeEventListener = removeEventListener, setBubbleParent = setBubbleParent, state = state)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Alert]
  }
}

