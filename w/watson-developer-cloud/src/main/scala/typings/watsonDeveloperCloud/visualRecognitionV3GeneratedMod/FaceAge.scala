package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Age information about a face. */
@js.native
trait FaceAge extends StObject {
  
  /** Estimated maximum age. */
  var max: js.UndefOr[Double] = js.native
  
  /** Estimated minimum age. */
  var min: js.UndefOr[Double] = js.native
  
  /** Confidence score in the range of 0 to 1. A higher score indicates greater confidence in the estimated value for the property. */
  var score: Double = js.native
}
object FaceAge {
  
  @scala.inline
  def apply(score: Double): FaceAge = {
    val __obj = js.Dynamic.literal(score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceAge]
  }
  
  @scala.inline
  implicit class FaceAgeMutableBuilder[Self <: FaceAge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
  }
}
