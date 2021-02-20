package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the value of any column's row is changed.
  */
@js.native
trait PickerChangeEvent extends PickerBaseEvent {
  
  /**
    * The column object. On iOS, only applicable to <Titanium.UI.PICKER_TYPE_PLAIN>
    * picker types.
    */
  var column: PickerColumn = js.native
  
  /**
    * Selected column index. On iOS, only applicable to <Titanium.UI.PICKER_TYPE_PLAIN>
    * picker types.
    */
  var columnIndex: Double = js.native
  
  /**
    * The selected duration in milliseconds. Applicable to <Titanium.UI.PICKER_TYPE_COUNT_DOWN_TIMER> picker types.
    */
  var countDownDuration: Double = js.native
  
  /**
    * The row object. On iOS, only applicable to <Titanium.UI.PICKER_TYPE_PLAIN> picker types.
    */
  var row: PickerRow = js.native
  
  /**
    * Selected row index. On iOS, only applicable to <Titanium.UI.PICKER_TYPE_PLAIN>
    * picker types.
    */
  var rowIndex: Double = js.native
  
  /**
    * Array of selected values, one element per column in the picker. Applicable to
    * <Titanium.UI.PICKER_TYPE_PLAIN> picker types.
    */
  var selectedValue: js.Array[String] = js.native
  
  /**
    * The selected value. Applicable to date/time pickers only. This property is read-only
    * on Android.
    */
  var value: String = js.native
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
  
  @scala.inline
  implicit class PickerChangeEventMutableBuilder[Self <: PickerChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: PickerColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountDownDuration(value: Double): Self = StObject.set(x, "countDownDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: PickerRow): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedValue(value: js.Array[String]): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedValueVarargs(value: String*): Self = StObject.set(x, "selectedValue", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
