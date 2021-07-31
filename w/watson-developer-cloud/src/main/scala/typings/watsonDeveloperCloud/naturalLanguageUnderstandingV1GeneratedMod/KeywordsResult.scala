package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The important keywords in the content, organized by relevance. */
trait KeywordsResult extends StObject {
  
  /** Number of times the keyword appears in the analyzed text. */
  var count: js.UndefOr[Double] = js.undefined
  
  /** Emotion analysis results for the keyword, enabled with the `emotion` option. */
  var emotion: js.UndefOr[EmotionScores] = js.undefined
  
  /** Relevance score from 0 to 1. Higher values indicate greater relevance. */
  var relevance: js.UndefOr[Double] = js.undefined
  
  /** Sentiment analysis results for the keyword, enabled with the `sentiment` option. */
  var sentiment: js.UndefOr[FeatureSentimentResults] = js.undefined
  
  /** The keyword text. */
  var text: js.UndefOr[String] = js.undefined
}
object KeywordsResult {
  
  @scala.inline
  def apply(): KeywordsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeywordsResult]
  }
  
  @scala.inline
  implicit class KeywordsResultMutableBuilder[Self <: KeywordsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setEmotion(value: EmotionScores): Self = StObject.set(x, "emotion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmotionUndefined: Self = StObject.set(x, "emotion", js.undefined)
    
    @scala.inline
    def setRelevance(value: Double): Self = StObject.set(x, "relevance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelevanceUndefined: Self = StObject.set(x, "relevance", js.undefined)
    
    @scala.inline
    def setSentiment(value: FeatureSentimentResults): Self = StObject.set(x, "sentiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentimentUndefined: Self = StObject.set(x, "sentiment", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
