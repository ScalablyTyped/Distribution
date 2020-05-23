package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataValue extends js.Object {
  /** The value formatted according to the locale and the formatting applied to the field or parameter. */
  var formattedValue: String
  /** Contains the raw native value as a JavaScript type, which is one of String, Number, Boolean, or Date */
  var value: js.Any
}

object DataValue {
  @scala.inline
  def apply(formattedValue: String, value: js.Any): DataValue = {
    val __obj = js.Dynamic.literal(formattedValue = formattedValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataValue]
  }
}

