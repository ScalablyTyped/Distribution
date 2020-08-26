package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information returned from the `POST /v1/feedback` method. */
@js.native
trait FeedbackDataOutput extends js.Object {
  /** Brief information about the input document. */
  var document: js.UndefOr[ShortDoc] = js.native
  /** A string identifying the user adding the feedback. The only permitted value is `element_classification`. */
  var feedback_type: js.UndefOr[String] = js.native
  /** The numeric location of the identified element in the document, represented with two integers labeled `begin` and `end`. */
  var location: js.UndefOr[Location] = js.native
  /** An optional string identifying the model ID. The only permitted value is `contracts`. */
  var model_id: js.UndefOr[String] = js.native
  /** An optional string identifying the version of the model used. */
  var model_version: js.UndefOr[String] = js.native
  /** The original labeling from the input document, without the submitted feedback. */
  var original_labels: js.UndefOr[OriginalLabelsOut] = js.native
  /** Pagination details, if required by the length of the output. */
  var pagination: js.UndefOr[Pagination] = js.native
  /** The text to which the feedback applies. */
  var text: js.UndefOr[String] = js.native
  /** The updated labeling from the input document, accounting for the submitted feedback. */
  var updated_labels: js.UndefOr[UpdatedLabelsOut] = js.native
}

object FeedbackDataOutput {
  @scala.inline
  def apply(): FeedbackDataOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeedbackDataOutput]
  }
  @scala.inline
  implicit class FeedbackDataOutputOps[Self <: FeedbackDataOutput] (val x: Self) extends AnyVal {
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
    def setDocument(value: ShortDoc): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocument: Self = this.set("document", js.undefined)
    @scala.inline
    def setFeedback_type(value: String): Self = this.set("feedback_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeedback_type: Self = this.set("feedback_type", js.undefined)
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setModel_id(value: String): Self = this.set("model_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel_id: Self = this.set("model_id", js.undefined)
    @scala.inline
    def setModel_version(value: String): Self = this.set("model_version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel_version: Self = this.set("model_version", js.undefined)
    @scala.inline
    def setOriginal_labels(value: OriginalLabelsOut): Self = this.set("original_labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginal_labels: Self = this.set("original_labels", js.undefined)
    @scala.inline
    def setPagination(value: Pagination): Self = this.set("pagination", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePagination: Self = this.set("pagination", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setUpdated_labels(value: UpdatedLabelsOut): Self = this.set("updated_labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated_labels: Self = this.set("updated_labels", js.undefined)
  }
  
}

