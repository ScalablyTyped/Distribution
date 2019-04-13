package typings
package titaniumLib.TitaniumNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A button bar that maintains a selected state.
		 */
@js.native
trait TabbedBar extends View {
  /**
  			 * Index of the currently selected button.
  			 */
  var index: scala.Double = js.native
  /**
  			 * Array of labels for the tabbed bar.
  			 */
  var labels: js.Array[java.lang.String] | js.Array[titaniumLib.BarItemType] = js.native
  /**
  			 * Style of the tabbed bar.
  			 */
  var style: scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabbedBar.index> property.
  			 */
  def getIndex(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabbedBar.labels> property.
  			 */
  def getLabels(): js.Array[java.lang.String] | js.Array[titaniumLib.BarItemType] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabbedBar.style> property.
  			 */
  def getStyle(): scala.Double = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabbedBar.index> property.
  			 */
  def setIndex(index: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabbedBar.labels> property.
  			 */
  def setLabels(labels: js.Array[titaniumLib.BarItemType | java.lang.String]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabbedBar.style> property.
  			 */
  def setStyle(style: scala.Double): scala.Unit = js.native
}

