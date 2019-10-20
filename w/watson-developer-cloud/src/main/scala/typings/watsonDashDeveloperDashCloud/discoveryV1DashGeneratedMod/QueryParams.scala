package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `query` operation. */
trait QueryParams extends js.Object {
  /** An aggregation search that returns an exact answer by combining query search with filters. Useful for applications to build lists, tables, and time series. For a full list of possible aggregations, see the Query reference. */
  var aggregation: js.UndefOr[String] = js.undefined
  /** Field which the returned results will be biased against. The specified field must be either a **date** or **number** format. When a **date** type field is specified returned results are biased towards field values closer to the current date. When a **number** type field is specified, returned results are biased towards higher field values. This parameter cannot be used in the same query as the **sort** parameter. */
  var bias: js.UndefOr[String] = js.undefined
  /** The ID of the collection. */
  var collection_id: String
  /** A comma-separated list of collection IDs to be queried against. Required when querying multiple collections, invalid when performing a single collection query. */
  var collection_ids: js.UndefOr[String] = js.undefined
  /** Number of results to return. */
  var count: js.UndefOr[Double] = js.undefined
  /** When `true`, and used with a Watson Discovery News collection, duplicate results (based on the contents of the **title** field) are removed. Duplicate comparison is limited to the current query only; **offset** is not considered. This parameter is currently Beta functionality. */
  var deduplicate: js.UndefOr[Boolean] = js.undefined
  /** When specified, duplicate results based on the field specified are removed from the returned results. Duplicate comparison is limited to the current query only, **offset** is not considered. This parameter is currently Beta functionality. */
  var deduplicate_field: js.UndefOr[String] = js.undefined
  /** The ID of the environment. */
  var environment_id: String
  /** A cacheable query that excludes documents that don't mention the query content. Filter searches are better for metadata-type searches and for assessing the concepts in the data set. */
  var filter: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  /** When true, a highlight field is returned for each result which contains the fields which match the query with `<em></em>` tags around the matching query terms. */
  var highlight: js.UndefOr[Boolean] = js.undefined
  /** If `true`, queries are not stored in the Discovery **Logs** endpoint. */
  var logging_opt_out: js.UndefOr[Boolean] = js.undefined
  /** A natural language query that returns relevant documents by utilizing training data and natural language understanding. You cannot use **natural_language_query** and **query** at the same time. */
  var natural_language_query: js.UndefOr[String] = js.undefined
  /** The number of query results to skip at the beginning. For example, if the total number of results that are returned is 10 and the offset is 8, it returns the last two results. */
  var offset: js.UndefOr[Double] = js.undefined
  /** A passages query that returns the most relevant passages from the results. */
  var passages: js.UndefOr[Boolean] = js.undefined
  /** The approximate number of characters that any one passage will have. */
  var passages_characters: js.UndefOr[Double] = js.undefined
  /** The maximum number of passages to return. The search returns fewer passages if the requested total is not found. The default is `10`. The maximum is `100`. */
  var passages_count: js.UndefOr[Double] = js.undefined
  /** A comma-separated list of fields that passages are drawn from. If this parameter not specified, then all top-level fields are included. */
  var passages_fields: js.UndefOr[String] = js.undefined
  /** A query search returns all documents in your data set with full enrichments and full text, but with the most relevant documents listed first. Use a query search when you want to find the most relevant search results. You cannot use **natural_language_query** and **query** at the same time. */
  var query: js.UndefOr[String] = js.undefined
  /** A comma-separated list of the portion of the document hierarchy to return. */
  var return_fields: js.UndefOr[String] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** When `true`, results are returned based on their similarity to the document IDs specified in the **similar.document_ids** parameter. */
  var similar: js.UndefOr[Boolean] = js.undefined
  /** A comma-separated list of document IDs to find similar documents. **Tip:** Include the **natural_language_query** parameter to expand the scope of the document similarity search with the natural language query. Other query parameters, such as **filter** and **query**, are subsequently applied and reduce the scope. */
  var similar_document_ids: js.UndefOr[String] = js.undefined
  /** A comma-separated list of field names that are used as a basis for comparison to identify similar documents. If not specified, the entire document is used for comparison. */
  var similar_fields: js.UndefOr[String] = js.undefined
  /** A comma-separated list of fields in the document to sort on. You can optionally specify a sort direction by prefixing the field with `-` for descending or `+` for ascending. Ascending is the default sort direction if no prefix is specified. This parameter cannot be used in the same query as the **bias** parameter. */
  var sort: js.UndefOr[String] = js.undefined
}

object QueryParams {
  @scala.inline
  def apply(
    collection_id: String,
    environment_id: String,
    aggregation: String = null,
    bias: String = null,
    collection_ids: String = null,
    count: Int | Double = null,
    deduplicate: js.UndefOr[Boolean] = js.undefined,
    deduplicate_field: String = null,
    filter: String = null,
    headers: js.Object = null,
    highlight: js.UndefOr[Boolean] = js.undefined,
    logging_opt_out: js.UndefOr[Boolean] = js.undefined,
    natural_language_query: String = null,
    offset: Int | Double = null,
    passages: js.UndefOr[Boolean] = js.undefined,
    passages_characters: Int | Double = null,
    passages_count: Int | Double = null,
    passages_fields: String = null,
    query: String = null,
    return_fields: String = null,
    return_response: js.UndefOr[Boolean] = js.undefined,
    similar: js.UndefOr[Boolean] = js.undefined,
    similar_document_ids: String = null,
    similar_fields: String = null,
    sort: String = null
  ): QueryParams = {
    val __obj = js.Dynamic.literal(collection_id = collection_id, environment_id = environment_id)
    if (aggregation != null) __obj.updateDynamic("aggregation")(aggregation)
    if (bias != null) __obj.updateDynamic("bias")(bias)
    if (collection_ids != null) __obj.updateDynamic("collection_ids")(collection_ids)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (!js.isUndefined(deduplicate)) __obj.updateDynamic("deduplicate")(deduplicate)
    if (deduplicate_field != null) __obj.updateDynamic("deduplicate_field")(deduplicate_field)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight)
    if (!js.isUndefined(logging_opt_out)) __obj.updateDynamic("logging_opt_out")(logging_opt_out)
    if (natural_language_query != null) __obj.updateDynamic("natural_language_query")(natural_language_query)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(passages)) __obj.updateDynamic("passages")(passages)
    if (passages_characters != null) __obj.updateDynamic("passages_characters")(passages_characters.asInstanceOf[js.Any])
    if (passages_count != null) __obj.updateDynamic("passages_count")(passages_count.asInstanceOf[js.Any])
    if (passages_fields != null) __obj.updateDynamic("passages_fields")(passages_fields)
    if (query != null) __obj.updateDynamic("query")(query)
    if (return_fields != null) __obj.updateDynamic("return_fields")(return_fields)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    if (!js.isUndefined(similar)) __obj.updateDynamic("similar")(similar)
    if (similar_document_ids != null) __obj.updateDynamic("similar_document_ids")(similar_document_ids)
    if (similar_fields != null) __obj.updateDynamic("similar_fields")(similar_fields)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[QueryParams]
  }
}

