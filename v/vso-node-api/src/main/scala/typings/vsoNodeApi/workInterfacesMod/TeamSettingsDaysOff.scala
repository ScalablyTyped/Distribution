package typings.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamSettingsDaysOff extends TeamSettingsDataContractBase {
  var daysOff: js.Array[DateRange] = js.native
}

object TeamSettingsDaysOff {
  @scala.inline
  def apply(_links: js.Any, daysOff: js.Array[DateRange], url: String): TeamSettingsDaysOff = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], daysOff = daysOff.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamSettingsDaysOff]
  }
  @scala.inline
  implicit class TeamSettingsDaysOffOps[Self <: TeamSettingsDaysOff] (val x: Self) extends AnyVal {
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

