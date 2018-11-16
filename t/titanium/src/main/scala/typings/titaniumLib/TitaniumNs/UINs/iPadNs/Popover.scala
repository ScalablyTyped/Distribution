package typings
package titaniumLib.TitaniumNs.UINs.iPadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A Popover is used to manage the presentation of content in a popover.
			 */
@js.native
trait Popover
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * Indicates the arrow direction of the popover.
  				 */
  var arrowDirection: scala.Double = js.native
  /**
  				 * Sets the background color of the popover.
  				 */
  var backgroundColor: java.lang.String = js.native
  /**
  				 * View to use for the popover content. Must be set before calling the `show()` method.
  				 */
  var contentView: titaniumLib.TitaniumNs.UINs.View = js.native
  /**
  				 * Height of the popover.
  				 */
  var height: scala.Double | java.lang.String = js.native
  /**
  				 * Adds a horizontal parallax effect to the view
  				 */
  var horizontalMotionEffect: js.Any = js.native
  /**
  				 * Left button in the navigation area of the popover.
  				 */
  var leftNavButton: js.Any = js.native
  /**
  				 * Passthrough views to use when the popover is shown.
  				 */
  var passthroughViews: js.Array[titaniumLib.TitaniumNs.UINs.View] = js.native
  /**
  				 * Right button in the navigation area of the popover.
  				 */
  var rightNavButton: js.Any = js.native
  /**
  				 * Title of the navigation area of the popover.
  				 */
  var title: java.lang.String = js.native
  /**
  				 * Adds a vertical parallax effect to the view
  				 */
  var verticalMotionEffect: js.Any = js.native
  /**
  				 * Width of the popover.
  				 */
  var width: scala.Double | java.lang.String = js.native
  /**
  				 * Finishes a batch update of the View's layout properties and schedules a layout pass of the
  				 * view tree.
  				 */
  def finishLayout(): scala.Unit = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iPad.Popover.arrowDirection> property.
  				 */
  def getArrowDirection(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iPad.Popover.backgroundColor> property.
  				 */
  def getBackgroundColor(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iPad.Popover.contentView> property.
  				 */
  def getContentView(): titaniumLib.TitaniumNs.UINs.View = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iPad.Popover.height> property.
  				 */
  def getHeight(): scala.Double | java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iPad.Popover.horizontalMotionEffect> property.
  				 */
  def getHorizontalMotionEffect(): js.Any = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iPad.Popover.leftNavButton> property.
  				 */
  def getLeftNavButton(): js.Any = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iPad.Popover.passthroughViews> property.
  				 */
  def getPassthroughViews(): js.Array[titaniumLib.TitaniumNs.UINs.View] = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iPad.Popover.rightNavButton> property.
  				 */
  def getRightNavButton(): js.Any = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iPad.Popover.title> property.
  				 */
  def getTitle(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iPad.Popover.verticalMotionEffect> property.
  				 */
  def getVerticalMotionEffect(): js.Any = js.native
  /**
  				 * Returns the matching view of a given view ID.
  				 */
  def getViewById(id: java.lang.String): titaniumLib.TitaniumNs.UINs.View = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iPad.Popover.width> property.
  				 */
  def getWidth(): scala.Double | java.lang.String = js.native
  /**
  				 * Hides the popover.
  				 */
  def hide(options: titaniumLib.PopoverParams): scala.Unit = js.native
  /**
  				 * Inserts a view at the specified position in the [children](Titanium.UI.View.children) array.
  				 */
  def insertAt(params: js.Any): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iPad.Popover.arrowDirection> property.
  				 */
  def setArrowDirection(arrowDirection: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iPad.Popover.backgroundColor> property.
  				 */
  def setBackgroundColor(backgroundColor: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iPad.Popover.contentView> property.
  				 */
  def setContentView(contentView: js.Any): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iPad.Popover.height> property.
  				 */
  def setHeight(height: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iPad.Popover.height> property.
  				 */
  def setHeight(height: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iPad.Popover.horizontalMotionEffect> property.
  				 */
  def setHorizontalMotionEffect(horizontalMotionEffect: js.Any): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iPad.Popover.leftNavButton> property.
  				 */
  def setLeftNavButton(leftNavButton: js.Any): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iPad.Popover.passthroughViews> property.
  				 */
  def setPassthroughViews(passthroughViews: js.Array[_]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iPad.Popover.rightNavButton> property.
  				 */
  def setRightNavButton(rightNavButton: js.Any): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iPad.Popover.title> property.
  				 */
  def setTitle(title: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iPad.Popover.verticalMotionEffect> property.
  				 */
  def setVerticalMotionEffect(verticalMotionEffect: js.Any): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iPad.Popover.width> property.
  				 */
  def setWidth(width: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iPad.Popover.width> property.
  				 */
  def setWidth(width: scala.Double): scala.Unit = js.native
  /**
  				 * Displays the popover.
  				 */
  def show(params: titaniumLib.PopoverParams): scala.Unit = js.native
  /**
  				 * Starts a batch update of this view's layout properties.
  				 */
  def startLayout(): scala.Unit = js.native
  /**
  				 * Performs a batch update of all supplied layout properties and schedules a layout pass after
  				 * they have been updated.
  				 */
  def updateLayout(params: js.Any): scala.Unit = js.native
}

