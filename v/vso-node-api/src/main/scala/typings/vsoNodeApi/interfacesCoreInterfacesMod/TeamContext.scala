package typings.vsoNodeApi.interfacesCoreInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamContext extends StObject {
  
  /**
    * The team project Id or name.  Ignored if ProjectId is set.
    */
  var project: String
  
  /**
    * The Team Project ID.  Required if Project is not set.
    */
  var projectId: String
  
  /**
    * The Team Id or name.  Ignored if TeamId is set.
    */
  var team: String
  
  /**
    * The Team Id
    */
  var teamId: String
}
object TeamContext {
  
  inline def apply(project: String, projectId: String, team: String, teamId: String): TeamContext = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TeamContext] (val x: Self) extends AnyVal {
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setTeam(value: String): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
    
    inline def setTeamId(value: String): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
  }
}
