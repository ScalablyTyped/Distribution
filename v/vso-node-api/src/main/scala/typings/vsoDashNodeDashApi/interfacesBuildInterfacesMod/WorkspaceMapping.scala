package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceMapping extends js.Object {
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
  @scala.inline
  def apply(
    definitionUri: String,
    depth: Double,
    localItem: String,
    mappingType: WorkspaceMappingType,
    serverItem: String,
    workspaceId: Double
  ): WorkspaceMapping = {
    val __obj = js.Dynamic.literal(definitionUri = definitionUri, depth = depth, localItem = localItem, mappingType = mappingType, serverItem = serverItem, workspaceId = workspaceId)
  
    __obj.asInstanceOf[WorkspaceMapping]
  }
}

