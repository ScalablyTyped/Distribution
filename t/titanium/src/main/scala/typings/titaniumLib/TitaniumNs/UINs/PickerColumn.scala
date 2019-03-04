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

object PickerColumn {
  @scala.inline
  def apply(
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    addRow: js.Function1[PickerRow, scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    font: titaniumLib.Font,
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getFont: js.Function0[titaniumLib.Font],
    getRowCount: js.Function0[scala.Double],
    getRows: js.Function0[js.Array[PickerRow]],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    removeRow: js.Function1[PickerRow, scala.Unit],
    rowCount: scala.Double,
    rows: js.Array[PickerRow],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setFont: js.Function1[titaniumLib.Font, scala.Unit],
    getLifecycleContainer: js.Function0[Window | TabGroup] = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, scala.Unit]) = null
  ): PickerColumn = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener, addRow = addRow, apiName = apiName, applyProperties = applyProperties, bubbleParent = bubbleParent, fireEvent = fireEvent, font = font, getApiName = getApiName, getBubbleParent = getBubbleParent, getFont = getFont, getRowCount = getRowCount, getRows = getRows, removeEventListener = removeEventListener, removeRow = removeRow, rowCount = rowCount, rows = rows, setBubbleParent = setBubbleParent, setFont = setFont)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[PickerColumn]
  }
}

