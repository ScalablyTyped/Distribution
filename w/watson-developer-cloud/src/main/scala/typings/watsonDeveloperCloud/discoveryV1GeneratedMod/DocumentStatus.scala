package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Status information about a submitted document. */
trait DocumentStatus extends StObject {
  
  /** The unique identifier for the configuration. */
  var configuration_id: js.UndefOr[String] = js.undefined
  
  /** The unique identifier of the document. */
  var document_id: String
  
  /** The type of the original source file. */
  var file_type: js.UndefOr[String] = js.undefined
  
  /** Name of the original source file (if available). */
  var filename: js.UndefOr[String] = js.undefined
  
  /** Array of notices produced by the document-ingestion process. */
  var notices: js.Array[Notice]
  
  /** The SHA-1 hash of the original source file (formatted as a hexadecimal string). */
  var sha1: js.UndefOr[String] = js.undefined
  
  /** Status of the document in the ingestion process. */
  var status: String
  
  /** Description of the document status. */
  var status_description: String
}
object DocumentStatus {
  
  inline def apply(document_id: String, notices: js.Array[Notice], status: String, status_description: String): DocumentStatus = {
    val __obj = js.Dynamic.literal(document_id = document_id.asInstanceOf[js.Any], notices = notices.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_description = status_description.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentStatus] (val x: Self) extends AnyVal {
    
    inline def setConfiguration_id(value: String): Self = StObject.set(x, "configuration_id", value.asInstanceOf[js.Any])
    
    inline def setConfiguration_idUndefined: Self = StObject.set(x, "configuration_id", js.undefined)
    
    inline def setDocument_id(value: String): Self = StObject.set(x, "document_id", value.asInstanceOf[js.Any])
    
    inline def setFile_type(value: String): Self = StObject.set(x, "file_type", value.asInstanceOf[js.Any])
    
    inline def setFile_typeUndefined: Self = StObject.set(x, "file_type", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setNotices(value: js.Array[Notice]): Self = StObject.set(x, "notices", value.asInstanceOf[js.Any])
    
    inline def setNoticesVarargs(value: Notice*): Self = StObject.set(x, "notices", js.Array(value*))
    
    inline def setSha1(value: String): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
    
    inline def setSha1Undefined: Self = StObject.set(x, "sha1", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatus_description(value: String): Self = StObject.set(x, "status_description", value.asInstanceOf[js.Any])
  }
}
