package typings.winrt.WindowsNs.UINs.CoreNs

import typings.winrt.WindowsNs.FoundationNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoreProximityEvaluation extends js.Object {
  var adjustedPoint: Point
  var score: Double
}

object CoreProximityEvaluation {
  @scala.inline
  def apply(adjustedPoint: Point, score: Double): CoreProximityEvaluation = {
    val __obj = js.Dynamic.literal(adjustedPoint = adjustedPoint, score = score)
  
    __obj.asInstanceOf[CoreProximityEvaluation]
  }
}

