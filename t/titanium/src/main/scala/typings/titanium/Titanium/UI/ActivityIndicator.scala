package typings.titanium.Titanium.UI

import typings.titanium.Font
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
		 * An activity indicator that lets the user know an action is taking place.
		 */
@JSGlobal("Titanium.UI.ActivityIndicator")
@js.native
class ActivityIndicator () extends View {
  /**
  			 * Color of the message text, as a color name or hex triplet.
  			 */
  var color: String = js.native
  /**
  			 * Font used for the message text.
  			 */
  var font: Font = js.native
  /**
  			 * Width of the view. Only accepts value of <Titanium.UI.SIZE>, which must be explicitly set in order to
  			 * display the message and to position the view correctly.
  			 */
  @JSName("height")
  var height_ActivityIndicator: String = js.native
  /**
  			 * Color of the animated indicator.
  			 */
  var indicatorColor: String = js.native
  /**
  			 * Message text.
  			 */
  var message: String = js.native
  /**
  			 * Key identifying a string in the locale file to use for the message text.
  			 */
  var messageid: String = js.native
  /**
  			 * The style for the activity indicator.
  			 */
  var style: Double = js.native
  /**
  			 * Width of the view. Only accepts value of <Titanium.UI.SIZE>, which must be explicitly set in order to
  			 * display the message and to position the view correctly.
  			 */
  @JSName("width")
  var width_ActivityIndicator: String = js.native
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: ActivityIndicatorClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: ActivityIndicatorDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: ActivityIndicatorDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_focus(name: focus, event: ActivityIndicatorFocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: ActivityIndicatorKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longclick(name: longclick, event: ActivityIndicatorLongclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: ActivityIndicatorLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: ActivityIndicatorPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: ActivityIndicatorPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: ActivityIndicatorSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: ActivityIndicatorSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: ActivityIndicatorTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: ActivityIndicatorTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: ActivityIndicatorTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: ActivityIndicatorTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: ActivityIndicatorTwofingertapEvent): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ActivityIndicator.color> property.
  			 * @deprecated Access <Titanium.UI.ActivityIndicator.color> instead.
  			 */
  def getColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ActivityIndicator.font> property.
  			 * @deprecated Access <Titanium.UI.ActivityIndicator.font> instead.
  			 */
  def getFont(): Font = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ActivityIndicator.indicatorColor> property.
  			 * @deprecated Access <Titanium.UI.ActivityIndicator.indicatorColor> instead.
  			 */
  def getIndicatorColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ActivityIndicator.message> property.
  			 * @deprecated Access <Titanium.UI.ActivityIndicator.message> instead.
  			 */
  def getMessage(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ActivityIndicator.messageid> property.
  			 * @deprecated Access <Titanium.UI.ActivityIndicator.messageid> instead.
  			 */
  def getMessageid(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ActivityIndicator.style> property.
  			 * @deprecated Access <Titanium.UI.ActivityIndicator.style> instead.
  			 */
  def getStyle(): Double = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ActivityIndicator.color> property.
  			 * @deprecated Set the value using <Titanium.UI.ActivityIndicator.color> instead.
  			 */
  def setColor(color: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ActivityIndicator.font> property.
  			 * @deprecated Set the value using <Titanium.UI.ActivityIndicator.font> instead.
  			 */
  def setFont(font: Font): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ActivityIndicator.indicatorColor> property.
  			 * @deprecated Set the value using <Titanium.UI.ActivityIndicator.indicatorColor> instead.
  			 */
  def setIndicatorColor(indicatorColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ActivityIndicator.message> property.
  			 * @deprecated Set the value using <Titanium.UI.ActivityIndicator.message> instead.
  			 */
  def setMessage(message: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ActivityIndicator.messageid> property.
  			 * @deprecated Set the value using <Titanium.UI.ActivityIndicator.messageid> instead.
  			 */
  def setMessageid(messageid: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ActivityIndicator.style> property.
  			 * @deprecated Set the value using <Titanium.UI.ActivityIndicator.style> instead.
  			 */
  def setStyle(style: Double): Unit = js.native
}

