package typings.stronciumProcfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessMountinfo extends StObject {
  
  var devId: Double
  
  var mountId: Double
  
  var mountOptions: js.Array[String]
  
  var mountPoint: String
  
  var mountSource: String
  
  var optionalFields: js.Array[String]
  
  var parentId: Double
  
  var root: String
  
  var superOptions: js.Array[String]
  
  var `type`: js.Array[String]
}
object ProcessMountinfo {
  
  inline def apply(
    devId: Double,
    mountId: Double,
    mountOptions: js.Array[String],
    mountPoint: String,
    mountSource: String,
    optionalFields: js.Array[String],
    parentId: Double,
    root: String,
    superOptions: js.Array[String],
    `type`: js.Array[String]
  ): ProcessMountinfo = {
    val __obj = js.Dynamic.literal(devId = devId.asInstanceOf[js.Any], mountId = mountId.asInstanceOf[js.Any], mountOptions = mountOptions.asInstanceOf[js.Any], mountPoint = mountPoint.asInstanceOf[js.Any], mountSource = mountSource.asInstanceOf[js.Any], optionalFields = optionalFields.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], superOptions = superOptions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessMountinfo]
  }
  
  extension [Self <: ProcessMountinfo](x: Self) {
    
    inline def setDevId(value: Double): Self = StObject.set(x, "devId", value.asInstanceOf[js.Any])
    
    inline def setMountId(value: Double): Self = StObject.set(x, "mountId", value.asInstanceOf[js.Any])
    
    inline def setMountOptions(value: js.Array[String]): Self = StObject.set(x, "mountOptions", value.asInstanceOf[js.Any])
    
    inline def setMountOptionsVarargs(value: String*): Self = StObject.set(x, "mountOptions", js.Array(value*))
    
    inline def setMountPoint(value: String): Self = StObject.set(x, "mountPoint", value.asInstanceOf[js.Any])
    
    inline def setMountSource(value: String): Self = StObject.set(x, "mountSource", value.asInstanceOf[js.Any])
    
    inline def setOptionalFields(value: js.Array[String]): Self = StObject.set(x, "optionalFields", value.asInstanceOf[js.Any])
    
    inline def setOptionalFieldsVarargs(value: String*): Self = StObject.set(x, "optionalFields", js.Array(value*))
    
    inline def setParentId(value: Double): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setSuperOptions(value: js.Array[String]): Self = StObject.set(x, "superOptions", value.asInstanceOf[js.Any])
    
    inline def setSuperOptionsVarargs(value: String*): Self = StObject.set(x, "superOptions", js.Array(value*))
    
    inline def setType(value: js.Array[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
