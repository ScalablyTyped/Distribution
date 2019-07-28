package typings.titanium.TitaniumNs.UINs

import typings.std.Date
import typings.titanium.Font
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A control used to select one or more fixed values.
		 */
@js.native
trait Picker extends View {
  /**
  			 * Determines whether the calenderView is visible.
  			 */
  var calendarViewShown: Boolean = js.native
  /**
  			 * Columns used for this picker, as an array of <Titanium.UI.PickerColumn> objects.
  			 */
  var columns: js.Array[PickerColumn] = js.native
  /**
  			 * Duration in milliseconds used for a Countdown Timer picker.
  			 */
  var countDownDuration: Double = js.native
  /**
  			 * Sets the text color of date- and time-pickers.
  			 */
  var dateTimeColor: String = js.native
  /**
  			 * Font to use for text.
  			 */
  var font: Font = js.native
  /**
  			 * Determines whether the Time pickers display in 24-hour or 12-hour clock format.
  			 */
  var format24: Boolean = js.native
  /**
  			 * Locale used when displaying Date and Time picker values.
  			 */
  var locale: String = js.native
  /**
  			 * Maximum date displayed when a Date picker is in use.
  			 */
  var maxDate: Date = js.native
  /**
  			 * Minimum date displayed when a Date picker is in use.
  			 */
  var minDate: Date = js.native
  /**
  			 * Interval in minutes displayed when one of the Time types of pickers is in use.
  			 */
  var minuteInterval: Double = js.native
  /**
  			 * Creates a native Android control for creating a Time Spinner with Type `Ti.UI.PICKER_TYPE_TIME`.
  			 * This is invoked rather than the default native "dropdown" style.
  			 */
  var nativeSpinner: Boolean = js.native
  /**
  			 * Determines whether the visual selection indicator is shown.
  			 */
  var selectionIndicator: Boolean = js.native
  /**
  			 * Determines whether calling the method `setSelectedRow` opens when called
  			 */
  var selectionOpens: Boolean = js.native
  /**
  			 * Determines the type of picker displayed
  			 */
  var `type`: Double = js.native
  /**
  			 * Determines whether the non-native Android control, with a spinning wheel that looks and
  			 * behaves like the iOS picker, is invoked rather than the default native "dropdown" style.
  			 */
  var useSpinner: Boolean = js.native
  /**
  			 * Date and time value for Date and Time pickers.
  			 */
  var value: Date = js.native
  /**
  			 * Number of visible rows to display. This is only applicable to a plain picker and when the
  			 * `useSpinner` is `true`.
  			 */
  var visibleItems: Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Picker.calendarViewShown> property.
  			 */
  def getCalendarViewShown(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Picker.columns> property.
  			 */
  def getColumns(): js.Array[PickerColumn] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Picker.countDownDuration> property.
  			 */
  def getCountDownDuration(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Picker.dateTimeColor> property.
  			 */
  def getDateTimeColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Picker.font> property.
  			 */
  def getFont(): Font = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Picker.format24> property.
  			 */
  def getFormat24(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Picker.locale> property.
  			 */
  def getLocale(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Picker.maxDate> property.
  			 */
  def getMaxDate(): Date = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Picker.minDate> property.
  			 */
  def getMinDate(): Date = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Picker.minuteInterval> property.
  			 */
  def getMinuteInterval(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Picker.nativeSpinner> property.
  			 */
  def getNativeSpinner(): Boolean = js.native
  /**
  			 * Gets the selected row for a column, or `null` if none exists.
  			 */
  def getSelectedRow(index: Double): PickerRow = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Picker.selectionIndicator> property.
  			 */
  def getSelectionIndicator(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Picker.selectionOpens> property.
  			 */
  def getSelectionOpens(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Picker.type> property.
  			 */
  def getType(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Picker.useSpinner> property.
  			 */
  def getUseSpinner(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Picker.value> property.
  			 */
  def getValue(): Date = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Picker.visibleItems> property.
  			 */
  def getVisibleItems(): Double = js.native
  /**
  			 * Repopulates values for a column.
  			 */
  def reloadColumn(column: PickerColumn): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Picker.calendarViewShown> property.
  			 */
  def setCalendarViewShown(calendarViewShown: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Picker.columns> property.
  			 */
  def setColumns(columns: js.Array[PickerColumn]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Picker.countDownDuration> property.
  			 */
  def setCountDownDuration(countDownDuration: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Picker.dateTimeColor> property.
  			 */
  def setDateTimeColor(dateTimeColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Picker.font> property.
  			 */
  def setFont(font: Font): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Picker.format24> property.
  			 */
  def setFormat24(format24: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Picker.locale> property.
  			 */
  def setLocale(locale: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Picker.maxDate> property.
  			 */
  def setMaxDate(maxDate: Date): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Picker.minDate> property.
  			 */
  def setMinDate(minDate: Date): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Picker.minuteInterval> property.
  			 */
  def setMinuteInterval(minuteInterval: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Picker.nativeSpinner> property.
  			 */
  def setNativeSpinner(nativeSpinner: Boolean): Unit = js.native
  /**
  			 * Selects a column's row.
  			 */
  def setSelectedRow(column: Double, row: Double): Unit = js.native
  def setSelectedRow(column: Double, row: Double, animated: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Picker.selectionIndicator> property.
  			 */
  def setSelectionIndicator(selectionIndicator: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Picker.selectionOpens> property.
  			 */
  def setSelectionOpens(selectionOpens: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Picker.type> property.
  			 */
  def setType(`type`: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Picker.useSpinner> property.
  			 */
  def setUseSpinner(useSpinner: Boolean): Unit = js.native
  /**
  			 * Sets the date and time value property for Date pickers.
  			 */
  def setValue(date: js.Any, suppressEvent: Boolean): PickerRow = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Picker.visibleItems> property.
  			 */
  def setVisibleItems(visibleItems: Double): Unit = js.native
  /**
  			 * Shows Date picker as a modal dialog.
  			 */
  def showDatePickerDialog(dictObj: js.Any): Unit = js.native
  /**
  			 * Shows Time picker as a modal dialog.
  			 */
  def showTimePickerDialog(dictObj: js.Any): Unit = js.native
}

