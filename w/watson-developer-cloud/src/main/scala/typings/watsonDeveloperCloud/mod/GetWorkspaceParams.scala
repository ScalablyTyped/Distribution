package typings.watsonDeveloperCloud.mod

import typings.watsonDeveloperCloud.mod.GetWorkspaceConstants.Sort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `getWorkspace` operation. */
@js.native
trait GetWorkspaceParams extends StObject {
  
  /** Whether to include all element content in the returned data. If **export**=`false`, the returned data includes only information about the element itself. If **export**=`true`, all content, including subelements, is included. */
  var _export: js.UndefOr[Boolean] = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  /** Whether to include the audit properties (`created` and `updated` timestamps) in the response. */
  var include_audit: js.UndefOr[Boolean] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
  
  /** Indicates how the returned workspace data will be sorted. This parameter is valid only if **export**=`true`. Specify `sort=stable` to sort all workspace objects by unique identifier, in ascending alphabetical order. */
  var sort: js.UndefOr[Sort | String] = js.native
  
  /** Unique identifier of the workspace. */
  var workspace_id: String = js.native
}
object GetWorkspaceParams {
  
  @scala.inline
  def apply(workspace_id: String): GetWorkspaceParams = {
    val __obj = js.Dynamic.literal(workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkspaceParams]
  }
  
  @scala.inline
  implicit class GetWorkspaceParamsMutableBuilder[Self <: GetWorkspaceParams] (val x: Self) extends AnyVal {
    
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
    def setSort(value: Sort | String): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setWorkspace_id(value: String): Self = StObject.set(x, "workspace_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_export(value: Boolean): Self = StObject.set(x, "_export", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_exportUndefined: Self = StObject.set(x, "_export", js.undefined)
  }
}
