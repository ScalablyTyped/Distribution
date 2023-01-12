package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information returned from the `POST /v1/feedback` method. */
trait FeedbackDataOutput extends StObject {
  
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
  
  inline def apply(): FeedbackDataOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeedbackDataOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeedbackDataOutput] (val x: Self) extends AnyVal {
    
    inline def setDocument(value: ShortDoc): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setFeedback_type(value: String): Self = StObject.set(x, "feedback_type", value.asInstanceOf[js.Any])
    
    inline def setFeedback_typeUndefined: Self = StObject.set(x, "feedback_type", js.undefined)
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setModel_id(value: String): Self = StObject.set(x, "model_id", value.asInstanceOf[js.Any])
    
    inline def setModel_idUndefined: Self = StObject.set(x, "model_id", js.undefined)
    
    inline def setModel_version(value: String): Self = StObject.set(x, "model_version", value.asInstanceOf[js.Any])
    
    inline def setModel_versionUndefined: Self = StObject.set(x, "model_version", js.undefined)
    
    inline def setOriginal_labels(value: OriginalLabelsOut): Self = StObject.set(x, "original_labels", value.asInstanceOf[js.Any])
    
    inline def setOriginal_labelsUndefined: Self = StObject.set(x, "original_labels", js.undefined)
    
    inline def setPagination(value: Pagination): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
    
    inline def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setUpdated_labels(value: UpdatedLabelsOut): Self = StObject.set(x, "updated_labels", value.asInstanceOf[js.Any])
    
    inline def setUpdated_labelsUndefined: Self = StObject.set(x, "updated_labels", js.undefined)
  }
}
