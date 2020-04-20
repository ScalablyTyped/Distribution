package typings.titanium.Titanium.UI

import typings.titanium.Point
import typings.titanium.Titanium.Proxy
import typings.titanium.titaniumStrings.complete
import typings.titanium.titaniumStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The `Animation` object defines an animation that can be applied to a view.
		 */
@JSGlobal("Titanium.UI.Animation")
@js.native
class Animation () extends Proxy {
  /**
  			 * Coordinate of the view about which to pivot an animation.
  			 */
  var anchorPoint: Point = js.native
  /**
  			 * Specifies if the animation should be replayed in reverse upon completion.
  			 */
  var autoreverse: Boolean = js.native
  /**
  			 * Value of the `backgroundColor` property at the end of the animation, as a color name
  			 * or hex triplet.
  			 */
  var backgroundColor: String = js.native
  /**
  			 * Value of the `bottom` property at the end of the animation.
  			 */
  var bottom: Double = js.native
  /**
  			 * Value of the `center` property at the end of the animation.
  			 */
  var center: Point = js.native
  /**
  			 * Value of the `color` property at the end of the animation, as a color name or hex triplet.
  			 */
  var color: String = js.native
  /**
  			 * Animation curve or easing function to apply to the animation.
  			 */
  var curve: Double = js.native
  /**
  			 * The damping ratio for the spring animation as it approaches its quiescent state.
  			 */
  var dampingRatio: Double = js.native
  /**
  			 * Delay, in milliseconds before starting the animation.
  			 */
  var delay: Double = js.native
  /**
  			 * Duration of the animation, in milliseconds.
  			 */
  var duration: Double = js.native
  /**
  			 * Value of the `height` property at the end of the animation.
  			 */
  var height: Double = js.native
  /**
  			 * Value of the `left` property at the end of the animation.
  			 */
  var left: Double = js.native
  /**
  			 * Value of the `opacity` property at the end of the animation.
  			 */
  var opacity: Double = js.native
  /**
  			 * Value of the `opaque` property at the end of the animation.
  			 */
  var opaque: Boolean = js.native
  /**
  			 * Number of times the animation should be performed.
  			 */
  var repeat: Double = js.native
  /**
  			 * Value of the `right` property at the end of the animation.
  			 */
  var right: Double = js.native
  /**
  			 * The initial spring velocity.
  			 */
  var springVelocity: Double = js.native
  /**
  			 * Value of the `top` property at the end of the animation.
  			 */
  var top: Double = js.native
  /**
  			 * Animate the view from its current tranform to the specified transform.
  			 */
  var transform: Matrix2D | Matrix3D = js.native
  /**
  			 * Transition type to use during a transition animation.
  			 */
  var transition: Double = js.native
  /**
  			 * New view to transition to.
  			 */
  var view: View = js.native
  /**
  			 * Value of the `visible` property at the end of the animation.
  			 */
  var visible: Boolean = js.native
  /**
  			 * Value of the `width` property at the end of the animation.
  			 */
  var width: Double = js.native
  /**
  			 * Value of the `zIndex` property at the end of the animation.
  			 */
  var zIndex: Double = js.native
  /**
  			 * Adds the specified callback as an event listener for the named event.
  			 */
  @JSName("addEventListener")
  def addEventListener_complete(
    name: complete,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AnimationCompleteEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(
    name: start,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AnimationStartEvent, Unit]
  ): Unit = js.native
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  @JSName("fireEvent")
  def fireEvent_complete(name: complete): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_complete(name: complete, event: AnimationCompleteEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_start(name: start): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_start(name: start, event: AnimationStartEvent): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.anchorPoint> property.
  			 * @deprecated Access <Titanium.UI.Animation.anchorPoint> instead.
  			 */
  def getAnchorPoint(): Point = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.autoreverse> property.
  			 * @deprecated Access <Titanium.UI.Animation.autoreverse> instead.
  			 */
  def getAutoreverse(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.backgroundColor> property.
  			 * @deprecated Access <Titanium.UI.Animation.backgroundColor> instead.
  			 */
  def getBackgroundColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.bottom> property.
  			 * @deprecated Access <Titanium.UI.Animation.bottom> instead.
  			 */
  def getBottom(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.center> property.
  			 * @deprecated Access <Titanium.UI.Animation.center> instead.
  			 */
  def getCenter(): Point = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.color> property.
  			 * @deprecated Access <Titanium.UI.Animation.color> instead.
  			 */
  def getColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.curve> property.
  			 * @deprecated Access <Titanium.UI.Animation.curve> instead.
  			 */
  def getCurve(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.dampingRatio> property.
  			 * @deprecated Access <Titanium.UI.Animation.dampingRatio> instead.
  			 */
  def getDampingRatio(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.delay> property.
  			 * @deprecated Access <Titanium.UI.Animation.delay> instead.
  			 */
  def getDelay(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.duration> property.
  			 * @deprecated Access <Titanium.UI.Animation.duration> instead.
  			 */
  def getDuration(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.height> property.
  			 * @deprecated Access <Titanium.UI.Animation.height> instead.
  			 */
  def getHeight(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.left> property.
  			 * @deprecated Access <Titanium.UI.Animation.left> instead.
  			 */
  def getLeft(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.opacity> property.
  			 * @deprecated Access <Titanium.UI.Animation.opacity> instead.
  			 */
  def getOpacity(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.opaque> property.
  			 * @deprecated Access <Titanium.UI.Animation.opaque> instead.
  			 */
  def getOpaque(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.repeat> property.
  			 * @deprecated Access <Titanium.UI.Animation.repeat> instead.
  			 */
  def getRepeat(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.right> property.
  			 * @deprecated Access <Titanium.UI.Animation.right> instead.
  			 */
  def getRight(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.springVelocity> property.
  			 * @deprecated Access <Titanium.UI.Animation.springVelocity> instead.
  			 */
  def getSpringVelocity(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.top> property.
  			 * @deprecated Access <Titanium.UI.Animation.top> instead.
  			 */
  def getTop(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.transform> property.
  			 * @deprecated Access <Titanium.UI.Animation.transform> instead.
  			 */
  def getTransform(): Matrix2D | Matrix3D = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.transition> property.
  			 * @deprecated Access <Titanium.UI.Animation.transition> instead.
  			 */
  def getTransition(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.view> property.
  			 * @deprecated Access <Titanium.UI.Animation.view> instead.
  			 */
  def getView(): View = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.visible> property.
  			 * @deprecated Access <Titanium.UI.Animation.visible> instead.
  			 */
  def getVisible(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.width> property.
  			 * @deprecated Access <Titanium.UI.Animation.width> instead.
  			 */
  def getWidth(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.zIndex> property.
  			 * @deprecated Access <Titanium.UI.Animation.zIndex> instead.
  			 */
  def getZIndex(): Double = js.native
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  @JSName("removeEventListener")
  def removeEventListener_complete(
    name: complete,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AnimationCompleteEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(
    name: start,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AnimationStartEvent, Unit]
  ): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.anchorPoint> property.
  			 * @deprecated Set the value using <Titanium.UI.Animation.anchorPoint> instead.
  			 */
  def setAnchorPoint(anchorPoint: Point): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.autoreverse> property.
  			 * @deprecated Set the value using <Titanium.UI.Animation.autoreverse> instead.
  			 */
  def setAutoreverse(autoreverse: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.backgroundColor> property.
  			 * @deprecated Set the value using <Titanium.UI.Animation.backgroundColor> instead.
  			 */
  def setBackgroundColor(backgroundColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.bottom> property.
  			 * @deprecated Set the value using <Titanium.UI.Animation.bottom> instead.
  			 */
  def setBottom(bottom: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.center> property.
  			 * @deprecated Set the value using <Titanium.UI.Animation.center> instead.
  			 */
  def setCenter(center: Point): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.color> property.
  			 * @deprecated Set the value using <Titanium.UI.Animation.color> instead.
  			 */
  def setColor(color: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.curve> property.
  			 * @deprecated Set the value using <Titanium.UI.Animation.curve> instead.
  			 */
  def setCurve(curve: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.dampingRatio> property.
  			 * @deprecated Set the value using <Titanium.UI.Animation.dampingRatio> instead.
  			 */
  def setDampingRatio(dampingRatio: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.delay> property.
  			 * @deprecated Set the value using <Titanium.UI.Animation.delay> instead.
  			 */
  def setDelay(delay: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.duration> property.
  			 * @deprecated Set the value using <Titanium.UI.Animation.duration> instead.
  			 */
  def setDuration(duration: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.height> property.
  			 * @deprecated Set the value using <Titanium.UI.Animation.height> instead.
  			 */
  def setHeight(height: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.left> property.
  			 * @deprecated Set the value using <Titanium.UI.Animation.left> instead.
  			 */
  def setLeft(left: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.opacity> property.
  			 * @deprecated Set the value using <Titanium.UI.Animation.opacity> instead.
  			 */
  def setOpacity(opacity: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.opaque> property.
  			 * @deprecated Set the value using <Titanium.UI.Animation.opaque> instead.
  			 */
  def setOpaque(opaque: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.repeat> property.
  			 * @deprecated Set the value using <Titanium.UI.Animation.repeat> instead.
  			 */
  def setRepeat(repeat: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.right> property.
  			 * @deprecated Set the value using <Titanium.UI.Animation.right> instead.
  			 */
  def setRight(right: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.springVelocity> property.
  			 * @deprecated Set the value using <Titanium.UI.Animation.springVelocity> instead.
  			 */
  def setSpringVelocity(springVelocity: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.top> property.
  			 * @deprecated Set the value using <Titanium.UI.Animation.top> instead.
  			 */
  def setTop(top: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.transform> property.
  			 * @deprecated Set the value using <Titanium.UI.Animation.transform> instead.
  			 */
  def setTransform(transform: Matrix2D): Unit = js.native
  def setTransform(transform: Matrix3D): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.transition> property.
  			 * @deprecated Set the value using <Titanium.UI.Animation.transition> instead.
  			 */
  def setTransition(transition: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.view> property.
  			 * @deprecated Set the value using <Titanium.UI.Animation.view> instead.
  			 */
  def setView(view: View): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.visible> property.
  			 * @deprecated Set the value using <Titanium.UI.Animation.visible> instead.
  			 */
  def setVisible(visible: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.width> property.
  			 * @deprecated Set the value using <Titanium.UI.Animation.width> instead.
  			 */
  def setWidth(width: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.zIndex> property.
  			 * @deprecated Set the value using <Titanium.UI.Animation.zIndex> instead.
  			 */
  def setZIndex(zIndex: Double): Unit = js.native
}

