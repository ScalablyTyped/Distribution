package typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information returned from the `POST /v1/feedback` method. */
trait FeedbackDataOutput extends js.Object {
  /** Brief information about the input document. */
  var document: js.UndefOr[ShortDoc] = js.undefined
  /** A string identifying the user adding the feedback. The only permitted value is `element_classification`. */
  var feedback_type: js.UndefOr[String] = js.undefined
  /** The numeric location of the identified element in the document, represented with two integers labeled `begin` and `end`. */
  var location: js.UndefOr[Location] = js.undefined
  /** An optional string identifying the model ID. The only permitted value is `contracts`. */
  var model_id: js.UndefOr[String] = js.undefined
  /** An optional string identifying the version of the model used. */
  var model_version: js.UndefOr[String] = js.undefined
  /** The original labeling from the input document, without the submitted feedback. */
  var original_labels: js.UndefOr[OriginalLabelsOut] = js.undefined
  /** Pagination details, if required by the length of the output. */
  var pagination: js.UndefOr[Pagination] = js.undefined
  /** The text to which the feedback applies. */
  var text: js.UndefOr[String] = js.undefined
  /** The updated labeling from the input document, accounting for the submitted feedback. */
  var updated_labels: js.UndefOr[UpdatedLabelsOut] = js.undefined
}

object FeedbackDataOutput {
  @scala.inline
  def apply(
    document: ShortDoc = null,
    feedback_type: String = null,
    location: Location = null,
    model_id: String = null,
    model_version: String = null,
    original_labels: OriginalLabelsOut = null,
    pagination: Pagination = null,
    text: String = null,
    updated_labels: UpdatedLabelsOut = null
  ): FeedbackDataOutput = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (feedback_type != null) __obj.updateDynamic("feedback_type")(feedback_type.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (model_id != null) __obj.updateDynamic("model_id")(model_id.asInstanceOf[js.Any])
    if (model_version != null) __obj.updateDynamic("model_version")(model_version.asInstanceOf[js.Any])
    if (original_labels != null) __obj.updateDynamic("original_labels")(original_labels.asInstanceOf[js.Any])
    if (pagination != null) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (updated_labels != null) __obj.updateDynamic("updated_labels")(updated_labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedbackDataOutput]
  }
}

