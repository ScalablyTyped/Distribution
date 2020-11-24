package typings.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamSettingsDaysOffPatch extends js.Object {
  
  var daysOff: js.Array[DateRange] = js.native
}
object TeamSettingsDaysOffPatch {
  
  @scala.inline
  def apply(daysOff: js.Array[DateRange]): TeamSettingsDaysOffPatch = {
    val __obj = js.Dynamic.literal(daysOff = daysOff.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamSettingsDaysOffPatch]
  }
  
  @scala.inline
  implicit class TeamSettingsDaysOffPatchOps[Self <: TeamSettingsDaysOffPatch] (val x: Self) extends AnyVal {
    
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
    def setDaysOffVarargs(value: DateRange*): Self = this.set("daysOff", js.Array(value :_*))
    
    @scala.inline
    def setDaysOff(value: js.Array[DateRange]): Self = this.set("daysOff", value.asInstanceOf[js.Any])
  }
}
