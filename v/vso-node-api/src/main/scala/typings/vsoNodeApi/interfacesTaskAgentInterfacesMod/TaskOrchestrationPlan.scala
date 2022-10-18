package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskOrchestrationPlan
  extends StObject
     with TaskOrchestrationPlanReference {
  
  var environment: PlanEnvironment
  
  var finishTime: js.Date
  
  var implementation: TaskOrchestrationContainer
  
  var planGroup: String
  
  var requestedById: String
  
  var requestedForId: String
  
  var result: TaskResult
  
  var resultCode: String
  
  var startTime: js.Date
  
  var state: TaskOrchestrationPlanState
  
  var timeline: TimelineReference
}
object TaskOrchestrationPlan {
  
  inline def apply(
    artifactLocation: String,
    artifactUri: String,
    definition: TaskOrchestrationOwner,
    environment: PlanEnvironment,
    finishTime: js.Date,
    implementation: TaskOrchestrationContainer,
    owner: TaskOrchestrationOwner,
    planGroup: String,
    planId: String,
    planType: String,
    requestedById: String,
    requestedForId: String,
    result: TaskResult,
    resultCode: String,
    scopeIdentifier: String,
    startTime: js.Date,
    state: TaskOrchestrationPlanState,
    timeline: TimelineReference,
    version: Double
  ): TaskOrchestrationPlan = {
    val __obj = js.Dynamic.literal(artifactLocation = artifactLocation.asInstanceOf[js.Any], artifactUri = artifactUri.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], finishTime = finishTime.asInstanceOf[js.Any], implementation = implementation.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], planGroup = planGroup.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any], planType = planType.asInstanceOf[js.Any], requestedById = requestedById.asInstanceOf[js.Any], requestedForId = requestedForId.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], resultCode = resultCode.asInstanceOf[js.Any], scopeIdentifier = scopeIdentifier.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOrchestrationPlan]
  }
  
  extension [Self <: TaskOrchestrationPlan](x: Self) {
    
    inline def setEnvironment(value: PlanEnvironment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setFinishTime(value: js.Date): Self = StObject.set(x, "finishTime", value.asInstanceOf[js.Any])
    
    inline def setImplementation(value: TaskOrchestrationContainer): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
    
    inline def setPlanGroup(value: String): Self = StObject.set(x, "planGroup", value.asInstanceOf[js.Any])
    
    inline def setRequestedById(value: String): Self = StObject.set(x, "requestedById", value.asInstanceOf[js.Any])
    
    inline def setRequestedForId(value: String): Self = StObject.set(x, "requestedForId", value.asInstanceOf[js.Any])
    
    inline def setResult(value: TaskResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultCode(value: String): Self = StObject.set(x, "resultCode", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setState(value: TaskOrchestrationPlanState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTimeline(value: TimelineReference): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
  }
}
