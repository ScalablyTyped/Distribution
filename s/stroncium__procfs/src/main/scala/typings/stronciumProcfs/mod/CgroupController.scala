package typings.stronciumProcfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CgroupController extends StObject {
  
  var cgroupsNumber: Double
  
  var enabled: Boolean
  
  var hierarchyId: Double
  
  var name: String
}
object CgroupController {
  
  inline def apply(cgroupsNumber: Double, enabled: Boolean, hierarchyId: Double, name: String): CgroupController = {
    val __obj = js.Dynamic.literal(cgroupsNumber = cgroupsNumber.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], hierarchyId = hierarchyId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CgroupController]
  }
  
  extension [Self <: CgroupController](x: Self) {
    
    inline def setCgroupsNumber(value: Double): Self = StObject.set(x, "cgroupsNumber", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setHierarchyId(value: Double): Self = StObject.set(x, "hierarchyId", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
