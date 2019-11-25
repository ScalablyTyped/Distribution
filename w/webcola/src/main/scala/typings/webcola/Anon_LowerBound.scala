package typings.webcola

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LowerBound extends js.Object {
  var lowerBound: Double
  var newCenters: js.Array[Double]
  var upperBound: Double
}

object Anon_LowerBound {
  @scala.inline
  def apply(lowerBound: Double, newCenters: js.Array[Double], upperBound: Double): Anon_LowerBound = {
    val __obj = js.Dynamic.literal(lowerBound = lowerBound.asInstanceOf[js.Any], newCenters = newCenters.asInstanceOf[js.Any], upperBound = upperBound.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_LowerBound]
  }
}

