package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceMapping extends js.Object {
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
  implicit class WorkspaceMappingOps[Self <: WorkspaceMapping] (val x: Self) extends AnyVal {
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
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalItem(value: String): Self = this.set("localItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setMappingType(value: WorkspaceMappingType): Self = this.set("mappingType", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerItem(value: String): Self = this.set("serverItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkspaceId(value: Double): Self = this.set("workspaceId", value.asInstanceOf[js.Any])
  }
  
}

