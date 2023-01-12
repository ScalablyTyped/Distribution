package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildAgent extends StObject {
  
  var buildDirectory: String
  
  var controller: XamlBuildControllerReference
  
  var createdDate: js.Date
  
  var description: String
  
  var enabled: Boolean
  
  var id: Double
  
  var messageQueueUrl: String
  
  var name: String
  
  var reservedForBuild: String
  
  var server: XamlBuildServerReference
  
  var status: AgentStatus
  
  var statusMessage: String
  
  var updatedDate: js.Date
  
  var uri: String
  
  var url: String
}
object BuildAgent {
  
  inline def apply(
    buildDirectory: String,
    controller: XamlBuildControllerReference,
    createdDate: js.Date,
    description: String,
    enabled: Boolean,
    id: Double,
    messageQueueUrl: String,
    name: String,
    reservedForBuild: String,
    server: XamlBuildServerReference,
    status: AgentStatus,
    statusMessage: String,
    updatedDate: js.Date,
    uri: String,
    url: String
  ): BuildAgent = {
    val __obj = js.Dynamic.literal(buildDirectory = buildDirectory.asInstanceOf[js.Any], controller = controller.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], messageQueueUrl = messageQueueUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], reservedForBuild = reservedForBuild.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildAgent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildAgent] (val x: Self) extends AnyVal {
    
    inline def setBuildDirectory(value: String): Self = StObject.set(x, "buildDirectory", value.asInstanceOf[js.Any])
    
    inline def setController(value: XamlBuildControllerReference): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMessageQueueUrl(value: String): Self = StObject.set(x, "messageQueueUrl", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setReservedForBuild(value: String): Self = StObject.set(x, "reservedForBuild", value.asInstanceOf[js.Any])
    
    inline def setServer(value: XamlBuildServerReference): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: AgentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setUpdatedDate(value: js.Date): Self = StObject.set(x, "updatedDate", value.asInstanceOf[js.Any])
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
