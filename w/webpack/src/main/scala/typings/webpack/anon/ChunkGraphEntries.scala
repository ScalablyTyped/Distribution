package typings.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChunkGraphEntries extends StObject {
  
  /**
  		 * the chunk graph
  		 */
  var chunkGraph: js.UndefOr[typings.webpack.mod.ChunkGraph] = js.undefined
  
  /**
  		 * chunkGraphEntries
  		 */
  var chunkGraphEntries: js.UndefOr[js.Iterable[typings.webpack.mod.Chunk]] = js.undefined
  
  /**
  		 * chunks
  		 */
  var chunks: js.UndefOr[js.Iterable[typings.webpack.mod.Chunk]] = js.undefined
  
  /**
  		 * codeGenerationResults
  		 */
  var codeGenerationResults: js.UndefOr[typings.webpack.mod.CodeGenerationResults] = js.undefined
  
  /**
  		 * modules
  		 */
  var modules: js.UndefOr[js.Iterable[typings.webpack.mod.Module]] = js.undefined
}
object ChunkGraphEntries {
  
  inline def apply(): ChunkGraphEntries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChunkGraphEntries]
  }
  
  extension [Self <: ChunkGraphEntries](x: Self) {
    
    inline def setChunkGraph(value: typings.webpack.mod.ChunkGraph): Self = StObject.set(x, "chunkGraph", value.asInstanceOf[js.Any])
    
    inline def setChunkGraphEntries(value: js.Iterable[typings.webpack.mod.Chunk]): Self = StObject.set(x, "chunkGraphEntries", value.asInstanceOf[js.Any])
    
    inline def setChunkGraphEntriesUndefined: Self = StObject.set(x, "chunkGraphEntries", js.undefined)
    
    inline def setChunkGraphUndefined: Self = StObject.set(x, "chunkGraph", js.undefined)
    
    inline def setChunks(value: js.Iterable[typings.webpack.mod.Chunk]): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
    
    inline def setChunksUndefined: Self = StObject.set(x, "chunks", js.undefined)
    
    inline def setCodeGenerationResults(value: typings.webpack.mod.CodeGenerationResults): Self = StObject.set(x, "codeGenerationResults", value.asInstanceOf[js.Any])
    
    inline def setCodeGenerationResultsUndefined: Self = StObject.set(x, "codeGenerationResults", js.undefined)
    
    inline def setModules(value: js.Iterable[typings.webpack.mod.Module]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
  }
}
