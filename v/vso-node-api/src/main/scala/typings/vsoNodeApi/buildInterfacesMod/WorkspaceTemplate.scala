package typings.vsoNodeApi.buildInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceTemplate extends js.Object {
  
  /**
    * Uri of the associated definition
    */
  var definitionUri: String = js.native
  
  /**
    * The identity that last modified this template
    */
  var lastModifiedBy: String = js.native
  
  /**
    * The last time this template was modified
    */
  var lastModifiedDate: Date = js.native
  
  /**
    * List of workspace mappings
    */
  var mappings: js.Array[WorkspaceMapping] = js.native
  
  /**
    * Id of the workspace for this template
    */
  var workspaceId: Double = js.native
}
object WorkspaceTemplate {
  
  @scala.inline
  def apply(
    definitionUri: String,
    lastModifiedBy: String,
    lastModifiedDate: Date,
    mappings: js.Array[WorkspaceMapping],
    workspaceId: Double
  ): WorkspaceTemplate = {
    val __obj = js.Dynamic.literal(definitionUri = definitionUri.asInstanceOf[js.Any], lastModifiedBy = lastModifiedBy.asInstanceOf[js.Any], lastModifiedDate = lastModifiedDate.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceTemplate]
  }
  
  @scala.inline
  implicit class WorkspaceTemplateOps[Self <: WorkspaceTemplate] (val x: Self) extends AnyVal {
    
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
    def setDefinitionUri(value: String): Self = this.set("definitionUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedBy(value: String): Self = this.set("lastModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDate(value: Date): Self = this.set("lastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMappingsVarargs(value: WorkspaceMapping*): Self = this.set("mappings", js.Array(value :_*))
    
    @scala.inline
    def setMappings(value: js.Array[WorkspaceMapping]): Self = this.set("mappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceId(value: Double): Self = this.set("workspaceId", value.asInstanceOf[js.Any])
  }
}
