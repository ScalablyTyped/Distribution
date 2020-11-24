package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildProcessResources extends js.Object {
  
  var endpoints: js.Array[ServiceEndpointReference] = js.native
  
  var files: js.Array[SecureFileReference] = js.native
  
  var queues: js.Array[AgentPoolQueueReference] = js.native
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
  implicit class BuildProcessResourcesOps[Self <: BuildProcessResources] (val x: Self) extends AnyVal {
    
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
    def setEndpointsVarargs(value: ServiceEndpointReference*): Self = this.set("endpoints", js.Array(value :_*))
    
    @scala.inline
    def setEndpoints(value: js.Array[ServiceEndpointReference]): Self = this.set("endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesVarargs(value: SecureFileReference*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[SecureFileReference]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueuesVarargs(value: AgentPoolQueueReference*): Self = this.set("queues", js.Array(value :_*))
    
    @scala.inline
    def setQueues(value: js.Array[AgentPoolQueueReference]): Self = this.set("queues", value.asInstanceOf[js.Any])
  }
}
