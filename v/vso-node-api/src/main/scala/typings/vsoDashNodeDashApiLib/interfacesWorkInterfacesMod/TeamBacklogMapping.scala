package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamBacklogMapping extends js.Object {
  var categoryReferenceName: java.lang.String
  var teamId: java.lang.String
}

object TeamBacklogMapping {
  @scala.inline
  def apply(categoryReferenceName: java.lang.String, teamId: java.lang.String): TeamBacklogMapping = {
    val __obj = js.Dynamic.literal(categoryReferenceName = categoryReferenceName, teamId = teamId)
  
    __obj.asInstanceOf[TeamBacklogMapping]
  }
}

