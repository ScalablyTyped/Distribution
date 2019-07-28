package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

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
    val __obj = js.Dynamic.literal(alwaysRun = alwaysRun, condition = condition, continueOnError = continueOnError, displayName = displayName, enabled = enabled, id = id, inputs = inputs, instanceId = instanceId, name = name, timeoutInMinutes = timeoutInMinutes, version = version)
  
    __obj.asInstanceOf[TaskInstance]
  }
}

