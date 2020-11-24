package typings.vsoNodeApi.coreInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebApiConnectedService extends WebApiConnectedServiceRef {
  
  /**
    * The user who did the OAuth authentication to created this service
    */
  var authenticatedBy: IdentityRef = js.native
  
  /**
    * Extra description on the service.
    */
  var description: String = js.native
  
  /**
    * Friendly Name of service connection
    */
  var friendlyName: String = js.native
  
  /**
    * The kind of service.
    */
  var kind: String = js.native
  
  /**
    * The project associated with this service
    */
  var project: TeamProjectReference = js.native
  
  /**
    * Optional uri to connect directly to the service such as https://windows.azure.com
    */
  var serviceUri: String = js.native
}
object WebApiConnectedService {
  
  @scala.inline
  def apply(
    authenticatedBy: IdentityRef,
    description: String,
    friendlyName: String,
    id: String,
    kind: String,
    project: TeamProjectReference,
    serviceUri: String,
    url: String
  ): WebApiConnectedService = {
    val __obj = js.Dynamic.literal(authenticatedBy = authenticatedBy.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], serviceUri = serviceUri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebApiConnectedService]
  }
  
  @scala.inline
  implicit class WebApiConnectedServiceOps[Self <: WebApiConnectedService] (val x: Self) extends AnyVal {
    
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
    def setAuthenticatedBy(value: IdentityRef): Self = this.set("authenticatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendlyName(value: String): Self = this.set("friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject(value: TeamProjectReference): Self = this.set("project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUri(value: String): Self = this.set("serviceUri", value.asInstanceOf[js.Any])
  }
}
