package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskInstance extends TaskReference {
  var alwaysRun: scala.Boolean
  var condition: java.lang.String
  var continueOnError: scala.Boolean
  var displayName: java.lang.String
  var enabled: scala.Boolean
  var instanceId: java.lang.String
  var timeoutInMinutes: scala.Double
}

object TaskInstance {
  @scala.inline
  def apply(
    alwaysRun: scala.Boolean,
    condition: java.lang.String,
    continueOnError: scala.Boolean,
    displayName: java.lang.String,
    enabled: scala.Boolean,
    id: java.lang.String,
    inputs: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    instanceId: java.lang.String,
    name: java.lang.String,
    timeoutInMinutes: scala.Double,
    version: java.lang.String
  ): TaskInstance = {
    val __obj = js.Dynamic.literal(alwaysRun = alwaysRun, condition = condition, continueOnError = continueOnError, displayName = displayName, enabled = enabled, id = id, inputs = inputs, instanceId = instanceId, name = name, timeoutInMinutes = timeoutInMinutes, version = version)
  
    __obj.asInstanceOf[TaskInstance]
  }
}

