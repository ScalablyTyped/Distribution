package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.vsoDashNodeDashApi.interfacesCommonSystemMod.DayOfWeek
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamSettingsPatch extends js.Object {
  var backlogIteration: String
  var backlogVisibilities: StringDictionary[Boolean]
  var bugsBehavior: BugsBehavior
  var defaultIteration: String
  var defaultIterationMacro: String
  var workingDays: js.Array[DayOfWeek]
}

object TeamSettingsPatch {
  @scala.inline
  def apply(
    backlogIteration: String,
    backlogVisibilities: StringDictionary[Boolean],
    bugsBehavior: BugsBehavior,
    defaultIteration: String,
    defaultIterationMacro: String,
    workingDays: js.Array[DayOfWeek]
  ): TeamSettingsPatch = {
    val __obj = js.Dynamic.literal(backlogIteration = backlogIteration.asInstanceOf[js.Any], backlogVisibilities = backlogVisibilities.asInstanceOf[js.Any], bugsBehavior = bugsBehavior.asInstanceOf[js.Any], defaultIteration = defaultIteration.asInstanceOf[js.Any], defaultIterationMacro = defaultIterationMacro.asInstanceOf[js.Any], workingDays = workingDays.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamSettingsPatch]
  }
}

