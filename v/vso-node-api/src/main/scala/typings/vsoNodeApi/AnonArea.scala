package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArea extends js.Object {
  var area: Double
  var iteration: Double
}

object AnonArea {
  @scala.inline
  def apply(area: Double, iteration: Double): AnonArea = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], iteration = iteration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArea]
  }
}

