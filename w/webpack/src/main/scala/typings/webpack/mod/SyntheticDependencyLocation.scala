package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyntheticDependencyLocation
  extends StObject
     with DependencyLocation {
  
  var index: js.UndefOr[Double] = js.undefined
  
  var name: String
}
object SyntheticDependencyLocation {
  
  inline def apply(name: String): SyntheticDependencyLocation = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntheticDependencyLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SyntheticDependencyLocation] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
