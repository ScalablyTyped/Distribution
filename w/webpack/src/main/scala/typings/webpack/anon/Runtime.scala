package typings.webpack.anon

import typings.std.Set
import typings.webpack.mod.RuntimeSpec
import typings.webpack.mod.SortableSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Runtime extends StObject {
  
  /**
  		 * the chunk graph
  		 */
  var chunkGraph: typings.webpack.mod.ChunkGraph
  
  /**
  		 * runtime for which this code will be generated
  		 */
  var runtime: js.UndefOr[RuntimeSpec] = js.undefined
  
  /**
  		 * only execute the statement in some runtimes
  		 */
  var runtimeCondition: js.UndefOr[String | Boolean | SortableSet[String]] = js.undefined
  
  /**
  		 * if set, will be filled with runtime requirements
  		 */
  var runtimeRequirements: Set[String]
}
object Runtime {
  
  inline def apply(chunkGraph: typings.webpack.mod.ChunkGraph, runtimeRequirements: Set[String]): Runtime = {
    val __obj = js.Dynamic.literal(chunkGraph = chunkGraph.asInstanceOf[js.Any], runtimeRequirements = runtimeRequirements.asInstanceOf[js.Any])
    __obj.asInstanceOf[Runtime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Runtime] (val x: Self) extends AnyVal {
    
    inline def setChunkGraph(value: typings.webpack.mod.ChunkGraph): Self = StObject.set(x, "chunkGraph", value.asInstanceOf[js.Any])
    
    inline def setRuntime(value: RuntimeSpec): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeCondition(value: String | Boolean | SortableSet[String]): Self = StObject.set(x, "runtimeCondition", value.asInstanceOf[js.Any])
    
    inline def setRuntimeConditionUndefined: Self = StObject.set(x, "runtimeCondition", js.undefined)
    
    inline def setRuntimeRequirements(value: Set[String]): Self = StObject.set(x, "runtimeRequirements", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
  }
}
