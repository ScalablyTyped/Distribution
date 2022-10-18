package typings.vsoNodeApi.interfacesWorkItemTrackingProcessInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProcessModel extends StObject {
  
  /**
    * Description of the process
    */
  var description: String
  
  /**
    * Name of the process
    */
  var name: String
  
  /**
    * The ID of the parent process
    */
  var parentProcessTypeId: String
  
  /**
    * Reference name of the process
    */
  var referenceName: String
}
object CreateProcessModel {
  
  inline def apply(description: String, name: String, parentProcessTypeId: String, referenceName: String): CreateProcessModel = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentProcessTypeId = parentProcessTypeId.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProcessModel]
  }
  
  extension [Self <: CreateProcessModel](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParentProcessTypeId(value: String): Self = StObject.set(x, "parentProcessTypeId", value.asInstanceOf[js.Any])
    
    inline def setReferenceName(value: String): Self = StObject.set(x, "referenceName", value.asInstanceOf[js.Any])
  }
}
