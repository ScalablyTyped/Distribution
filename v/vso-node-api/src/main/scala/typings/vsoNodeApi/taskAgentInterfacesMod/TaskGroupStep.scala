package typings.vsoNodeApi.taskAgentInterfacesMod

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
    val __obj = js.Dynamic.literal(alwaysRun = alwaysRun.asInstanceOf[js.Any], continueOnError = continueOnError.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], timeoutInMinutes = timeoutInMinutes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TaskGroupStep]
  }
}

