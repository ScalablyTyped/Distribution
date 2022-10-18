package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentInput
  extends StObject
     with BaseDeploymentInput {
  
  var artifactsDownloadInput: ArtifactsDownloadInput
  
  var demands: js.Array[Any]
  
  var enableAccessToken: Boolean
  
  var queueId: Double
  
  var skipArtifactsDownload: Boolean
}
object DeploymentInput {
  
  inline def apply(
    artifactsDownloadInput: ArtifactsDownloadInput,
    condition: String,
    demands: js.Array[Any],
    enableAccessToken: Boolean,
    jobCancelTimeoutInMinutes: Double,
    overrideInputs: StringDictionary[String],
    queueId: Double,
    skipArtifactsDownload: Boolean,
    timeoutInMinutes: Double
  ): DeploymentInput = {
    val __obj = js.Dynamic.literal(artifactsDownloadInput = artifactsDownloadInput.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], demands = demands.asInstanceOf[js.Any], enableAccessToken = enableAccessToken.asInstanceOf[js.Any], jobCancelTimeoutInMinutes = jobCancelTimeoutInMinutes.asInstanceOf[js.Any], overrideInputs = overrideInputs.asInstanceOf[js.Any], queueId = queueId.asInstanceOf[js.Any], skipArtifactsDownload = skipArtifactsDownload.asInstanceOf[js.Any], timeoutInMinutes = timeoutInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentInput]
  }
  
  extension [Self <: DeploymentInput](x: Self) {
    
    inline def setArtifactsDownloadInput(value: ArtifactsDownloadInput): Self = StObject.set(x, "artifactsDownloadInput", value.asInstanceOf[js.Any])
    
    inline def setDemands(value: js.Array[Any]): Self = StObject.set(x, "demands", value.asInstanceOf[js.Any])
    
    inline def setDemandsVarargs(value: Any*): Self = StObject.set(x, "demands", js.Array(value*))
    
    inline def setEnableAccessToken(value: Boolean): Self = StObject.set(x, "enableAccessToken", value.asInstanceOf[js.Any])
    
    inline def setQueueId(value: Double): Self = StObject.set(x, "queueId", value.asInstanceOf[js.Any])
    
    inline def setSkipArtifactsDownload(value: Boolean): Self = StObject.set(x, "skipArtifactsDownload", value.asInstanceOf[js.Any])
  }
}
