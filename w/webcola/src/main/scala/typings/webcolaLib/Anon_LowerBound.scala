package typings
package webcolaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LowerBound extends js.Object {
  var lowerBound: scala.Double
  var newCenters: js.Array[scala.Double]
  var upperBound: scala.Double
}

object Anon_LowerBound {
  @scala.inline
  def apply(lowerBound: scala.Double, newCenters: js.Array[scala.Double], upperBound: scala.Double): Anon_LowerBound = {
    val __obj = js.Dynamic.literal(lowerBound = lowerBound, newCenters = newCenters, upperBound = upperBound)
  
    __obj.asInstanceOf[Anon_LowerBound]
  }
}

