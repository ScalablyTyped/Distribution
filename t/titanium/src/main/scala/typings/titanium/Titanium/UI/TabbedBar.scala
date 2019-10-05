package typings.titanium.Titanium.UI

import typings.titanium.BarItemType
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
  var index: Double = js.native
  /**
  			 * Array of labels for the tabbed bar.
  			 */
  var labels: js.Array[BarItemType | String] = js.native
  /**
  			 * Style of the tabbed bar.
  			 */
  var style: Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabbedBar.index> property.
  			 */
  def getIndex(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabbedBar.labels> property.
  			 */
  def getLabels(): js.Array[BarItemType | String] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabbedBar.style> property.
  			 */
  def getStyle(): Double = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabbedBar.index> property.
  			 */
  def setIndex(index: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabbedBar.labels> property.
  			 */
  def setLabels(labels: js.Array[BarItemType | String]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabbedBar.style> property.
  			 */
  def setStyle(style: Double): Unit = js.native
}

