package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `listFeedback` operation. */
trait ListFeedbackParams extends js.Object {
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
  @scala.inline
  def apply(
    after: String = null,
    before: String = null,
    category_added: String = null,
    category_not_changed: String = null,
    category_removed: String = null,
    cursor: String = null,
    document_title: String = null,
    feedback_type: String = null,
    headers: js.Object = null,
    include_total: js.UndefOr[Boolean] = js.undefined,
    model_id: String = null,
    model_version: String = null,
    page_limit: Int | Double = null,
    return_response: js.UndefOr[Boolean] = js.undefined,
    sort: String = null,
    type_added: String = null,
    type_not_changed: String = null,
    type_removed: String = null
  ): ListFeedbackParams = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (category_added != null) __obj.updateDynamic("category_added")(category_added.asInstanceOf[js.Any])
    if (category_not_changed != null) __obj.updateDynamic("category_not_changed")(category_not_changed.asInstanceOf[js.Any])
    if (category_removed != null) __obj.updateDynamic("category_removed")(category_removed.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (document_title != null) __obj.updateDynamic("document_title")(document_title.asInstanceOf[js.Any])
    if (feedback_type != null) __obj.updateDynamic("feedback_type")(feedback_type.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(include_total)) __obj.updateDynamic("include_total")(include_total.asInstanceOf[js.Any])
    if (model_id != null) __obj.updateDynamic("model_id")(model_id.asInstanceOf[js.Any])
    if (model_version != null) __obj.updateDynamic("model_version")(model_version.asInstanceOf[js.Any])
    if (page_limit != null) __obj.updateDynamic("page_limit")(page_limit.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (type_added != null) __obj.updateDynamic("type_added")(type_added.asInstanceOf[js.Any])
    if (type_not_changed != null) __obj.updateDynamic("type_not_changed")(type_not_changed.asInstanceOf[js.Any])
    if (type_removed != null) __obj.updateDynamic("type_removed")(type_removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFeedbackParams]
  }
}

