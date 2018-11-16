package typings
package titaniumLib.TitaniumNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The `Animation` object defines an animation that can be applied to a view.
		 */
@js.native
trait Animation
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * Coordinate of the view about which to pivot an animation.
  			 */
  var anchorPoint: titaniumLib.Point = js.native
  /**
  			 * Specifies if the animation should be replayed in reverse upon completion.
  			 */
  var autoreverse: scala.Boolean = js.native
  /**
  			 * Value of the `backgroundColor` property at the end of the animation, as a color name
  			 * or hex triplet.
  			 */
  var backgroundColor: java.lang.String = js.native
  /**
  			 * Value of the `bottom` property at the end of the animation.
  			 */
  var bottom: scala.Double = js.native
  /**
  			 * Value of the `center` property at the end of the animation.
  			 */
  var center: js.Any = js.native
  /**
  			 * Value of the `color` property at the end of the animation, as a color name or hex triplet.
  			 */
  var color: java.lang.String = js.native
  /**
  			 * Animation curve or easing function to apply to the animation.
  			 */
  var curve: scala.Double = js.native
  /**
  			 * Delay, in milliseconds before starting the animation.
  			 */
  var delay: scala.Double = js.native
  /**
  			 * Duration of the animation, in milliseconds.
  			 */
  var duration: scala.Double = js.native
  /**
  			 * Value of the `height` property at the end of the animation.
  			 */
  var height: scala.Double = js.native
  /**
  			 * Value of the `left` property at the end of the animation.
  			 */
  var left: scala.Double = js.native
  /**
  			 * Value of the `opacity` property at the end of the animation.
  			 */
  var opacity: scala.Double = js.native
  /**
  			 * Value of the `opaque` property at the end of the animation.
  			 */
  var opaque: scala.Boolean = js.native
  /**
  			 * Number of times the animation should be performed.
  			 */
  var repeat: scala.Double = js.native
  /**
  			 * Value of the `right` property at the end of the animation.
  			 */
  var right: scala.Double = js.native
  /**
  			 * Value of the `top` property at the end of the animation.
  			 */
  var top: scala.Double = js.native
  /**
  			 * Animate the view from its current tranform to the specified transform.
  			 */
  var transform: Matrix2D | Matrix3D = js.native
  /**
  			 * Transition type to use during a transition animation.
  			 */
  var transition: scala.Double = js.native
  /**
  			 * New view to transition to.
  			 */
  var view: View = js.native
  /**
  			 * Value of the `visible` property at the end of the animation.
  			 */
  var visible: scala.Boolean = js.native
  /**
  			 * Value of the `width` property at the end of the animation.
  			 */
  var width: scala.Double = js.native
  /**
  			 * Value of the `zIndex` property at the end of the animation.
  			 */
  var zIndex: scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.anchorPoint> property.
  			 */
  def getAnchorPoint(): titaniumLib.Point = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.autoreverse> property.
  			 */
  def getAutoreverse(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.backgroundColor> property.
  			 */
  def getBackgroundColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.bottom> property.
  			 */
  def getBottom(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.center> property.
  			 */
  def getCenter(): js.Any = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.color> property.
  			 */
  def getColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.curve> property.
  			 */
  def getCurve(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.delay> property.
  			 */
  def getDelay(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.duration> property.
  			 */
  def getDuration(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.height> property.
  			 */
  def getHeight(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.left> property.
  			 */
  def getLeft(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.opacity> property.
  			 */
  def getOpacity(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.opaque> property.
  			 */
  def getOpaque(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.repeat> property.
  			 */
  def getRepeat(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.right> property.
  			 */
  def getRight(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.top> property.
  			 */
  def getTop(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.transform> property.
  			 */
  def getTransform(): Matrix2D | Matrix3D = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.transition> property.
  			 */
  def getTransition(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.view> property.
  			 */
  def getView(): View = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.visible> property.
  			 */
  def getVisible(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.width> property.
  			 */
  def getWidth(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Animation.zIndex> property.
  			 */
  def getZIndex(): scala.Double = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.anchorPoint> property.
  			 */
  def setAnchorPoint(anchorPoint: titaniumLib.Point): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.autoreverse> property.
  			 */
  def setAutoreverse(autoreverse: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.backgroundColor> property.
  			 */
  def setBackgroundColor(backgroundColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.bottom> property.
  			 */
  def setBottom(bottom: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.center> property.
  			 */
  def setCenter(center: js.Any): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.color> property.
  			 */
  def setColor(color: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.curve> property.
  			 */
  def setCurve(curve: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.delay> property.
  			 */
  def setDelay(delay: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.duration> property.
  			 */
  def setDuration(duration: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.height> property.
  			 */
  def setHeight(height: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.left> property.
  			 */
  def setLeft(left: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.opacity> property.
  			 */
  def setOpacity(opacity: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.opaque> property.
  			 */
  def setOpaque(opaque: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.repeat> property.
  			 */
  def setRepeat(repeat: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.right> property.
  			 */
  def setRight(right: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.top> property.
  			 */
  def setTop(top: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.transform> property.
  			 */
  def setTransform(transform: Matrix2D): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.transform> property.
  			 */
  def setTransform(transform: Matrix3D): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.transition> property.
  			 */
  def setTransition(transition: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.view> property.
  			 */
  def setView(view: js.Any): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.visible> property.
  			 */
  def setVisible(visible: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.width> property.
  			 */
  def setWidth(width: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Animation.zIndex> property.
  			 */
  def setZIndex(zIndex: scala.Double): scala.Unit = js.native
}

