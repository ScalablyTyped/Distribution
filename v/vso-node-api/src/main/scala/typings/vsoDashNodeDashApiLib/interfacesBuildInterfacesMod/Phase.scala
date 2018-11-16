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
  var variables: ScalablyTyped.runtime.StringDictionary[BuildDefinitionVariable]
}

