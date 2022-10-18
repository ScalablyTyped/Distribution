package typings.tern.libTernMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Document extends StObject {
  
  var files: js.UndefOr[js.Array[File]] = js.undefined
  
  var query: js.UndefOr[Query] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object Document {
  
  inline def apply(): Document = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Document]
  }
  
  extension [Self <: Document](x: Self) {
    
    inline def setFiles(value: js.Array[File]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: File*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
