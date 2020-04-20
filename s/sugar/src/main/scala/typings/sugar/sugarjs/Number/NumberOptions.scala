package typings.sugar.sugarjs.Number

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberOptions extends js.Object {
  var decimal: String
  var thousands: String
}

object NumberOptions {
  @scala.inline
  def apply(decimal: String, thousands: String): NumberOptions = {
    val __obj = js.Dynamic.literal(decimal = decimal.asInstanceOf[js.Any], thousands = thousands.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberOptions]
  }
}

