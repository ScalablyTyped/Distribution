package typings.sugar.sugarjsNs.NumberNs

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
    val __obj = js.Dynamic.literal(decimal = decimal, thousands = thousands)
  
    __obj.asInstanceOf[NumberOptions]
  }
}

