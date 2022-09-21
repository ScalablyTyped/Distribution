package typings.webpack.anon

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportVar extends StObject {
  
  /**
  		 * the chunk graph
  		 */
  var chunkGraph: typings.webpack.mod.ChunkGraph
  
  /**
  		 * name of the import variable
  		 */
  var importVar: String
  
  /**
  		 * the module
  		 */
  var module: typings.webpack.mod.Module
  
  /**
  		 * module in which the statement is emitted
  		 */
  var originModule: typings.webpack.mod.Module
  
  /**
  		 * the request that should be printed as comment
  		 */
  var request: String
  
  /**
  		 * if set, will be filled with runtime requirements
  		 */
  var runtimeRequirements: Set[String]
  
  /**
  		 * whether a new variable should be created or the existing one updated
  		 */
  var update: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * true, if this is a weak dependency
  		 */
  var weak: js.UndefOr[Boolean] = js.undefined
}
object ImportVar {
  
  inline def apply(
    chunkGraph: typings.webpack.mod.ChunkGraph,
    importVar: String,
    module: typings.webpack.mod.Module,
    originModule: typings.webpack.mod.Module,
    request: String,
    runtimeRequirements: Set[String]
  ): ImportVar = {
    val __obj = js.Dynamic.literal(chunkGraph = chunkGraph.asInstanceOf[js.Any], importVar = importVar.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], originModule = originModule.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], runtimeRequirements = runtimeRequirements.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportVar]
  }
  
  extension [Self <: ImportVar](x: Self) {
    
    inline def setChunkGraph(value: typings.webpack.mod.ChunkGraph): Self = StObject.set(x, "chunkGraph", value.asInstanceOf[js.Any])
    
    inline def setImportVar(value: String): Self = StObject.set(x, "importVar", value.asInstanceOf[js.Any])
    
    inline def setModule(value: typings.webpack.mod.Module): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setOriginModule(value: typings.webpack.mod.Module): Self = StObject.set(x, "originModule", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRuntimeRequirements(value: Set[String]): Self = StObject.set(x, "runtimeRequirements", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    inline def setWeak(value: Boolean): Self = StObject.set(x, "weak", value.asInstanceOf[js.Any])
    
    inline def setWeakUndefined: Self = StObject.set(x, "weak", js.undefined)
  }
}
