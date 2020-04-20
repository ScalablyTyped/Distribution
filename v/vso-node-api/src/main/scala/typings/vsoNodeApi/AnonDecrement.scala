package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDecrement extends js.Object {
  var decrement: Double
  var delete: Double
  var increment: Double
  var none: Double
  var set: Double
}

object AnonDecrement {
  @scala.inline
  def apply(decrement: Double, delete: Double, increment: Double, none: Double, set: Double): AnonDecrement = {
    val __obj = js.Dynamic.literal(decrement = decrement.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], increment = increment.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDecrement]
  }
}

