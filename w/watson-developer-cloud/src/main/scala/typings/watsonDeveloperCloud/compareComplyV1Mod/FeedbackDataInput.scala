package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Feedback data for submission. */
@js.native
trait FeedbackDataInput extends StObject {
  
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
  implicit class FeedbackDataInputMutableBuilder[Self <: FeedbackDataInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument(value: ShortDoc): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    @scala.inline
    def setFeedback_type(value: String): Self = StObject.set(x, "feedback_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel_id(value: String): Self = StObject.set(x, "model_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel_idUndefined: Self = StObject.set(x, "model_id", js.undefined)
    
    @scala.inline
    def setModel_version(value: String): Self = StObject.set(x, "model_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel_versionUndefined: Self = StObject.set(x, "model_version", js.undefined)
    
    @scala.inline
    def setOriginal_labels(value: OriginalLabelsIn): Self = StObject.set(x, "original_labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_labels(value: UpdatedLabelsIn): Self = StObject.set(x, "updated_labels", value.asInstanceOf[js.Any])
  }
}
