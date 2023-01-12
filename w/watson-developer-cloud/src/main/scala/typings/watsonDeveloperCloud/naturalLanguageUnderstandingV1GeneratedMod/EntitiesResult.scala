package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The important people, places, geopolitical entities and other types of entities in your content. */
trait EntitiesResult extends StObject {
  
  /** How many times the entity was mentioned in the text. */
  var count: js.UndefOr[Double] = js.undefined
  
  /** Disambiguation information for the entity. */
  var disambiguation: js.UndefOr[DisambiguationResult] = js.undefined
  
  /** Emotion analysis results for the entity, enabled with the `emotion` option. */
  var emotion: js.UndefOr[EmotionScores] = js.undefined
  
  /** Entity mentions and locations. */
  var mentions: js.UndefOr[js.Array[EntityMention]] = js.undefined
  
  /** Relevance score from 0 to 1. Higher values indicate greater relevance. */
  var relevance: js.UndefOr[Double] = js.undefined
  
  /** Sentiment analysis results for the entity, enabled with the `sentiment` option. */
  var sentiment: js.UndefOr[FeatureSentimentResults] = js.undefined
  
  /** The name of the entity. */
  var text: js.UndefOr[String] = js.undefined
  
  /** Entity type. */
  var `type`: js.UndefOr[String] = js.undefined
}
object EntitiesResult {
  
  inline def apply(): EntitiesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntitiesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EntitiesResult] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setDisambiguation(value: DisambiguationResult): Self = StObject.set(x, "disambiguation", value.asInstanceOf[js.Any])
    
    inline def setDisambiguationUndefined: Self = StObject.set(x, "disambiguation", js.undefined)
    
    inline def setEmotion(value: EmotionScores): Self = StObject.set(x, "emotion", value.asInstanceOf[js.Any])
    
    inline def setEmotionUndefined: Self = StObject.set(x, "emotion", js.undefined)
    
    inline def setMentions(value: js.Array[EntityMention]): Self = StObject.set(x, "mentions", value.asInstanceOf[js.Any])
    
    inline def setMentionsUndefined: Self = StObject.set(x, "mentions", js.undefined)
    
    inline def setMentionsVarargs(value: EntityMention*): Self = StObject.set(x, "mentions", js.Array(value*))
    
    inline def setRelevance(value: Double): Self = StObject.set(x, "relevance", value.asInstanceOf[js.Any])
    
    inline def setRelevanceUndefined: Self = StObject.set(x, "relevance", js.undefined)
    
    inline def setSentiment(value: FeatureSentimentResults): Self = StObject.set(x, "sentiment", value.asInstanceOf[js.Any])
    
    inline def setSentimentUndefined: Self = StObject.set(x, "sentiment", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
