package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** TargetedSentimentResults. */
trait TargetedSentimentResults extends StObject {
  
  /** Sentiment score from -1 (negative) to 1 (positive). */
  var score: js.UndefOr[Double] = js.undefined
  
  /** Targeted text. */
  var text: js.UndefOr[String] = js.undefined
}
object TargetedSentimentResults {
  
  inline def apply(): TargetedSentimentResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetedSentimentResults]
  }
  
  extension [Self <: TargetedSentimentResults](x: Self) {
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
