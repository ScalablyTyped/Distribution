package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `getIntent` operation. */
trait GetIntentParams extends StObject {
  
  /** Whether to include all element content in the returned data. If **export**=`false`, the returned data includes only information about the element itself. If **export**=`true`, all content, including subelements, is included. */
  var _export: js.UndefOr[Boolean] = js.undefined
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** Whether to include the audit properties (`created` and `updated` timestamps) in the response. */
  var include_audit: js.UndefOr[Boolean] = js.undefined
  
  /** The intent name. */
  var intent: String
  
  var return_response: js.UndefOr[Boolean] = js.undefined
  
  /** Unique identifier of the workspace. */
  var workspace_id: String
}
object GetIntentParams {
  
  inline def apply(intent: String, workspace_id: String): GetIntentParams = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIntentParams]
  }
  
  extension [Self <: GetIntentParams](x: Self) {
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setInclude_audit(value: Boolean): Self = StObject.set(x, "include_audit", value.asInstanceOf[js.Any])
    
    inline def setInclude_auditUndefined: Self = StObject.set(x, "include_audit", js.undefined)
    
    inline def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    inline def setWorkspace_id(value: String): Self = StObject.set(x, "workspace_id", value.asInstanceOf[js.Any])
    
    inline def set_export(value: Boolean): Self = StObject.set(x, "_export", value.asInstanceOf[js.Any])
    
    inline def set_exportUndefined: Self = StObject.set(x, "_export", js.undefined)
  }
}
