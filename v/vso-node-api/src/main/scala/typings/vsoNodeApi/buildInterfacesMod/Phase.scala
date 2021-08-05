package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Phase extends StObject {
  
  /**
    * The condition that must be true for this phase to execute.
    */
  var condition: String
  
  var dependencies: js.Array[Dependency]
  
  /**
    * The job authorization scope for builds queued against this definition.
    */
  var jobAuthorizationScope: BuildAuthorizationScope
  
  /**
    * The cancellation timeout, in minutes, for builds queued against this definition.
    */
  var jobCancelTimeoutInMinutes: Double
  
  /**
    * The job execution timeout, in minutes, for builds queued against this definition.
    */
  var jobTimeoutInMinutes: Double
  
  /**
    * The name of the phase.
    */
  var name: String
  
  var steps: js.Array[BuildDefinitionStep]
  
  /**
    * The target (agent, server, etc.) for this phase.
    */
  var target: PhaseTarget
  
  var variables: StringDictionary[BuildDefinitionVariable]
}
object Phase {
  
  inline def apply(
    condition: String,
    dependencies: js.Array[Dependency],
    jobAuthorizationScope: BuildAuthorizationScope,
    jobCancelTimeoutInMinutes: Double,
    jobTimeoutInMinutes: Double,
    name: String,
    steps: js.Array[BuildDefinitionStep],
    target: PhaseTarget,
    variables: StringDictionary[BuildDefinitionVariable]
  ): Phase = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], jobAuthorizationScope = jobAuthorizationScope.asInstanceOf[js.Any], jobCancelTimeoutInMinutes = jobCancelTimeoutInMinutes.asInstanceOf[js.Any], jobTimeoutInMinutes = jobTimeoutInMinutes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Phase]
  }
  
  extension [Self <: Phase](x: Self) {
    
    inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setDependencies(value: js.Array[Dependency]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesVarargs(value: Dependency*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
    
    inline def setJobAuthorizationScope(value: BuildAuthorizationScope): Self = StObject.set(x, "jobAuthorizationScope", value.asInstanceOf[js.Any])
    
    inline def setJobCancelTimeoutInMinutes(value: Double): Self = StObject.set(x, "jobCancelTimeoutInMinutes", value.asInstanceOf[js.Any])
    
    inline def setJobTimeoutInMinutes(value: Double): Self = StObject.set(x, "jobTimeoutInMinutes", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSteps(value: js.Array[BuildDefinitionStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsVarargs(value: BuildDefinitionStep*): Self = StObject.set(x, "steps", js.Array(value :_*))
    
    inline def setTarget(value: PhaseTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setVariables(value: StringDictionary[BuildDefinitionVariable]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}
