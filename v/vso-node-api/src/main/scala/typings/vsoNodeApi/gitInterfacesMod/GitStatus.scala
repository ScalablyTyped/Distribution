package typings.vsoNodeApi.gitInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitStatus extends js.Object {
  
  /**
    * Reference links.
    */
  var _links: js.Any = js.native
  
  /**
    * Context of the status.
    */
  var context: GitStatusContext = js.native
  
  /**
    * Identity that created the status.
    */
  var createdBy: IdentityRef = js.native
  
  /**
    * Creation date and time of the status.
    */
  var creationDate: Date = js.native
  
  /**
    * Status description. Typically describes current state of the status.
    */
  var description: String = js.native
  
  /**
    * Status identifier.
    */
  var id: Double = js.native
  
  /**
    * State of the status.
    */
  var state: GitStatusState = js.native
  
  /**
    * URL with status details.
    */
  var targetUrl: String = js.native
  
  /**
    * Last update date and time of the status.
    */
  var updatedDate: Date = js.native
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
  implicit class GitStatusOps[Self <: GitStatus] (val x: Self) extends AnyVal {
    
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
    def set_links(value: js.Any): Self = this.set("_links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: GitStatusContext): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedBy(value: IdentityRef): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDate(value: Date): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: GitStatusState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUrl(value: String): Self = this.set("targetUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedDate(value: Date): Self = this.set("updatedDate", value.asInstanceOf[js.Any])
  }
}
