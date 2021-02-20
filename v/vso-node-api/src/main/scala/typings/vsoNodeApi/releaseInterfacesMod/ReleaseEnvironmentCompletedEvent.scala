package typings.vsoNodeApi.releaseInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseEnvironmentCompletedEvent extends StObject {
  
  var createdByName: String = js.native
  
  var definitionId: Double = js.native
  
  var definitionName: String = js.native
  
  var environment: ReleaseEnvironment = js.native
  
  var environmentId: Double = js.native
  
  var projectName: String = js.native
  
  var reason: DeploymentReason = js.native
  
  var releaseCreatedBy: IdentityRef = js.native
  
  var releaseLogsUri: String = js.native
  
  var releaseName: String = js.native
  
  var status: String = js.native
  
  var title: String = js.native
  
  var webAccessUri: String = js.native
}
object ReleaseEnvironmentCompletedEvent {
  
  @scala.inline
  def apply(
    createdByName: String,
    definitionId: Double,
    definitionName: String,
    environment: ReleaseEnvironment,
    environmentId: Double,
    projectName: String,
    reason: DeploymentReason,
    releaseCreatedBy: IdentityRef,
    releaseLogsUri: String,
    releaseName: String,
    status: String,
    title: String,
    webAccessUri: String
  ): ReleaseEnvironmentCompletedEvent = {
    val __obj = js.Dynamic.literal(createdByName = createdByName.asInstanceOf[js.Any], definitionId = definitionId.asInstanceOf[js.Any], definitionName = definitionName.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], environmentId = environmentId.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], releaseCreatedBy = releaseCreatedBy.asInstanceOf[js.Any], releaseLogsUri = releaseLogsUri.asInstanceOf[js.Any], releaseName = releaseName.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], webAccessUri = webAccessUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseEnvironmentCompletedEvent]
  }
  
  @scala.inline
  implicit class ReleaseEnvironmentCompletedEventMutableBuilder[Self <: ReleaseEnvironmentCompletedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedByName(value: String): Self = StObject.set(x, "createdByName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionId(value: Double): Self = StObject.set(x, "definitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionName(value: String): Self = StObject.set(x, "definitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironment(value: ReleaseEnvironment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentId(value: Double): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: DeploymentReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseCreatedBy(value: IdentityRef): Self = StObject.set(x, "releaseCreatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseLogsUri(value: String): Self = StObject.set(x, "releaseLogsUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseName(value: String): Self = StObject.set(x, "releaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebAccessUri(value: String): Self = StObject.set(x, "webAccessUri", value.asInstanceOf[js.Any])
  }
}
