package typings.uikit.UIkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerOptions extends js.Object {
  /**
    * Date format string
    * @default 'DD.MM.YYYY'
    */
  var format: js.UndefOr[String] = js.undefined
  /**
    * Language string definitions
    * @default { months:['January',...], weekdays:['Sun',..,'Sat'] }
    */
  var i18n: js.UndefOr[js.Object] = js.undefined
  /**
    * Max. date
    * bool (false to ignore the option)
    * string (date as in format)
    * integer (offset in days from current date)
    * @default false
    */
  var maxDate: js.UndefOr[String | Boolean | Double] = js.undefined
  /**
    * Min. date
    * bool (false to ignore the option)
    * string (date as in format)
    * integer (offset in days from current date)
    * @default false
    */
  var minDate: js.UndefOr[String | Boolean | Double] = js.undefined
  /**
    * Offset to the input value
    * @default 5
    */
  var offsettop: js.UndefOr[Double] = js.undefined
  /**
    * Position of the datepicker
    * 'auto', 'top', 'bottom'
    * @default 'auto'
    */
  var pos: js.UndefOr[String] = js.undefined
  /**
    * Start of the week
    * integer (0..6)
    * @default 1
    */
  var weekstart: js.UndefOr[Double] = js.undefined
}

object DatePickerOptions {
  @scala.inline
  def apply(
    format: String = null,
    i18n: js.Object = null,
    maxDate: String | Boolean | Double = null,
    minDate: String | Boolean | Double = null,
    offsettop: Int | Double = null,
    pos: String = null,
    weekstart: Int | Double = null
  ): DatePickerOptions = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (i18n != null) __obj.updateDynamic("i18n")(i18n)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (offsettop != null) __obj.updateDynamic("offsettop")(offsettop.asInstanceOf[js.Any])
    if (pos != null) __obj.updateDynamic("pos")(pos)
    if (weekstart != null) __obj.updateDynamic("weekstart")(weekstart.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerOptions]
  }
}

