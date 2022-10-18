package typings.vsoNodeApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamBacklogMapping extends StObject {
  
  var categoryReferenceName: String
  
  var teamId: String
}
object TeamBacklogMapping {
  
  inline def apply(categoryReferenceName: String, teamId: String): TeamBacklogMapping = {
    val __obj = js.Dynamic.literal(categoryReferenceName = categoryReferenceName.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamBacklogMapping]
  }
  
  extension [Self <: TeamBacklogMapping](x: Self) {
    
    inline def setCategoryReferenceName(value: String): Self = StObject.set(x, "categoryReferenceName", value.asInstanceOf[js.Any])
    
    inline def setTeamId(value: String): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
  }
}
