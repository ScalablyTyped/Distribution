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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("categoryReferenceName")(categoryReferenceName)
    __obj.updateDynamic("teamId")(teamId)
    __obj.asInstanceOf[TeamBacklogMapping]
  }
}

