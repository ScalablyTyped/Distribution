package typings.watsonDeveloperCloud.assistantV1Mod

import typings.watsonDeveloperCloud.assistantV1Mod.ListSynonymsConstants.Sort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `listSynonyms` operation. */
trait ListSynonymsParams extends StObject {
  
  /** A token identifying the page of results to retrieve. */
  var cursor: js.UndefOr[String] = js.undefined
  
  /** The name of the entity. */
  var entity: String
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** Whether to include the audit properties (`created` and `updated` timestamps) in the response. */
  var include_audit: js.UndefOr[Boolean] = js.undefined
  
  /** Whether to include information about the number of records returned. */
  var include_count: js.UndefOr[Boolean] = js.undefined
  
  /** The number of records to return in each page of results. */
  var page_limit: js.UndefOr[Double] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
  
  /** The attribute by which returned entity value synonyms will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
  var sort: js.UndefOr[Sort | String] = js.undefined
  
  /** The text of the entity value. */
  var value: String
  
  /** Unique identifier of the workspace. */
  var workspace_id: String
}
object ListSynonymsParams {
  
  inline def apply(entity: String, value: String, workspace_id: String): ListSynonymsParams = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSynonymsParams]
  }
  
  extension [Self <: ListSynonymsParams](x: Self) {
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
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
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setWorkspace_id(value: String): Self = StObject.set(x, "workspace_id", value.asInstanceOf[js.Any])
  }
}
