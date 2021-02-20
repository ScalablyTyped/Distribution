package typings.watsonDeveloperCloud.mod

import typings.watsonDeveloperCloud.mod.ListCounterexamplesConstants.Sort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `listCounterexamples` operation. */
@js.native
trait ListCounterexamplesParams extends StObject {
  
  /** A token identifying the page of results to retrieve. */
  var cursor: js.UndefOr[String] = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  /** Whether to include the audit properties (`created` and `updated` timestamps) in the response. */
  var include_audit: js.UndefOr[Boolean] = js.native
  
  /** Whether to include information about the number of records returned. */
  var include_count: js.UndefOr[Boolean] = js.native
  
  /** The number of records to return in each page of results. */
  var page_limit: js.UndefOr[Double] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
  
  /** The attribute by which returned counterexamples will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
  var sort: js.UndefOr[Sort | String] = js.native
  
  /** Unique identifier of the workspace. */
  var workspace_id: String = js.native
}
object ListCounterexamplesParams {
  
  @scala.inline
  def apply(workspace_id: String): ListCounterexamplesParams = {
    val __obj = js.Dynamic.literal(workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCounterexamplesParams]
  }
  
  @scala.inline
  implicit class ListCounterexamplesParamsMutableBuilder[Self <: ListCounterexamplesParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setInclude_audit(value: Boolean): Self = StObject.set(x, "include_audit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude_auditUndefined: Self = StObject.set(x, "include_audit", js.undefined)
    
    @scala.inline
    def setInclude_count(value: Boolean): Self = StObject.set(x, "include_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude_countUndefined: Self = StObject.set(x, "include_count", js.undefined)
    
    @scala.inline
    def setPage_limit(value: Double): Self = StObject.set(x, "page_limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage_limitUndefined: Self = StObject.set(x, "page_limit", js.undefined)
    
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
  }
}
