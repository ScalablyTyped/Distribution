package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowTask extends js.Object {
  var alwaysRun: scala.Boolean
  var condition: java.lang.String
  var continueOnError: scala.Boolean
  var definitionType: java.lang.String
  var enabled: scala.Boolean
  var inputs: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var name: java.lang.String
  var overrideInputs: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var refName: java.lang.String
  var taskId: java.lang.String
  var timeoutInMinutes: scala.Double
  var version: java.lang.String
}

object WorkflowTask {
  @scala.inline
  def apply(
    alwaysRun: scala.Boolean,
    condition: java.lang.String,
    continueOnError: scala.Boolean,
    definitionType: java.lang.String,
    enabled: scala.Boolean,
    inputs: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    name: java.lang.String,
    overrideInputs: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    refName: java.lang.String,
    taskId: java.lang.String,
    timeoutInMinutes: scala.Double,
    version: java.lang.String
  ): WorkflowTask = {
    val __obj = js.Dynamic.literal(alwaysRun = alwaysRun, condition = condition, continueOnError = continueOnError, definitionType = definitionType, enabled = enabled, inputs = inputs, name = name, overrideInputs = overrideInputs, refName = refName, taskId = taskId, timeoutInMinutes = timeoutInMinutes, version = version)
  
    __obj.asInstanceOf[WorkflowTask]
  }
}

