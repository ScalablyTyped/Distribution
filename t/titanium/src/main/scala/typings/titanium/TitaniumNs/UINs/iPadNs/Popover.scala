package typings.titanium.TitaniumNs.UINs.iPadNs

import typings.titanium.PopoverParams
import typings.titanium.TitaniumNs.Proxy
import typings.titanium.TitaniumNs.UINs.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A Popover is used to manage the presentation of content in a popover.
			 */
@js.native
trait Popover extends Proxy {
  /**
  				 * Indicates the arrow direction of the popover.
  				 */
  var arrowDirection: Double = js.native
  /**
  				 * Sets the background color of the popover.
  				 */
  var backgroundColor: String = js.native
  /**
  				 * View to use for the popover content. Must be set before calling the `show()` method.
  				 */
  var contentView: View = js.native
  /**
  				 * Height of the popover.
  				 */
  var height: Double | String = js.native
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
  var passthroughViews: js.Array[View] = js.native
  /**
  				 * Right button in the navigation area of the popover.
  				 */
  var rightNavButton: js.Any = js.native
  /**
  				 * Title of the navigation area of the popover.
  				 */
  var title: String = js.native
  /**
  				 * Adds a vertical parallax effect to the view
  				 */
  var verticalMotionEffect: js.Any = js.native
  /**
  				 * Width of the popover.
  				 */
  var width: Double | String = js.native
  /**
  				 * Finishes a batch update of the View's layout properties and schedules a layout pass of the
  				 * view tree.
  				 */
  def finishLayout(): Unit = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iPad.Popover.arrowDirection> property.
  				 */
  def getArrowDirection(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iPad.Popover.backgroundColor> property.
  				 */
  def getBackgroundColor(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iPad.Popover.contentView> property.
  				 */
  def getContentView(): View = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iPad.Popover.height> property.
  				 */
  def getHeight(): Double | String = js.native
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
  def getPassthroughViews(): js.Array[View] = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iPad.Popover.rightNavButton> property.
  				 */
  def getRightNavButton(): js.Any = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iPad.Popover.title> property.
  				 */
  def getTitle(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iPad.Popover.verticalMotionEffect> property.
  				 */
  def getVerticalMotionEffect(): js.Any = js.native
  /**
  				 * Returns the matching view of a given view ID.
  				 */
  def getViewById(id: String): View = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iPad.Popover.width> property.
  				 */
  def getWidth(): Double | String = js.native
  /**
  				 * Hides the popover.
  				 */
  def hide(options: PopoverParams): Unit = js.native
  /**
  				 * Inserts a view at the specified position in the [children](Titanium.UI.View.children) array.
  				 */
  def insertAt(params: js.Any): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iPad.Popover.arrowDirection> property.
  				 */
  def setArrowDirection(arrowDirection: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iPad.Popover.backgroundColor> property.
  				 */
  def setBackgroundColor(backgroundColor: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iPad.Popover.contentView> property.
  				 */
  def setContentView(contentView: js.Any): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iPad.Popover.height> property.
  				 */
  def setHeight(height: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iPad.Popover.height> property.
  				 */
  def setHeight(height: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iPad.Popover.horizontalMotionEffect> property.
  				 */
  def setHorizontalMotionEffect(horizontalMotionEffect: js.Any): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iPad.Popover.leftNavButton> property.
  				 */
  def setLeftNavButton(leftNavButton: js.Any): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iPad.Popover.passthroughViews> property.
  				 */
  def setPassthroughViews(passthroughViews: js.Array[_]): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iPad.Popover.rightNavButton> property.
  				 */
  def setRightNavButton(rightNavButton: js.Any): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iPad.Popover.title> property.
  				 */
  def setTitle(title: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iPad.Popover.verticalMotionEffect> property.
  				 */
  def setVerticalMotionEffect(verticalMotionEffect: js.Any): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iPad.Popover.width> property.
  				 */
  def setWidth(width: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iPad.Popover.width> property.
  				 */
  def setWidth(width: Double): Unit = js.native
  /**
  				 * Displays the popover.
  				 */
  def show(params: PopoverParams): Unit = js.native
  /**
  				 * Starts a batch update of this view's layout properties.
  				 */
  def startLayout(): Unit = js.native
  /**
  				 * Performs a batch update of all supplied layout properties and schedules a layout pass after
  				 * they have been updated.
  				 */
  def updateLayout(params: js.Any): Unit = js.native
}

