package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerDeploymentInput
  extends StObject
     with BaseDeploymentInput {
  
  var parallelExecution: ExecutionInput
}
object ServerDeploymentInput {
  
  inline def apply(
    condition: String,
    jobCancelTimeoutInMinutes: Double,
    overrideInputs: StringDictionary[String],
    parallelExecution: ExecutionInput,
    timeoutInMinutes: Double
  ): ServerDeploymentInput = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], jobCancelTimeoutInMinutes = jobCancelTimeoutInMinutes.asInstanceOf[js.Any], overrideInputs = overrideInputs.asInstanceOf[js.Any], parallelExecution = parallelExecution.asInstanceOf[js.Any], timeoutInMinutes = timeoutInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerDeploymentInput]
  }
  
  extension [Self <: ServerDeploymentInput](x: Self) {
    
    inline def setParallelExecution(value: ExecutionInput): Self = StObject.set(x, "parallelExecution", value.asInstanceOf[js.Any])
  }
}
