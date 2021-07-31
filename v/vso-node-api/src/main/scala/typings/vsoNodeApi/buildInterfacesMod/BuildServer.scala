package typings.vsoNodeApi.buildInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildServer extends StObject {
  
  var agents: js.Array[BuildAgentReference]
  
  var controller: XamlBuildControllerReference
  
  var id: Double
  
  var isVirtual: Boolean
  
  var messageQueueUrl: String
  
  var name: String
  
  var requireClientCertificates: Boolean
  
  var status: ServiceHostStatus
  
  var statusChangedDate: Date
  
  var uri: String
  
  var url: String
  
  var version: Double
}
object BuildServer {
  
  @scala.inline
  def apply(
    agents: js.Array[BuildAgentReference],
    controller: XamlBuildControllerReference,
    id: Double,
    isVirtual: Boolean,
    messageQueueUrl: String,
    name: String,
    requireClientCertificates: Boolean,
    status: ServiceHostStatus,
    statusChangedDate: Date,
    uri: String,
    url: String,
    version: Double
  ): BuildServer = {
    val __obj = js.Dynamic.literal(agents = agents.asInstanceOf[js.Any], controller = controller.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isVirtual = isVirtual.asInstanceOf[js.Any], messageQueueUrl = messageQueueUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], requireClientCertificates = requireClientCertificates.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusChangedDate = statusChangedDate.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildServer]
  }
  
  @scala.inline
  implicit class BuildServerMutableBuilder[Self <: BuildServer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgents(value: js.Array[BuildAgentReference]): Self = StObject.set(x, "agents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentsVarargs(value: BuildAgentReference*): Self = StObject.set(x, "agents", js.Array(value :_*))
    
    @scala.inline
    def setController(value: XamlBuildControllerReference): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVirtual(value: Boolean): Self = StObject.set(x, "isVirtual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageQueueUrl(value: String): Self = StObject.set(x, "messageQueueUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireClientCertificates(value: Boolean): Self = StObject.set(x, "requireClientCertificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: ServiceHostStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusChangedDate(value: Date): Self = StObject.set(x, "statusChangedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
