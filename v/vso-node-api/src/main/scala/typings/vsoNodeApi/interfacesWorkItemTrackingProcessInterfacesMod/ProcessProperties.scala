package typings.vsoNodeApi.interfacesWorkItemTrackingProcessInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessProperties extends StObject {
  
  /**
    * Class of the process
    */
  var `class`: ProcessClass
  
  /**
    * Is the process default process
    */
  var isDefault: Boolean
  
  /**
    * Is the process enabled
    */
  var isEnabled: Boolean
  
  /**
    * ID of the parent process
    */
  var parentProcessTypeId: String
  
  /**
    * Version of the process
    */
  var version: String
}
object ProcessProperties {
  
  inline def apply(
    `class`: ProcessClass,
    isDefault: Boolean,
    isEnabled: Boolean,
    parentProcessTypeId: String,
    version: String
  ): ProcessProperties = {
    val __obj = js.Dynamic.literal(isDefault = isDefault.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], parentProcessTypeId = parentProcessTypeId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessProperties]
  }
  
  extension [Self <: ProcessProperties](x: Self) {
    
    inline def setClass(value: ProcessClass): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setParentProcessTypeId(value: String): Self = StObject.set(x, "parentProcessTypeId", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
