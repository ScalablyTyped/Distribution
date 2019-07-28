package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceTemplate extends js.Object {
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
  var lastModifiedDate: Date
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
  @scala.inline
  def apply(
    definitionUri: String,
    lastModifiedBy: String,
    lastModifiedDate: Date,
    mappings: js.Array[WorkspaceMapping],
    workspaceId: Double
  ): WorkspaceTemplate = {
    val __obj = js.Dynamic.literal(definitionUri = definitionUri, lastModifiedBy = lastModifiedBy, lastModifiedDate = lastModifiedDate, mappings = mappings, workspaceId = workspaceId)
  
    __obj.asInstanceOf[WorkspaceTemplate]
  }
}

