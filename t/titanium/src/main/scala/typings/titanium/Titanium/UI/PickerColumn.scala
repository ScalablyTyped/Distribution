package typings.titanium.Titanium.UI

import typings.titanium.Font
import typings.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A picker column, representing a selectable group of items in a <Titanium.UI.Picker>.
		 */
trait PickerColumn extends Proxy {
  /**
  			 * Font to use for text.
  			 */
  var font: Font
  /**
  			 * Number of rows in this column.
  			 */
  val rowCount: Double
  /**
  			 * Rows of this column.
  			 */
  val rows: js.Array[PickerRow]
  /**
  			 * Adds a row to this column.
  			 */
  def addRow(row: PickerRow): Unit
  /**
  			 * Gets the value of the <Titanium.UI.PickerColumn.font> property.
  			 */
  def getFont(): Font
  /**
  			 * Gets the value of the <Titanium.UI.PickerColumn.rowCount> property.
  			 */
  def getRowCount(): Double
  /**
  			 * Gets the value of the <Titanium.UI.PickerColumn.rows> property.
  			 */
  def getRows(): js.Array[PickerRow]
  /**
  			 * Removes a row from this column.
  			 */
  def removeRow(row: PickerRow): Unit
  /**
  			 * Sets the value of the <Titanium.UI.PickerColumn.font> property.
  			 */
  def setFont(font: Font): Unit
}

object PickerColumn {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    addRow: PickerRow => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Unit,
    font: Font,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getFont: () => Font,
    getRowCount: () => Double,
    getRows: () => js.Array[PickerRow],
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    removeRow: PickerRow => Unit,
    rowCount: Double,
    rows: js.Array[PickerRow],
    setBubbleParent: Boolean => Unit,
    setFont: Font => Unit,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): PickerColumn = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), addRow = js.Any.fromFunction1(addRow), apiName = apiName.asInstanceOf[js.Any], applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent.asInstanceOf[js.Any], fireEvent = js.Any.fromFunction2(fireEvent), font = font.asInstanceOf[js.Any], getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getFont = js.Any.fromFunction0(getFont), getRowCount = js.Any.fromFunction0(getRowCount), getRows = js.Any.fromFunction0(getRows), removeEventListener = js.Any.fromFunction2(removeEventListener), removeRow = js.Any.fromFunction1(removeRow), rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], setBubbleParent = js.Any.fromFunction1(setBubbleParent), setFont = js.Any.fromFunction1(setFont))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerColumn]
  }
}

