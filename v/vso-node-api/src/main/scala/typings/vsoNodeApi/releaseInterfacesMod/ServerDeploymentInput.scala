package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerDeploymentInput extends BaseDeploymentInput {
  
  var parallelExecution: ExecutionInput = js.native
}
object ServerDeploymentInput {
  
  @scala.inline
  def apply(
    condition: String,
    jobCancelTimeoutInMinutes: Double,
    overrideInputs: StringDictionary[String],
    parallelExecution: ExecutionInput,
    timeoutInMinutes: Double
  ): ServerDeploymentInput = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], jobCancelTimeoutInMinutes = jobCancelTimeoutInMinutes.asInstanceOf[js.Any], overrideInputs = overrideInputs.asInstanceOf[js.Any], parallelExecution = parallelExecution.asInstanceOf[js.Any], timeoutInMinutes = timeoutInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerDeploymentInput]
  }
  
  @scala.inline
  implicit class ServerDeploymentInputMutableBuilder[Self <: ServerDeploymentInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParallelExecution(value: ExecutionInput): Self = StObject.set(x, "parallelExecution", value.asInstanceOf[js.Any])
  }
}
