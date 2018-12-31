package typings
package titaniumLib.TitaniumNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A picker column, representing a selectable group of items in a <Titanium.UI.Picker>.
		 */
trait PickerColumn
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * Font to use for text.
  			 */
  var font: titaniumLib.Font
  /**
  			 * Number of rows in this column.
  			 */
  val rowCount: scala.Double
  /**
  			 * Rows of this column.
  			 */
  val rows: js.Array[PickerRow]
  /**
  			 * Adds a row to this column.
  			 */
  def addRow(row: PickerRow): scala.Unit
  /**
  			 * Gets the value of the <Titanium.UI.PickerColumn.font> property.
  			 */
  def getFont(): titaniumLib.Font
  /**
  			 * Gets the value of the <Titanium.UI.PickerColumn.rowCount> property.
  			 */
  def getRowCount(): scala.Double
  /**
  			 * Gets the value of the <Titanium.UI.PickerColumn.rows> property.
  			 */
  def getRows(): js.Array[PickerRow]
  /**
  			 * Removes a row from this column.
  			 */
  def removeRow(row: PickerRow): scala.Unit
  /**
  			 * Sets the value of the <Titanium.UI.PickerColumn.font> property.
  			 */
  def setFont(font: titaniumLib.Font): scala.Unit
}

