package typings.swPrecacheWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ChunkName extends StObject {
    
    var chunkName: js.UndefOr[String] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
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
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    }
  }
}
