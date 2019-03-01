package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Decrement extends js.Object {
  var decrement: scala.Double
  var delete: scala.Double
  var increment: scala.Double
  var none: scala.Double
  var set: scala.Double
}

object Anon_Decrement {
  @scala.inline
  def apply(
    decrement: scala.Double,
    delete: scala.Double,
    increment: scala.Double,
    none: scala.Double,
    set: scala.Double
  ): Anon_Decrement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decrement")(decrement)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("increment")(increment)
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("set")(set)
    __obj.asInstanceOf[Anon_Decrement]
  }
}

