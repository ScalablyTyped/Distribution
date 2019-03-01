package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Phase extends js.Object {
  /**
    * The condition that must be true for this phase to execute.
    */
  var condition: java.lang.String
  var dependencies: js.Array[Dependency]
  /**
    * The job authorization scope for builds queued against this definition.
    */
  var jobAuthorizationScope: BuildAuthorizationScope
  /**
    * The cancellation timeout, in minutes, for builds queued against this definition.
    */
  var jobCancelTimeoutInMinutes: scala.Double
  /**
    * The job execution timeout, in minutes, for builds queued against this definition.
    */
  var jobTimeoutInMinutes: scala.Double
  /**
    * The name of the phase.
    */
  var name: java.lang.String
  var steps: js.Array[BuildDefinitionStep]
  /**
    * The target (agent, server, etc.) for this phase.
    */
  var target: PhaseTarget
  var variables: org.scalablytyped.runtime.StringDictionary[BuildDefinitionVariable]
}

object Phase {
  @scala.inline
  def apply(
    condition: java.lang.String,
    dependencies: js.Array[Dependency],
    jobAuthorizationScope: BuildAuthorizationScope,
    jobCancelTimeoutInMinutes: scala.Double,
    jobTimeoutInMinutes: scala.Double,
    name: java.lang.String,
    steps: js.Array[BuildDefinitionStep],
    target: PhaseTarget,
    variables: org.scalablytyped.runtime.StringDictionary[BuildDefinitionVariable]
  ): Phase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("condition")(condition)
    __obj.updateDynamic("dependencies")(dependencies)
    __obj.updateDynamic("jobAuthorizationScope")(jobAuthorizationScope)
    __obj.updateDynamic("jobCancelTimeoutInMinutes")(jobCancelTimeoutInMinutes)
    __obj.updateDynamic("jobTimeoutInMinutes")(jobTimeoutInMinutes)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("steps")(steps)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[Phase]
  }
}

