package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object representing the configuration options to use for the `elements` enrichment. */
@js.native
trait EnrichmentOptions extends StObject {
  
  var features: js.UndefOr[NluEnrichmentFeatures] = js.native
  
  /** ISO 639-1 code indicating the language to use for the analysis. This code overrides the automatic language detection performed by the service. Valid codes are `ar` (Arabic), `en` (English), `fr` (French), `de` (German), `it` (Italian), `pt` (Portuguese), `ru` (Russian), `es` (Spanish), and `sv` (Swedish). **Note:** Not all features support all languages, automatic detection is recommended. */
  var language: js.UndefOr[String] = js.native
  
  /** *For use with `elements` enrichments only.* The element extraction model to use. Models available are: `contract`. */
  var model: js.UndefOr[String] = js.native
}
object EnrichmentOptions {
  
  @scala.inline
  def apply(): EnrichmentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnrichmentOptions]
  }
  
  @scala.inline
  implicit class EnrichmentOptionsMutableBuilder[Self <: EnrichmentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeatures(value: NluEnrichmentFeatures): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
