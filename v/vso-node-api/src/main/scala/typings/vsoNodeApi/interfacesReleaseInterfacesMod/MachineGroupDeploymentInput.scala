package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MachineGroupDeploymentInput
  extends StObject
     with DeploymentInput {
  
  var deploymentHealthOption: String
  
  var healthPercent: Double
  
  var tags: js.Array[String]
}
object MachineGroupDeploymentInput {
  
  inline def apply(
    artifactsDownloadInput: ArtifactsDownloadInput,
    condition: String,
    demands: js.Array[Any],
    deploymentHealthOption: String,
    enableAccessToken: Boolean,
    healthPercent: Double,
    jobCancelTimeoutInMinutes: Double,
    overrideInputs: StringDictionary[String],
    queueId: Double,
    skipArtifactsDownload: Boolean,
    tags: js.Array[String],
    timeoutInMinutes: Double
  ): MachineGroupDeploymentInput = {
    val __obj = js.Dynamic.literal(artifactsDownloadInput = artifactsDownloadInput.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], demands = demands.asInstanceOf[js.Any], deploymentHealthOption = deploymentHealthOption.asInstanceOf[js.Any], enableAccessToken = enableAccessToken.asInstanceOf[js.Any], healthPercent = healthPercent.asInstanceOf[js.Any], jobCancelTimeoutInMinutes = jobCancelTimeoutInMinutes.asInstanceOf[js.Any], overrideInputs = overrideInputs.asInstanceOf[js.Any], queueId = queueId.asInstanceOf[js.Any], skipArtifactsDownload = skipArtifactsDownload.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], timeoutInMinutes = timeoutInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[MachineGroupDeploymentInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MachineGroupDeploymentInput] (val x: Self) extends AnyVal {
    
    inline def setDeploymentHealthOption(value: String): Self = StObject.set(x, "deploymentHealthOption", value.asInstanceOf[js.Any])
    
    inline def setHealthPercent(value: Double): Self = StObject.set(x, "healthPercent", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
