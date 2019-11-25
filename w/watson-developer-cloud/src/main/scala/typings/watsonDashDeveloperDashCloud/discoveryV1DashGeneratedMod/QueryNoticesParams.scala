package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `queryNotices` operation. */
trait QueryNoticesParams extends js.Object {
  /** An aggregation search that returns an exact answer by combining query search with filters. Useful for applications to build lists, tables, and time series. For a full list of possible aggregations, see the Query reference. */
  var aggregation: js.UndefOr[String] = js.undefined
  /** The ID of the collection. */
  var collection_id: String
  /** Number of results to return. The maximum for the **count** and **offset** values together in any one query is **10000**. */
  var count: js.UndefOr[Double] = js.undefined
  /** When specified, duplicate results based on the field specified are removed from the returned results. Duplicate comparison is limited to the current query only, **offset** is not considered. This parameter is currently Beta functionality. */
  var deduplicate_field: js.UndefOr[String] = js.undefined
  /** The ID of the environment. */
  var environment_id: String
  /** A cacheable query that excludes documents that don't mention the query content. Filter searches are better for metadata-type searches and for assessing the concepts in the data set. */
  var filter: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  /** When true, a highlight field is returned for each result which contains the fields which match the query with `<em></em>` tags around the matching query terms. */
  var highlight: js.UndefOr[Boolean] = js.undefined
  /** A natural language query that returns relevant documents by utilizing training data and natural language understanding. You cannot use **natural_language_query** and **query** at the same time. */
  var natural_language_query: js.UndefOr[String] = js.undefined
  /** The number of query results to skip at the beginning. For example, if the total number of results that are returned is 10 and the offset is 8, it returns the last two results. The maximum for the **count** and **offset** values together in any one query is **10000**. */
  var offset: js.UndefOr[Double] = js.undefined
  /** A passages query that returns the most relevant passages from the results. */
  var passages: js.UndefOr[Boolean] = js.undefined
  /** The approximate number of characters that any one passage will have. */
  var passages_characters: js.UndefOr[Double] = js.undefined
  /** The maximum number of passages to return. The search returns fewer passages if the requested total is not found. */
  var passages_count: js.UndefOr[Double] = js.undefined
  /** A comma-separated list of fields that passages are drawn from. If this parameter not specified, then all top-level fields are included. */
  var passages_fields: js.UndefOr[js.Array[String]] = js.undefined
  /** A query search returns all documents in your data set with full enrichments and full text, but with the most relevant documents listed first. Use a query search when you want to find the most relevant search results. You cannot use **natural_language_query** and **query** at the same time. */
  var query: js.UndefOr[String] = js.undefined
  /** A comma-separated list of the portion of the document hierarchy to return. */
  var return_fields: js.UndefOr[js.Array[String]] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** When `true`, results are returned based on their similarity to the document IDs specified in the **similar.document_ids** parameter. */
  var similar: js.UndefOr[Boolean] = js.undefined
  /** A comma-separated list of document IDs to find similar documents. **Tip:** Include the **natural_language_query** parameter to expand the scope of the document similarity search with the natural language query. Other query parameters, such as **filter** and **query**, are subsequently applied and reduce the scope. */
  var similar_document_ids: js.UndefOr[js.Array[String]] = js.undefined
  /** A comma-separated list of field names that are used as a basis for comparison to identify similar documents. If not specified, the entire document is used for comparison. */
  var similar_fields: js.UndefOr[js.Array[String]] = js.undefined
  /** A comma-separated list of fields in the document to sort on. You can optionally specify a sort direction by prefixing the field with `-` for descending or `+` for ascending. Ascending is the default sort direction if no prefix is specified. */
  var sort: js.UndefOr[js.Array[String]] = js.undefined
}

object QueryNoticesParams {
  @scala.inline
  def apply(
    collection_id: String,
    environment_id: String,
    aggregation: String = null,
    count: Int | Double = null,
    deduplicate_field: String = null,
    filter: String = null,
    headers: js.Object = null,
    highlight: js.UndefOr[Boolean] = js.undefined,
    natural_language_query: String = null,
    offset: Int | Double = null,
    passages: js.UndefOr[Boolean] = js.undefined,
    passages_characters: Int | Double = null,
    passages_count: Int | Double = null,
    passages_fields: js.Array[String] = null,
    query: String = null,
    return_fields: js.Array[String] = null,
    return_response: js.UndefOr[Boolean] = js.undefined,
    similar: js.UndefOr[Boolean] = js.undefined,
    similar_document_ids: js.Array[String] = null,
    similar_fields: js.Array[String] = null,
    sort: js.Array[String] = null
  ): QueryNoticesParams = {
    val __obj = js.Dynamic.literal(collection_id = collection_id.asInstanceOf[js.Any], environment_id = environment_id.asInstanceOf[js.Any])
    if (aggregation != null) __obj.updateDynamic("aggregation")(aggregation.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (deduplicate_field != null) __obj.updateDynamic("deduplicate_field")(deduplicate_field.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (natural_language_query != null) __obj.updateDynamic("natural_language_query")(natural_language_query.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(passages)) __obj.updateDynamic("passages")(passages.asInstanceOf[js.Any])
    if (passages_characters != null) __obj.updateDynamic("passages_characters")(passages_characters.asInstanceOf[js.Any])
    if (passages_count != null) __obj.updateDynamic("passages_count")(passages_count.asInstanceOf[js.Any])
    if (passages_fields != null) __obj.updateDynamic("passages_fields")(passages_fields.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (return_fields != null) __obj.updateDynamic("return_fields")(return_fields.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    if (!js.isUndefined(similar)) __obj.updateDynamic("similar")(similar.asInstanceOf[js.Any])
    if (similar_document_ids != null) __obj.updateDynamic("similar_document_ids")(similar_document_ids.asInstanceOf[js.Any])
    if (similar_fields != null) __obj.updateDynamic("similar_fields")(similar_fields.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryNoticesParams]
  }
}

