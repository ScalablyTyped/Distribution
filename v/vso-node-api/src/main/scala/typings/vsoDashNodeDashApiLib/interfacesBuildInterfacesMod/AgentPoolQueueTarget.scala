package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentPoolQueueTarget extends PhaseTarget {
  /**
    * Enables scripts and other processes launched while executing phase to access the OAuth token
    */
  var allowScriptsAuthAccessOption: scala.Boolean
  var demands: js.Array[_]
  /**
    * The execution options.
    */
  var executionOptions: AgentTargetExecutionOptions
  /**
    * The queue.
    */
  var queue: AgentPoolQueue
}

