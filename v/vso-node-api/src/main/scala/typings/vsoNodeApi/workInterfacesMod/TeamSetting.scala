package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.vsoNodeApi.systemMod.DayOfWeek
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamSetting extends TeamSettingsDataContractBase {
  
  /**
    * Backlog Iteration
    */
  var backlogIteration: TeamSettingsIteration = js.native
  
  /**
    * Information about categories that are visible on the backlog.
    */
  var backlogVisibilities: StringDictionary[Boolean] = js.native
  
  /**
    * BugsBehavior (Off, AsTasks, AsRequirements, ...)
    */
  var bugsBehavior: BugsBehavior = js.native
  
  /**
    * Default Iteration, the iteration used when creating a new work item on the queries page.
    */
  var defaultIteration: TeamSettingsIteration = js.native
  
  /**
    * Default Iteration macro (if any)
    */
  var defaultIterationMacro: String = js.native
  
  /**
    * Days that the team is working
    */
  var workingDays: js.Array[DayOfWeek] = js.native
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
  
  @scala.inline
  implicit class TeamSettingOps[Self <: TeamSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBacklogIteration(value: TeamSettingsIteration): Self = this.set("backlogIteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBacklogVisibilities(value: StringDictionary[Boolean]): Self = this.set("backlogVisibilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBugsBehavior(value: BugsBehavior): Self = this.set("bugsBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultIteration(value: TeamSettingsIteration): Self = this.set("defaultIteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultIterationMacro(value: String): Self = this.set("defaultIterationMacro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkingDaysVarargs(value: DayOfWeek*): Self = this.set("workingDays", js.Array(value :_*))
    
    @scala.inline
    def setWorkingDays(value: js.Array[DayOfWeek]): Self = this.set("workingDays", value.asInstanceOf[js.Any])
  }
}
