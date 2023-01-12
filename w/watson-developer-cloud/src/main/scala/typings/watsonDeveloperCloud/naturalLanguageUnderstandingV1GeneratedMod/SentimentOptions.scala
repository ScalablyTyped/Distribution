package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Analyzes the general sentiment of your content or the sentiment toward specific target phrases. You can analyze sentiment for detected entities with `entities.sentiment` and for keywords with `keywords.sentiment`. Supported languages: Arabic, English, French, German, Italian, Japanese, Korean, Portuguese, Russian, Spanish. */
trait SentimentOptions extends StObject {
  
  /** Set this to `false` to hide document-level sentiment results. */
  var document: js.UndefOr[Boolean] = js.undefined
  
  /** Sentiment results will be returned for each target string that is found in the document. */
  var targets: js.UndefOr[js.Array[String]] = js.undefined
}
object SentimentOptions {
  
  inline def apply(): SentimentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SentimentOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SentimentOptions] (val x: Self) extends AnyVal {
    
    inline def setDocument(value: Boolean): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setTargets(value: js.Array[String]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    inline def setTargetsVarargs(value: String*): Self = StObject.set(x, "targets", js.Array(value*))
  }
}
