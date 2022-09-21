package typings.vsoNodeApi.workItemTrackingProcessInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessModel extends StObject {
  
  /**
    * Description of the process
    */
  var description: String
  
  /**
    * Name of the process
    */
  var name: String
  
  /**
    * Projects in this process
    */
  var projects: js.Array[ProjectReference]
  
  /**
    * Properties of the process
    */
  var properties: ProcessProperties
  
  /**
    * Reference name of the process
    */
  var referenceName: String
  
  /**
    * The ID of the process
    */
  var typeId: String
}
object ProcessModel {
  
  inline def apply(
    description: String,
    name: String,
    projects: js.Array[ProjectReference],
    properties: ProcessProperties,
    referenceName: String,
    typeId: String
  ): ProcessModel = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any], typeId = typeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessModel]
  }
  
  extension [Self <: ProcessModel](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProjects(value: js.Array[ProjectReference]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
    
    inline def setProjectsVarargs(value: ProjectReference*): Self = StObject.set(x, "projects", js.Array(value*))
    
    inline def setProperties(value: ProcessProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setReferenceName(value: String): Self = StObject.set(x, "referenceName", value.asInstanceOf[js.Any])
    
    inline def setTypeId(value: String): Self = StObject.set(x, "typeId", value.asInstanceOf[js.Any])
  }
}
