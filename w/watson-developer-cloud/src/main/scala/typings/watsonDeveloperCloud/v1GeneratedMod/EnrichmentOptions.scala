package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object representing the configuration options to use for the `elements` enrichment. */
trait EnrichmentOptions extends StObject {
  
  var features: js.UndefOr[NluEnrichmentFeatures] = js.undefined
  
  /** ISO 639-1 code indicating the language to use for the analysis. This code overrides the automatic language detection performed by the service. Valid codes are `ar` (Arabic), `en` (English), `fr` (French), `de` (German), `it` (Italian), `pt` (Portuguese), `ru` (Russian), `es` (Spanish), and `sv` (Swedish). **Note:** Not all features support all languages, automatic detection is recommended. */
  var language: js.UndefOr[String] = js.undefined
  
  /** *For use with `elements` enrichments only.* The element extraction model to use. Models available are: `contract`. */
  var model: js.UndefOr[String] = js.undefined
}
object EnrichmentOptions {
  
  inline def apply(): EnrichmentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnrichmentOptions]
  }
  
  extension [Self <: EnrichmentOptions](x: Self) {
    
    inline def setFeatures(value: NluEnrichmentFeatures): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
