package typings.stronciumProcfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessCgroup extends StObject {
  
  var controllers: js.UndefOr[js.Array[String]] = js.undefined
  
  var hierarchyId: Double
  
  var path: String
}
object ProcessCgroup {
  
  inline def apply(hierarchyId: Double, path: String): ProcessCgroup = {
    val __obj = js.Dynamic.literal(hierarchyId = hierarchyId.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessCgroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProcessCgroup] (val x: Self) extends AnyVal {
    
    inline def setControllers(value: js.Array[String]): Self = StObject.set(x, "controllers", value.asInstanceOf[js.Any])
    
    inline def setControllersUndefined: Self = StObject.set(x, "controllers", js.undefined)
    
    inline def setControllersVarargs(value: String*): Self = StObject.set(x, "controllers", js.Array(value*))
    
    inline def setHierarchyId(value: Double): Self = StObject.set(x, "hierarchyId", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
