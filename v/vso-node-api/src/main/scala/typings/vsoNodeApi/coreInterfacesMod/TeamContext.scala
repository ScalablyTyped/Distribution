package typings.vsoNodeApi.coreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamContext extends js.Object {
  
  /**
    * The team project Id or name.  Ignored if ProjectId is set.
    */
  var project: String = js.native
  
  /**
    * The Team Project ID.  Required if Project is not set.
    */
  var projectId: String = js.native
  
  /**
    * The Team Id or name.  Ignored if TeamId is set.
    */
  var team: String = js.native
  
  /**
    * The Team Id
    */
  var teamId: String = js.native
}
object TeamContext {
  
  @scala.inline
  def apply(project: String, projectId: String, team: String, teamId: String): TeamContext = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamContext]
  }
  
  @scala.inline
  implicit class TeamContextOps[Self <: TeamContext] (val x: Self) extends AnyVal {
    
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
    def setProject(value: String): Self = this.set("project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam(value: String): Self = this.set("team", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamId(value: String): Self = this.set("teamId", value.asInstanceOf[js.Any])
  }
}
