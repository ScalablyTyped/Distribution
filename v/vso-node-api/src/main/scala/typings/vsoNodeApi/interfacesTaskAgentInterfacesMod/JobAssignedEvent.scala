package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobAssignedEvent
  extends StObject
     with JobEvent {
  
  var request: TaskAgentJobRequest
}
object JobAssignedEvent {
  
  inline def apply(jobId: String, name: String, request: TaskAgentJobRequest): JobAssignedEvent = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobAssignedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobAssignedEvent] (val x: Self) extends AnyVal {
    
    inline def setRequest(value: TaskAgentJobRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
