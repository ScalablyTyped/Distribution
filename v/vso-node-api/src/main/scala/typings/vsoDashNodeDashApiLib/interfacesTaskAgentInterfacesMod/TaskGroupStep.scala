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
    val __obj = js.Dynamic.literal(alwaysRun = alwaysRun, continueOnError = continueOnError, displayName = displayName, enabled = enabled, inputs = inputs, task = task, timeoutInMinutes = timeoutInMinutes)
  
    __obj.asInstanceOf[TaskGroupStep]
  }
}

