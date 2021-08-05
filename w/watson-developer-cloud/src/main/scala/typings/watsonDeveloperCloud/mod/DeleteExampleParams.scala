package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `deleteExample` operation. */
trait DeleteExampleParams extends StObject {
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** The intent name. */
  var intent: String
  
  var return_response: js.UndefOr[Boolean] = js.undefined
  
  /** The text of the user input example. */
  var text: String
  
  /** Unique identifier of the workspace. */
  var workspace_id: String
}
object DeleteExampleParams {
  
  inline def apply(intent: String, text: String, workspace_id: String): DeleteExampleParams = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteExampleParams]
  }
  
  extension [Self <: DeleteExampleParams](x: Self) {
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setWorkspace_id(value: String): Self = StObject.set(x, "workspace_id", value.asInstanceOf[js.Any])
  }
}
