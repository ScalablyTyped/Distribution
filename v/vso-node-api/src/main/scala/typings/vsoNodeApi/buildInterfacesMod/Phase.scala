package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Phase extends js.Object {
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
}

