package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object speficying the Entities enrichment and related parameters. */
@js.native
trait NluEnrichmentEntities extends StObject {
  
  /** When `true`, emotion detection of entities will be performed on the specified field. */
  var emotion: js.UndefOr[Boolean] = js.native
  
  /** The maximum number of entities to extract for each instance of the specified field. */
  var limit: js.UndefOr[Double] = js.native
  
  /** When `true`, the types of mentions for each idetifieid entity is recorded. The default is `false`. */
  var mention_types: js.UndefOr[Boolean] = js.native
  
  /** When `true`, the number of mentions of each identified entity is recorded. The default is `false`. */
  var mentions: js.UndefOr[Boolean] = js.native
  
  /** The enrichement model to use with entity extraction. May be a custom model provided by Watson Knowledge Studio, the public model for use with Knowledge Graph `en-news`, or the default public model `alchemy`. */
  var model: js.UndefOr[String] = js.native
  
  /** When `true`, a list of sentence locations for each instance of each identified entity is recorded. The default is `false`. */
  var sentence_locations: js.UndefOr[Boolean] = js.native
  
  /** When `true`, sentiment analysis of entities will be performed on the specified field. */
  var sentiment: js.UndefOr[Boolean] = js.native
}
object NluEnrichmentEntities {
  
  @scala.inline
  def apply(): NluEnrichmentEntities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NluEnrichmentEntities]
  }
  
  @scala.inline
  implicit class NluEnrichmentEntitiesMutableBuilder[Self <: NluEnrichmentEntities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmotion(value: Boolean): Self = StObject.set(x, "emotion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmotionUndefined: Self = StObject.set(x, "emotion", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setMention_types(value: Boolean): Self = StObject.set(x, "mention_types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMention_typesUndefined: Self = StObject.set(x, "mention_types", js.undefined)
    
    @scala.inline
    def setMentions(value: Boolean): Self = StObject.set(x, "mentions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMentionsUndefined: Self = StObject.set(x, "mentions", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setSentence_locations(value: Boolean): Self = StObject.set(x, "sentence_locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentence_locationsUndefined: Self = StObject.set(x, "sentence_locations", js.undefined)
    
    @scala.inline
    def setSentiment(value: Boolean): Self = StObject.set(x, "sentiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentimentUndefined: Self = StObject.set(x, "sentiment", js.undefined)
  }
}
