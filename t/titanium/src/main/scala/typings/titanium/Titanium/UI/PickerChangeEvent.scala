package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the value of any column's row is changed.
  */
trait PickerChangeEvent extends PickerBaseEvent {
  /**
    * The column object. On iOS, only applicable to <Titanium.UI.PICKER_TYPE_PLAIN>
    * picker types.
    */
  var column: PickerColumn
  /**
    * Selected column index. On iOS, only applicable to <Titanium.UI.PICKER_TYPE_PLAIN>
    * picker types.
    */
  var columnIndex: Double
  /**
    * The selected duration in milliseconds. Applicable to <Titanium.UI.PICKER_TYPE_COUNT_DOWN_TIMER> picker types.
    */
  var countDownDuration: Double
  /**
    * The row object. On iOS, only applicable to <Titanium.UI.PICKER_TYPE_PLAIN> picker types.
    */
  var row: PickerRow
  /**
    * Selected row index. On iOS, only applicable to <Titanium.UI.PICKER_TYPE_PLAIN>
    * picker types.
    */
  var rowIndex: Double
  /**
    * Array of selected values, one element per column in the picker. Applicable to
    * <Titanium.UI.PICKER_TYPE_PLAIN> picker types.
    */
  var selectedValue: js.Array[String]
  /**
    * The selected value. Applicable to date/time pickers only. This property is read-only
    * on Android.
    */
  var value: String
}

object PickerChangeEvent {
  @scala.inline
  def apply(
    column: PickerColumn,
    columnIndex: Double,
    countDownDuration: Double,
    row: PickerRow,
    rowIndex: Double,
    selectedValue: js.Array[String],
    source: Picker,
    value: String
  ): PickerChangeEvent = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], countDownDuration = countDownDuration.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], selectedValue = selectedValue.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerChangeEvent]
  }
}

