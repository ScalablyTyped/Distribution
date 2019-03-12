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
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    addRow: PickerRow => scala.Unit,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    bubbleParent: scala.Boolean,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    font: titaniumLib.Font,
    getApiName: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    getFont: () => titaniumLib.Font,
    getRowCount: () => scala.Double,
    getRows: () => js.Array[PickerRow],
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    removeRow: PickerRow => scala.Unit,
    rowCount: scala.Double,
    rows: js.Array[PickerRow],
    setBubbleParent: scala.Boolean => scala.Unit,
    setFont: titaniumLib.Font => scala.Unit,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, scala.Unit]) = null
  ): PickerColumn = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), addRow = js.Any.fromFunction1(addRow), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), font = font, getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getFont = js.Any.fromFunction0(getFont), getRowCount = js.Any.fromFunction0(getRowCount), getRows = js.Any.fromFunction0(getRows), removeEventListener = js.Any.fromFunction2(removeEventListener), removeRow = js.Any.fromFunction1(removeRow), rowCount = rowCount, rows = rows, setBubbleParent = js.Any.fromFunction1(setBubbleParent), setFont = js.Any.fromFunction1(setFont))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[PickerColumn]
  }
}

