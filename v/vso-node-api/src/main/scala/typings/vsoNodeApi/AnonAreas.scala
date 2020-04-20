package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAreas extends js.Object {
  var areas: Double
  var iterations: Double
}

object AnonAreas {
  @scala.inline
  def apply(areas: Double, iterations: Double): AnonAreas = {
    val __obj = js.Dynamic.literal(areas = areas.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAreas]
  }
}

