package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskInstance extends TaskReference {
  var alwaysRun: Boolean
  var condition: String
  var continueOnError: Boolean
  var displayName: String
  var enabled: Boolean
  var instanceId: String
  var timeoutInMinutes: Double
}

object TaskInstance {
  @scala.inline
  def apply(
    alwaysRun: Boolean,
    condition: String,
    continueOnError: Boolean,
    displayName: String,
    enabled: Boolean,
    id: String,
    inputs: StringDictionary[String],
    instanceId: String,
    name: String,
    timeoutInMinutes: Double,
    version: String
  ): TaskInstance = {
    val __obj = js.Dynamic.literal(alwaysRun = alwaysRun.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], continueOnError = continueOnError.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timeoutInMinutes = timeoutInMinutes.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TaskInstance]
  }
}

