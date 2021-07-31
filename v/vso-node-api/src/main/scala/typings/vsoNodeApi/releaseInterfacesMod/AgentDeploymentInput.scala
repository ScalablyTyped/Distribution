package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentDeploymentInput
  extends StObject
     with DeploymentInput {
  
  var imageId: Double
  
  var parallelExecution: ExecutionInput
}
object AgentDeploymentInput {
  
  @scala.inline
  def apply(
    artifactsDownloadInput: ArtifactsDownloadInput,
    condition: String,
    demands: js.Array[js.Any],
    enableAccessToken: Boolean,
    imageId: Double,
    jobCancelTimeoutInMinutes: Double,
    overrideInputs: StringDictionary[String],
    parallelExecution: ExecutionInput,
    queueId: Double,
    skipArtifactsDownload: Boolean,
    timeoutInMinutes: Double
  ): AgentDeploymentInput = {
    val __obj = js.Dynamic.literal(artifactsDownloadInput = artifactsDownloadInput.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], demands = demands.asInstanceOf[js.Any], enableAccessToken = enableAccessToken.asInstanceOf[js.Any], imageId = imageId.asInstanceOf[js.Any], jobCancelTimeoutInMinutes = jobCancelTimeoutInMinutes.asInstanceOf[js.Any], overrideInputs = overrideInputs.asInstanceOf[js.Any], parallelExecution = parallelExecution.asInstanceOf[js.Any], queueId = queueId.asInstanceOf[js.Any], skipArtifactsDownload = skipArtifactsDownload.asInstanceOf[js.Any], timeoutInMinutes = timeoutInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentDeploymentInput]
  }
  
  @scala.inline
  implicit class AgentDeploymentInputMutableBuilder[Self <: AgentDeploymentInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageId(value: Double): Self = StObject.set(x, "imageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelExecution(value: ExecutionInput): Self = StObject.set(x, "parallelExecution", value.asInstanceOf[js.Any])
  }
}
