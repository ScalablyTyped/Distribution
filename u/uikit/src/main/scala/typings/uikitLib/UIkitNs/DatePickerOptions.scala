package typings
package uikitLib.UIkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerOptions extends js.Object {
  /**
    * Date format string
    * @default 'DD.MM.YYYY'
    */
  var format: js.UndefOr[java.lang.String] = js.undefined
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
  var maxDate: js.UndefOr[java.lang.String | scala.Boolean | scala.Double] = js.undefined
  /**
    * Min. date
    * bool (false to ignore the option)
    * string (date as in format)
    * integer (offset in days from current date)
    * @default false
    */
  var minDate: js.UndefOr[java.lang.String | scala.Boolean | scala.Double] = js.undefined
  /**
    * Offset to the input value
    * @default 5
    */
  var offsettop: js.UndefOr[scala.Double] = js.undefined
  /**
    * Position of the datepicker
    * 'auto', 'top', 'bottom'
    * @default 'auto'
    */
  var pos: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Start of the week
    * integer (0..6)
    * @default 1
    */
  var weekstart: js.UndefOr[scala.Double] = js.undefined
}

