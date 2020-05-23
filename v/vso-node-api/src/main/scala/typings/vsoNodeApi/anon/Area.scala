package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Area extends js.Object {
  var area: scala.Double
  var iteration: scala.Double
}

object Area {
  @scala.inline
  def apply(area: scala.Double, iteration: scala.Double): Area = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], iteration = iteration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Area]
  }
}

