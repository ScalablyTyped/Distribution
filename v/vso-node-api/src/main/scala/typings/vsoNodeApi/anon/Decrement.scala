package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Decrement extends js.Object {
  var decrement: scala.Double
  var delete: scala.Double
  var increment: scala.Double
  var none: scala.Double
  var set: scala.Double
}

object Decrement {
  @scala.inline
  def apply(
    decrement: scala.Double,
    delete: scala.Double,
    increment: scala.Double,
    none: scala.Double,
    set: scala.Double
  ): Decrement = {
    val __obj = js.Dynamic.literal(decrement = decrement.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], increment = increment.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decrement]
  }
}

