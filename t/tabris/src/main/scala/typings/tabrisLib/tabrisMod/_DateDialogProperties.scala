package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// DateDialog
trait _DateDialogProperties extends _NativeObjectProperties {
  /**
    * The date to be displayed in the dialog. The current date is used when no date is provided.
    */
  var date: stdLib.Date
  /**
    * Limits the selectable date range to the given future date. No limit is applied when not set.
    */
  var maxDate: stdLib.Date
  /**
    * Limits the selectable date range to the given past date. No limit is applied when not set.
    */
  var minDate: stdLib.Date
}

object _DateDialogProperties {
  @scala.inline
  def apply(date: stdLib.Date, maxDate: stdLib.Date, minDate: stdLib.Date): _DateDialogProperties = {
    val __obj = js.Dynamic.literal(date = date, maxDate = maxDate, minDate = minDate)
  
    __obj.asInstanceOf[_DateDialogProperties]
  }
}

