package typings.swPrecacheWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ChunkName extends StObject {
    
    var chunkName: js.UndefOr[String] = js.native
    
    var filename: js.UndefOr[String] = js.native
  }
  object ChunkName {
    
    @scala.inline
    def apply(): ChunkName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChunkName]
    }
    
    @scala.inline
    implicit class ChunkNameMutableBuilder[Self <: ChunkName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChunkName(value: String): Self = StObject.set(x, "chunkName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunkNameUndefined: Self = StObject.set(x, "chunkName", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    }
  }
}
