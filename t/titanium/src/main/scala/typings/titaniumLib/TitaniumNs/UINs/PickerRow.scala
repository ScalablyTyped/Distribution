package typings
package titaniumLib.TitaniumNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A picker row, representing a selectable item in a <Titanium.UI.Picker>.
		 */
@js.native
trait PickerRow extends View {
  /**
  			 * Color of the item text, as a color name or hex triplet.
  			 */
  var color: java.lang.String = js.native
  /**
  			 * Font to use for the item text.
  			 */
  var font: titaniumLib.Font = js.native
  /**
  			 * Item text.
  			 */
  var title: java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.PickerRow.color> property.
  			 */
  def getColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.PickerRow.font> property.
  			 */
  def getFont(): titaniumLib.Font = js.native
  /**
  			 * Gets the value of the <Titanium.UI.PickerRow.title> property.
  			 */
  def getTitle(): java.lang.String = js.native
  /**
  			 * Sets the value of the <Titanium.UI.PickerRow.color> property.
  			 */
  def setColor(color: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.PickerRow.font> property.
  			 */
  def setFont(font: titaniumLib.Font): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.PickerRow.title> property.
  			 */
  def setTitle(title: java.lang.String): scala.Unit = js.native
}

