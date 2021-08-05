package typings.watsonDeveloperCloud.v3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `listModels` operation. */
trait ListModelsParams extends StObject {
  
  /** If the default parameter isn't specified, the service will return all models (default and non-default) for each language pair. To return only default models, set this to `true`. To return only non-default models, set this to `false`. There is exactly one default model per language pair, the IBM provided base model. */
  var default_models: js.UndefOr[Boolean] = js.undefined
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
  
  /** Specify a language code to filter results by source language. */
  var source: js.UndefOr[String] = js.undefined
  
  /** Specify a language code to filter results by target language. */
  var target: js.UndefOr[String] = js.undefined
}
object ListModelsParams {
  
  inline def apply(): ListModelsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListModelsParams]
  }
  
  extension [Self <: ListModelsParams](x: Self) {
    
    inline def setDefault_models(value: Boolean): Self = StObject.set(x, "default_models", value.asInstanceOf[js.Any])
    
    inline def setDefault_modelsUndefined: Self = StObject.set(x, "default_models", js.undefined)
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
