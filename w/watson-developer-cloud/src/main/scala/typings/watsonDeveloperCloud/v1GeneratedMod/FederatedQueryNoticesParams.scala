package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `federatedQueryNotices` operation. */
@js.native
trait FederatedQueryNoticesParams extends StObject {
  
  /** An aggregation search that returns an exact answer by combining query search with filters. Useful for applications to build lists, tables, and time series. For a full list of possible aggregations, see the Query reference. */
  var aggregation: js.UndefOr[String] = js.native
  
  /** A comma-separated list of collection IDs to be queried against. */
  var collection_ids: js.Array[String] = js.native
  
  /** Number of results to return. The maximum for the **count** and **offset** values together in any one query is **10000**. */
  var count: js.UndefOr[Double] = js.native
  
  /** When specified, duplicate results based on the field specified are removed from the returned results. Duplicate comparison is limited to the current query only, **offset** is not considered. This parameter is currently Beta functionality. */
  var deduplicate_field: js.UndefOr[String] = js.native
  
  /** The ID of the environment. */
  var environment_id: String = js.native
  
  /** A cacheable query that excludes documents that don't mention the query content. Filter searches are better for metadata-type searches and for assessing the concepts in the data set. */
  var filter: js.UndefOr[String] = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  /** When true, a highlight field is returned for each result which contains the fields which match the query with `<em></em>` tags around the matching query terms. */
  var highlight: js.UndefOr[Boolean] = js.native
  
  /** A natural language query that returns relevant documents by utilizing training data and natural language understanding. You cannot use **natural_language_query** and **query** at the same time. */
  var natural_language_query: js.UndefOr[String] = js.native
  
  /** The number of query results to skip at the beginning. For example, if the total number of results that are returned is 10 and the offset is 8, it returns the last two results. The maximum for the **count** and **offset** values together in any one query is **10000**. */
  var offset: js.UndefOr[Double] = js.native
  
  /** A query search returns all documents in your data set with full enrichments and full text, but with the most relevant documents listed first. Use a query search when you want to find the most relevant search results. You cannot use **natural_language_query** and **query** at the same time. */
  var query: js.UndefOr[String] = js.native
  
  /** A comma-separated list of the portion of the document hierarchy to return. */
  var return_fields: js.UndefOr[js.Array[String]] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
  
  /** When `true`, results are returned based on their similarity to the document IDs specified in the **similar.document_ids** parameter. */
  var similar: js.UndefOr[Boolean] = js.native
  
  /** A comma-separated list of document IDs to find similar documents. **Tip:** Include the **natural_language_query** parameter to expand the scope of the document similarity search with the natural language query. Other query parameters, such as **filter** and **query**, are subsequently applied and reduce the scope. */
  var similar_document_ids: js.UndefOr[js.Array[String]] = js.native
  
  /** A comma-separated list of field names that are used as a basis for comparison to identify similar documents. If not specified, the entire document is used for comparison. */
  var similar_fields: js.UndefOr[js.Array[String]] = js.native
  
  /** A comma-separated list of fields in the document to sort on. You can optionally specify a sort direction by prefixing the field with `-` for descending or `+` for ascending. Ascending is the default sort direction if no prefix is specified. */
  var sort: js.UndefOr[js.Array[String]] = js.native
}
object FederatedQueryNoticesParams {
  
  @scala.inline
  def apply(collection_ids: js.Array[String], environment_id: String): FederatedQueryNoticesParams = {
    val __obj = js.Dynamic.literal(collection_ids = collection_ids.asInstanceOf[js.Any], environment_id = environment_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FederatedQueryNoticesParams]
  }
  
  @scala.inline
  implicit class FederatedQueryNoticesParamsMutableBuilder[Self <: FederatedQueryNoticesParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregation(value: String): Self = StObject.set(x, "aggregation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregationUndefined: Self = StObject.set(x, "aggregation", js.undefined)
    
    @scala.inline
    def setCollection_ids(value: js.Array[String]): Self = StObject.set(x, "collection_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollection_idsVarargs(value: String*): Self = StObject.set(x, "collection_ids", js.Array(value :_*))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setDeduplicate_field(value: String): Self = StObject.set(x, "deduplicate_field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeduplicate_fieldUndefined: Self = StObject.set(x, "deduplicate_field", js.undefined)
    
    @scala.inline
    def setEnvironment_id(value: String): Self = StObject.set(x, "environment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
    
    @scala.inline
    def setNatural_language_query(value: String): Self = StObject.set(x, "natural_language_query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNatural_language_queryUndefined: Self = StObject.set(x, "natural_language_query", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setReturn_fields(value: js.Array[String]): Self = StObject.set(x, "return_fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_fieldsUndefined: Self = StObject.set(x, "return_fields", js.undefined)
    
    @scala.inline
    def setReturn_fieldsVarargs(value: String*): Self = StObject.set(x, "return_fields", js.Array(value :_*))
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    @scala.inline
    def setSimilar(value: Boolean): Self = StObject.set(x, "similar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimilarUndefined: Self = StObject.set(x, "similar", js.undefined)
    
    @scala.inline
    def setSimilar_document_ids(value: js.Array[String]): Self = StObject.set(x, "similar_document_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimilar_document_idsUndefined: Self = StObject.set(x, "similar_document_ids", js.undefined)
    
    @scala.inline
    def setSimilar_document_idsVarargs(value: String*): Self = StObject.set(x, "similar_document_ids", js.Array(value :_*))
    
    @scala.inline
    def setSimilar_fields(value: js.Array[String]): Self = StObject.set(x, "similar_fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimilar_fieldsUndefined: Self = StObject.set(x, "similar_fields", js.undefined)
    
    @scala.inline
    def setSimilar_fieldsVarargs(value: String*): Self = StObject.set(x, "similar_fields", js.Array(value :_*))
    
    @scala.inline
    def setSort(value: js.Array[String]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setSortVarargs(value: String*): Self = StObject.set(x, "sort", js.Array(value :_*))
  }
}
