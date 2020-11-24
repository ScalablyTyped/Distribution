package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.vsoNodeApi.systemMod.DayOfWeek
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamSettingsPatch extends js.Object {
  
  var backlogIteration: String = js.native
  
  var backlogVisibilities: StringDictionary[Boolean] = js.native
  
  var bugsBehavior: BugsBehavior = js.native
  
  var defaultIteration: String = js.native
  
  var defaultIterationMacro: String = js.native
  
  var workingDays: js.Array[DayOfWeek] = js.native
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
  
  @scala.inline
  implicit class TeamSettingsPatchOps[Self <: TeamSettingsPatch] (val x: Self) extends AnyVal {
    
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
    def setBacklogIteration(value: String): Self = this.set("backlogIteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBacklogVisibilities(value: StringDictionary[Boolean]): Self = this.set("backlogVisibilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBugsBehavior(value: BugsBehavior): Self = this.set("bugsBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultIteration(value: String): Self = this.set("defaultIteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultIterationMacro(value: String): Self = this.set("defaultIterationMacro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkingDaysVarargs(value: DayOfWeek*): Self = this.set("workingDays", js.Array(value :_*))
    
    @scala.inline
    def setWorkingDays(value: js.Array[DayOfWeek]): Self = this.set("workingDays", value.asInstanceOf[js.Any])
  }
}
