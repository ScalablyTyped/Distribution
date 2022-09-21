package typings.webpack.anon

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Strict extends StObject {
  
  /**
  		 * the chunk graph
  		 */
  var chunkGraph: typings.webpack.mod.ChunkGraph
  
  /**
  		 * the module
  		 */
  var module: typings.webpack.mod.Module
  
  /**
  		 * the request that should be printed as comment
  		 */
  var request: String
  
  /**
  		 * if set, will be filled with runtime requirements
  		 */
  var runtimeRequirements: Set[String]
  
  /**
  		 * if the current module is in strict esm mode
  		 */
  var strict: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * if the dependency is weak (will create a nice error message)
  		 */
  var weak: js.UndefOr[Boolean] = js.undefined
}
object Strict {
  
  inline def apply(
    chunkGraph: typings.webpack.mod.ChunkGraph,
    module: typings.webpack.mod.Module,
    request: String,
    runtimeRequirements: Set[String]
  ): Strict = {
    val __obj = js.Dynamic.literal(chunkGraph = chunkGraph.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], runtimeRequirements = runtimeRequirements.asInstanceOf[js.Any])
    __obj.asInstanceOf[Strict]
  }
  
  extension [Self <: Strict](x: Self) {
    
    inline def setChunkGraph(value: typings.webpack.mod.ChunkGraph): Self = StObject.set(x, "chunkGraph", value.asInstanceOf[js.Any])
    
    inline def setModule(value: typings.webpack.mod.Module): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRuntimeRequirements(value: Set[String]): Self = StObject.set(x, "runtimeRequirements", value.asInstanceOf[js.Any])
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    inline def setWeak(value: Boolean): Self = StObject.set(x, "weak", value.asInstanceOf[js.Any])
    
    inline def setWeakUndefined: Self = StObject.set(x, "weak", js.undefined)
  }
}
