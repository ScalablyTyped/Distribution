package typings.tensorflowTfjsCore.typesMod

import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveResult extends StObject {
  
  /**
    * Error messages and related data (if any).
    */
  var errors: js.UndefOr[js.Array[js.Object | String]] = js.undefined
  
  /**
    * Information about the model artifacts saved.
    */
  var modelArtifactsInfo: ModelArtifactsInfo
  
  /**
    * HTTP responses from the server that handled the model-saving request (if
    * any). This is applicable only to server-based saving routes.
    */
  var responses: js.UndefOr[js.Array[Response]] = js.undefined
}
object SaveResult {
  
  inline def apply(modelArtifactsInfo: ModelArtifactsInfo): SaveResult = {
    val __obj = js.Dynamic.literal(modelArtifactsInfo = modelArtifactsInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveResult]
  }
  
  extension [Self <: SaveResult](x: Self) {
    
    inline def setErrors(value: js.Array[js.Object | String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: (js.Object | String)*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setModelArtifactsInfo(value: ModelArtifactsInfo): Self = StObject.set(x, "modelArtifactsInfo", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: js.Array[Response]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setResponsesVarargs(value: Response*): Self = StObject.set(x, "responses", js.Array(value*))
  }
}
