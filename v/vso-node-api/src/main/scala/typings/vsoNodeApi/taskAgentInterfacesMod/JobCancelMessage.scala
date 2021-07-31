package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobCancelMessage extends StObject {
  
  var jobId: String
  
  var timeout: js.Any
}
object JobCancelMessage {
  
  @scala.inline
  def apply(jobId: String, timeout: js.Any): JobCancelMessage = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobCancelMessage]
  }
  
  @scala.inline
  implicit class JobCancelMessageMutableBuilder[Self <: JobCancelMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
