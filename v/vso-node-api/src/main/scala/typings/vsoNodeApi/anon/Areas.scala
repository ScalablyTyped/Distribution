package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Areas extends js.Object {
  var areas: scala.Double
  var iterations: scala.Double
}

object Areas {
  @scala.inline
  def apply(areas: scala.Double, iterations: scala.Double): Areas = {
    val __obj = js.Dynamic.literal(areas = areas.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Areas]
  }
}

