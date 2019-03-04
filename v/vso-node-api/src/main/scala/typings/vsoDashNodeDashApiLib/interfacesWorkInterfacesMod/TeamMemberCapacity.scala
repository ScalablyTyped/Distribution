package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

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
    url: java.lang.String
  ): TeamMemberCapacity = {
    val __obj = js.Dynamic.literal(_links = _links, activities = activities, daysOff = daysOff, teamMember = teamMember, url = url)
  
    __obj.asInstanceOf[TeamMemberCapacity]
  }
}

