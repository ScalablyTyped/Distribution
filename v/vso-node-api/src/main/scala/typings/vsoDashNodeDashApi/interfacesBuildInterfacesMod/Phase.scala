package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

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
    val __obj = js.Dynamic.literal(condition = condition, dependencies = dependencies, jobAuthorizationScope = jobAuthorizationScope, jobCancelTimeoutInMinutes = jobCancelTimeoutInMinutes, jobTimeoutInMinutes = jobTimeoutInMinutes, name = name, steps = steps, target = target, variables = variables)
  
    __obj.asInstanceOf[Phase]
  }
}

