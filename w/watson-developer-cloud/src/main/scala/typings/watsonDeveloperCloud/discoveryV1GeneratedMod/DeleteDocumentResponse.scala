package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

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
  
  inline def apply(): DeleteDocumentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDocumentResponse]
  }
  
  extension [Self <: DeleteDocumentResponse](x: Self) {
    
    inline def setDocument_id(value: String): Self = StObject.set(x, "document_id", value.asInstanceOf[js.Any])
    
    inline def setDocument_idUndefined: Self = StObject.set(x, "document_id", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
