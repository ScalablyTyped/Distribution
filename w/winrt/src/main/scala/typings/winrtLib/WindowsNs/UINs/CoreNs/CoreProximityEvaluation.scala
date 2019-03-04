package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoreProximityEvaluation extends js.Object {
  var adjustedPoint: winrtLib.WindowsNs.FoundationNs.Point
  var score: scala.Double
}

object CoreProximityEvaluation {
  @scala.inline
  def apply(adjustedPoint: winrtLib.WindowsNs.FoundationNs.Point, score: scala.Double): CoreProximityEvaluation = {
    val __obj = js.Dynamic.literal(adjustedPoint = adjustedPoint, score = score)
  
    __obj.asInstanceOf[CoreProximityEvaluation]
  }
}

