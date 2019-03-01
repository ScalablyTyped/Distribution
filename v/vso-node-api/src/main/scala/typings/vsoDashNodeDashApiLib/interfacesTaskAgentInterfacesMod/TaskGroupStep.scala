package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskGroupStep extends js.Object {
  var alwaysRun: scala.Boolean
  var continueOnError: scala.Boolean
  var displayName: java.lang.String
  var enabled: scala.Boolean
  var inputs: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var task: TaskDefinitionReference
  var timeoutInMinutes: scala.Double
}

object TaskGroupStep {
  @scala.inline
  def apply(
    alwaysRun: scala.Boolean,
    continueOnError: scala.Boolean,
    displayName: java.lang.String,
    enabled: scala.Boolean,
    inputs: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    task: TaskDefinitionReference,
    timeoutInMinutes: scala.Double
  ): TaskGroupStep = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alwaysRun")(alwaysRun)
    __obj.updateDynamic("continueOnError")(continueOnError)
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("inputs")(inputs)
    __obj.updateDynamic("task")(task)
    __obj.updateDynamic("timeoutInMinutes")(timeoutInMinutes)
    __obj.asInstanceOf[TaskGroupStep]
  }
}

