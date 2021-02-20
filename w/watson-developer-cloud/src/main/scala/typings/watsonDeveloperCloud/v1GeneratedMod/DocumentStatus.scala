package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Status information about a submitted document. */
@js.native
trait DocumentStatus extends StObject {
  
  /** The unique identifier for the configuration. */
  var configuration_id: js.UndefOr[String] = js.native
  
  /** The unique identifier of the document. */
  var document_id: String = js.native
  
  /** The type of the original source file. */
  var file_type: js.UndefOr[String] = js.native
  
  /** Name of the original source file (if available). */
  var filename: js.UndefOr[String] = js.native
  
  /** Array of notices produced by the document-ingestion process. */
  var notices: js.Array[Notice] = js.native
  
  /** The SHA-1 hash of the original source file (formatted as a hexadecimal string). */
  var sha1: js.UndefOr[String] = js.native
  
  /** Status of the document in the ingestion process. */
  var status: String = js.native
  
  /** Description of the document status. */
  var status_description: String = js.native
}
object DocumentStatus {
  
  @scala.inline
  def apply(document_id: String, notices: js.Array[Notice], status: String, status_description: String): DocumentStatus = {
    val __obj = js.Dynamic.literal(document_id = document_id.asInstanceOf[js.Any], notices = notices.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_description = status_description.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentStatus]
  }
  
  @scala.inline
  implicit class DocumentStatusMutableBuilder[Self <: DocumentStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration_id(value: String): Self = StObject.set(x, "configuration_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfiguration_idUndefined: Self = StObject.set(x, "configuration_id", js.undefined)
    
    @scala.inline
    def setDocument_id(value: String): Self = StObject.set(x, "document_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile_type(value: String): Self = StObject.set(x, "file_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile_typeUndefined: Self = StObject.set(x, "file_type", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    @scala.inline
    def setNotices(value: js.Array[Notice]): Self = StObject.set(x, "notices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoticesVarargs(value: Notice*): Self = StObject.set(x, "notices", js.Array(value :_*))
    
    @scala.inline
    def setSha1(value: String): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha1Undefined: Self = StObject.set(x, "sha1", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus_description(value: String): Self = StObject.set(x, "status_description", value.asInstanceOf[js.Any])
  }
}
