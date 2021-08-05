package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceMapping extends StObject {
  
  /**
    * Uri of the associated definition
    */
  var definitionUri: String
  
  /**
    * Depth of this mapping
    */
  var depth: Double
  
  /**
    * local location of the definition
    */
  var localItem: String
  
  /**
    * type of workspace mapping
    */
  var mappingType: WorkspaceMappingType
  
  /**
    * Server location of the definition
    */
  var serverItem: String
  
  /**
    * Id of the workspace
    */
  var workspaceId: Double
}
object WorkspaceMapping {
  
  inline def apply(
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
  
  extension [Self <: WorkspaceMapping](x: Self) {
    
    inline def setDefinitionUri(value: String): Self = StObject.set(x, "definitionUri", value.asInstanceOf[js.Any])
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setLocalItem(value: String): Self = StObject.set(x, "localItem", value.asInstanceOf[js.Any])
    
    inline def setMappingType(value: WorkspaceMappingType): Self = StObject.set(x, "mappingType", value.asInstanceOf[js.Any])
    
    inline def setServerItem(value: String): Self = StObject.set(x, "serverItem", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceId(value: Double): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
