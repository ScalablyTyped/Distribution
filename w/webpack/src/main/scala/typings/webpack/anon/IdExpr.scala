package typings.webpack.anon

import typings.webpack.webpackStrings.expression
import typings.webpack.webpackStrings.promise
import typings.webpack.webpackStrings.statements
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdExpr extends StObject {
  
  /**
  		 * the chunk graph
  		 */
  var chunkGraph: typings.webpack.mod.ChunkGraph
  
  /**
  		 * expression to use as id expression
  		 */
  var idExpr: js.UndefOr[String] = js.undefined
  
  /**
  		 * the module
  		 */
  var module: typings.webpack.mod.Module
  
  /**
  		 * the request that should be printed as comment
  		 */
  var request: String
  
  /**
  		 * which kind of code should be returned
  		 */
  var `type`: promise | expression | statements
}
object IdExpr {
  
  inline def apply(
    chunkGraph: typings.webpack.mod.ChunkGraph,
    module: typings.webpack.mod.Module,
    request: String,
    `type`: promise | expression | statements
  ): IdExpr = {
    val __obj = js.Dynamic.literal(chunkGraph = chunkGraph.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdExpr]
  }
  
  extension [Self <: IdExpr](x: Self) {
    
    inline def setChunkGraph(value: typings.webpack.mod.ChunkGraph): Self = StObject.set(x, "chunkGraph", value.asInstanceOf[js.Any])
    
    inline def setIdExpr(value: String): Self = StObject.set(x, "idExpr", value.asInstanceOf[js.Any])
    
    inline def setIdExprUndefined: Self = StObject.set(x, "idExpr", js.undefined)
    
    inline def setModule(value: typings.webpack.mod.Module): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setType(value: promise | expression | statements): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
