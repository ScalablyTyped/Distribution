package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contains extends js.Object {
  var contains: scala.Double
  var exact: scala.Double
  var startsWith: scala.Double
}

object Contains {
  @scala.inline
  def apply(contains: scala.Double, exact: scala.Double, startsWith: scala.Double): Contains = {
    val __obj = js.Dynamic.literal(contains = contains.asInstanceOf[js.Any], exact = exact.asInstanceOf[js.Any], startsWith = startsWith.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contains]
  }
}

