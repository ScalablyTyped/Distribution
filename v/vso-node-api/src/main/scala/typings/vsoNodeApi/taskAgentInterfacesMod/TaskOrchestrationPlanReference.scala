package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskOrchestrationPlanReference extends StObject {
  
  var artifactLocation: String
  
  var artifactUri: String
  
  var definition: TaskOrchestrationOwner
  
  var owner: TaskOrchestrationOwner
  
  var planId: String
  
  var planType: String
  
  var scopeIdentifier: String
  
  var version: Double
}
object TaskOrchestrationPlanReference {
  
  inline def apply(
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
  
  extension [Self <: TaskOrchestrationPlanReference](x: Self) {
    
    inline def setArtifactLocation(value: String): Self = StObject.set(x, "artifactLocation", value.asInstanceOf[js.Any])
    
    inline def setArtifactUri(value: String): Self = StObject.set(x, "artifactUri", value.asInstanceOf[js.Any])
    
    inline def setDefinition(value: TaskOrchestrationOwner): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: TaskOrchestrationOwner): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setPlanId(value: String): Self = StObject.set(x, "planId", value.asInstanceOf[js.Any])
    
    inline def setPlanType(value: String): Self = StObject.set(x, "planType", value.asInstanceOf[js.Any])
    
    inline def setScopeIdentifier(value: String): Self = StObject.set(x, "scopeIdentifier", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
