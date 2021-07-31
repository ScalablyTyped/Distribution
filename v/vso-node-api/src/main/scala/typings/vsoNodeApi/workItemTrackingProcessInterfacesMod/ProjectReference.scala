package typings.vsoNodeApi.workItemTrackingProcessInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectReference extends StObject {
  
  /**
    * Description of the project
    */
  var description: String
  
  /**
    * The ID of the project
    */
  var id: String
  
  /**
    * Name of the project
    */
  var name: String
  
  /**
    * Url of the project
    */
  var url: String
}
object ProjectReference {
  
  @scala.inline
  def apply(description: String, id: String, name: String, url: String): ProjectReference = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectReference]
  }
  
  @scala.inline
  implicit class ProjectReferenceMutableBuilder[Self <: ProjectReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
