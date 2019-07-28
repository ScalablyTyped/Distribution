package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskGroupStep extends js.Object {
  var alwaysRun: Boolean
  var continueOnError: Boolean
  var displayName: String
  var enabled: Boolean
  var inputs: StringDictionary[String]
  var task: TaskDefinitionReference
  var timeoutInMinutes: Double
}

object TaskGroupStep {
  @scala.inline
  def apply(
    alwaysRun: Boolean,
    continueOnError: Boolean,
    displayName: String,
    enabled: Boolean,
    inputs: StringDictionary[String],
    task: TaskDefinitionReference,
    timeoutInMinutes: Double
  ): TaskGroupStep = {
    val __obj = js.Dynamic.literal(alwaysRun = alwaysRun, continueOnError = continueOnError, displayName = displayName, enabled = enabled, inputs = inputs, task = task, timeoutInMinutes = timeoutInMinutes)
  
    __obj.asInstanceOf[TaskGroupStep]
  }
}

