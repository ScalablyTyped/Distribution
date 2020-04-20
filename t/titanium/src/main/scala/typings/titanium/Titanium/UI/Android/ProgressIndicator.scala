package typings.titanium.Titanium.UI.Android

import typings.titanium.Titanium.UI.View
import typings.titanium.titaniumStrings.cancel
import typings.titanium.titaniumStrings.click
import typings.titanium.titaniumStrings.dblclick
import typings.titanium.titaniumStrings.doubletap
import typings.titanium.titaniumStrings.focus
import typings.titanium.titaniumStrings.keypressed
import typings.titanium.titaniumStrings.longclick
import typings.titanium.titaniumStrings.longpress
import typings.titanium.titaniumStrings.pinch
import typings.titanium.titaniumStrings.postlayout
import typings.titanium.titaniumStrings.singletap
import typings.titanium.titaniumStrings.swipe
import typings.titanium.titaniumStrings.touchcancel
import typings.titanium.titaniumStrings.touchend
import typings.titanium.titaniumStrings.touchmove
import typings.titanium.titaniumStrings.touchstart
import typings.titanium.titaniumStrings.twofingertap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A progress dialog or a horizontal progress bar in the title of the window.
			 */
@JSGlobal("Titanium.UI.Android.ProgressIndicator")
@js.native
class ProgressIndicator () extends View {
  /**
  				 * When `true` allows the user to cancel the progress dialog by pressing the BACK button.
  				 */
  var cancelable: Boolean = js.native
  /**
  				 * When `cancelable` is set to `true` and this is set to `true`, the dialog is canceled when touched outside the window's bounds.
  				 */
  var canceledOnTouchOutside: Boolean = js.native
  /**
  				 * Location for the progress indicator.
  				 */
  var location: Double = js.native
  /**
  				 * Maximum value of the progress bar.
  				 */
  var max: Double = js.native
  /**
  				 * Message text.
  				 */
  var message: String = js.native
  /**
  				 * Key identifying a string in the locale file to use for the message text.
  				 */
  var messageid: String = js.native
  /**
  				 * Minimum value of the progress bar.
  				 */
  var min: Double = js.native
  /**
  				 * Type for the progress indicator.
  				 */
  var `type`: Double = js.native
  /**
  				 * Adds the specified callback as an event listener for the named event.
  				 */
  @JSName("addEventListener")
  def addEventListener_cancel(
    name: cancel,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ProgressIndicatorCancelEvent, Unit]
  ): Unit = js.native
  /**
  				 * Fires a synthesized event to any registered listeners.
  				 */
  @JSName("fireEvent")
  def fireEvent_cancel(name: cancel): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_cancel(name: cancel, event: ProgressIndicatorCancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: ProgressIndicatorClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: ProgressIndicatorDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: ProgressIndicatorDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_focus(name: focus, event: ProgressIndicatorFocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: ProgressIndicatorKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longclick(name: longclick, event: ProgressIndicatorLongclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: ProgressIndicatorLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: ProgressIndicatorPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: ProgressIndicatorPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: ProgressIndicatorSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: ProgressIndicatorSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: ProgressIndicatorTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: ProgressIndicatorTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: ProgressIndicatorTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: ProgressIndicatorTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: ProgressIndicatorTwofingertapEvent): Unit = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.cancelable> property.
  				 * @deprecated Access <Titanium.UI.Android.ProgressIndicator.cancelable> instead.
  				 */
  def getCancelable(): Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.canceledOnTouchOutside> property.
  				 * @deprecated Access <Titanium.UI.Android.ProgressIndicator.canceledOnTouchOutside> instead.
  				 */
  def getCanceledOnTouchOutside(): Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.location> property.
  				 * @deprecated Access <Titanium.UI.Android.ProgressIndicator.location> instead.
  				 */
  def getLocation(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.max> property.
  				 * @deprecated Access <Titanium.UI.Android.ProgressIndicator.max> instead.
  				 */
  def getMax(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.message> property.
  				 * @deprecated Access <Titanium.UI.Android.ProgressIndicator.message> instead.
  				 */
  def getMessage(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.messageid> property.
  				 * @deprecated Access <Titanium.UI.Android.ProgressIndicator.messageid> instead.
  				 */
  def getMessageid(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.min> property.
  				 * @deprecated Access <Titanium.UI.Android.ProgressIndicator.min> instead.
  				 */
  def getMin(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.type> property.
  				 * @deprecated Access <Titanium.UI.Android.ProgressIndicator.type> instead.
  				 */
  def getType(): Double = js.native
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    name: cancel,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ProgressIndicatorCancelEvent, Unit]
  ): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.cancelable> property.
  				 * @deprecated Set the value using <Titanium.UI.Android.ProgressIndicator.cancelable> instead.
  				 */
  def setCancelable(cancelable: Boolean): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.canceledOnTouchOutside> property.
  				 * @deprecated Set the value using <Titanium.UI.Android.ProgressIndicator.canceledOnTouchOutside> instead.
  				 */
  def setCanceledOnTouchOutside(canceledOnTouchOutside: Boolean): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.location> property.
  				 * @deprecated Set the value using <Titanium.UI.Android.ProgressIndicator.location> instead.
  				 */
  def setLocation(location: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.max> property.
  				 * @deprecated Set the value using <Titanium.UI.Android.ProgressIndicator.max> instead.
  				 */
  def setMax(max: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.message> property.
  				 * @deprecated Set the value using <Titanium.UI.Android.ProgressIndicator.message> instead.
  				 */
  def setMessage(message: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.messageid> property.
  				 * @deprecated Set the value using <Titanium.UI.Android.ProgressIndicator.messageid> instead.
  				 */
  def setMessageid(messageid: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.min> property.
  				 * @deprecated Set the value using <Titanium.UI.Android.ProgressIndicator.min> instead.
  				 */
  def setMin(min: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.type> property.
  				 * @deprecated Set the value using <Titanium.UI.Android.ProgressIndicator.type> instead.
  				 */
  def setType(`type`: Double): Unit = js.native
}

