package typings.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Basename extends StObject {
  
  var basename: String
  
  var chunk: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Chunk */ js.Any
  
  var filename: String
  
  var hash: String
  
  var query: String
}
object Basename {
  
  @scala.inline
  def apply(
    basename: String,
    chunk: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Chunk */ js.Any,
    filename: String,
    hash: String,
    query: String
  ): Basename = {
    val __obj = js.Dynamic.literal(basename = basename.asInstanceOf[js.Any], chunk = chunk.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Basename]
  }
  
  @scala.inline
  implicit class BasenameMutableBuilder[Self <: Basename] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunk(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Chunk */ js.Any
    ): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
