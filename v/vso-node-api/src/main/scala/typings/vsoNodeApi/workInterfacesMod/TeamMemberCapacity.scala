package typings.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamMemberCapacity extends TeamSettingsDataContractBase {
  /**
    * Collection of capacities associated with the team member
    */
  var activities: js.Array[Activity] = js.native
  /**
    * The days off associated with the team member
    */
  var daysOff: js.Array[DateRange] = js.native
  /**
    * Shallow Ref to the associated team member
    */
  var teamMember: Member = js.native
}

object TeamMemberCapacity {
  @scala.inline
  def apply(
    _links: js.Any,
    activities: js.Array[Activity],
    daysOff: js.Array[DateRange],
    teamMember: Member,
    url: String
  ): TeamMemberCapacity = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], activities = activities.asInstanceOf[js.Any], daysOff = daysOff.asInstanceOf[js.Any], teamMember = teamMember.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamMemberCapacity]
  }
  @scala.inline
  implicit class TeamMemberCapacityOps[Self <: TeamMemberCapacity] (val x: Self) extends AnyVal {
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
    def setActivitiesVarargs(value: Activity*): Self = this.set("activities", js.Array(value :_*))
    @scala.inline
    def setActivities(value: js.Array[Activity]): Self = this.set("activities", value.asInstanceOf[js.Any])
    @scala.inline
    def setDaysOffVarargs(value: DateRange*): Self = this.set("daysOff", js.Array(value :_*))
    @scala.inline
    def setDaysOff(value: js.Array[DateRange]): Self = this.set("daysOff", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeamMember(value: Member): Self = this.set("teamMember", value.asInstanceOf[js.Any])
  }
  
}

