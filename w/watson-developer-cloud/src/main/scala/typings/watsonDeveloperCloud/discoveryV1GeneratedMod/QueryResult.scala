package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** QueryResult. */
trait QueryResult
  extends StObject
     with /** QueryNoticesResult accepts additional properties. */
/* propName */ StringDictionary[Any] {
  
  /** The collection ID of the collection containing the document for this result. */
  var collection_id: js.UndefOr[String] = js.undefined
  
  /** The unique identifier of the document. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Metadata of the document. */
  var metadata: js.UndefOr[js.Object] = js.undefined
  
  /** Metadata of a query result. */
  var result_metadata: js.UndefOr[QueryResultMetadata] = js.undefined
  
  /** Automatically extracted result title. */
  var title: js.UndefOr[String] = js.undefined
}
object QueryResult {
  
  inline def apply(): QueryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryResult]
  }
  
  extension [Self <: QueryResult](x: Self) {
    
    inline def setCollection_id(value: String): Self = StObject.set(x, "collection_id", value.asInstanceOf[js.Any])
    
    inline def setCollection_idUndefined: Self = StObject.set(x, "collection_id", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setResult_metadata(value: QueryResultMetadata): Self = StObject.set(x, "result_metadata", value.asInstanceOf[js.Any])
    
    inline def setResult_metadataUndefined: Self = StObject.set(x, "result_metadata", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
