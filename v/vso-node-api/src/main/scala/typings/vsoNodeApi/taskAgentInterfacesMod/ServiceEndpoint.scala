package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceEndpoint extends StObject {
  
  var administratorsGroup: IdentityRef
  
  /**
    * Gets or sets the authorization data for talking to the endpoint.
    */
  var authorization: EndpointAuthorization
  
  /**
    * The Gets or sets Identity reference for the user who created the Service endpoint
    */
  var createdBy: IdentityRef
  
  var data: StringDictionary[String]
  
  /**
    * Gets or Sets description of endpoint
    */
  var description: String
  
  var groupScopeId: String
  
  /**
    * Gets or sets the identifier of this endpoint.
    */
  var id: String
  
  /**
    * EndPoint state indictor
    */
  var isReady: Boolean
  
  /**
    * Gets or sets the friendly name of the endpoint.
    */
  var name: String
  
  /**
    * Error message during creation/deletion of endpoint
    */
  var operationStatus: js.Any
  
  var readersGroup: IdentityRef
  
  /**
    * Gets or sets the type of the endpoint.
    */
  var `type`: String
  
  /**
    * Gets or sets the url of the endpoint.
    */
  var url: String
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
  implicit class ServiceEndpointMutableBuilder[Self <: ServiceEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdministratorsGroup(value: IdentityRef): Self = StObject.set(x, "administratorsGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorization(value: EndpointAuthorization): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedBy(value: IdentityRef): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: StringDictionary[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupScopeId(value: String): Self = StObject.set(x, "groupScopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReady(value: Boolean): Self = StObject.set(x, "isReady", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationStatus(value: js.Any): Self = StObject.set(x, "operationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadersGroup(value: IdentityRef): Self = StObject.set(x, "readersGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
