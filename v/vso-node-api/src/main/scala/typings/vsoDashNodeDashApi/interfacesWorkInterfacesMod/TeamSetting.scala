package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.vsoDashNodeDashApi.interfacesCommonSystemMod.DayOfWeek
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamSetting extends TeamSettingsDataContractBase {
  /**
    * Backlog Iteration
    */
  var backlogIteration: TeamSettingsIteration
  /**
    * Information about categories that are visible on the backlog.
    */
  var backlogVisibilities: StringDictionary[Boolean]
  /**
    * BugsBehavior (Off, AsTasks, AsRequirements, ...)
    */
  var bugsBehavior: BugsBehavior
  /**
    * Default Iteration, the iteration used when creating a new work item on the queries page.
    */
  var defaultIteration: TeamSettingsIteration
  /**
    * Default Iteration macro (if any)
    */
  var defaultIterationMacro: String
  /**
    * Days that the team is working
    */
  var workingDays: js.Array[DayOfWeek]
}

object TeamSetting {
  @scala.inline
  def apply(
    _links: js.Any,
    backlogIteration: TeamSettingsIteration,
    backlogVisibilities: StringDictionary[Boolean],
    bugsBehavior: BugsBehavior,
    defaultIteration: TeamSettingsIteration,
    defaultIterationMacro: String,
    url: String,
    workingDays: js.Array[DayOfWeek]
  ): TeamSetting = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], backlogIteration = backlogIteration.asInstanceOf[js.Any], backlogVisibilities = backlogVisibilities.asInstanceOf[js.Any], bugsBehavior = bugsBehavior.asInstanceOf[js.Any], defaultIteration = defaultIteration.asInstanceOf[js.Any], defaultIterationMacro = defaultIterationMacro.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workingDays = workingDays.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamSetting]
  }
}

