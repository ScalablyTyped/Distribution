package typings.vsoNodeApi.buildInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceTemplate extends StObject {
  
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
  implicit class WorkspaceTemplateMutableBuilder[Self <: WorkspaceTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefinitionUri(value: String): Self = StObject.set(x, "definitionUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedBy(value: String): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDate(value: Date): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMappings(value: js.Array[WorkspaceMapping]): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMappingsVarargs(value: WorkspaceMapping*): Self = StObject.set(x, "mappings", js.Array(value :_*))
    
    @scala.inline
    def setWorkspaceId(value: Double): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
