package typings
package valiantLib.valiantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Endpoint[T] extends js.Object {
  var finite: scala.Boolean
  var inclusive: scala.Boolean
  var value: T
}

object Endpoint {
  @scala.inline
  def apply[T](finite: scala.Boolean, inclusive: scala.Boolean, value: T): Endpoint[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("finite")(finite)
    __obj.updateDynamic("inclusive")(inclusive)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint[T]]
  }
}

