package typings.vsoNodeApi.gitInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitStatus extends StObject {
  
  /**
    * Reference links.
    */
  var _links: js.Any
  
  /**
    * Context of the status.
    */
  var context: GitStatusContext
  
  /**
    * Identity that created the status.
    */
  var createdBy: IdentityRef
  
  /**
    * Creation date and time of the status.
    */
  var creationDate: Date
  
  /**
    * Status description. Typically describes current state of the status.
    */
  var description: String
  
  /**
    * Status identifier.
    */
  var id: Double
  
  /**
    * State of the status.
    */
  var state: GitStatusState
  
  /**
    * URL with status details.
    */
  var targetUrl: String
  
  /**
    * Last update date and time of the status.
    */
  var updatedDate: Date
}
object GitStatus {
  
  @scala.inline
  def apply(
    _links: js.Any,
    context: GitStatusContext,
    createdBy: IdentityRef,
    creationDate: Date,
    description: String,
    id: Double,
    state: GitStatusState,
    targetUrl: String,
    updatedDate: Date
  ): GitStatus = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], targetUrl = targetUrl.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitStatus]
  }
  
  @scala.inline
  implicit class GitStatusMutableBuilder[Self <: GitStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: GitStatusContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedBy(value: IdentityRef): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDate(value: Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: GitStatusState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUrl(value: String): Self = StObject.set(x, "targetUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedDate(value: Date): Self = StObject.set(x, "updatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
