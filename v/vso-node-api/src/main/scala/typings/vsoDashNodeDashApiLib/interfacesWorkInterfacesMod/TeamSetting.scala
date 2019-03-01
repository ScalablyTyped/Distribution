package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

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
  var backlogVisibilities: org.scalablytyped.runtime.StringDictionary[scala.Boolean]
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
  var defaultIterationMacro: java.lang.String
  /**
    * Days that the team is working
    */
  var workingDays: js.Array[vsoDashNodeDashApiLib.interfacesCommonSystemMod.DayOfWeek]
}

object TeamSetting {
  @scala.inline
  def apply(
    _links: js.Any,
    backlogIteration: TeamSettingsIteration,
    backlogVisibilities: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    bugsBehavior: BugsBehavior,
    defaultIteration: TeamSettingsIteration,
    defaultIterationMacro: java.lang.String,
    url: java.lang.String,
    workingDays: js.Array[vsoDashNodeDashApiLib.interfacesCommonSystemMod.DayOfWeek]
  ): TeamSetting = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("backlogIteration")(backlogIteration)
    __obj.updateDynamic("backlogVisibilities")(backlogVisibilities)
    __obj.updateDynamic("bugsBehavior")(bugsBehavior)
    __obj.updateDynamic("defaultIteration")(defaultIteration)
    __obj.updateDynamic("defaultIterationMacro")(defaultIterationMacro)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("workingDays")(workingDays)
    __obj.asInstanceOf[TeamSetting]
  }
}

