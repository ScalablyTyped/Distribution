package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `getEntity` operation. */
@js.native
trait GetEntityParams extends StObject {
  
  /** Whether to include all element content in the returned data. If **export**=`false`, the returned data includes only information about the element itself. If **export**=`true`, all content, including subelements, is included. */
  var _export: js.UndefOr[Boolean] = js.native
  
  /** The name of the entity. */
  var entity: String = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  /** Whether to include the audit properties (`created` and `updated` timestamps) in the response. */
  var include_audit: js.UndefOr[Boolean] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
  
  /** Unique identifier of the workspace. */
  var workspace_id: String = js.native
}
object GetEntityParams {
  
  @scala.inline
  def apply(entity: String, workspace_id: String): GetEntityParams = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEntityParams]
  }
  
  @scala.inline
  implicit class GetEntityParamsMutableBuilder[Self <: GetEntityParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setInclude_audit(value: Boolean): Self = StObject.set(x, "include_audit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude_auditUndefined: Self = StObject.set(x, "include_audit", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    @scala.inline
    def setWorkspace_id(value: String): Self = StObject.set(x, "workspace_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_export(value: Boolean): Self = StObject.set(x, "_export", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_exportUndefined: Self = StObject.set(x, "_export", js.undefined)
  }
}
