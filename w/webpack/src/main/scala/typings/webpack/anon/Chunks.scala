package typings.webpack.anon

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chunks extends StObject {
  
  var chunks: Set[typings.webpack.mod.Chunk]
  
  var onChunks: js.Array[typings.webpack.mod.Chunk]
}
object Chunks {
  
  inline def apply(chunks: Set[typings.webpack.mod.Chunk], onChunks: js.Array[typings.webpack.mod.Chunk]): Chunks = {
    val __obj = js.Dynamic.literal(chunks = chunks.asInstanceOf[js.Any], onChunks = onChunks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chunks]
  }
  
  extension [Self <: Chunks](x: Self) {
    
    inline def setChunks(value: Set[typings.webpack.mod.Chunk]): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
    
    inline def setOnChunks(value: js.Array[typings.webpack.mod.Chunk]): Self = StObject.set(x, "onChunks", value.asInstanceOf[js.Any])
    
    inline def setOnChunksVarargs(value: typings.webpack.mod.Chunk*): Self = StObject.set(x, "onChunks", js.Array(value*))
  }
}
