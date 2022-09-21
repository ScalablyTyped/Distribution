package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateHashContextDependency extends StObject {
  
  var chunkGraph: ChunkGraph
  
  var runtime: RuntimeSpec
  
  var runtimeTemplate: js.UndefOr[RuntimeTemplate] = js.undefined
}
object UpdateHashContextDependency {
  
  inline def apply(chunkGraph: ChunkGraph): UpdateHashContextDependency = {
    val __obj = js.Dynamic.literal(chunkGraph = chunkGraph.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateHashContextDependency]
  }
  
  extension [Self <: UpdateHashContextDependency](x: Self) {
    
    inline def setChunkGraph(value: ChunkGraph): Self = StObject.set(x, "chunkGraph", value.asInstanceOf[js.Any])
    
    inline def setRuntime(value: RuntimeSpec): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeTemplate(value: RuntimeTemplate): Self = StObject.set(x, "runtimeTemplate", value.asInstanceOf[js.Any])
    
    inline def setRuntimeTemplateUndefined: Self = StObject.set(x, "runtimeTemplate", js.undefined)
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
  }
}
