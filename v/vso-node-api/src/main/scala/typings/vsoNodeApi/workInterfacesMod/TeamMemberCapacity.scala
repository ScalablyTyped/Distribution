package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamMemberCapacity
  extends StObject
     with TeamSettingsDataContractBase {
  
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
  
  inline def apply(
    _links: js.Any,
    activities: js.Array[Activity],
    daysOff: js.Array[DateRange],
    teamMember: Member,
    url: String
  ): TeamMemberCapacity = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], activities = activities.asInstanceOf[js.Any], daysOff = daysOff.asInstanceOf[js.Any], teamMember = teamMember.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamMemberCapacity]
  }
  
  extension [Self <: TeamMemberCapacity](x: Self) {
    
    inline def setActivities(value: js.Array[Activity]): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
    
    inline def setActivitiesVarargs(value: Activity*): Self = StObject.set(x, "activities", js.Array(value :_*))
    
    inline def setDaysOff(value: js.Array[DateRange]): Self = StObject.set(x, "daysOff", value.asInstanceOf[js.Any])
    
    inline def setDaysOffVarargs(value: DateRange*): Self = StObject.set(x, "daysOff", js.Array(value :_*))
    
    inline def setTeamMember(value: Member): Self = StObject.set(x, "teamMember", value.asInstanceOf[js.Any])
  }
}
