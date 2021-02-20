package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Identifies people, cities, organizations, and other entities in the content. See [Entity types and subtypes](https://cloud.ibm.com/docs/services/natural-language-understanding/entity-types.html). Supported languages: English, French, German, Italian, Japanese, Korean, Portuguese, Russian, Spanish, Swedish. Arabic, Chinese, and Dutch are supported only through custom models. */
@js.native
trait EntitiesOptions extends StObject {
  
  /** Set this to `true` to analyze emotion for detected keywords. */
  var emotion: js.UndefOr[Boolean] = js.native
  
  /** Maximum number of entities to return. */
  var limit: js.UndefOr[Double] = js.native
  
  /** Set this to `true` to return locations of entity mentions. */
  var mentions: js.UndefOr[Boolean] = js.native
  
  /** Enter a [custom model](https://cloud.ibm.com/docs/services/natural-language-understanding/customizing.html) ID to override the standard entity detection model. */
  var model: js.UndefOr[String] = js.native
  
  /** Set this to `true` to return sentiment information for detected entities. */
  var sentiment: js.UndefOr[Boolean] = js.native
}
object EntitiesOptions {
  
  @scala.inline
  def apply(): EntitiesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntitiesOptions]
  }
  
  @scala.inline
  implicit class EntitiesOptionsMutableBuilder[Self <: EntitiesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmotion(value: Boolean): Self = StObject.set(x, "emotion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmotionUndefined: Self = StObject.set(x, "emotion", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setMentions(value: Boolean): Self = StObject.set(x, "mentions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMentionsUndefined: Self = StObject.set(x, "mentions", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setSentiment(value: Boolean): Self = StObject.set(x, "sentiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentimentUndefined: Self = StObject.set(x, "sentiment", js.undefined)
  }
}
