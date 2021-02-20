package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskOrchestrationPlanReference extends StObject {
  
  var artifactLocation: String = js.native
  
  var artifactUri: String = js.native
  
  var definition: TaskOrchestrationOwner = js.native
  
  var owner: TaskOrchestrationOwner = js.native
  
  var planId: String = js.native
  
  var planType: String = js.native
  
  var scopeIdentifier: String = js.native
  
  var version: Double = js.native
}
object TaskOrchestrationPlanReference {
  
  @scala.inline
  def apply(
    artifactLocation: String,
    artifactUri: String,
    definition: TaskOrchestrationOwner,
    owner: TaskOrchestrationOwner,
    planId: String,
    planType: String,
    scopeIdentifier: String,
    version: Double
  ): TaskOrchestrationPlanReference = {
    val __obj = js.Dynamic.literal(artifactLocation = artifactLocation.asInstanceOf[js.Any], artifactUri = artifactUri.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any], planType = planType.asInstanceOf[js.Any], scopeIdentifier = scopeIdentifier.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOrchestrationPlanReference]
  }
  
  @scala.inline
  implicit class TaskOrchestrationPlanReferenceMutableBuilder[Self <: TaskOrchestrationPlanReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifactLocation(value: String): Self = StObject.set(x, "artifactLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactUri(value: String): Self = StObject.set(x, "artifactUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinition(value: TaskOrchestrationOwner): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: TaskOrchestrationOwner): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanId(value: String): Self = StObject.set(x, "planId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanType(value: String): Self = StObject.set(x, "planType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeIdentifier(value: String): Self = StObject.set(x, "scopeIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
