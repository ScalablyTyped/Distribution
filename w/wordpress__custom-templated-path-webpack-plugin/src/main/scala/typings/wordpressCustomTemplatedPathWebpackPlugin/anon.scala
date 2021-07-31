package typings.wordpressCustomTemplatedPathWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Basename extends StObject {
    
    var basename: js.UndefOr[String] = js.undefined
    
    var chunk: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compilation.Chunk */ js.Any
      ] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    var hash: js.UndefOr[String] = js.undefined
    
    var query: js.UndefOr[js.Any] = js.undefined
  }
  object Basename {
    
    @scala.inline
    def apply(): Basename = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Basename]
    }
    
    @scala.inline
    implicit class BasenameMutableBuilder[Self <: Basename] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      @scala.inline
      def setChunk(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compilation.Chunk */ js.Any
      ): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunkUndefined: Self = StObject.set(x, "chunk", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      @scala.inline
      def setQuery(value: js.Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
}
