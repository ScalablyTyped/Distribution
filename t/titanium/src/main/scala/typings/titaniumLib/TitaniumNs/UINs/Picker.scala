package typings
package titaniumLib.TitaniumNs.UINs

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
  var calendarViewShown: scala.Boolean = js.native
  /**
  			 * Columns used for this picker, as an array of <Titanium.UI.PickerColumn> objects.
  			 */
  var columns: js.Array[PickerColumn] = js.native
  /**
  			 * Duration in milliseconds used for a Countdown Timer picker.
  			 */
  var countDownDuration: scala.Double = js.native
  /**
  			 * Sets the text color of date- and time-pickers.
  			 */
  var dateTimeColor: java.lang.String = js.native
  /**
  			 * Font to use for text.
  			 */
  var font: titaniumLib.Font = js.native
  /**
  			 * Determines whether the Time pickers display in 24-hour or 12-hour clock format.
  			 */
  var format24: scala.Boolean = js.native
  /**
  			 * Locale used when displaying Date and Time picker values.
  			 */
  var locale: java.lang.String = js.native
  /**
  			 * Maximum date displayed when a Date picker is in use.
  			 */
  var maxDate: stdLib.Date = js.native
  /**
  			 * Minimum date displayed when a Date picker is in use.
  			 */
  var minDate: stdLib.Date = js.native
  /**
  			 * Interval in minutes displayed when one of the Time types of pickers is in use.
  			 */
  var minuteInterval: scala.Double = js.native
  /**
  			 * Creates a native Android control for creating a Time Spinner with Type `Ti.UI.PICKER_TYPE_TIME`.
  			 * This is invoked rather than the default native "dropdown" style.
  			 */
  var nativeSpinner: scala.Boolean = js.native
  /**
  			 * Determines whether the visual selection indicator is shown.
  			 */
  var selectionIndicator: scala.Boolean = js.native
  /**
  			 * Determines whether calling the method `setSelectedRow` opens when called
  			 */
  var selectionOpens: scala.Boolean = js.native
  /**
  			 * Determines the type of picker displayed
  			 */
  var `type`: scala.Double = js.native
  /**
  			 * Determines whether the non-native Android control, with a spinning wheel that looks and
  			 * behaves like the iOS picker, is invoked rather than the default native "dropdown" style.
  			 */
  var useSpinner: scala.Boolean = js.native
  /**
  			 * Date and time value for Date and Time pickers.
  			 */
  var value: stdLib.Date = js.native
  /**
  			 * Number of visible rows to display. This is only applicable to a plain picker and when the
  			 * `useSpinner` is `true`.
  			 */
  var visibleItems: scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Picker.calendarViewShown> property.
  			 */
  def getCalendarViewShown(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Picker.columns> property.
  			 */
  def getColumns(): js.Array[PickerColumn] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Picker.countDownDuration> property.
  			 */
  def getCountDownDuration(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Picker.dateTimeColor> property.
  			 */
  def getDateTimeColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Picker.font> property.
  			 */
  def getFont(): titaniumLib.Font = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Picker.format24> property.
  			 */
  def getFormat24(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Picker.locale> property.
  			 */
  def getLocale(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Picker.maxDate> property.
  			 */
  def getMaxDate(): stdLib.Date = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Picker.minDate> property.
  			 */
  def getMinDate(): stdLib.Date = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Picker.minuteInterval> property.
  			 */
  def getMinuteInterval(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Picker.nativeSpinner> property.
  			 */
  def getNativeSpinner(): scala.Boolean = js.native
  /**
  			 * Gets the selected row for a column, or `null` if none exists.
  			 */
  def getSelectedRow(index: scala.Double): PickerRow = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Picker.selectionIndicator> property.
  			 */
  def getSelectionIndicator(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Picker.selectionOpens> property.
  			 */
  def getSelectionOpens(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Picker.type> property.
  			 */
  def getType(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Picker.useSpinner> property.
  			 */
  def getUseSpinner(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Picker.value> property.
  			 */
  def getValue(): stdLib.Date = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Picker.visibleItems> property.
  			 */
  def getVisibleItems(): scala.Double = js.native
  /**
  			 * Repopulates values for a column.
  			 */
  def reloadColumn(column: PickerColumn): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Picker.calendarViewShown> property.
  			 */
  def setCalendarViewShown(calendarViewShown: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Picker.columns> property.
  			 */
  def setColumns(columns: js.Array[PickerColumn]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Picker.countDownDuration> property.
  			 */
  def setCountDownDuration(countDownDuration: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Picker.dateTimeColor> property.
  			 */
  def setDateTimeColor(dateTimeColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Picker.font> property.
  			 */
  def setFont(font: titaniumLib.Font): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Picker.format24> property.
  			 */
  def setFormat24(format24: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Picker.locale> property.
  			 */
  def setLocale(locale: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Picker.maxDate> property.
  			 */
  def setMaxDate(maxDate: stdLib.Date): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Picker.minDate> property.
  			 */
  def setMinDate(minDate: stdLib.Date): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Picker.minuteInterval> property.
  			 */
  def setMinuteInterval(minuteInterval: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Picker.nativeSpinner> property.
  			 */
  def setNativeSpinner(nativeSpinner: scala.Boolean): scala.Unit = js.native
  /**
  			 * Selects a column's row.
  			 */
  def setSelectedRow(column: scala.Double, row: scala.Double): scala.Unit = js.native
  /**
  			 * Selects a column's row.
  			 */
  def setSelectedRow(column: scala.Double, row: scala.Double, animated: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Picker.selectionIndicator> property.
  			 */
  def setSelectionIndicator(selectionIndicator: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Picker.selectionOpens> property.
  			 */
  def setSelectionOpens(selectionOpens: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Picker.type> property.
  			 */
  def setType(`type`: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Picker.useSpinner> property.
  			 */
  def setUseSpinner(useSpinner: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the date and time value property for Date pickers.
  			 */
  def setValue(date: js.Any, suppressEvent: scala.Boolean): PickerRow = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Picker.value> property.
  			 */
  def setValue(value: stdLib.Date): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Picker.visibleItems> property.
  			 */
  def setVisibleItems(visibleItems: scala.Double): scala.Unit = js.native
  /**
  			 * Shows Date picker as a modal dialog.
  			 */
  def showDatePickerDialog(dictObj: js.Any): scala.Unit = js.native
  /**
  			 * Shows Time picker as a modal dialog.
  			 */
  def showTimePickerDialog(dictObj: js.Any): scala.Unit = js.native
}

