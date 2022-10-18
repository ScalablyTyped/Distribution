package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object speficying the Entities enrichment and related parameters. */
trait NluEnrichmentEntities extends StObject {
  
  /** When `true`, emotion detection of entities will be performed on the specified field. */
  var emotion: js.UndefOr[Boolean] = js.undefined
  
  /** The maximum number of entities to extract for each instance of the specified field. */
  var limit: js.UndefOr[Double] = js.undefined
  
  /** When `true`, the types of mentions for each idetifieid entity is recorded. The default is `false`. */
  var mention_types: js.UndefOr[Boolean] = js.undefined
  
  /** When `true`, the number of mentions of each identified entity is recorded. The default is `false`. */
  var mentions: js.UndefOr[Boolean] = js.undefined
  
  /** The enrichement model to use with entity extraction. May be a custom model provided by Watson Knowledge Studio, the public model for use with Knowledge Graph `en-news`, or the default public model `alchemy`. */
  var model: js.UndefOr[String] = js.undefined
  
  /** When `true`, a list of sentence locations for each instance of each identified entity is recorded. The default is `false`. */
  var sentence_locations: js.UndefOr[Boolean] = js.undefined
  
  /** When `true`, sentiment analysis of entities will be performed on the specified field. */
  var sentiment: js.UndefOr[Boolean] = js.undefined
}
object NluEnrichmentEntities {
  
  inline def apply(): NluEnrichmentEntities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NluEnrichmentEntities]
  }
  
  extension [Self <: NluEnrichmentEntities](x: Self) {
    
    inline def setEmotion(value: Boolean): Self = StObject.set(x, "emotion", value.asInstanceOf[js.Any])
    
    inline def setEmotionUndefined: Self = StObject.set(x, "emotion", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setMention_types(value: Boolean): Self = StObject.set(x, "mention_types", value.asInstanceOf[js.Any])
    
    inline def setMention_typesUndefined: Self = StObject.set(x, "mention_types", js.undefined)
    
    inline def setMentions(value: Boolean): Self = StObject.set(x, "mentions", value.asInstanceOf[js.Any])
    
    inline def setMentionsUndefined: Self = StObject.set(x, "mentions", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setSentence_locations(value: Boolean): Self = StObject.set(x, "sentence_locations", value.asInstanceOf[js.Any])
    
    inline def setSentence_locationsUndefined: Self = StObject.set(x, "sentence_locations", js.undefined)
    
    inline def setSentiment(value: Boolean): Self = StObject.set(x, "sentiment", value.asInstanceOf[js.Any])
    
    inline def setSentimentUndefined: Self = StObject.set(x, "sentiment", js.undefined)
  }
}
