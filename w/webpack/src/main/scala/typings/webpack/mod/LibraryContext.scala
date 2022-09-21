package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LibraryContext[T] extends StObject {
  
  var chunkGraph: ChunkGraph
  
  var compilation: Compilation
  
  var options: T
}
object LibraryContext {
  
  inline def apply[T](chunkGraph: ChunkGraph, compilation: Compilation, options: T): LibraryContext[T] = {
    val __obj = js.Dynamic.literal(chunkGraph = chunkGraph.asInstanceOf[js.Any], compilation = compilation.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[LibraryContext[T]]
  }
  
  extension [Self <: LibraryContext[?], T](x: Self & LibraryContext[T]) {
    
    inline def setChunkGraph(value: ChunkGraph): Self = StObject.set(x, "chunkGraph", value.asInstanceOf[js.Any])
    
    inline def setCompilation(value: Compilation): Self = StObject.set(x, "compilation", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: T): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
