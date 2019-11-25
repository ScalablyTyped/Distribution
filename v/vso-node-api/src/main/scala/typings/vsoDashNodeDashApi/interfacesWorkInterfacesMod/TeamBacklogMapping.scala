package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamBacklogMapping extends js.Object {
  var categoryReferenceName: String
  var teamId: String
}

object TeamBacklogMapping {
  @scala.inline
  def apply(categoryReferenceName: String, teamId: String): TeamBacklogMapping = {
    val __obj = js.Dynamic.literal(categoryReferenceName = categoryReferenceName.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamBacklogMapping]
  }
}

