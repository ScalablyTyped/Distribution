package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectReference extends StObject {
  
  /**
    * Gets the unique identifier of this field.
    */
  var id: String
  
  /**
    * Gets name of project.
    */
  var name: String
}
object ProjectReference {
  
  @scala.inline
  def apply(id: String, name: String): ProjectReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectReference]
  }
  
  @scala.inline
  implicit class ProjectReferenceMutableBuilder[Self <: ProjectReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
