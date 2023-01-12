package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** QueryNoticesResult. */
trait QueryNoticesResult
  extends StObject
     with /** QueryNoticesResult accepts additional properties. */
/* propName */ StringDictionary[Any] {
  
  /** The internal status code returned by the ingestion subsystem indicating the overall result of ingesting the source document. */
  var code: js.UndefOr[Double] = js.undefined
  
  /** The collection ID of the collection containing the document for this result. */
  var collection_id: js.UndefOr[String] = js.undefined
  
  /** The type of the original source file. */
  var file_type: js.UndefOr[String] = js.undefined
  
  /** Name of the original source file (if available). */
  var filename: js.UndefOr[String] = js.undefined
  
  /** The unique identifier of the document. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Metadata of the document. */
  var metadata: js.UndefOr[js.Object] = js.undefined
  
  /** Array of notices for the document. */
  var notices: js.UndefOr[js.Array[Notice]] = js.undefined
  
  /** Metadata of a query result. */
  var result_metadata: js.UndefOr[QueryResultMetadata] = js.undefined
  
  /** The SHA-1 hash of the original source file (formatted as a hexadecimal string). */
  var sha1: js.UndefOr[String] = js.undefined
  
  /** Automatically extracted result title. */
  var title: js.UndefOr[String] = js.undefined
}
object QueryNoticesResult {
  
  inline def apply(): QueryNoticesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryNoticesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryNoticesResult] (val x: Self) extends AnyVal {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCollection_id(value: String): Self = StObject.set(x, "collection_id", value.asInstanceOf[js.Any])
    
    inline def setCollection_idUndefined: Self = StObject.set(x, "collection_id", js.undefined)
    
    inline def setFile_type(value: String): Self = StObject.set(x, "file_type", value.asInstanceOf[js.Any])
    
    inline def setFile_typeUndefined: Self = StObject.set(x, "file_type", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setNotices(value: js.Array[Notice]): Self = StObject.set(x, "notices", value.asInstanceOf[js.Any])
    
    inline def setNoticesUndefined: Self = StObject.set(x, "notices", js.undefined)
    
    inline def setNoticesVarargs(value: Notice*): Self = StObject.set(x, "notices", js.Array(value*))
    
    inline def setResult_metadata(value: QueryResultMetadata): Self = StObject.set(x, "result_metadata", value.asInstanceOf[js.Any])
    
    inline def setResult_metadataUndefined: Self = StObject.set(x, "result_metadata", js.undefined)
    
    inline def setSha1(value: String): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
    
    inline def setSha1Undefined: Self = StObject.set(x, "sha1", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
