package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildProcessResources extends StObject {
  
  var endpoints: js.Array[ServiceEndpointReference]
  
  var files: js.Array[SecureFileReference]
  
  var queues: js.Array[AgentPoolQueueReference]
}
object BuildProcessResources {
  
  @scala.inline
  def apply(
    endpoints: js.Array[ServiceEndpointReference],
    files: js.Array[SecureFileReference],
    queues: js.Array[AgentPoolQueueReference]
  ): BuildProcessResources = {
    val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], queues = queues.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildProcessResources]
  }
  
  @scala.inline
  implicit class BuildProcessResourcesMutableBuilder[Self <: BuildProcessResources] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpoints(value: js.Array[ServiceEndpointReference]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointsVarargs(value: ServiceEndpointReference*): Self = StObject.set(x, "endpoints", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[SecureFileReference]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesVarargs(value: SecureFileReference*): Self = StObject.set(x, "files", js.Array(value :_*))
    
    @scala.inline
    def setQueues(value: js.Array[AgentPoolQueueReference]): Self = StObject.set(x, "queues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueuesVarargs(value: AgentPoolQueueReference*): Self = StObject.set(x, "queues", js.Array(value :_*))
  }
}
