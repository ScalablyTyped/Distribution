package typings.vsoNodeApi.coreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamContext extends js.Object {
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
  @scala.inline
  def apply(project: String, projectId: String, team: String, teamId: String): TeamContext = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamContext]
  }
}

