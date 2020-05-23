package typings.tableau.tableau

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pair extends js.Object {
  /** The field name to which the value is applied. */
  var fieldName: String
  /** The value formatted according to the locale and the formatting applied to the field. */
  var formattedValue: String
  /** Contains the raw native value for the field as a JavaScript type, which is one of String, Number, Boolean, or Date. */
  var value: String | Double | Boolean | Date
}

object Pair {
  @scala.inline
  def apply(fieldName: String, formattedValue: String, value: String | Double | Boolean | Date): Pair = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], formattedValue = formattedValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pair]
  }
}

