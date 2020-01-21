package typings.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamMemberCapacity extends TeamSettingsDataContractBase {
  /**
    * Collection of capacities associated with the team member
    */
  var activities: js.Array[Activity]
  /**
    * The days off associated with the team member
    */
  var daysOff: js.Array[DateRange]
  /**
    * Shallow Ref to the associated team member
    */
  var teamMember: Member
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
}

