package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `listFeedback` operation. */
trait ListFeedbackParams extends StObject {
  
  /** An optional string in the format `YYYY-MM-DD` that filters the output to include only feedback that was added after the specified date. */
  var after: js.UndefOr[String] = js.undefined
  
  /** An optional string in the format `YYYY-MM-DD` that filters the output to include only feedback that was added before the specified date. */
  var before: js.UndefOr[String] = js.undefined
  
  /** An optional string in the form of a comma-separated list of categories. If this is specified, the service filters the output to include only feedback that has at least one category from the list added. */
  var category_added: js.UndefOr[String] = js.undefined
  
  /** An optional string in the form of a comma-separated list of categories. If this is specified, the service filters the output to include only feedback that has at least one category from the list unchanged. */
  var category_not_changed: js.UndefOr[String] = js.undefined
  
  /** An optional string in the form of a comma-separated list of categories. If this is specified, the service filters the output to include only feedback that has at least one category from the list removed. */
  var category_removed: js.UndefOr[String] = js.undefined
  
  /** An optional string that returns the set of documents after the previous set. Use this parameter with the `page_limit` parameter. */
  var cursor: js.UndefOr[String] = js.undefined
  
  /** An optional string that filters the output to include only feedback from the document with the specified `document_title`. */
  var document_title: js.UndefOr[String] = js.undefined
  
  /** An optional string that filters the output to include only feedback with the specified feedback type. The only permitted value is `element_classification`. */
  var feedback_type: js.UndefOr[String] = js.undefined
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** An optional boolean value. If specified as `true`, the `pagination` object in the output includes a value called `total` that gives the total count of feedback created. */
  var include_total: js.UndefOr[Boolean] = js.undefined
  
  /** An optional string that filters the output to include only feedback with the specified `model_id`. The only permitted value is `contracts`. */
  var model_id: js.UndefOr[String] = js.undefined
  
  /** An optional string that filters the output to include only feedback with the specified `model_version`. */
  var model_version: js.UndefOr[String] = js.undefined
  
  /** An optional integer specifying the number of documents that you want the service to return. */
  var page_limit: js.UndefOr[Double] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
  
  /** An optional comma-separated list of fields in the document to sort on. You can optionally specify the sort direction by prefixing the value of the field with `-` for descending order or `+` for ascending order (the default). Currently permitted sorting fields are `created`, `user_id`, and `document_title`. */
  var sort: js.UndefOr[String] = js.undefined
  
  /** An optional string of comma-separated `nature`:`party` pairs. If this is specified, the service filters the output to include only feedback that has at least one `nature`:`party` pair from the list removed. */
  var type_added: js.UndefOr[String] = js.undefined
  
  /** An optional string of comma-separated `nature`:`party` pairs. If this is specified, the service filters the output to include only feedback that has at least one `nature`:`party` pair from the list unchanged. */
  var type_not_changed: js.UndefOr[String] = js.undefined
  
  /** An optional string of comma-separated `nature`:`party` pairs. If this is specified, the service filters the output to include only feedback that has at least one `nature`:`party` pair from the list removed. */
  var type_removed: js.UndefOr[String] = js.undefined
}
object ListFeedbackParams {
  
  inline def apply(): ListFeedbackParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFeedbackParams]
  }
  
  extension [Self <: ListFeedbackParams](x: Self) {
    
    inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setCategory_added(value: String): Self = StObject.set(x, "category_added", value.asInstanceOf[js.Any])
    
    inline def setCategory_addedUndefined: Self = StObject.set(x, "category_added", js.undefined)
    
    inline def setCategory_not_changed(value: String): Self = StObject.set(x, "category_not_changed", value.asInstanceOf[js.Any])
    
    inline def setCategory_not_changedUndefined: Self = StObject.set(x, "category_not_changed", js.undefined)
    
    inline def setCategory_removed(value: String): Self = StObject.set(x, "category_removed", value.asInstanceOf[js.Any])
    
    inline def setCategory_removedUndefined: Self = StObject.set(x, "category_removed", js.undefined)
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setDocument_title(value: String): Self = StObject.set(x, "document_title", value.asInstanceOf[js.Any])
    
    inline def setDocument_titleUndefined: Self = StObject.set(x, "document_title", js.undefined)
    
    inline def setFeedback_type(value: String): Self = StObject.set(x, "feedback_type", value.asInstanceOf[js.Any])
    
    inline def setFeedback_typeUndefined: Self = StObject.set(x, "feedback_type", js.undefined)
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setInclude_total(value: Boolean): Self = StObject.set(x, "include_total", value.asInstanceOf[js.Any])
    
    inline def setInclude_totalUndefined: Self = StObject.set(x, "include_total", js.undefined)
    
    inline def setModel_id(value: String): Self = StObject.set(x, "model_id", value.asInstanceOf[js.Any])
    
    inline def setModel_idUndefined: Self = StObject.set(x, "model_id", js.undefined)
    
    inline def setModel_version(value: String): Self = StObject.set(x, "model_version", value.asInstanceOf[js.Any])
    
    inline def setModel_versionUndefined: Self = StObject.set(x, "model_version", js.undefined)
    
    inline def setPage_limit(value: Double): Self = StObject.set(x, "page_limit", value.asInstanceOf[js.Any])
    
    inline def setPage_limitUndefined: Self = StObject.set(x, "page_limit", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    inline def setSort(value: String): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setType_added(value: String): Self = StObject.set(x, "type_added", value.asInstanceOf[js.Any])
    
    inline def setType_addedUndefined: Self = StObject.set(x, "type_added", js.undefined)
    
    inline def setType_not_changed(value: String): Self = StObject.set(x, "type_not_changed", value.asInstanceOf[js.Any])
    
    inline def setType_not_changedUndefined: Self = StObject.set(x, "type_not_changed", js.undefined)
    
    inline def setType_removed(value: String): Self = StObject.set(x, "type_removed", value.asInstanceOf[js.Any])
    
    inline def setType_removedUndefined: Self = StObject.set(x, "type_removed", js.undefined)
  }
}
