package typings.titanium.Titanium.UI

import typings.titanium.Font
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
  var color: String = js.native
  /**
  			 * Font to use for the item text.
  			 */
  var font: Font = js.native
  /**
  			 * Item text.
  			 */
  var title: String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.PickerRow.color> property.
  			 */
  def getColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.PickerRow.font> property.
  			 */
  def getFont(): Font = js.native
  /**
  			 * Gets the value of the <Titanium.UI.PickerRow.title> property.
  			 */
  def getTitle(): String = js.native
  /**
  			 * Sets the value of the <Titanium.UI.PickerRow.color> property.
  			 */
  def setColor(color: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.PickerRow.font> property.
  			 */
  def setFont(font: Font): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.PickerRow.title> property.
  			 */
  def setTitle(title: String): Unit = js.native
}

