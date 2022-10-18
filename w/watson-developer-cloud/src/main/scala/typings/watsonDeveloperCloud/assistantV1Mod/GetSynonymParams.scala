package typings.watsonDeveloperCloud.assistantV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `getSynonym` operation. */
trait GetSynonymParams extends StObject {
  
  /** The name of the entity. */
  var entity: String
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** Whether to include the audit properties (`created` and `updated` timestamps) in the response. */
  var include_audit: js.UndefOr[Boolean] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
  
  /** The text of the synonym. */
  var synonym: String
  
  /** The text of the entity value. */
  var value: String
  
  /** Unique identifier of the workspace. */
  var workspace_id: String
}
object GetSynonymParams {
  
  inline def apply(entity: String, synonym: String, value: String, workspace_id: String): GetSynonymParams = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], synonym = synonym.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSynonymParams]
  }
  
  extension [Self <: GetSynonymParams](x: Self) {
    
    inline def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setInclude_audit(value: Boolean): Self = StObject.set(x, "include_audit", value.asInstanceOf[js.Any])
    
    inline def setInclude_auditUndefined: Self = StObject.set(x, "include_audit", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    inline def setSynonym(value: String): Self = StObject.set(x, "synonym", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setWorkspace_id(value: String): Self = StObject.set(x, "workspace_id", value.asInstanceOf[js.Any])
  }
}
