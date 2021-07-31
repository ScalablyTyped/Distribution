package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `updateConfiguration` operation. */
trait UpdateConfigurationParams extends StObject {
  
  /** The ID of the configuration. */
  var configuration_id: String
  
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
object UpdateConfigurationParams {
  
  @scala.inline
  def apply(configuration_id: String, environment_id: String, name: String): UpdateConfigurationParams = {
    val __obj = js.Dynamic.literal(configuration_id = configuration_id.asInstanceOf[js.Any], environment_id = environment_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfigurationParams]
  }
  
  @scala.inline
  implicit class UpdateConfigurationParamsMutableBuilder[Self <: UpdateConfigurationParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration_id(value: String): Self = StObject.set(x, "configuration_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversions(value: Conversions): Self = StObject.set(x, "conversions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversionsUndefined: Self = StObject.set(x, "conversions", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEnrichments(value: js.Array[Enrichment]): Self = StObject.set(x, "enrichments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnrichmentsUndefined: Self = StObject.set(x, "enrichments", js.undefined)
    
    @scala.inline
    def setEnrichmentsVarargs(value: Enrichment*): Self = StObject.set(x, "enrichments", js.Array(value :_*))
    
    @scala.inline
    def setEnvironment_id(value: String): Self = StObject.set(x, "environment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizations(value: js.Array[NormalizationOperation]): Self = StObject.set(x, "normalizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizationsUndefined: Self = StObject.set(x, "normalizations", js.undefined)
    
    @scala.inline
    def setNormalizationsVarargs(value: NormalizationOperation*): Self = StObject.set(x, "normalizations", js.Array(value :_*))
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    @scala.inline
    def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
