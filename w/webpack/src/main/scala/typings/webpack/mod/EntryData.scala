package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntryData extends StObject {
  
  /**
  	 * dependencies of the entrypoint that should be evaluated at startup
  	 */
  var dependencies: js.Array[Dependency]
  
  /**
  	 * dependencies of the entrypoint that should be included but not evaluated
  	 */
  var includeDependencies: js.Array[Dependency]
  
  /**
  	 * options of the entrypoint
  	 */
  var options: EntryOptions
}
object EntryData {
  
  inline def apply(
    dependencies: js.Array[Dependency],
    includeDependencies: js.Array[Dependency],
    options: EntryOptions
  ): EntryData = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], includeDependencies = includeDependencies.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryData]
  }
  
  extension [Self <: EntryData](x: Self) {
    
    inline def setDependencies(value: js.Array[Dependency]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesVarargs(value: Dependency*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setIncludeDependencies(value: js.Array[Dependency]): Self = StObject.set(x, "includeDependencies", value.asInstanceOf[js.Any])
    
    inline def setIncludeDependenciesVarargs(value: Dependency*): Self = StObject.set(x, "includeDependencies", js.Array(value*))
    
    inline def setOptions(value: EntryOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
