package typings.winrt.Windows.UI.Core

import typings.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoreProximityEvaluation extends js.Object {
  var adjustedPoint: Point = js.native
  var score: Double = js.native
}

object CoreProximityEvaluation {
  @scala.inline
  def apply(adjustedPoint: Point, score: Double): CoreProximityEvaluation = {
    val __obj = js.Dynamic.literal(adjustedPoint = adjustedPoint.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreProximityEvaluation]
  }
  @scala.inline
  implicit class CoreProximityEvaluationOps[Self <: CoreProximityEvaluation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdjustedPoint(value: Point): Self = this.set("adjustedPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
  }
  
}

