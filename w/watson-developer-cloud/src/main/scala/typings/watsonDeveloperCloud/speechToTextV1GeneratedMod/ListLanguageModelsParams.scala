package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `listLanguageModels` operation. */
trait ListLanguageModelsParams extends StObject {
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** The identifier of the language for which custom language or custom acoustic models are to be returned (for example, `en-US`). Omit the parameter to see all custom language or custom acoustic models that are owned by the requesting credentials. */
  var language: js.UndefOr[String] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
}
object ListLanguageModelsParams {
  
  @scala.inline
  def apply(): ListLanguageModelsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLanguageModelsParams]
  }
  
  @scala.inline
  implicit class ListLanguageModelsParamsMutableBuilder[Self <: ListLanguageModelsParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
