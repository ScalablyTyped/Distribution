package typings.titanium.Titanium.UI.iOS

import typings.titanium.Titanium.UI.View
import typings.titanium.titaniumStrings.change
import typings.titanium.titaniumStrings.click
import typings.titanium.titaniumStrings.dblclick
import typings.titanium.titaniumStrings.doubletap
import typings.titanium.titaniumStrings.keypressed
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
  * A widget used to increment and decrement a value.
  */
@js.native
trait Stepper extends View {
  /**
    * If YES, the user pressing and holding on the stepper repeatedly alters value.
    * The default value is YES.
    */
  var autorepeat: Boolean = js.native
  /**
    * If YES, value change events are sent immediately when the value changes during user interaction.
    * If NO, a value change event is sent when user interaction ends.
    * The default value is YES.
    */
  var continuous: Boolean = js.native
  /**
    * Background image for the stepper decrement button in its disabled state, specified as a local
    * file path or URL. The decrement button enters a disabled state ones the value is equal to the
    * minimumValue , setting the enabled property to false will have no effect to decrement button state.
    */
  var decrementDisabledImage: String = js.native
  /**
    * Background image for the stepper decrement button in its normal state, specified as a local
    * file path or URL.
    */
  var decrementImage: String = js.native
  /**
    * Determines if the stepper is enabled or disabled.
    */
  var enabled: Boolean = js.native
  /**
    * Background image for the stepper increment button in its disabled state, specified as a local
    * file path or URL.The increment button enters a disabled state ones the value is equal to the
    * maximumValue , setting the enabled property to false will have no effect to increment button state.
    */
  var incrementDisabledImage: String = js.native
  /**
    * Background image for the stepper increment button in its normal state, specified as a local
    * file path or URL.
    */
  var incrementImage: String = js.native
  /**
    * The maximum value the stepper will be set to, the value must be greater than the minimum value.
    * If you attempt to set a value equal to or lower than minimum, the system will default the
    * value to 100.
    */
  var maximum: Double = js.native
  /**
    * The minimum value the stepper will be set to, the value must be smaller than the maximum value.
    * If you attempt to set a value equal to or greater than maximum, the system will default the
    * value to 0.
    */
  var minimum: Double = js.native
  /**
    * The value the stepper will increment and decrement by, default value for this property is 1. When setting
    * a new value, it must be greater than 1.
    */
  var steps: Double = js.native
  /**
    * The current value of the stepper.
    */
  var value: Double = js.native
  /**
    * If YES, incrementing beyond <Titanium.UI.iOS.Stepper.maximum> sets value to <Titanium.UI.iOS.Stepper.minimum>. likewise, decrementing below
    * <Titanium.UI.iOS.Stepper.minimum> sets value to <Titanium.UI.iOS.Stepper.maximum>. If NO, the stepper does not increment beyond <Titanium.UI.iOS.Stepper.maximum> nor
    * does it decrement below <Titanium.UI.iOS.Stepper.minimum> but rather holds at those values.
    * The default value is NO.
    */
  var wraps: Boolean = js.native
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  @JSName("addEventListener")
  def addEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ StepperChangeEvent, Unit]
  ): Unit = js.native
  /**
    * Fires a synthesized event to any registered listeners.
    */
  @JSName("fireEvent")
  def fireEvent_change(name: change): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_change(name: change, event: StepperChangeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: StepperClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: StepperDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: StepperDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: StepperKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: StepperLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: StepperPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: StepperPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: StepperSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: StepperSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: StepperTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: StepperTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: StepperTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: StepperTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: StepperTwofingertapEvent): Unit = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.Stepper.autorepeat> property.
    * @deprecated Access <Titanium.UI.iOS.Stepper.autorepeat> instead.
    */
  def getAutorepeat(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.Stepper.continuous> property.
    * @deprecated Access <Titanium.UI.iOS.Stepper.continuous> instead.
    */
  def getContinuous(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.Stepper.decrementDisabledImage> property.
    * @deprecated Access <Titanium.UI.iOS.Stepper.decrementDisabledImage> instead.
    */
  def getDecrementDisabledImage(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.Stepper.decrementImage> property.
    * @deprecated Access <Titanium.UI.iOS.Stepper.decrementImage> instead.
    */
  def getDecrementImage(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.Stepper.enabled> property.
    * @deprecated Access <Titanium.UI.iOS.Stepper.enabled> instead.
    */
  def getEnabled(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.Stepper.incrementDisabledImage> property.
    * @deprecated Access <Titanium.UI.iOS.Stepper.incrementDisabledImage> instead.
    */
  def getIncrementDisabledImage(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.Stepper.incrementImage> property.
    * @deprecated Access <Titanium.UI.iOS.Stepper.incrementImage> instead.
    */
  def getIncrementImage(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.Stepper.maximum> property.
    * @deprecated Access <Titanium.UI.iOS.Stepper.maximum> instead.
    */
  def getMaximum(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.Stepper.minimum> property.
    * @deprecated Access <Titanium.UI.iOS.Stepper.minimum> instead.
    */
  def getMinimum(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.Stepper.steps> property.
    * @deprecated Access <Titanium.UI.iOS.Stepper.steps> instead.
    */
  def getSteps(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.Stepper.value> property.
    * @deprecated Access <Titanium.UI.iOS.Stepper.value> instead.
    */
  def getValue(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.Stepper.wraps> property.
    * @deprecated Access <Titanium.UI.iOS.Stepper.wraps> instead.
    */
  def getWraps(): Boolean = js.native
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  @JSName("removeEventListener")
  def removeEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ StepperChangeEvent, Unit]
  ): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.Stepper.autorepeat> property.
    * @deprecated Set the value using <Titanium.UI.iOS.Stepper.autorepeat> instead.
    */
  def setAutorepeat(autorepeat: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.Stepper.continuous> property.
    * @deprecated Set the value using <Titanium.UI.iOS.Stepper.continuous> instead.
    */
  def setContinuous(continuous: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.Stepper.decrementDisabledImage> property.
    * @deprecated Set the value using <Titanium.UI.iOS.Stepper.decrementDisabledImage> instead.
    */
  def setDecrementDisabledImage(decrementDisabledImage: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.Stepper.decrementImage> property.
    * @deprecated Set the value using <Titanium.UI.iOS.Stepper.decrementImage> instead.
    */
  def setDecrementImage(decrementImage: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.Stepper.enabled> property.
    * @deprecated Set the value using <Titanium.UI.iOS.Stepper.enabled> instead.
    */
  def setEnabled(enabled: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.Stepper.incrementDisabledImage> property.
    * @deprecated Set the value using <Titanium.UI.iOS.Stepper.incrementDisabledImage> instead.
    */
  def setIncrementDisabledImage(incrementDisabledImage: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.Stepper.incrementImage> property.
    * @deprecated Set the value using <Titanium.UI.iOS.Stepper.incrementImage> instead.
    */
  def setIncrementImage(incrementImage: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.Stepper.maximum> property.
    * @deprecated Set the value using <Titanium.UI.iOS.Stepper.maximum> instead.
    */
  def setMaximum(maximum: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.Stepper.minimum> property.
    * @deprecated Set the value using <Titanium.UI.iOS.Stepper.minimum> instead.
    */
  def setMinimum(minimum: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.Stepper.steps> property.
    * @deprecated Set the value using <Titanium.UI.iOS.Stepper.steps> instead.
    */
  def setSteps(steps: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.Stepper.value> property.
    * @deprecated Set the value using <Titanium.UI.iOS.Stepper.value> instead.
    */
  def setValue(value: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.Stepper.wraps> property.
    * @deprecated Set the value using <Titanium.UI.iOS.Stepper.wraps> instead.
    */
  def setWraps(wraps: Boolean): Unit = js.native
}

