package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobCancelMessage extends StObject {
  
  var jobId: String
  
  var timeout: Any
}
object JobCancelMessage {
  
  inline def apply(jobId: String, timeout: Any): JobCancelMessage = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobCancelMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobCancelMessage] (val x: Self) extends AnyVal {
    
    inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
