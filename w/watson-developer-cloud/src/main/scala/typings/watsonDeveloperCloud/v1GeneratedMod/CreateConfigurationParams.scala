package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `createConfiguration` operation. */
trait CreateConfigurationParams extends StObject {
  
  /** Document conversion settings. */
  var conversions: js.UndefOr[Conversions] = js.undefined
  
  /** The description of the configuration, if available. */
  var description: js.UndefOr[String] = js.undefined
  
  /** An array of document enrichment settings for the configuration. */
  var enrichments: js.UndefOr[js.Array[Enrichment]] = js.undefined
  
  /** The ID of the environment. */
  var environment_id: String
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** The name of the configuration. */
  var name: String
  
  /** Defines operations that can be used to transform the final output JSON into a normalized form. Operations are executed in the order that they appear in the array. */
  var normalizations: js.UndefOr[js.Array[NormalizationOperation]] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
  
  /** Object containing source parameters for the configuration. */
  var source: js.UndefOr[Source] = js.undefined
}
object CreateConfigurationParams {
  
  inline def apply(environment_id: String, name: String): CreateConfigurationParams = {
    val __obj = js.Dynamic.literal(environment_id = environment_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfigurationParams]
  }
  
  extension [Self <: CreateConfigurationParams](x: Self) {
    
    inline def setConversions(value: Conversions): Self = StObject.set(x, "conversions", value.asInstanceOf[js.Any])
    
    inline def setConversionsUndefined: Self = StObject.set(x, "conversions", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnrichments(value: js.Array[Enrichment]): Self = StObject.set(x, "enrichments", value.asInstanceOf[js.Any])
    
    inline def setEnrichmentsUndefined: Self = StObject.set(x, "enrichments", js.undefined)
    
    inline def setEnrichmentsVarargs(value: Enrichment*): Self = StObject.set(x, "enrichments", js.Array(value :_*))
    
    inline def setEnvironment_id(value: String): Self = StObject.set(x, "environment_id", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNormalizations(value: js.Array[NormalizationOperation]): Self = StObject.set(x, "normalizations", value.asInstanceOf[js.Any])
    
    inline def setNormalizationsUndefined: Self = StObject.set(x, "normalizations", js.undefined)
    
    inline def setNormalizationsVarargs(value: NormalizationOperation*): Self = StObject.set(x, "normalizations", js.Array(value :_*))
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
