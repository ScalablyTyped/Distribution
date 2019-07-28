package typings.titanium.TitaniumNs.AndroidNs.CalendarNs

import typings.titanium.TitaniumNs.UINs.TabGroup
import typings.titanium.TitaniumNs.UINs.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Titanium.Android.Calendar")
@js.native
object ^ extends js.Object {
  /**
  			 * Reminder alert delivery method.
  			 */
  val METHOD_ALERT: Double = js.native
  /**
  			 * Reminder default delivery method.
  			 */
  val METHOD_DEFAULT: Double = js.native
  /**
  			 * Reminder email delivery method.
  			 */
  val METHOD_EMAIL: Double = js.native
  /**
  			 * Reminder SMS delivery method.
  			 */
  val METHOD_SMS: Double = js.native
  /**
  			 * Alert dismissed state.
  			 */
  val STATE_DISMISSED: Double = js.native
  /**
  			 * Alert fired state.
  			 */
  val STATE_FIRED: Double = js.native
  /**
  			 * Alert scheduled status.
  			 */
  val STATE_SCHEDULED: Double = js.native
  /**
  			 * Event canceled status.
  			 */
  val STATUS_CANCELED: Double = js.native
  /**
  			 * Event confirmed status.
  			 */
  val STATUS_CONFIRMED: Double = js.native
  /**
  			 * Event tentative status.
  			 */
  val STATUS_TENTATIVE: Double = js.native
  /**
  			 * Event confidential visibility.
  			 */
  val VISIBILITY_CONFIDENTIAL: Double = js.native
  /**
  			 * Event default visibility.
  			 */
  val VISIBILITY_DEFAULT: Double = js.native
  /**
  			 * Event private visibility.
  			 */
  val VISIBILITY_PRIVATE: Double = js.native
  /**
  			 * Event public visibility.
  			 */
  val VISIBILITY_PUBLIC: Double = js.native
  /**
  			 * All alerts in selected calendars.
  			 */
  val allAlerts: js.Array[Alert] = js.native
  /**
  			 * All calendars known to the native calendar app.
  			 */
  val allCalendars: js.Array[Calendar] = js.native
  /**
  			 * The name of the API that this proxy corresponds to.
  			 */
  val apiName: String = js.native
  /**
  			 * Indicates if the proxy will bubble an event to its parent.
  			 */
  var bubbleParent: Boolean = js.native
  /**
  			 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  			 */
  var lifecycleContainer: Window | TabGroup = js.native
  /**
  			 * All calendars selected within the native calendar app, which may be a subset of `allCalendars`.
  			 */
  val selectableCalendars: js.Array[Calendar] = js.native
  /**
  			 * Adds the specified callback as an event listener for the named event.
  			 */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  			 * Applies the properties to the proxy.
  			 */
  def applyProperties(props: js.Any): Unit = js.native
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Calendar.allAlerts> property.
  			 */
  def getAllAlerts(): js.Array[Alert] = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Calendar.allCalendars> property.
  			 */
  def getAllCalendars(): js.Array[Calendar] = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Calendar.apiName> property.
  			 */
  def getApiName(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Calendar.bubbleParent> property.
  			 */
  def getBubbleParent(): Boolean = js.native
  /**
  			 * Gets the calendar with the specified identifier.
  			 */
  def getCalendarById(id: Double): Calendar = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Calendar.lifecycleContainer> property.
  			 */
  def getLifecycleContainer(): Window | TabGroup = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Calendar.selectableCalendars> property.
  			 */
  def getSelectableCalendars(): js.Array[Calendar] = js.native
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Calendar.bubbleParent> property.
  			 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Calendar.lifecycleContainer> property.
  			 */
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Calendar.lifecycleContainer> property.
  			 */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
}

