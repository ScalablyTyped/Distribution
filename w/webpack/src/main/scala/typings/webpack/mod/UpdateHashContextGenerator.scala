package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateHashContextGenerator extends StObject {
  
  var chunkGraph: ChunkGraph
  
  /**
  	 * the module
  	 */
  var module: NormalModule
  
  var runtime: RuntimeSpec
  
  var runtimeTemplate: js.UndefOr[RuntimeTemplate] = js.undefined
}
object UpdateHashContextGenerator {
  
  inline def apply(chunkGraph: ChunkGraph, module: NormalModule): UpdateHashContextGenerator = {
    val __obj = js.Dynamic.literal(chunkGraph = chunkGraph.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateHashContextGenerator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateHashContextGenerator] (val x: Self) extends AnyVal {
    
    inline def setChunkGraph(value: ChunkGraph): Self = StObject.set(x, "chunkGraph", value.asInstanceOf[js.Any])
    
    inline def setModule(value: NormalModule): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setRuntime(value: RuntimeSpec): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeTemplate(value: RuntimeTemplate): Self = StObject.set(x, "runtimeTemplate", value.asInstanceOf[js.Any])
    
    inline def setRuntimeTemplateUndefined: Self = StObject.set(x, "runtimeTemplate", js.undefined)
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
  }
}
