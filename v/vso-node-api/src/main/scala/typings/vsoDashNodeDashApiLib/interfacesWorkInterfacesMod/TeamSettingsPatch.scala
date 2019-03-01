package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamSettingsPatch extends js.Object {
  var backlogIteration: java.lang.String
  var backlogVisibilities: org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  var bugsBehavior: BugsBehavior
  var defaultIteration: java.lang.String
  var defaultIterationMacro: java.lang.String
  var workingDays: js.Array[vsoDashNodeDashApiLib.interfacesCommonSystemMod.DayOfWeek]
}

object TeamSettingsPatch {
  @scala.inline
  def apply(
    backlogIteration: java.lang.String,
    backlogVisibilities: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    bugsBehavior: BugsBehavior,
    defaultIteration: java.lang.String,
    defaultIterationMacro: java.lang.String,
    workingDays: js.Array[vsoDashNodeDashApiLib.interfacesCommonSystemMod.DayOfWeek]
  ): TeamSettingsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("backlogIteration")(backlogIteration)
    __obj.updateDynamic("backlogVisibilities")(backlogVisibilities)
    __obj.updateDynamic("bugsBehavior")(bugsBehavior)
    __obj.updateDynamic("defaultIteration")(defaultIteration)
    __obj.updateDynamic("defaultIterationMacro")(defaultIterationMacro)
    __obj.updateDynamic("workingDays")(workingDays)
    __obj.asInstanceOf[TeamSettingsPatch]
  }
}

