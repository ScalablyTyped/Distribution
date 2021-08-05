package typings.watsonDeveloperCloud.mod

import typings.watsonDeveloperCloud.mod.ListWorkspacesConstants.Sort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `listWorkspaces` operation. */
trait ListWorkspacesParams extends StObject {
  
  /** A token identifying the page of results to retrieve. */
  var cursor: js.UndefOr[String] = js.undefined
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** Whether to include the audit properties (`created` and `updated` timestamps) in the response. */
  var include_audit: js.UndefOr[Boolean] = js.undefined
  
  /** Whether to include information about the number of records returned. */
  var include_count: js.UndefOr[Boolean] = js.undefined
  
  /** The number of records to return in each page of results. */
  var page_limit: js.UndefOr[Double] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
  
  /** The attribute by which returned workspaces will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
  var sort: js.UndefOr[Sort | String] = js.undefined
}
object ListWorkspacesParams {
  
  inline def apply(): ListWorkspacesParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkspacesParams]
  }
  
  extension [Self <: ListWorkspacesParams](x: Self) {
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setInclude_audit(value: Boolean): Self = StObject.set(x, "include_audit", value.asInstanceOf[js.Any])
    
    inline def setInclude_auditUndefined: Self = StObject.set(x, "include_audit", js.undefined)
    
    inline def setInclude_count(value: Boolean): Self = StObject.set(x, "include_count", value.asInstanceOf[js.Any])
    
    inline def setInclude_countUndefined: Self = StObject.set(x, "include_count", js.undefined)
    
    inline def setPage_limit(value: Double): Self = StObject.set(x, "page_limit", value.asInstanceOf[js.Any])
    
    inline def setPage_limitUndefined: Self = StObject.set(x, "page_limit", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    inline def setSort(value: Sort | String): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
