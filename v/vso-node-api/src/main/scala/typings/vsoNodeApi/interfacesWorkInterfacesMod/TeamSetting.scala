package typings.vsoNodeApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.vsoNodeApi.interfacesCommonSystemMod.DayOfWeek
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamSetting
  extends StObject
     with TeamSettingsDataContractBase {
  
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
  
  inline def apply(
    _links: Any,
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
  implicit open class MutableBuilder[Self <: TeamSetting] (val x: Self) extends AnyVal {
    
    inline def setBacklogIteration(value: TeamSettingsIteration): Self = StObject.set(x, "backlogIteration", value.asInstanceOf[js.Any])
    
    inline def setBacklogVisibilities(value: StringDictionary[Boolean]): Self = StObject.set(x, "backlogVisibilities", value.asInstanceOf[js.Any])
    
    inline def setBugsBehavior(value: BugsBehavior): Self = StObject.set(x, "bugsBehavior", value.asInstanceOf[js.Any])
    
    inline def setDefaultIteration(value: TeamSettingsIteration): Self = StObject.set(x, "defaultIteration", value.asInstanceOf[js.Any])
    
    inline def setDefaultIterationMacro(value: String): Self = StObject.set(x, "defaultIterationMacro", value.asInstanceOf[js.Any])
    
    inline def setWorkingDays(value: js.Array[DayOfWeek]): Self = StObject.set(x, "workingDays", value.asInstanceOf[js.Any])
    
    inline def setWorkingDaysVarargs(value: DayOfWeek*): Self = StObject.set(x, "workingDays", js.Array(value*))
  }
}
