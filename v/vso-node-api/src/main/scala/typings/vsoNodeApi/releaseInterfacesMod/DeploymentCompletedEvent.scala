package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentCompletedEvent extends StObject {
  
  var comment: String
  
  var data: StringDictionary[js.Any]
  
  var deployment: Deployment
  
  var environment: ReleaseEnvironment
  
  var project: ProjectReference
}
object DeploymentCompletedEvent {
  
  @scala.inline
  def apply(
    comment: String,
    data: StringDictionary[js.Any],
    deployment: Deployment,
    environment: ReleaseEnvironment,
    project: ProjectReference
  ): DeploymentCompletedEvent = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], deployment = deployment.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentCompletedEvent]
  }
  
  @scala.inline
  implicit class DeploymentCompletedEventMutableBuilder[Self <: DeploymentCompletedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: StringDictionary[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeployment(value: Deployment): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironment(value: ReleaseEnvironment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject(value: ProjectReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
  }
}
