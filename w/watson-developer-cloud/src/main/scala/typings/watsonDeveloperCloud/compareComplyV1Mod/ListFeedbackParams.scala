package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `listFeedback` operation. */
@js.native
trait ListFeedbackParams extends js.Object {
  /** An optional string in the format `YYYY-MM-DD` that filters the output to include only feedback that was added after the specified date. */
  var after: js.UndefOr[String] = js.native
  /** An optional string in the format `YYYY-MM-DD` that filters the output to include only feedback that was added before the specified date. */
  var before: js.UndefOr[String] = js.native
  /** An optional string in the form of a comma-separated list of categories. If this is specified, the service filters the output to include only feedback that has at least one category from the list added. */
  var category_added: js.UndefOr[String] = js.native
  /** An optional string in the form of a comma-separated list of categories. If this is specified, the service filters the output to include only feedback that has at least one category from the list unchanged. */
  var category_not_changed: js.UndefOr[String] = js.native
  /** An optional string in the form of a comma-separated list of categories. If this is specified, the service filters the output to include only feedback that has at least one category from the list removed. */
  var category_removed: js.UndefOr[String] = js.native
  /** An optional string that returns the set of documents after the previous set. Use this parameter with the `page_limit` parameter. */
  var cursor: js.UndefOr[String] = js.native
  /** An optional string that filters the output to include only feedback from the document with the specified `document_title`. */
  var document_title: js.UndefOr[String] = js.native
  /** An optional string that filters the output to include only feedback with the specified feedback type. The only permitted value is `element_classification`. */
  var feedback_type: js.UndefOr[String] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  /** An optional boolean value. If specified as `true`, the `pagination` object in the output includes a value called `total` that gives the total count of feedback created. */
  var include_total: js.UndefOr[Boolean] = js.native
  /** An optional string that filters the output to include only feedback with the specified `model_id`. The only permitted value is `contracts`. */
  var model_id: js.UndefOr[String] = js.native
  /** An optional string that filters the output to include only feedback with the specified `model_version`. */
  var model_version: js.UndefOr[String] = js.native
  /** An optional integer specifying the number of documents that you want the service to return. */
  var page_limit: js.UndefOr[Double] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** An optional comma-separated list of fields in the document to sort on. You can optionally specify the sort direction by prefixing the value of the field with `-` for descending order or `+` for ascending order (the default). Currently permitted sorting fields are `created`, `user_id`, and `document_title`. */
  var sort: js.UndefOr[String] = js.native
  /** An optional string of comma-separated `nature`:`party` pairs. If this is specified, the service filters the output to include only feedback that has at least one `nature`:`party` pair from the list removed. */
  var type_added: js.UndefOr[String] = js.native
  /** An optional string of comma-separated `nature`:`party` pairs. If this is specified, the service filters the output to include only feedback that has at least one `nature`:`party` pair from the list unchanged. */
  var type_not_changed: js.UndefOr[String] = js.native
  /** An optional string of comma-separated `nature`:`party` pairs. If this is specified, the service filters the output to include only feedback that has at least one `nature`:`party` pair from the list removed. */
  var type_removed: js.UndefOr[String] = js.native
}

object ListFeedbackParams {
  @scala.inline
  def apply(): ListFeedbackParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFeedbackParams]
  }
  @scala.inline
  implicit class ListFeedbackParamsOps[Self <: ListFeedbackParams] (val x: Self) extends AnyVal {
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
    def setAfter(value: String): Self = this.set("after", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    @scala.inline
    def setBefore(value: String): Self = this.set("before", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    @scala.inline
    def setCategory_added(value: String): Self = this.set("category_added", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory_added: Self = this.set("category_added", js.undefined)
    @scala.inline
    def setCategory_not_changed(value: String): Self = this.set("category_not_changed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory_not_changed: Self = this.set("category_not_changed", js.undefined)
    @scala.inline
    def setCategory_removed(value: String): Self = this.set("category_removed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory_removed: Self = this.set("category_removed", js.undefined)
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setDocument_title(value: String): Self = this.set("document_title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocument_title: Self = this.set("document_title", js.undefined)
    @scala.inline
    def setFeedback_type(value: String): Self = this.set("feedback_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeedback_type: Self = this.set("feedback_type", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setInclude_total(value: Boolean): Self = this.set("include_total", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude_total: Self = this.set("include_total", js.undefined)
    @scala.inline
    def setModel_id(value: String): Self = this.set("model_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel_id: Self = this.set("model_id", js.undefined)
    @scala.inline
    def setModel_version(value: String): Self = this.set("model_version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel_version: Self = this.set("model_version", js.undefined)
    @scala.inline
    def setPage_limit(value: Double): Self = this.set("page_limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage_limit: Self = this.set("page_limit", js.undefined)
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
    @scala.inline
    def setSort(value: String): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setType_added(value: String): Self = this.set("type_added", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType_added: Self = this.set("type_added", js.undefined)
    @scala.inline
    def setType_not_changed(value: String): Self = this.set("type_not_changed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType_not_changed: Self = this.set("type_not_changed", js.undefined)
    @scala.inline
    def setType_removed(value: String): Self = this.set("type_removed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType_removed: Self = this.set("type_removed", js.undefined)
  }
  
}

