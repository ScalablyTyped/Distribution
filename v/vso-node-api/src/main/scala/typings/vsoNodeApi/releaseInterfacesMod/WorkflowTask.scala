package typings.vsoNodeApi.releaseInterfacesMod

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
    val __obj = js.Dynamic.literal(alwaysRun = alwaysRun.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], continueOnError = continueOnError.asInstanceOf[js.Any], definitionType = definitionType.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], overrideInputs = overrideInputs.asInstanceOf[js.Any], refName = refName.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any], timeoutInMinutes = timeoutInMinutes.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkflowTask]
  }
}

