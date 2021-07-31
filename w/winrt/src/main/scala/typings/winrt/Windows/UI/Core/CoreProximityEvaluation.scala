package typings.winrt.Windows.UI.Core

import typings.winrt.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreProximityEvaluation extends StObject {
  
  var adjustedPoint: Point
  
  var score: Double
}
object CoreProximityEvaluation {
  
  @scala.inline
  def apply(adjustedPoint: Point, score: Double): CoreProximityEvaluation = {
    val __obj = js.Dynamic.literal(adjustedPoint = adjustedPoint.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreProximityEvaluation]
  }
  
  @scala.inline
  implicit class CoreProximityEvaluationMutableBuilder[Self <: CoreProximityEvaluation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdjustedPoint(value: Point): Self = StObject.set(x, "adjustedPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
  }
}
