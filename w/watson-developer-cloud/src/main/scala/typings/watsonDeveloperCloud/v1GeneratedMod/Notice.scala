package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A notice produced for the collection. */
trait Notice extends StObject {
  
  /** The creation date of the collection in the format yyyy-MM-dd'T'HH:mm:ss.SSS'Z'. */
  var created: js.UndefOr[String] = js.undefined
  
  /** The description of the notice. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Unique identifier of the document. */
  var document_id: js.UndefOr[String] = js.undefined
  
  /** Identifies the notice. Many notices might have the same ID. This field exists so that user applications can programmatically identify a notice and take automatic corrective action. Typical notice IDs include: `index_failed`, `index_failed_too_many_requests`, `index_failed_incompatible_field`, `index_failed_cluster_unavailable`, `ingestion_timeout`, `ingestion_error`, `bad_request`, `internal_error`, `missing_model`, `unsupported_model`, `smart_document_understanding_failed_incompatible_field`, `smart_document_understanding_failed_internal_error`, `smart_document_understanding_failed_internal_error`, `smart_document_understanding_failed_warning`, `smart_document_understanding_page_error`, `smart_document_understanding_page_warning`. **Note:** This is not a complete list, other values might be returned. */
  var notice_id: js.UndefOr[String] = js.undefined
  
  /** Unique identifier of the query used for relevance training. */
  var query_id: js.UndefOr[String] = js.undefined
  
  /** Severity level of the notice. */
  var severity: js.UndefOr[String] = js.undefined
  
  /** Ingestion or training step in which the notice occurred. Typical step values include: `classify_elements`, `smartDocumentUnderstanding`, `ingestion`, `indexing`, `convert`. **Note:** This is not a complete list, other values might be returned. */
  var step: js.UndefOr[String] = js.undefined
}
object Notice {
  
  inline def apply(): Notice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notice]
  }
  
  extension [Self <: Notice](x: Self) {
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDocument_id(value: String): Self = StObject.set(x, "document_id", value.asInstanceOf[js.Any])
    
    inline def setDocument_idUndefined: Self = StObject.set(x, "document_id", js.undefined)
    
    inline def setNotice_id(value: String): Self = StObject.set(x, "notice_id", value.asInstanceOf[js.Any])
    
    inline def setNotice_idUndefined: Self = StObject.set(x, "notice_id", js.undefined)
    
    inline def setQuery_id(value: String): Self = StObject.set(x, "query_id", value.asInstanceOf[js.Any])
    
    inline def setQuery_idUndefined: Self = StObject.set(x, "query_id", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setStep(value: String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
