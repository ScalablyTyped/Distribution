package typings.watsonDeveloperCloud.v3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `listModels` operation. */
@js.native
trait ListModelsParams extends StObject {
  
  /** If the default parameter isn't specified, the service will return all models (default and non-default) for each language pair. To return only default models, set this to `true`. To return only non-default models, set this to `false`. There is exactly one default model per language pair, the IBM provided base model. */
  var default_models: js.UndefOr[Boolean] = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
  
  /** Specify a language code to filter results by source language. */
  var source: js.UndefOr[String] = js.native
  
  /** Specify a language code to filter results by target language. */
  var target: js.UndefOr[String] = js.native
}
object ListModelsParams {
  
  @scala.inline
  def apply(): ListModelsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListModelsParams]
  }
  
  @scala.inline
  implicit class ListModelsParamsMutableBuilder[Self <: ListModelsParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault_models(value: Boolean): Self = StObject.set(x, "default_models", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_modelsUndefined: Self = StObject.set(x, "default_models", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
