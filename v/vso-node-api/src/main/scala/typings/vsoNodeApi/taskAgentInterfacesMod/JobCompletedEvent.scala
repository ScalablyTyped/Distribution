package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobCompletedEvent extends JobEvent {
  
  var outputVariables: StringDictionary[VariableValue] = js.native
  
  var requestId: Double = js.native
  
  var result: TaskResult = js.native
}
object JobCompletedEvent {
  
  @scala.inline
  def apply(
    jobId: String,
    name: String,
    outputVariables: StringDictionary[VariableValue],
    requestId: Double,
    result: TaskResult
  ): JobCompletedEvent = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputVariables = outputVariables.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobCompletedEvent]
  }
  
  @scala.inline
  implicit class JobCompletedEventMutableBuilder[Self <: JobCompletedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputVariables(value: StringDictionary[VariableValue]): Self = StObject.set(x, "outputVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: Double): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: TaskResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
