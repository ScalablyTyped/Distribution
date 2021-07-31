package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** WorkspaceCollection. */
trait WorkspaceCollection extends StObject {
  
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
  
  @scala.inline
  implicit class WorkspaceCollectionMutableBuilder[Self <: WorkspaceCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPagination(value: Pagination): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaces(value: js.Array[Workspace]): Self = StObject.set(x, "workspaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspacesVarargs(value: Workspace*): Self = StObject.set(x, "workspaces", js.Array(value :_*))
  }
}
