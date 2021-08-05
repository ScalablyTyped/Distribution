package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** DocumentAccepted. */
trait DocumentAccepted extends StObject {
  
  /** The unique identifier of the ingested document. */
  var document_id: js.UndefOr[String] = js.undefined
  
  /** Array of notices produced by the document-ingestion process. */
  var notices: js.UndefOr[js.Array[Notice]] = js.undefined
  
  /** Status of the document in the ingestion process. A status of `processing` is returned for documents that are ingested with a *version* date before `2019-01-01`. The `pending` status is returned for all others. */
  var status: js.UndefOr[String] = js.undefined
}
object DocumentAccepted {
  
  inline def apply(): DocumentAccepted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentAccepted]
  }
  
  extension [Self <: DocumentAccepted](x: Self) {
    
    inline def setDocument_id(value: String): Self = StObject.set(x, "document_id", value.asInstanceOf[js.Any])
    
    inline def setDocument_idUndefined: Self = StObject.set(x, "document_id", js.undefined)
    
    inline def setNotices(value: js.Array[Notice]): Self = StObject.set(x, "notices", value.asInstanceOf[js.Any])
    
    inline def setNoticesUndefined: Self = StObject.set(x, "notices", js.undefined)
    
    inline def setNoticesVarargs(value: Notice*): Self = StObject.set(x, "notices", js.Array(value :_*))
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
