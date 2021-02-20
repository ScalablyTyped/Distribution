package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamBacklogMapping extends StObject {
  
  var categoryReferenceName: String = js.native
  
  var teamId: String = js.native
}
object TeamBacklogMapping {
  
  @scala.inline
  def apply(categoryReferenceName: String, teamId: String): TeamBacklogMapping = {
    val __obj = js.Dynamic.literal(categoryReferenceName = categoryReferenceName.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamBacklogMapping]
  }
  
  @scala.inline
  implicit class TeamBacklogMappingMutableBuilder[Self <: TeamBacklogMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategoryReferenceName(value: String): Self = StObject.set(x, "categoryReferenceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamId(value: String): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
  }
}
