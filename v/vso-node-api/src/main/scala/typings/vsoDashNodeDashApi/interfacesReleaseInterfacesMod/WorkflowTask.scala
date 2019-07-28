package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowTask extends js.Object {
  var alwaysRun: Boolean
  var condition: String
  var continueOnError: Boolean
  var definitionType: String
  var enabled: Boolean
  var inputs: StringDictionary[String]
  var name: String
  var overrideInputs: StringDictionary[String]
  var refName: String
  var taskId: String
  var timeoutInMinutes: Double
  var version: String
}

object WorkflowTask {
  @scala.inline
  def apply(
    alwaysRun: Boolean,
    condition: String,
    continueOnError: Boolean,
    definitionType: String,
    enabled: Boolean,
    inputs: StringDictionary[String],
    name: String,
    overrideInputs: StringDictionary[String],
    refName: String,
    taskId: String,
    timeoutInMinutes: Double,
    version: String
  ): WorkflowTask = {
    val __obj = js.Dynamic.literal(alwaysRun = alwaysRun, condition = condition, continueOnError = continueOnError, definitionType = definitionType, enabled = enabled, inputs = inputs, name = name, overrideInputs = overrideInputs, refName = refName, taskId = taskId, timeoutInMinutes = timeoutInMinutes, version = version)
  
    __obj.asInstanceOf[WorkflowTask]
  }
}

