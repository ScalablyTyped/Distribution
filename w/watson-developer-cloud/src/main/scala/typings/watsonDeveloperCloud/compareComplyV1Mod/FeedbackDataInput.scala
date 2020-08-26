package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Feedback data for submission. */
@js.native
trait FeedbackDataInput extends js.Object {
  /** Brief information about the input document. */
  var document: js.UndefOr[ShortDoc] = js.native
  /** The type of feedback. The only permitted value is `element_classification`. */
  var feedback_type: String = js.native
  /** The numeric location of the identified element in the document, represented with two integers labeled `begin` and `end`. */
  var location: Location = js.native
  /** An optional string identifying the model ID. The only permitted value is `contracts`. */
  var model_id: js.UndefOr[String] = js.native
  /** An optional string identifying the version of the model used. */
  var model_version: js.UndefOr[String] = js.native
  /** The original labeling from the input document, without the submitted feedback. */
  var original_labels: OriginalLabelsIn = js.native
  /** The text on which to submit feedback. */
  var text: String = js.native
  /** The updated labeling from the input document, accounting for the submitted feedback. */
  var updated_labels: UpdatedLabelsIn = js.native
}

object FeedbackDataInput {
  @scala.inline
  def apply(
    feedback_type: String,
    location: Location,
    original_labels: OriginalLabelsIn,
    text: String,
    updated_labels: UpdatedLabelsIn
  ): FeedbackDataInput = {
    val __obj = js.Dynamic.literal(feedback_type = feedback_type.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], original_labels = original_labels.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], updated_labels = updated_labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedbackDataInput]
  }
  @scala.inline
  implicit class FeedbackDataInputOps[Self <: FeedbackDataInput] (val x: Self) extends AnyVal {
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
    def setFeedback_type(value: String): Self = this.set("feedback_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginal_labels(value: OriginalLabelsIn): Self = this.set("original_labels", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated_labels(value: UpdatedLabelsIn): Self = this.set("updated_labels", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocument(value: ShortDoc): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocument: Self = this.set("document", js.undefined)
    @scala.inline
    def setModel_id(value: String): Self = this.set("model_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel_id: Self = this.set("model_id", js.undefined)
    @scala.inline
    def setModel_version(value: String): Self = this.set("model_version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel_version: Self = this.set("model_version", js.undefined)
  }
  
}

