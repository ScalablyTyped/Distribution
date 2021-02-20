package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceMapping extends StObject {
  
  /**
    * Uri of the associated definition
    */
  var definitionUri: String = js.native
  
  /**
    * Depth of this mapping
    */
  var depth: Double = js.native
  
  /**
    * local location of the definition
    */
  var localItem: String = js.native
  
  /**
    * type of workspace mapping
    */
  var mappingType: WorkspaceMappingType = js.native
  
  /**
    * Server location of the definition
    */
  var serverItem: String = js.native
  
  /**
    * Id of the workspace
    */
  var workspaceId: Double = js.native
}
object WorkspaceMapping {
  
  @scala.inline
  def apply(
    definitionUri: String,
    depth: Double,
    localItem: String,
    mappingType: WorkspaceMappingType,
    serverItem: String,
    workspaceId: Double
  ): WorkspaceMapping = {
    val __obj = js.Dynamic.literal(definitionUri = definitionUri.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], localItem = localItem.asInstanceOf[js.Any], mappingType = mappingType.asInstanceOf[js.Any], serverItem = serverItem.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceMapping]
  }
  
  @scala.inline
  implicit class WorkspaceMappingMutableBuilder[Self <: WorkspaceMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefinitionUri(value: String): Self = StObject.set(x, "definitionUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalItem(value: String): Self = StObject.set(x, "localItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMappingType(value: WorkspaceMappingType): Self = StObject.set(x, "mappingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerItem(value: String): Self = StObject.set(x, "serverItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceId(value: Double): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
