package typings.webcola.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LowerBound extends js.Object {
  var lowerBound: Double
  var newCenters: js.Array[Double]
  var upperBound: Double
}

object LowerBound {
  @scala.inline
  def apply(lowerBound: Double, newCenters: js.Array[Double], upperBound: Double): LowerBound = {
    val __obj = js.Dynamic.literal(lowerBound = lowerBound.asInstanceOf[js.Any], newCenters = newCenters.asInstanceOf[js.Any], upperBound = upperBound.asInstanceOf[js.Any])
    __obj.asInstanceOf[LowerBound]
  }
}

