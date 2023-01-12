package typings.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DependencyIdModuleId extends StObject {
  
  var dependencyId: String | Double
  
  var moduleId: String | Double
}
object DependencyIdModuleId {
  
  inline def apply(dependencyId: String | Double, moduleId: String | Double): DependencyIdModuleId = {
    val __obj = js.Dynamic.literal(dependencyId = dependencyId.asInstanceOf[js.Any], moduleId = moduleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependencyIdModuleId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DependencyIdModuleId] (val x: Self) extends AnyVal {
    
    inline def setDependencyId(value: String | Double): Self = StObject.set(x, "dependencyId", value.asInstanceOf[js.Any])
    
    inline def setModuleId(value: String | Double): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
  }
}
