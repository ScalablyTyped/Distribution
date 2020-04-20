package typings.titanium.Titanium.UI

import typings.titanium.Font
import typings.titanium.titaniumStrings.change
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
		 * An on/off switch control.
		 */
@JSGlobal("Titanium.UI.Switch")
@js.native
class Switch () extends View {
  /**
  			 * Determines if there is animation when the switch value changes.
  			 */
  var animated: Boolean = js.native
  /**
  			 * Color to use for switch text, as a color name or hex triplet.
  			 */
  var color: String = js.native
  /**
  			 * Determines whether the switch is enabled.
  			 */
  var enabled: Boolean = js.native
  /**
  			 * Font to use for the switch text.
  			 */
  var font: Font = js.native
  /**
  			 * The color used to tint the appearance of the switch when it is turned on.
  			 */
  var onTintColor: String = js.native
  /**
  			 * Style of the switch.
  			 */
  var style: Double = js.native
  /**
  			 * Horizontal text alignment of the switch title.
  			 */
  var textAlign: String | Double = js.native
  /**
  			 * The color used to tint the appearance of the thumb.
  			 */
  var thumbTintColor: String = js.native
  /**
  			 * Text to display next to the switch, when the checkbox style is in use.
  			 */
  var title: String = js.native
  /**
  			 * Text to display on the switch in its "off" state, when the toggle button style is in use.
  			 */
  var titleOff: String = js.native
  /**
  			 * Text to display on the switch in its "on" state, when the toggle button style is in use.
  			 */
  var titleOn: String = js.native
  /**
  			 * Indicates whether the switch has been turned on or off by the user. May also be set
  			 * programmatically.
  			 */
  var value: Boolean = js.native
  /**
  			 * Vertical alignment for the text field.
  			 */
  var verticalAlign: Double | String = js.native
  /**
  			 * Adds the specified callback as an event listener for the named event.
  			 */
  @JSName("addEventListener")
  def addEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ SwitchChangeEvent, Unit]
  ): Unit = js.native
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  @JSName("fireEvent")
  def fireEvent_change(name: change): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_change(name: change, event: SwitchChangeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: SwitchClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: SwitchDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: SwitchDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_focus(name: focus, event: SwitchFocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: SwitchKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longclick(name: longclick, event: SwitchLongclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: SwitchLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: SwitchPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: SwitchPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: SwitchSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: SwitchSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: SwitchTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: SwitchTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: SwitchTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: SwitchTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: SwitchTwofingertapEvent): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Switch.animated> property.
  			 * @deprecated Access <Titanium.UI.Switch.animated> instead.
  			 */
  def getAnimated(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Switch.color> property.
  			 * @deprecated Access <Titanium.UI.Switch.color> instead.
  			 */
  def getColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Switch.enabled> property.
  			 * @deprecated Access <Titanium.UI.Switch.enabled> instead.
  			 */
  def getEnabled(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Switch.font> property.
  			 * @deprecated Access <Titanium.UI.Switch.font> instead.
  			 */
  def getFont(): Font = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Switch.onTintColor> property.
  			 * @deprecated Access <Titanium.UI.Switch.onTintColor> instead.
  			 */
  def getOnTintColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Switch.style> property.
  			 * @deprecated Access <Titanium.UI.Switch.style> instead.
  			 */
  def getStyle(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Switch.textAlign> property.
  			 * @deprecated Access <Titanium.UI.Switch.textAlign> instead.
  			 */
  def getTextAlign(): String | Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Switch.thumbTintColor> property.
  			 * @deprecated Access <Titanium.UI.Switch.thumbTintColor> instead.
  			 */
  def getThumbTintColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Switch.title> property.
  			 * @deprecated Access <Titanium.UI.Switch.title> instead.
  			 */
  def getTitle(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Switch.titleOff> property.
  			 * @deprecated Access <Titanium.UI.Switch.titleOff> instead.
  			 */
  def getTitleOff(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Switch.titleOn> property.
  			 * @deprecated Access <Titanium.UI.Switch.titleOn> instead.
  			 */
  def getTitleOn(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Switch.value> property.
  			 * @deprecated Access <Titanium.UI.Switch.value> instead.
  			 */
  def getValue(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Switch.verticalAlign> property.
  			 * @deprecated Access <Titanium.UI.Switch.verticalAlign> instead.
  			 */
  def getVerticalAlign(): Double | String = js.native
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  @JSName("removeEventListener")
  def removeEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ SwitchChangeEvent, Unit]
  ): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.animated> property.
  			 * @deprecated Set the value using <Titanium.UI.Switch.animated> instead.
  			 */
  def setAnimated(animated: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.color> property.
  			 * @deprecated Set the value using <Titanium.UI.Switch.color> instead.
  			 */
  def setColor(color: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.enabled> property.
  			 * @deprecated Set the value using <Titanium.UI.Switch.enabled> instead.
  			 */
  def setEnabled(enabled: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.font> property.
  			 * @deprecated Set the value using <Titanium.UI.Switch.font> instead.
  			 */
  def setFont(font: Font): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.onTintColor> property.
  			 * @deprecated Set the value using <Titanium.UI.Switch.onTintColor> instead.
  			 */
  def setOnTintColor(onTintColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.style> property.
  			 * @deprecated Set the value using <Titanium.UI.Switch.style> instead.
  			 */
  def setStyle(style: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.textAlign> property.
  			 * @deprecated Set the value using <Titanium.UI.Switch.textAlign> instead.
  			 */
  def setTextAlign(textAlign: String): Unit = js.native
  def setTextAlign(textAlign: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.thumbTintColor> property.
  			 * @deprecated Set the value using <Titanium.UI.Switch.thumbTintColor> instead.
  			 */
  def setThumbTintColor(thumbTintColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.title> property.
  			 * @deprecated Set the value using <Titanium.UI.Switch.title> instead.
  			 */
  def setTitle(title: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.titleOff> property.
  			 * @deprecated Set the value using <Titanium.UI.Switch.titleOff> instead.
  			 */
  def setTitleOff(titleOff: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.titleOn> property.
  			 * @deprecated Set the value using <Titanium.UI.Switch.titleOn> instead.
  			 */
  def setTitleOn(titleOn: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.value> property.
  			 * @deprecated Set the value using <Titanium.UI.Switch.value> instead.
  			 */
  def setValue(value: Boolean): Unit = js.native
  def setVerticalAlign(verticalAlign: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.verticalAlign> property.
  			 * @deprecated Set the value using <Titanium.UI.Switch.verticalAlign> instead.
  			 */
  def setVerticalAlign(verticalAlign: Double): Unit = js.native
}

