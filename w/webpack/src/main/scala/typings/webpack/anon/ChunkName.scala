package typings.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChunkName extends StObject {
  
  /**
  		 * name of the chunk referenced
  		 */
  var chunkName: js.UndefOr[String] = js.undefined
  
  /**
  		 * reason information of the chunk
  		 */
  var chunkReason: js.UndefOr[String] = js.undefined
  
  /**
  		 * name of the export
  		 */
  var exportName: js.UndefOr[String] = js.undefined
  
  /**
  		 * additional message
  		 */
  var message: js.UndefOr[String] = js.undefined
  
  /**
  		 * request string used originally
  		 */
  var request: js.UndefOr[String] = js.undefined
}
object ChunkName {
  
  inline def apply(): ChunkName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChunkName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChunkName] (val x: Self) extends AnyVal {
    
    inline def setChunkName(value: String): Self = StObject.set(x, "chunkName", value.asInstanceOf[js.Any])
    
    inline def setChunkNameUndefined: Self = StObject.set(x, "chunkName", js.undefined)
    
    inline def setChunkReason(value: String): Self = StObject.set(x, "chunkReason", value.asInstanceOf[js.Any])
    
    inline def setChunkReasonUndefined: Self = StObject.set(x, "chunkReason", js.undefined)
    
    inline def setExportName(value: String): Self = StObject.set(x, "exportName", value.asInstanceOf[js.Any])
    
    inline def setExportNameUndefined: Self = StObject.set(x, "exportName", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
  }
}
