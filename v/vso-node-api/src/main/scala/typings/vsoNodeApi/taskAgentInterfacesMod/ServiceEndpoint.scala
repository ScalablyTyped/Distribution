package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceEndpoint extends js.Object {
  
  var administratorsGroup: IdentityRef = js.native
  
  /**
    * Gets or sets the authorization data for talking to the endpoint.
    */
  var authorization: EndpointAuthorization = js.native
  
  /**
    * The Gets or sets Identity reference for the user who created the Service endpoint
    */
  var createdBy: IdentityRef = js.native
  
  var data: StringDictionary[String] = js.native
  
  /**
    * Gets or Sets description of endpoint
    */
  var description: String = js.native
  
  var groupScopeId: String = js.native
  
  /**
    * Gets or sets the identifier of this endpoint.
    */
  var id: String = js.native
  
  /**
    * EndPoint state indictor
    */
  var isReady: Boolean = js.native
  
  /**
    * Gets or sets the friendly name of the endpoint.
    */
  var name: String = js.native
  
  /**
    * Error message during creation/deletion of endpoint
    */
  var operationStatus: js.Any = js.native
  
  var readersGroup: IdentityRef = js.native
  
  /**
    * Gets or sets the type of the endpoint.
    */
  var `type`: String = js.native
  
  /**
    * Gets or sets the url of the endpoint.
    */
  var url: String = js.native
}
object ServiceEndpoint {
  
  @scala.inline
  def apply(
    administratorsGroup: IdentityRef,
    authorization: EndpointAuthorization,
    createdBy: IdentityRef,
    data: StringDictionary[String],
    description: String,
    groupScopeId: String,
    id: String,
    isReady: Boolean,
    name: String,
    operationStatus: js.Any,
    readersGroup: IdentityRef,
    `type`: String,
    url: String
  ): ServiceEndpoint = {
    val __obj = js.Dynamic.literal(administratorsGroup = administratorsGroup.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], groupScopeId = groupScopeId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isReady = isReady.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operationStatus = operationStatus.asInstanceOf[js.Any], readersGroup = readersGroup.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceEndpoint]
  }
  
  @scala.inline
  implicit class ServiceEndpointOps[Self <: ServiceEndpoint] (val x: Self) extends AnyVal {
    
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
    def setAdministratorsGroup(value: IdentityRef): Self = this.set("administratorsGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorization(value: EndpointAuthorization): Self = this.set("authorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedBy(value: IdentityRef): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: StringDictionary[String]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupScopeId(value: String): Self = this.set("groupScopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReady(value: Boolean): Self = this.set("isReady", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationStatus(value: js.Any): Self = this.set("operationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadersGroup(value: IdentityRef): Self = this.set("readersGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
