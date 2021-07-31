package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object specifying the Keyword enrichment and related parameters. */
trait NluEnrichmentKeywords extends StObject {
  
  /** When `true`, emotion detection of keywords will be performed on the specified field. */
  var emotion: js.UndefOr[Boolean] = js.undefined
  
  /** The maximum number of keywords to extract for each instance of the specified field. */
  var limit: js.UndefOr[Double] = js.undefined
  
  /** When `true`, sentiment analysis of keywords will be performed on the specified field. */
  var sentiment: js.UndefOr[Boolean] = js.undefined
}
object NluEnrichmentKeywords {
  
  @scala.inline
  def apply(): NluEnrichmentKeywords = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NluEnrichmentKeywords]
  }
  
  @scala.inline
  implicit class NluEnrichmentKeywordsMutableBuilder[Self <: NluEnrichmentKeywords] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmotion(value: Boolean): Self = StObject.set(x, "emotion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmotionUndefined: Self = StObject.set(x, "emotion", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setSentiment(value: Boolean): Self = StObject.set(x, "sentiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentimentUndefined: Self = StObject.set(x, "sentiment", js.undefined)
  }
}
