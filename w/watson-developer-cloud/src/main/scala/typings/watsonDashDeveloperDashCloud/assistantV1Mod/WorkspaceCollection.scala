package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** WorkspaceCollection. */
trait WorkspaceCollection extends js.Object {
  /** The pagination data for the returned objects. */
  var pagination: Pagination
  /** An array of objects describing the workspaces associated with the service instance. */
  var workspaces: js.Array[Workspace]
}

object WorkspaceCollection {
  @scala.inline
  def apply(pagination: Pagination, workspaces: js.Array[Workspace]): WorkspaceCollection = {
    val __obj = js.Dynamic.literal(pagination = pagination.asInstanceOf[js.Any], workspaces = workspaces.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkspaceCollection]
  }
}

