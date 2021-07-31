package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** DeleteDocumentResponse. */
trait DeleteDocumentResponse extends StObject {
  
  /** The unique identifier of the document. */
  var document_id: js.UndefOr[String] = js.undefined
  
  /** Status of the document. A deleted document has the status deleted. */
  var status: js.UndefOr[String] = js.undefined
}
object DeleteDocumentResponse {
  
  @scala.inline
  def apply(): DeleteDocumentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDocumentResponse]
  }
  
  @scala.inline
  implicit class DeleteDocumentResponseMutableBuilder[Self <: DeleteDocumentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument_id(value: String): Self = StObject.set(x, "document_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocument_idUndefined: Self = StObject.set(x, "document_id", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
