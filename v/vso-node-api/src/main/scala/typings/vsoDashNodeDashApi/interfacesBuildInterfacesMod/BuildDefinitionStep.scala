package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildDefinitionStep extends js.Object {
  /**
    * Indicates whether this step should run even if a previous step fails.
    */
  var alwaysRun: Boolean
  /**
    * A condition that determines whether this step should run.
    */
  var condition: String
  /**
    * Indicates whether the phase should continue even if this step fails.
    */
  var continueOnError: Boolean
  /**
    * The display name for this step.
    */
  var displayName: String
  /**
    * Indicates whether the step is enabled.
    */
  var enabled: Boolean
  var environment: StringDictionary[String]
  var inputs: StringDictionary[String]
  /**
    * The reference name for this step.
    */
  var refName: String
  /**
    * The task associated with this step.
    */
  var task: TaskDefinitionReference
  /**
    * The time, in minutes, that this step is allowed to run.
    */
  var timeoutInMinutes: Double
}

object BuildDefinitionStep {
  @scala.inline
  def apply(
    alwaysRun: Boolean,
    condition: String,
    continueOnError: Boolean,
    displayName: String,
    enabled: Boolean,
    environment: StringDictionary[String],
    inputs: StringDictionary[String],
    refName: String,
    task: TaskDefinitionReference,
    timeoutInMinutes: Double
  ): BuildDefinitionStep = {
    val __obj = js.Dynamic.literal(alwaysRun = alwaysRun, condition = condition, continueOnError = continueOnError, displayName = displayName, enabled = enabled, environment = environment, inputs = inputs, refName = refName, task = task, timeoutInMinutes = timeoutInMinutes)
  
    __obj.asInstanceOf[BuildDefinitionStep]
  }
}

