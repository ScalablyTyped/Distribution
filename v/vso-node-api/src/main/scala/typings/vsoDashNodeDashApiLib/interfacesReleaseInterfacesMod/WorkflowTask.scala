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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alwaysRun")(alwaysRun)
    __obj.updateDynamic("condition")(condition)
    __obj.updateDynamic("continueOnError")(continueOnError)
    __obj.updateDynamic("definitionType")(definitionType)
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("inputs")(inputs)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("overrideInputs")(overrideInputs)
    __obj.updateDynamic("refName")(refName)
    __obj.updateDynamic("taskId")(taskId)
    __obj.updateDynamic("timeoutInMinutes")(timeoutInMinutes)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[WorkflowTask]
  }
}

