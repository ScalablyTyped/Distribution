package typings.titanium.Titanium.UI

import typings.titanium.Point
import typings.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The `Animation` object defines an animation that can be applied to a view.
		 */
@js.native
trait Animation extends Proxy {
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
  var center: js.Any = js.native
  /**
  			 * Value of the `color` property at the end of the animation, as a color name or hex triplet.
  			 */
  var color: String = js.native
  /**
  			 * Animation curve or easing function to apply to the animation.
  			 */
  var curve: Double = js.native
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
  			 * Gets the value of the <Titanium.UI.Animation.anchorPoint> property.
  			 */
  def getAnchorPoint(): Point = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.autoreverse> property.
  			 */
  def getAutoreverse(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.backgroundColor> property.
  			 */
  def getBackgroundColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.bottom> property.
  			 */
  def getBottom(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.center> property.
  			 */
  def getCenter(): js.Any = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.color> property.
  			 */
  def getColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.curve> property.
  			 */
  def getCurve(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.delay> property.
  			 */
  def getDelay(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.duration> property.
  			 */
  def getDuration(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.height> property.
  			 */
  def getHeight(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.left> property.
  			 */
  def getLeft(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.opacity> property.
  			 */
  def getOpacity(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.opaque> property.
  			 */
  def getOpaque(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.repeat> property.
  			 */
  def getRepeat(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.right> property.
  			 */
  def getRight(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.top> property.
  			 */
  def getTop(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.transform> property.
  			 */
  def getTransform(): Matrix2D | Matrix3D = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.transition> property.
  			 */
  def getTransition(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.view> property.
  			 */
  def getView(): View = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.visible> property.
  			 */
  def getVisible(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.width> property.
  			 */
  def getWidth(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.zIndex> property.
  			 */
  def getZIndex(): Double = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.anchorPoint> property.
  			 */
  def setAnchorPoint(anchorPoint: Point): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.autoreverse> property.
  			 */
  def setAutoreverse(autoreverse: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.backgroundColor> property.
  			 */
  def setBackgroundColor(backgroundColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.bottom> property.
  			 */
  def setBottom(bottom: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.center> property.
  			 */
  def setCenter(center: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.color> property.
  			 */
  def setColor(color: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.curve> property.
  			 */
  def setCurve(curve: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.delay> property.
  			 */
  def setDelay(delay: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.duration> property.
  			 */
  def setDuration(duration: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.height> property.
  			 */
  def setHeight(height: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.left> property.
  			 */
  def setLeft(left: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.opacity> property.
  			 */
  def setOpacity(opacity: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.opaque> property.
  			 */
  def setOpaque(opaque: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.repeat> property.
  			 */
  def setRepeat(repeat: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.right> property.
  			 */
  def setRight(right: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.top> property.
  			 */
  def setTop(top: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.transform> property.
  			 */
  def setTransform(transform: Matrix2D): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.transform> property.
  			 */
  def setTransform(transform: Matrix3D): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.transition> property.
  			 */
  def setTransition(transition: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.view> property.
  			 */
  def setView(view: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.visible> property.
  			 */
  def setVisible(visible: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.width> property.
  			 */
  def setWidth(width: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.zIndex> property.
  			 */
  def setZIndex(zIndex: Double): Unit = js.native
}

