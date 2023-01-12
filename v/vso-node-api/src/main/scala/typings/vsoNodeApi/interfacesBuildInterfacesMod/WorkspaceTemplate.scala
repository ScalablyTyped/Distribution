package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceTemplate extends StObject {
  
  /**
    * Uri of the associated definition
    */
  var definitionUri: String
  
  /**
    * The identity that last modified this template
    */
  var lastModifiedBy: String
  
  /**
    * The last time this template was modified
    */
  var lastModifiedDate: js.Date
  
  /**
    * List of workspace mappings
    */
  var mappings: js.Array[WorkspaceMapping]
  
  /**
    * Id of the workspace for this template
    */
  var workspaceId: Double
}
object WorkspaceTemplate {
  
  inline def apply(
    definitionUri: String,
    lastModifiedBy: String,
    lastModifiedDate: js.Date,
    mappings: js.Array[WorkspaceMapping],
    workspaceId: Double
  ): WorkspaceTemplate = {
    val __obj = js.Dynamic.literal(definitionUri = definitionUri.asInstanceOf[js.Any], lastModifiedBy = lastModifiedBy.asInstanceOf[js.Any], lastModifiedDate = lastModifiedDate.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceTemplate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkspaceTemplate] (val x: Self) extends AnyVal {
    
    inline def setDefinitionUri(value: String): Self = StObject.set(x, "definitionUri", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedBy(value: String): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setMappings(value: js.Array[WorkspaceMapping]): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
    
    inline def setMappingsVarargs(value: WorkspaceMapping*): Self = StObject.set(x, "mappings", js.Array(value*))
    
    inline def setWorkspaceId(value: Double): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
