package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FeatureSentimentResults. */
@js.native
trait FeatureSentimentResults extends StObject {
  
  /** Sentiment score from -1 (negative) to 1 (positive). */
  var score: js.UndefOr[Double] = js.native
}
object FeatureSentimentResults {
  
  @scala.inline
  def apply(): FeatureSentimentResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureSentimentResults]
  }
  
  @scala.inline
  implicit class FeatureSentimentResultsMutableBuilder[Self <: FeatureSentimentResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
