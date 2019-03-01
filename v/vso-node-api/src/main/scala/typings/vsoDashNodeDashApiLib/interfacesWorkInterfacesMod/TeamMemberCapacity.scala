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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("activities")(activities)
    __obj.updateDynamic("daysOff")(daysOff)
    __obj.updateDynamic("teamMember")(teamMember)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[TeamMemberCapacity]
  }
}

