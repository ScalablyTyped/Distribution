package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceMapping extends js.Object {
  /**
    * Uri of the associated definition
    */
  var definitionUri: java.lang.String
  /**
    * Depth of this mapping
    */
  var depth: scala.Double
  /**
    * local location of the definition
    */
  var localItem: java.lang.String
  /**
    * type of workspace mapping
    */
  var mappingType: WorkspaceMappingType
  /**
    * Server location of the definition
    */
  var serverItem: java.lang.String
  /**
    * Id of the workspace
    */
  var workspaceId: scala.Double
}

object WorkspaceMapping {
  @scala.inline
  def apply(
    definitionUri: java.lang.String,
    depth: scala.Double,
    localItem: java.lang.String,
    mappingType: WorkspaceMappingType,
    serverItem: java.lang.String,
    workspaceId: scala.Double
  ): WorkspaceMapping = {
    val __obj = js.Dynamic.literal(definitionUri = definitionUri, depth = depth, localItem = localItem, mappingType = mappingType, serverItem = serverItem, workspaceId = workspaceId)
  
    __obj.asInstanceOf[WorkspaceMapping]
  }
}

