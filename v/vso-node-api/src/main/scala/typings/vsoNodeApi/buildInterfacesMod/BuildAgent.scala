package typings.vsoNodeApi.buildInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildAgent extends StObject {
  
  var buildDirectory: String = js.native
  
  var controller: XamlBuildControllerReference = js.native
  
  var createdDate: Date = js.native
  
  var description: String = js.native
  
  var enabled: Boolean = js.native
  
  var id: Double = js.native
  
  var messageQueueUrl: String = js.native
  
  var name: String = js.native
  
  var reservedForBuild: String = js.native
  
  var server: XamlBuildServerReference = js.native
  
  var status: AgentStatus = js.native
  
  var statusMessage: String = js.native
  
  var updatedDate: Date = js.native
  
  var uri: String = js.native
  
  var url: String = js.native
}
object BuildAgent {
  
  @scala.inline
  def apply(
    buildDirectory: String,
    controller: XamlBuildControllerReference,
    createdDate: Date,
    description: String,
    enabled: Boolean,
    id: Double,
    messageQueueUrl: String,
    name: String,
    reservedForBuild: String,
    server: XamlBuildServerReference,
    status: AgentStatus,
    statusMessage: String,
    updatedDate: Date,
    uri: String,
    url: String
  ): BuildAgent = {
    val __obj = js.Dynamic.literal(buildDirectory = buildDirectory.asInstanceOf[js.Any], controller = controller.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], messageQueueUrl = messageQueueUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], reservedForBuild = reservedForBuild.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildAgent]
  }
  
  @scala.inline
  implicit class BuildAgentMutableBuilder[Self <: BuildAgent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildDirectory(value: String): Self = StObject.set(x, "buildDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setController(value: XamlBuildControllerReference): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDate(value: Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageQueueUrl(value: String): Self = StObject.set(x, "messageQueueUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedForBuild(value: String): Self = StObject.set(x, "reservedForBuild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServer(value: XamlBuildServerReference): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: AgentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedDate(value: Date): Self = StObject.set(x, "updatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
