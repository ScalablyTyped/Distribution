package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `query` operation. */
@js.native
trait QueryParams extends js.Object {
  /** An aggregation search that returns an exact answer by combining query search with filters. Useful for applications to build lists, tables, and time series. For a full list of possible aggregations, see the Query reference. */
  var aggregation: js.UndefOr[String] = js.native
  /** Field which the returned results will be biased against. The specified field must be either a **date** or **number** format. When a **date** type field is specified returned results are biased towards field values closer to the current date. When a **number** type field is specified, returned results are biased towards higher field values. This parameter cannot be used in the same query as the **sort** parameter. */
  var bias: js.UndefOr[String] = js.native
  /** The ID of the collection. */
  var collection_id: String = js.native
  /** A comma-separated list of collection IDs to be queried against. Required when querying multiple collections, invalid when performing a single collection query. */
  var collection_ids: js.UndefOr[String] = js.native
  /** Number of results to return. */
  var count: js.UndefOr[Double] = js.native
  /** When `true`, and used with a Watson Discovery News collection, duplicate results (based on the contents of the **title** field) are removed. Duplicate comparison is limited to the current query only; **offset** is not considered. This parameter is currently Beta functionality. */
  var deduplicate: js.UndefOr[Boolean] = js.native
  /** When specified, duplicate results based on the field specified are removed from the returned results. Duplicate comparison is limited to the current query only, **offset** is not considered. This parameter is currently Beta functionality. */
  var deduplicate_field: js.UndefOr[String] = js.native
  /** The ID of the environment. */
  var environment_id: String = js.native
  /** A cacheable query that excludes documents that don't mention the query content. Filter searches are better for metadata-type searches and for assessing the concepts in the data set. */
  var filter: js.UndefOr[String] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  /** When true, a highlight field is returned for each result which contains the fields which match the query with `<em></em>` tags around the matching query terms. */
  var highlight: js.UndefOr[Boolean] = js.native
  /** If `true`, queries are not stored in the Discovery **Logs** endpoint. */
  var logging_opt_out: js.UndefOr[Boolean] = js.native
  /** A natural language query that returns relevant documents by utilizing training data and natural language understanding. You cannot use **natural_language_query** and **query** at the same time. */
  var natural_language_query: js.UndefOr[String] = js.native
  /** The number of query results to skip at the beginning. For example, if the total number of results that are returned is 10 and the offset is 8, it returns the last two results. */
  var offset: js.UndefOr[Double] = js.native
  /** A passages query that returns the most relevant passages from the results. */
  var passages: js.UndefOr[Boolean] = js.native
  /** The approximate number of characters that any one passage will have. */
  var passages_characters: js.UndefOr[Double] = js.native
  /** The maximum number of passages to return. The search returns fewer passages if the requested total is not found. The default is `10`. The maximum is `100`. */
  var passages_count: js.UndefOr[Double] = js.native
  /** A comma-separated list of fields that passages are drawn from. If this parameter not specified, then all top-level fields are included. */
  var passages_fields: js.UndefOr[String] = js.native
  /** A query search returns all documents in your data set with full enrichments and full text, but with the most relevant documents listed first. Use a query search when you want to find the most relevant search results. You cannot use **natural_language_query** and **query** at the same time. */
  var query: js.UndefOr[String] = js.native
  /** A comma-separated list of the portion of the document hierarchy to return. */
  var return_fields: js.UndefOr[String] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** When `true`, results are returned based on their similarity to the document IDs specified in the **similar.document_ids** parameter. */
  var similar: js.UndefOr[Boolean] = js.native
  /** A comma-separated list of document IDs to find similar documents. **Tip:** Include the **natural_language_query** parameter to expand the scope of the document similarity search with the natural language query. Other query parameters, such as **filter** and **query**, are subsequently applied and reduce the scope. */
  var similar_document_ids: js.UndefOr[String] = js.native
  /** A comma-separated list of field names that are used as a basis for comparison to identify similar documents. If not specified, the entire document is used for comparison. */
  var similar_fields: js.UndefOr[String] = js.native
  /** A comma-separated list of fields in the document to sort on. You can optionally specify a sort direction by prefixing the field with `-` for descending or `+` for ascending. Ascending is the default sort direction if no prefix is specified. This parameter cannot be used in the same query as the **bias** parameter. */
  var sort: js.UndefOr[String] = js.native
}

object QueryParams {
  @scala.inline
  def apply(collection_id: String, environment_id: String): QueryParams = {
    val __obj = js.Dynamic.literal(collection_id = collection_id.asInstanceOf[js.Any], environment_id = environment_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryParams]
  }
  @scala.inline
  implicit class QueryParamsOps[Self <: QueryParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCollection_id(value: String): Self = this.set("collection_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironment_id(value: String): Self = this.set("environment_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setAggregation(value: String): Self = this.set("aggregation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregation: Self = this.set("aggregation", js.undefined)
    @scala.inline
    def setBias(value: String): Self = this.set("bias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBias: Self = this.set("bias", js.undefined)
    @scala.inline
    def setCollection_ids(value: String): Self = this.set("collection_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollection_ids: Self = this.set("collection_ids", js.undefined)
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setDeduplicate(value: Boolean): Self = this.set("deduplicate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeduplicate: Self = this.set("deduplicate", js.undefined)
    @scala.inline
    def setDeduplicate_field(value: String): Self = this.set("deduplicate_field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeduplicate_field: Self = this.set("deduplicate_field", js.undefined)
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setHighlight(value: Boolean): Self = this.set("highlight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlight: Self = this.set("highlight", js.undefined)
    @scala.inline
    def setLogging_opt_out(value: Boolean): Self = this.set("logging_opt_out", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogging_opt_out: Self = this.set("logging_opt_out", js.undefined)
    @scala.inline
    def setNatural_language_query(value: String): Self = this.set("natural_language_query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNatural_language_query: Self = this.set("natural_language_query", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setPassages(value: Boolean): Self = this.set("passages", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassages: Self = this.set("passages", js.undefined)
    @scala.inline
    def setPassages_characters(value: Double): Self = this.set("passages_characters", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassages_characters: Self = this.set("passages_characters", js.undefined)
    @scala.inline
    def setPassages_count(value: Double): Self = this.set("passages_count", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassages_count: Self = this.set("passages_count", js.undefined)
    @scala.inline
    def setPassages_fields(value: String): Self = this.set("passages_fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassages_fields: Self = this.set("passages_fields", js.undefined)
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setReturn_fields(value: String): Self = this.set("return_fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_fields: Self = this.set("return_fields", js.undefined)
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
    @scala.inline
    def setSimilar(value: Boolean): Self = this.set("similar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimilar: Self = this.set("similar", js.undefined)
    @scala.inline
    def setSimilar_document_ids(value: String): Self = this.set("similar_document_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimilar_document_ids: Self = this.set("similar_document_ids", js.undefined)
    @scala.inline
    def setSimilar_fields(value: String): Self = this.set("similar_fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimilar_fields: Self = this.set("similar_fields", js.undefined)
    @scala.inline
    def setSort(value: String): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
  
}

