package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Inactive extends js.Object {
  var active: scala.Double
  var inactive: scala.Double
}

object Inactive {
  @scala.inline
  def apply(active: scala.Double, inactive: scala.Double): Inactive = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], inactive = inactive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inactive]
  }
}

