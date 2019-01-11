package typings
package titaniumLib.TitaniumNs.AndroidNs.CalendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Titanium.Android.Calendar")
@js.native
object ^ extends js.Object {
  /**
  			 * Reminder alert delivery method.
  			 */
  val METHOD_ALERT: scala.Double = js.native
  /**
  			 * Reminder default delivery method.
  			 */
  val METHOD_DEFAULT: scala.Double = js.native
  /**
  			 * Reminder email delivery method.
  			 */
  val METHOD_EMAIL: scala.Double = js.native
  /**
  			 * Reminder SMS delivery method.
  			 */
  val METHOD_SMS: scala.Double = js.native
  /**
  			 * Alert dismissed state.
  			 */
  val STATE_DISMISSED: scala.Double = js.native
  /**
  			 * Alert fired state.
  			 */
  val STATE_FIRED: scala.Double = js.native
  /**
  			 * Alert scheduled status.
  			 */
  val STATE_SCHEDULED: scala.Double = js.native
  /**
  			 * Event canceled status.
  			 */
  val STATUS_CANCELED: scala.Double = js.native
  /**
  			 * Event confirmed status.
  			 */
  val STATUS_CONFIRMED: scala.Double = js.native
  /**
  			 * Event tentative status.
  			 */
  val STATUS_TENTATIVE: scala.Double = js.native
  /**
  			 * Event confidential visibility.
  			 */
  val VISIBILITY_CONFIDENTIAL: scala.Double = js.native
  /**
  			 * Event default visibility.
  			 */
  val VISIBILITY_DEFAULT: scala.Double = js.native
  /**
  			 * Event private visibility.
  			 */
  val VISIBILITY_PRIVATE: scala.Double = js.native
  /**
  			 * Event public visibility.
  			 */
  val VISIBILITY_PUBLIC: scala.Double = js.native
  /**
  			 * All alerts in selected calendars.
  			 */
  val allAlerts: js.Array[titaniumLib.TitaniumNs.AndroidNs.CalendarNs.Alert] = js.native
  /**
  			 * All calendars known to the native calendar app.
  			 */
  val allCalendars: js.Array[titaniumLib.TitaniumNs.AndroidNs.CalendarNs.Calendar] = js.native
  /**
  			 * The name of the API that this proxy corresponds to.
  			 */
  val apiName: java.lang.String = js.native
  /**
  			 * Indicates if the proxy will bubble an event to its parent.
  			 */
  var bubbleParent: scala.Boolean = js.native
  /**
  			 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  			 */
  var lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  			 * All calendars selected within the native calendar app, which may be a subset of `allCalendars`.
  			 */
  val selectableCalendars: js.Array[titaniumLib.TitaniumNs.AndroidNs.CalendarNs.Calendar] = js.native
  /**
  			 * Adds the specified callback as an event listener for the named event.
  			 */
  def addEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  			 * Applies the properties to the proxy.
  			 */
  def applyProperties(props: js.Any): scala.Unit = js.native
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  def fireEvent(name: java.lang.String, event: js.Any): scala.Unit = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Calendar.allAlerts> property.
  			 */
  def getAllAlerts(): js.Array[titaniumLib.TitaniumNs.AndroidNs.CalendarNs.Alert] = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Calendar.allCalendars> property.
  			 */
  def getAllCalendars(): js.Array[titaniumLib.TitaniumNs.AndroidNs.CalendarNs.Calendar] = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Calendar.apiName> property.
  			 */
  def getApiName(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Calendar.bubbleParent> property.
  			 */
  def getBubbleParent(): scala.Boolean = js.native
  /**
  			 * Gets the calendar with the specified identifier.
  			 */
  def getCalendarById(id: scala.Double): titaniumLib.TitaniumNs.AndroidNs.CalendarNs.Calendar = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Calendar.lifecycleContainer> property.
  			 */
  def getLifecycleContainer(): titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Calendar.selectableCalendars> property.
  			 */
  def getSelectableCalendars(): js.Array[titaniumLib.TitaniumNs.AndroidNs.CalendarNs.Calendar] = js.native
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Calendar.bubbleParent> property.
  			 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Calendar.lifecycleContainer> property.
  			 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.TabGroup): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Calendar.lifecycleContainer> property.
  			 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window): scala.Unit = js.native
}

