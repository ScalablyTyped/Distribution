package typings
package sugarLib.sugarjsNs.NumberNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberOptions extends js.Object {
  var decimal: java.lang.String
  var thousands: java.lang.String
}

object NumberOptions {
  @scala.inline
  def apply(decimal: java.lang.String, thousands: java.lang.String): NumberOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decimal")(decimal)
    __obj.updateDynamic("thousands")(thousands)
    __obj.asInstanceOf[NumberOptions]
  }
}

