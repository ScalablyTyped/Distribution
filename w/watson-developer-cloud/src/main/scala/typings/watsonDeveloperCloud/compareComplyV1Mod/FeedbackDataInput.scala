package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Feedback data for submission. */
trait FeedbackDataInput extends js.Object {
  /** Brief information about the input document. */
  var document: js.UndefOr[ShortDoc] = js.undefined
  /** The type of feedback. The only permitted value is `element_classification`. */
  var feedback_type: String
  /** The numeric location of the identified element in the document, represented with two integers labeled `begin` and `end`. */
  var location: Location
  /** An optional string identifying the model ID. The only permitted value is `contracts`. */
  var model_id: js.UndefOr[String] = js.undefined
  /** An optional string identifying the version of the model used. */
  var model_version: js.UndefOr[String] = js.undefined
  /** The original labeling from the input document, without the submitted feedback. */
  var original_labels: OriginalLabelsIn
  /** The text on which to submit feedback. */
  var text: String
  /** The updated labeling from the input document, accounting for the submitted feedback. */
  var updated_labels: UpdatedLabelsIn
}

object FeedbackDataInput {
  @scala.inline
  def apply(
    feedback_type: String,
    location: Location,
    original_labels: OriginalLabelsIn,
    text: String,
    updated_labels: UpdatedLabelsIn,
    document: ShortDoc = null,
    model_id: String = null,
    model_version: String = null
  ): FeedbackDataInput = {
    val __obj = js.Dynamic.literal(feedback_type = feedback_type.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], original_labels = original_labels.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], updated_labels = updated_labels.asInstanceOf[js.Any])
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (model_id != null) __obj.updateDynamic("model_id")(model_id.asInstanceOf[js.Any])
    if (model_version != null) __obj.updateDynamic("model_version")(model_version.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedbackDataInput]
  }
}

