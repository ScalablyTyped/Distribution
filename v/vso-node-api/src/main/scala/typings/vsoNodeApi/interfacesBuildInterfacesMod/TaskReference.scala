package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskReference extends StObject {
  
  /**
    * The ID of the task definition.
    */
  var id: String
  
  /**
    * The name of the task definition.
    */
  var name: String
  
  /**
    * The version of the task definition.
    */
  var version: String
}
object TaskReference {
  
  inline def apply(id: String, name: String, version: String): TaskReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskReference]
  }
  
  extension [Self <: TaskReference](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
