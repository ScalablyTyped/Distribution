package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseWorkItemRef extends js.Object {
  var assignee: String
  var id: String
  var state: String
  var title: String
  var `type`: String
  var url: String
}

object ReleaseWorkItemRef {
  @scala.inline
  def apply(assignee: String, id: String, state: String, title: String, `type`: String, url: String): ReleaseWorkItemRef = {
    val __obj = js.Dynamic.literal(assignee = assignee, id = id, state = state, title = title, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ReleaseWorkItemRef]
  }
}

