package typings.vsoNodeApi.workItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessModel extends js.Object {
  
  /**
    * Description of the process
    */
  var description: String = js.native
  
  /**
    * Name of the process
    */
  var name: String = js.native
  
  /**
    * Projects in this process
    */
  var projects: js.Array[ProjectReference] = js.native
  
  /**
    * Properties of the process
    */
  var properties: ProcessProperties = js.native
  
  /**
    * Reference name of the process
    */
  var referenceName: String = js.native
  
  /**
    * The ID of the process
    */
  var typeId: String = js.native
}
object ProcessModel {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ProcessModelOps[Self <: ProcessModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectsVarargs(value: ProjectReference*): Self = this.set("projects", js.Array(value :_*))
    
    @scala.inline
    def setProjects(value: js.Array[ProjectReference]): Self = this.set("projects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: ProcessProperties): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceName(value: String): Self = this.set("referenceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeId(value: String): Self = this.set("typeId", value.asInstanceOf[js.Any])
  }
}
