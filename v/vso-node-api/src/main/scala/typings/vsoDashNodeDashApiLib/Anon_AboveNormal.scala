package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AboveNormal extends js.Object {
  var aboveNormal: scala.Double
  var belowNormal: scala.Double
  var high: scala.Double
  var low: scala.Double
  var normal: scala.Double
}

object Anon_AboveNormal {
  @scala.inline
  def apply(
    aboveNormal: scala.Double,
    belowNormal: scala.Double,
    high: scala.Double,
    low: scala.Double,
    normal: scala.Double
  ): Anon_AboveNormal = {
    val __obj = js.Dynamic.literal(aboveNormal = aboveNormal, belowNormal = belowNormal, high = high, low = low, normal = normal)
  
    __obj.asInstanceOf[Anon_AboveNormal]
  }
}

