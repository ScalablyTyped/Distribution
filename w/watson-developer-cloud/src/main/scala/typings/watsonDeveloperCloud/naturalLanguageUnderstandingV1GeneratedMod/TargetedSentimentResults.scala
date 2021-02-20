package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** TargetedSentimentResults. */
@js.native
trait TargetedSentimentResults extends StObject {
  
  /** Sentiment score from -1 (negative) to 1 (positive). */
  var score: js.UndefOr[Double] = js.native
  
  /** Targeted text. */
  var text: js.UndefOr[String] = js.native
}
object TargetedSentimentResults {
  
  @scala.inline
  def apply(): TargetedSentimentResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetedSentimentResults]
  }
  
  @scala.inline
  implicit class TargetedSentimentResultsMutableBuilder[Self <: TargetedSentimentResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
