package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.webpack.mod.SyntheticDependencyLocation
  - typings.webpack.mod.RealDependencyLocation
*/
trait DependencyLocation extends StObject
object DependencyLocation {
  
  inline def RealDependencyLocation(start: SourcePosition): typings.webpack.mod.RealDependencyLocation = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.webpack.mod.RealDependencyLocation]
  }
  
  inline def SyntheticDependencyLocation(name: String): typings.webpack.mod.SyntheticDependencyLocation = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.webpack.mod.SyntheticDependencyLocation]
  }
}
