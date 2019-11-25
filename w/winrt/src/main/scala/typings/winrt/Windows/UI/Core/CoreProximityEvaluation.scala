package typings.winrt.Windows.UI.Core

import typings.winrt.Windows.Foundation.Point
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
    val __obj = js.Dynamic.literal(adjustedPoint = adjustedPoint.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CoreProximityEvaluation]
  }
}

