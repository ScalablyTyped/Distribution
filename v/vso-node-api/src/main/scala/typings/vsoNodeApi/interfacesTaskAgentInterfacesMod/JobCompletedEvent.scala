package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobCompletedEvent
  extends StObject
     with JobEvent {
  
  var outputVariables: StringDictionary[VariableValue]
  
  var requestId: Double
  
  var result: TaskResult
}
object JobCompletedEvent {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: JobCompletedEvent] (val x: Self) extends AnyVal {
    
    inline def setOutputVariables(value: StringDictionary[VariableValue]): Self = StObject.set(x, "outputVariables", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: Double): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setResult(value: TaskResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
