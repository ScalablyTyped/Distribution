package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskDefinitionReference extends StObject {
  
  /**
    * The type of task (task or task group).
    */
  var definitionType: String = js.native
  
  /**
    * The ID of the task.
    */
  var id: String = js.native
  
  /**
    * The version of the task.
    */
  var versionSpec: String = js.native
}
object TaskDefinitionReference {
  
  @scala.inline
  def apply(definitionType: String, id: String, versionSpec: String): TaskDefinitionReference = {
    val __obj = js.Dynamic.literal(definitionType = definitionType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], versionSpec = versionSpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskDefinitionReference]
  }
  
  @scala.inline
  implicit class TaskDefinitionReferenceMutableBuilder[Self <: TaskDefinitionReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefinitionType(value: String): Self = StObject.set(x, "definitionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionSpec(value: String): Self = StObject.set(x, "versionSpec", value.asInstanceOf[js.Any])
  }
}
