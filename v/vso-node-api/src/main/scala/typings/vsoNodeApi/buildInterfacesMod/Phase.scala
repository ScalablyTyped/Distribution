package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Phase extends StObject {
  
  /**
    * The condition that must be true for this phase to execute.
    */
  var condition: String = js.native
  
  var dependencies: js.Array[Dependency] = js.native
  
  /**
    * The job authorization scope for builds queued against this definition.
    */
  var jobAuthorizationScope: BuildAuthorizationScope = js.native
  
  /**
    * The cancellation timeout, in minutes, for builds queued against this definition.
    */
  var jobCancelTimeoutInMinutes: Double = js.native
  
  /**
    * The job execution timeout, in minutes, for builds queued against this definition.
    */
  var jobTimeoutInMinutes: Double = js.native
  
  /**
    * The name of the phase.
    */
  var name: String = js.native
  
  var steps: js.Array[BuildDefinitionStep] = js.native
  
  /**
    * The target (agent, server, etc.) for this phase.
    */
  var target: PhaseTarget = js.native
  
  var variables: StringDictionary[BuildDefinitionVariable] = js.native
}
object Phase {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class PhaseMutableBuilder[Self <: Phase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependencies(value: js.Array[Dependency]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependenciesVarargs(value: Dependency*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
    
    @scala.inline
    def setJobAuthorizationScope(value: BuildAuthorizationScope): Self = StObject.set(x, "jobAuthorizationScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobCancelTimeoutInMinutes(value: Double): Self = StObject.set(x, "jobCancelTimeoutInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTimeoutInMinutes(value: Double): Self = StObject.set(x, "jobTimeoutInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSteps(value: js.Array[BuildDefinitionStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsVarargs(value: BuildDefinitionStep*): Self = StObject.set(x, "steps", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: PhaseTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariables(value: StringDictionary[BuildDefinitionVariable]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}
