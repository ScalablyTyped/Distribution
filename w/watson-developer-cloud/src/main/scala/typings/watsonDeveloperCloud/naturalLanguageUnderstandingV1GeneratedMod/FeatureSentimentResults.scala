package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FeatureSentimentResults. */
trait FeatureSentimentResults extends StObject {
  
  /** Sentiment score from -1 (negative) to 1 (positive). */
  var score: js.UndefOr[Double] = js.undefined
}
object FeatureSentimentResults {
  
  inline def apply(): FeatureSentimentResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureSentimentResults]
  }
  
  extension [Self <: FeatureSentimentResults](x: Self) {
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
