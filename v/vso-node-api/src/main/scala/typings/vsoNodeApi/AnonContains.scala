package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContains extends js.Object {
  var contains: Double
  var exact: Double
  var startsWith: Double
}

object AnonContains {
  @scala.inline
  def apply(contains: Double, exact: Double, startsWith: Double): AnonContains = {
    val __obj = js.Dynamic.literal(contains = contains.asInstanceOf[js.Any], exact = exact.asInstanceOf[js.Any], startsWith = startsWith.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContains]
  }
}

